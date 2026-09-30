package com.atelie.sobrancelhas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {

    @GetMapping("/")
    public String exibirSite() {
        return "index"; // Retorna o arquivo index.html da pasta templates
    }
}
