package br.com.Rafael.eventos.Controllers;

import br.com.Rafael.eventos.Models.eventosModel;
import br.com.Rafael.eventos.Service.eventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class eventosControllers {


    @Autowired
     private eventoService service;

    @GetMapping
    public String home(){
        return "index";
    }

    @GetMapping("/form")
    public String cadastro(){
        return "form";
    }

    @PostMapping("/cadastrar")
    public String Cadastro(eventosModel eventos){
        service.cadastraEventos(eventos);
    return "index";
    }
}
