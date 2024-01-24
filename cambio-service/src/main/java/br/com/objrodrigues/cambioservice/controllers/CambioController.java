package br.com.objrodrigues.cambioservice.controllers;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.objrodrigues.cambioservice.model.Cambio;



@RestController
@RequestMapping("cambio-service")
public class CambioController {
    
    // http://localhost:8000/cambio-service/5/USD/BRL

    @GetMapping(value = "/{amount}/{from}/{to}")
    public Cambio getCambio(
        @PathVariable("amount") BigDecimal amount,
        @PathVariable("from") String from,
        @PathVariable("to") String to) {
            return new Cambio(1L, from, to, BigDecimal.ONE, BigDecimal.ONE, "PORT 8000");
    }
    
}