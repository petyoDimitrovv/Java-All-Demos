package course.springdata.restMVC.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", required = false, defaultValue = "unknown") String name){
        return String.format("Hello %s, zadushaam sa", name);
    }
    @GetMapping("/users/{userID}/posts/{postID}")
    public String getPost(@PathVariable Integer userID,
                          @PathVariable Integer postID){
        return String.format("User: %d --> Post: %d%n",userID, postID);
    }

}
