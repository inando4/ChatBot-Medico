package com.empresa.SistemaBancario.controller;

import com.empresa.SistemaBancario.dto.TransaccionRequest;
import com.empresa.SistemaBancario.dto.TransaccionResponse;
import com.empresa.SistemaBancario.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacciones")
public class TransaccionController {
 private final TransaccionService transaccionService;

 @Autowired
 public TransaccionController(TransaccionService transaccionService) {
     this.transaccionService = transaccionService;
 }

 @PostMapping("/realizar")
 public TransaccionResponse realizarTransaccion(@RequestBody TransaccionRequest transaccionRequest) {
     return transaccionService.realizarTransaccion(transaccionRequest);
 }
}

