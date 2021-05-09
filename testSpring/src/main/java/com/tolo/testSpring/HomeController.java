package com.tolo.testSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/weather")
public class HomeController {

    @GetMapping("/")
    public String forecast(){
        return "Sunny... Rainy... Cloudy";
    }

}
