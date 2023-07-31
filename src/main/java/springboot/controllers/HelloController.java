package springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //--> @Controller and @ResponseBody
public class HelloController {
    @RequestMapping("/hello") //GET, POST
    public String hello(){
        return "Hello";
    }

}
