package spring.data.jsonprocessing.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.data.jsonprocessing.model.dto.ProductInRangeDto;
import spring.data.jsonprocessing.model.dto.ProductSeedDto;
import spring.data.jsonprocessing.model.entity.Category;
import spring.data.jsonprocessing.model.entity.Product;
import spring.data.jsonprocessing.repository.ProductRepository;
import spring.data.jsonprocessing.service.CategoryService;
import spring.data.jsonprocessing.service.ProductService;
import spring.data.jsonprocessing.service.UserService;
import spring.data.jsonprocessing.util.ValidationUtil;

import javax.validation.ConstraintViolation;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;
    private final ValidationUtil validationUtil;
    private final UserService userService;
    private final CategoryService categoryService;
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, ModelMapper modelMapper, ValidationUtil validationUtil, UserService userService, CategoryService categoryService) {
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
        this.userService = userService;
        this.categoryService = categoryService;
    }

    @Override
    public void seedProducts(ProductSeedDto[] productSeedDtos) {
        if(this.productRepository.count() != 0){
            return;
        }

        Arrays.stream(productSeedDtos)
                .forEach(productSeedDto -> {
                    if(this.validationUtil.isValid(productSeedDto)){
                        Product product = this.modelMapper.map(productSeedDto, Product.class);

                        product.setSeller(this.userService.getRandomUser());

                        Random random = new Random();
                        int randomNum = random.nextInt(2);
                        if(randomNum == 1){
                            product.setBuyer(this.userService.getRandomUser());
                        }

                        product.setCategories(new HashSet<>(this.categoryService.getRandomCategories()));

                        this.productRepository.saveAndFlush(product);

                    }else {
                        this.validationUtil.violations(productSeedDto)
                                .stream()
                                .map(ConstraintViolation::getMessage)
                                .forEach(System.out::println);
                    }

                });
    }

    @Override
    public List<ProductInRangeDto> getAllProductsInRange() {

        return this.productRepository
                .findAllByPriceBetweenAndBuyerIsNull(new BigDecimal(500), new BigDecimal(1000))
                .stream()
                .map(p -> {
                    ProductInRangeDto productInRangeDto =
                            this.modelMapper.map(p, ProductInRangeDto.class);

                    productInRangeDto.setSeller(String.format("%s %s",
                            p.getSeller().getFirstName(),
                            p.getSeller().getLastName()));

                    return productInRangeDto;
                }).collect(Collectors.toList());
    }
}
