package springboot.springbootapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendGreeting {

    @GetMapping("/greeting")
    public String greeting() {
        String response = "Hello from SpringBoot! :)";
        return response;
    }

}
