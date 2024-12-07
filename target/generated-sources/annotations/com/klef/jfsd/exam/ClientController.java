package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientController {

    // Display a personalized greeting
    @RequestMapping("/greet")
    public String greet(@RequestParam("username") String username, Model model) {
        model.addAttribute("username", username);
        return "greet";
    }

    // Render the "about.jsp" view
    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    // Display age and country values
    @RequestMapping("/demo1")
    public String demo1(@RequestParam("age") int age, @RequestParam("country") String country, Model model) {
        model.addAttribute("age", age);
        model.addAttribute("country", country);
        return "demo1";
    }

    // Perform subtraction and division
    @RequestMapping("/demo2/{num1}/{num2}")
    public String demo2(@PathVariable("num1") int num1, @PathVariable("num2") int num2, Model model) {
        model.addAttribute("subtraction", num1 - num2);
        model.addAttribute("division", num1 / num2);
        return "demo2";
    }

    // Display the product form
    @RequestMapping("/productform")
    public String productForm() {
        return "productform";
    }

    // Multiply two numbers
    @RequestMapping("/multiplyNumbers")
    public String multiplyNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("product", num1 * num2);
        return "multiplyNumbers";
    }

    // Reverse two strings
    @RequestMapping("/reverse")
    public String reverse(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        model.addAttribute("reversedStr1", new StringBuilder(str1).reverse().toString());
        model.addAttribute("reversedStr2", new StringBuilder(str2).reverse().toString());
        return "reverse";
    }

    // Subtraction and addition
    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("addition", num1 + num2);
        model.addAttribute("subtraction", num1 - num2);
        return "calculate";
    }
}
