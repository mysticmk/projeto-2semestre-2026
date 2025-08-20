package com.programacao.web.fatec.api_fatec.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    
    @GetMapping("/testeCliente1") //-> /api/clientes/testeCliente1
    public String testeCliente() {
        return "Teste Client";
    }

    @GetMapping("/testeCliente2/{nome}") //-> /api/clientes/testeCliente2/
    public String testeCliente2(@PathVariable String nome) {
        return nome;
    }

    


}
