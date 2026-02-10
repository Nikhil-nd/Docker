package com.nd.simplewebapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //or use RestController
public class HomeController {
    @RequestMapping("/")
    @ResponseBody 
 public String greet(){
    return "hello Docker is done";  
 }
}
