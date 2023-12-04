package com.empresa.SistemaBancario.service;

import com.empresa.SistemaBancario.model.CuentaA;
import com.empresa.SistemaBancario.repository.CuentaARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaAService {
 private final CuentaARepository cuentaARepository;

 @Autowired
 public CuentaAService(CuentaARepository cuentaARepository) {
     this.cuentaARepository = cuentaARepository;
 }

 public List<CuentaA> getAllCuentasA() {
     return cuentaARepository.findAll();
 }

 public CuentaA getCuentaAById(Long id) {
     return cuentaARepository.findById(id).orElse(null);
 }

 public CuentaA saveCuentaA(CuentaA cuentaA) {
     return cuentaARepository.save(cuentaA);
 }

 public void deleteCuentaA(Long id) {
     cuentaARepository.deleteById(id);
 }
}

