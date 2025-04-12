package com.learning.ecommerce.templateservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";  // Looks for src/main/resources/templates/login.html
    }

    @GetMapping("/signup")
    public String showSignupPage() {
        return "signup"; // This will render signup.html
    }

    @GetMapping("/home")
    public String showHomePage() {
        return "home"; // This will render home.html
    }
}