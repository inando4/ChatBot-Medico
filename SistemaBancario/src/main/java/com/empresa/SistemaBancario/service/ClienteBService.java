package com.empresa.SistemaBancario.service;

import com.empresa.SistemaBancario.model.ClienteB;
import com.empresa.SistemaBancario.repository.ClienteBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteBService {
 private final ClienteBRepository clienteBRepository;

 @Autowired
 public ClienteBService(ClienteBRepository clienteBRepository) {
     this.clienteBRepository = clienteBRepository;
 }

 public List<ClienteB> getAllClientesB() {
     return clienteBRepository.findAll();
 }

 public ClienteB getClienteBById(Long id) {
     return clienteBRepository.findById(id).orElse(null);
 }

 public ClienteB saveClienteB(ClienteB clienteB) {
     return clienteBRepository.save(clienteB);
 }

 public void deleteClienteB(Long id) {
     clienteBRepository.deleteById(id);
 }
}

