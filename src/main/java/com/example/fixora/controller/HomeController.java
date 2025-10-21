package com.example.fixora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping({"/", "/home"})
    public String home(Model model) {
        List<Map<String, String>> featured = List.of(
            Map.of("name", "Kamal", "role", "Plumber", "rating", "4.8", "image", "/images/worker1.jpg"),
            Map.of("name", "Saman", "role", "Electrician", "rating", "4.7", "image", "/images/worker2.jpg"),
            Map.of("name", "Anu", "role", "Cleaner", "rating", "4.9", "image", "/images/worker3.jpg")
        );

        model.addAttribute("title", "Fixora — Find Trusted Local Workers");
        model.addAttribute("tagline", "Quick. Verified. Local.");
        model.addAttribute("featured", featured);

        return "index"; // ✅ matches index.html
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/signup")
    public String signup(Model model) {
        return "signup";
    }
}
