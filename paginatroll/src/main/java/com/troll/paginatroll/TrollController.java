package com.troll.paginatroll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TrollController {

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String validar(@RequestParam String nombre, Model model) {

        if (!nombre.equals("PONER INICIAR SESION")) {
            model.addAttribute("error", "lee bien");
            return "login";
        }

        return "menu";
    }

    // Primera pantalla de necio
    @GetMapping("/no-abrir")
    public String noAbrir() {
        return "necio";
    }

    // Pantalla final troll con imagen
    @GetMapping("/seguir-necio")
    public String seguirNecio() {
        return "troll";
    }

    @GetMapping("/abrir")
    public String abrir() {
        return "hola";
    }

    @GetMapping("/troll3")
    public String troll3() {
        return "troll3";
    }

    @GetMapping("/menu")
    public String menu() {
        return "menu";
    }


}

