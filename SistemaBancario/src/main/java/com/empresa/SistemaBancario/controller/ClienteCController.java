package com.empresa.SistemaBancario.controller;

import com.empresa.SistemaBancario.model.ClienteC;
import com.empresa.SistemaBancario.service.ClienteCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientesC")
public class ClienteCController {
 private final ClienteCService clienteCService;

 @Autowired
 public ClienteCController(ClienteCService clienteCService) {
     this.clienteCService = clienteCService;
 }

 @GetMapping
 public List<ClienteC> getAllClientesC() {
     return clienteCService.getAllClientesC();
 }

 @GetMapping("/{id}")
 public ClienteC getClienteCById(@PathVariable Long id) {
     return clienteCService.getClienteCById(id);
 }

 @PostMapping
 public ClienteC saveClienteC(@RequestBody ClienteC clienteC) {
     return clienteCService.saveClienteC(clienteC);
 }

 @DeleteMapping("/{id}")
 public void deleteClienteC(@PathVariable Long id) {
     clienteCService.deleteClienteC(id);
 }
}

