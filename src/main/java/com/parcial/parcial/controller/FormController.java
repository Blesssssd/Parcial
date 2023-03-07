package com.parcial.parcial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;

import com.parcial.parcial.models.Empleado;
import jakarta.validation.Valid;

@Controller
public class FormController {
    
    @GetMapping("/form")
    public String form(Model model){
        Empleado emp = new Empleado();
        model.addAttribute("titulo","Formulario");
        model.addAttribute("Empleado", emp);
        return "form";
    }

    @PostMapping("/form")
    public String procesar(@Valid Empleado emp, BindingResult result, Model model){
        if (result.hasErrors()){
            model.addAttribute("titulo", "Resultado formulario");
        }
        return "resultado";
    }
}
