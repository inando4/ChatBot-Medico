package com.empresa.SistemaBancario.controller;

import com.empresa.SistemaBancario.model.CuentaB;
import com.empresa.SistemaBancario.service.CuentaBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuentasB")
public class CuentaBController {
 private final CuentaBService cuentaBService;

 @Autowired
 public CuentaBController(CuentaBService cuentaBService) {
     this.cuentaBService = cuentaBService;
 }

 @GetMapping
 public List<CuentaB> getAllCuentasB() {
     return cuentaBService.getAllCuentasB();
 }

 @GetMapping("/{id}")
 public CuentaB getCuentaBById(@PathVariable Long id) {
     return cuentaBService.getCuentaBById(id);
 }

 @PostMapping
 public CuentaB saveCuentaB(@RequestBody CuentaB cuentaB) {
     return cuentaBService.saveCuentaB(cuentaB);
 }

 @DeleteMapping("/{id}")
 public void deleteCuentaB(@PathVariable Long id) {
     cuentaBService.deleteCuentaB(id);
 }
}

