package io.authapp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
public class MainController {
     private static final Logger logger = LoggerFactory.getLogger(Main.class);
   @GetMapping("/")
    public String msg() {
     logger.info("Client connected");
     return "<html><body><h1>Hello, World!</h1><p>Hello! This is a Spring Boot app.</p></body></html>";
 }
}
