package byIvam.UserService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class TestUserController {

    @Value("${eureka.instance.instance-id}")
    private String id;
    @GetMapping("/user")
    public String test(){
        return id;
    }
}
