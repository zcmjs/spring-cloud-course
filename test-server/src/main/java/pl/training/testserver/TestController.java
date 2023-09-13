package pl.training.testserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Value("${prop1}")
    private String prop1;

    @Value("${prop2}")
    private String prop2;

    @GetMapping
    public String test() {
        return "prop: " + prop1 + ", prop2: " + prop2;
    }

}
