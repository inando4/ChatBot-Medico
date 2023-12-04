package com.empresa.SistemaBancario.service;

import com.empresa.SistemaBancario.model.CuentaC;
import com.empresa.SistemaBancario.repository.CuentaCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaCService {
 private final CuentaCRepository cuentaCRepository;

 @Autowired
 public CuentaCService(CuentaCRepository cuentaCRepository) {
     this.cuentaCRepository = cuentaCRepository;
 }

 public List<CuentaC> getAllCuentasC() {
     return cuentaCRepository.findAll();
 }

 public CuentaC getCuentaCById(Long id) {
     return cuentaCRepository.findById(id).orElse(null);
 }

 public CuentaC saveCuentaC(CuentaC cuentaC) {
     return cuentaCRepository.save(cuentaC);
 }

 public void deleteCuentaC(Long id) {
     cuentaCRepository.deleteById(id);
 }
}

