package course.springdata.restMVC.init;

import course.springdata.restMVC.dao.PostRepository;
import course.springdata.restMVC.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class DataInitializer implements CommandLineRunner {
    @Autowired
    private PostRepository postRepo;

    @Override
    public void run(String... args) throws Exception {
        if (postRepo.count() == 0) {
            List.of(
                    new Post("New in Spring", "Spring Boot is fancy...",
                            "Bat Georgi", Set.of("spring", "java", "spring boot")),
                    new Post("Reactive Spring", "Web Flux is here...",
                            "Trayan ", Set.of("spring", "java", "spring boot")),
                    new Post("Q elte pilenca prii batko", "How to grow a chicken...",
                            "Milko Kalayikata", Set.of("pilenca", "pri batko", "kurvi"))

            ).forEach(postRepo::save);

        }
    }
}
