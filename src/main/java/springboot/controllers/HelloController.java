package springboot.controllers;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import springboot.dataTransferObjects.Person;

import java.util.Arrays;
import java.util.List;

@RestController //--> @Controller and @ResponseBody
public class HelloController {
    @GetMapping(path = "/hello/{name}") // RequestMethod by default is GET
    public String hello(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @PostMapping(path = "/goodbye")
    public String goodbye(@RequestBody Person person) {
        return "Goodbye, " + person.getName() + "!";
    }

    @GetMapping(path = "/get")
    public Person getPerson() {
        Person p = new Person();
        p.setName("Bill");
        return p;
    }

    @GetMapping(path = "/getAll")
    public List<Person> getAllPersons() {
        Person p = new Person();
        Person p1 = new Person();
        p.setName("Bill");
        p1.setName("John");
        return Arrays.asList(p, p1);
    }

    @GetMapping(path ="/statusTest")
    public void statusTest(HttpServletResponse response){
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
    }
}
