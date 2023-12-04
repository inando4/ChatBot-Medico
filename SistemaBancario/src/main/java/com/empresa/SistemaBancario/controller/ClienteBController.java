package com.empresa.SistemaBancario.controller;

import com.empresa.SistemaBancario.model.ClienteB;
import com.empresa.SistemaBancario.service.ClienteBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientesB")
public class ClienteBController {
 private final ClienteBService clienteBService;

 @Autowired
 public ClienteBController(ClienteBService clienteBService) {
     this.clienteBService = clienteBService;
 }

 @GetMapping
 public List<ClienteB> getAllClientesB() {
     return clienteBService.getAllClientesB();
 }

 @GetMapping("/{id}")
 public ClienteB getClienteBById(@PathVariable Long id) {
     return clienteBService.getClienteBById(id);
 }

 @PostMapping
 public ClienteB saveClienteB(@RequestBody ClienteB clienteB) {
     return clienteBService.saveClienteB(clienteB);
 }

 @DeleteMapping("/{id}")
 public void deleteClienteB(@PathVariable Long id) {
     clienteBService.deleteClienteB(id);
 }
}

