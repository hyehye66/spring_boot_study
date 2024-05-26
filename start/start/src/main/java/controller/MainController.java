package controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MainController {

    private static final Logger log = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/")
    public String welcome() {
       log.info("sdsd");
        return "WELCOME TO API";
    }
}
