package com.codegym.controllers;

import com.codegym.services.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    Dictionary dictionary = new Dictionary();
    @GetMapping("/")
    public String showHomePage(){
        return "index";
    }

    @PostMapping("/translate")
    public String translate(@RequestParam String eng, Model model){
        String vi = dictionary.getVi(eng);
        model.addAttribute("vi",vi);
        return "index";
    }
}
