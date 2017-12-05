package controllers;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
public class MvcAppExample {
    public static void main(String[] args) {
        SpringApplication.run(MvcAppExample.class, args);
    }
}

public class homeController {
    @Controller
    public class HelloController {
        @RequestParam("/numbers")
        public String numbers() {
            return "numbers";
        }
    }

}
