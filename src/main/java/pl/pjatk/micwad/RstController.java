package pl.pjatk.micwad;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class RstController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> carResponseEntity() {
        Car car = new Car("hatckback");
        return ResponseEntity.ok(car);
    }

    @GetMapping("/model/{value}")
    public ResponseEntity<String> someValue(@PathVariable String value) {
        return ResponseEntity.ok(value);
    }

    //localhost:8080/test/hello/path?reqParam=dupa
    @GetMapping("/hello/path")
    public ResponseEntity<String> someValueTwo(@RequestParam String reqParam) {
        return ResponseEntity.ok(reqParam);
    }

    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody Car car){
        return ResponseEntity.ok(car);
    }
}
