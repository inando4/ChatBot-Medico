package com.empresa.SistemaBancario.service;

import com.empresa.SistemaBancario.model.ClienteC;
import com.empresa.SistemaBancario.repository.ClienteCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteCService {
 private final ClienteCRepository clienteCRepository;

 @Autowired
 public ClienteCService(ClienteCRepository clienteCRepository) {
     this.clienteCRepository = clienteCRepository;
 }

 public List<ClienteC> getAllClientesC() {
     return clienteCRepository.findAll();
 }

 public ClienteC getClienteCById(Long id) {
     return clienteCRepository.findById(id).orElse(null);
 }

 public ClienteC saveClienteC(ClienteC clienteC) {
     return clienteCRepository.save(clienteC);
 }

 public void deleteClienteC(Long id) {
     clienteCRepository.deleteById(id);
 }
}
