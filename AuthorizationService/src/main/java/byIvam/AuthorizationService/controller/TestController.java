package byIvam.AuthorizationService.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${eureka.instance.instance-id}")
    private String id;
    @GetMapping("/test")
    public String test(){
        return id;
    }
}
