package provider.controller;

import org.springframework.boot.env.RandomValuePropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author Ethan
 */
@RestController
public class InfoController {
    public static final String HOST_NUMBER = String.valueOf(new Random().nextInt());

    @GetMapping(path = "/info/host-number")
    public String getHostNumber(){
        return "The host number is: " + HOST_NUMBER + "\n";
    }
}
