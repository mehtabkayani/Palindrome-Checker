package com.example.palindromcheckerwebapp.Controllers;

import com.example.palindromcheckerwebapp.Util.Util;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RequestMapping("/")
@Controller
public class HomeController {

    @GetMapping()
    public String index(){
        return "index";
    }

    Util util = new Util();
    @GetMapping("/checkPalindrome")
    public String checkPalindrome(String words, Model model){

        List<String> palindromes = util.getPalindrome(words);
        List<String> nonPalindromes = util.getNonPalindrome(words);
        model.addAttribute("palindromes",palindromes);
        model.addAttribute("nonPalindromes",nonPalindromes);
        return  "index";
    }

}
