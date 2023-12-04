package com.empresa.SistemaBancario.service;

import com.empresa.SistemaBancario.model.ClienteA;
import com.empresa.SistemaBancario.repository.ClienteARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteAService {
 private final ClienteARepository clienteARepository;

 @Autowired
 public ClienteAService(ClienteARepository clienteARepository) {
     this.clienteARepository = clienteARepository;
 }

 public List<ClienteA> getAllClientesA() {
     return clienteARepository.findAll();
 }

 public ClienteA getClienteAById(Long id) {
     return clienteARepository.findById(id).orElse(null);
 }

 public ClienteA saveClienteA(ClienteA clienteA) {
     return clienteARepository.save(clienteA);
 }

 public void deleteClienteA(Long id) {
     clienteARepository.deleteById(id);
 }
}

