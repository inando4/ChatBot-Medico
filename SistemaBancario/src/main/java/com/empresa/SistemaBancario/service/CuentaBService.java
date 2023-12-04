package com.empresa.SistemaBancario.service;

import com.empresa.SistemaBancario.model.CuentaB;
import com.empresa.SistemaBancario.repository.CuentaBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaBService {
 private final CuentaBRepository cuentaBRepository;

 @Autowired
 public CuentaBService(CuentaBRepository cuentaBRepository) {
     this.cuentaBRepository = cuentaBRepository;
 }

 public List<CuentaB> getAllCuentasB() {
     return cuentaBRepository.findAll();
 }

 public CuentaB getCuentaBById(Long id) {
     return cuentaBRepository.findById(id).orElse(null);
 }

 public CuentaB saveCuentaB(CuentaB cuentaB) {
     return cuentaBRepository.save(cuentaB);
 }

 public void deleteCuentaB(Long id) {
     cuentaBRepository.deleteById(id);
 }
}

