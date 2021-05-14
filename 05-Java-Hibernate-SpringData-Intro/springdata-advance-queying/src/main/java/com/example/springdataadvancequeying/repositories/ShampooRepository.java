package com.example.springdataadvancequeying.repositories;

import com.example.springdataadvancequeying.entities.Shampoo;
import com.example.springdataadvancequeying.entities.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShampooRepository extends JpaRepository<Shampoo, Long> {

    List<Shampoo> findAllBySizeOrderById(Size size);
    //List<Shampoo>findAllBySizeOrLabel(Size size);
}
