package com.empresa.SistemaBancario.service;

import com.empresa.SistemaBancario.model.CuentaA;
import com.empresa.SistemaBancario.repository.CuentaARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
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
 
 @Transactional
 public void retirarMonto(Long idCuenta, double monto) {
     CuentaA cuentaA = cuentaARepository.findById(idCuenta).orElse(null);
     if (cuentaA != null && cuentaA.getSaldo() >= monto) {
         cuentaA.setSaldo(cuentaA.getSaldo() - monto);
         cuentaARepository.save(cuentaA);
     } else {
         throw new RuntimeException("Fondos insuficientes en la cuenta de origen");
     }
 }
 
 @Transactional
 public void depositarMonto(Long idCuenta, Double monto) {
     CuentaA cuentaA = cuentaARepository.findById(idCuenta).orElse(null);
     if (cuentaA != null) {
         cuentaA.setSaldo(cuentaA.getSaldo() + monto);
         cuentaARepository.save(cuentaA);
     } else {
         throw new RuntimeException("Cuenta de destino no encontrada");
     }
 }
}

