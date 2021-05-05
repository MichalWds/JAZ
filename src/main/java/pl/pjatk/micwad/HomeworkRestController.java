package pl.pjatk.micwad;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkRestController {

    @GetMapping //localhost:8080/homework?someValue=ass
    public ResponseEntity<String> getReqParam(@RequestParam String someValue) {
        return ResponseEntity.ok().body(someValue);
    }

    @GetMapping("/{someValue}")
    public ResponseEntity<String> getPathVar(@PathVariable String someValue) {
        return ResponseEntity.ok().body(someValue);
    }

    @PutMapping("/update/{someValue}")
    public ResponseEntity<String> update(@RequestBody String update, @PathVariable String someValue) {
        return ResponseEntity.ok(update.concat(someValue));
    }

    @PostMapping("/post")
    public ResponseEntity<String> post(@RequestBody String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @DeleteMapping("/delete/{someValue}")
    public ResponseEntity<HttpStatus> delete (@PathVariable String someValue){
        return ResponseEntity.ok().build();
    }
}
