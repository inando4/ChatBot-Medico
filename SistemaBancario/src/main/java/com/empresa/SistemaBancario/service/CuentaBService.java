package com.empresa.SistemaBancario.service;

import com.empresa.SistemaBancario.model.CuentaA;
import com.empresa.SistemaBancario.model.CuentaB;
import com.empresa.SistemaBancario.repository.CuentaBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Transactional;

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
 
 @Transactional
 public void retirarMonto(Long idCuenta, double monto) {
     CuentaB cuentaB = cuentaBRepository.findById(idCuenta).orElse(null);
     if (cuentaB != null && cuentaB.getSaldo() >= monto) {
         cuentaB.setSaldo(cuentaB.getSaldo() - monto);
         cuentaBRepository.save(cuentaB);
     } else {
         throw new RuntimeException("Fondos insuficientes en la cuenta de origen");
     }
 }
 
 @Transactional
 public void depositarMonto(Long idCuenta, Double monto) {
     CuentaB cuentaB = cuentaBRepository.findById(idCuenta).orElse(null);
     if (cuentaB != null) {
         cuentaB.setSaldo(cuentaB.getSaldo() + monto);
         cuentaBRepository.save(cuentaB);
     } else {
         throw new RuntimeException("Cuenta de destino no encontrada");
     }
 }
 
}

