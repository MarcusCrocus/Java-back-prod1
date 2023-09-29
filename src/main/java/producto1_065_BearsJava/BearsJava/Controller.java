package producto1_065_BearsJava.BearsJava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
    @GetMapping("/web")
    public String helloWord() {
        return "Hello World! producto1_065_BearsJava";
    }
}
