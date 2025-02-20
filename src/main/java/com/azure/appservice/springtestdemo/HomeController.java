package com.azure.appservice.springtestdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Joiner;

@RestController
public class HomeController {
    
    @GetMapping("/home")
    public String home() {
        // Use the Guava library as an example of an external dependency.
        Joiner joiner = Joiner.on(" ").skipNulls(); 
        return joiner.join("<a href='https://apithurain.azurewebsites.net' >http://abcd.efg.com</a>", null, "from", "Spring", "Boot");
    }
}
