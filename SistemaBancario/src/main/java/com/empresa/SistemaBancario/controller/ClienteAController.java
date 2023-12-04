package com.empresa.SistemaBancario.controller;

import com.empresa.SistemaBancario.model.ClienteA;
import com.empresa.SistemaBancario.service.ClienteAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientesA")
public class ClienteAController {
 private final ClienteAService clienteAService;

 @Autowired
 public ClienteAController(ClienteAService clienteAService) {
     this.clienteAService = clienteAService;
 }

 @GetMapping
 public List<ClienteA> getAllClientesA() {
     return clienteAService.getAllClientesA();
 }

 @GetMapping("/{id}")
 public ClienteA getClienteAById(@PathVariable Long id) {
     return clienteAService.getClienteAById(id);
 }

 @PostMapping
 public ClienteA saveClienteA(@RequestBody ClienteA clienteA) {
     return clienteAService.saveClienteA(clienteA);
 }

 @DeleteMapping("/{id}")
 public void deleteClienteA(@PathVariable Long id) {
     clienteAService.deleteClienteA(id);
 }
}

