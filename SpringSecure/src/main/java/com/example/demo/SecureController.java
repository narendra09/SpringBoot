package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecureController 
{
	@RequestMapping("/")
   public String message()
   {
	   return "hello.jsp";
   }
}
