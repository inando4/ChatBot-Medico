package com.empresa.SistemaBancario.service;

import com.empresa.SistemaBancario.model.CuentaC;
import com.empresa.SistemaBancario.repository.CuentaCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
 
 @Transactional
 public void retirarMonto(Long idCuenta, Double monto) {
     CuentaC cuentaC = cuentaCRepository.findById(idCuenta).orElse(null);
     if (cuentaC != null && cuentaC.getSaldo() >= monto) {
         cuentaC.setSaldo(cuentaC.getSaldo() - monto);
         cuentaCRepository.save(cuentaC);
     } else {
         throw new RuntimeException("Fondos insuficientes en la cuenta de origen");
     }
 }
 
 @Transactional
 public void depositarMonto(Long idCuenta, Double monto) {
     CuentaC cuentaC = cuentaCRepository.findById(idCuenta).orElse(null);
     if (cuentaC != null) {
         cuentaC.setSaldo(cuentaC.getSaldo() + monto);
         cuentaCRepository.save(cuentaC);
     } else {
         throw new RuntimeException("Cuenta de destino no encontrada");
     }
 }
}

