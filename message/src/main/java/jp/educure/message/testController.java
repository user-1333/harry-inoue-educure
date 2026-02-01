package jp.educure.message;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class testController {
    @GetMapping("/top") 
    public String test() {
        return "top";
    }
}
