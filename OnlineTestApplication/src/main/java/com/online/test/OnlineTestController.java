package com.online.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OnlineTestController 
{
   @GetMapping("/")
   public String index() {
	   return "index";
   }
}
