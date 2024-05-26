package controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.RandomService;

@CrossOrigin(origins = "*")
@Slf4j
@RestController
//@RequiredArgsConstructor
@RequestMapping("/random")
public class RandomController {

    private final RandomService randomService;

    public RandomController(RandomService randomService) {
        this.randomService = randomService;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<Object> getRandom() {
        return ResponseEntity.ok(randomService.getRandom());
    }

}
