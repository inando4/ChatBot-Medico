package com.empresa.SistemaBancario.controller;

import com.empresa.SistemaBancario.model.CuentaC;
import com.empresa.SistemaBancario.service.CuentaCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuentasC")
public class CuentaCController {
 private final CuentaCService cuentaCService;

 @Autowired
 public CuentaCController(CuentaCService cuentaCService) {
     this.cuentaCService = cuentaCService;
 }

 @GetMapping
 public List<CuentaC> getAllCuentasC() {
     return cuentaCService.getAllCuentasC();
 }

 @GetMapping("/{id}")
 public CuentaC getCuentaCById(@PathVariable Long id) {
     return cuentaCService.getCuentaCById(id);
 }

 @PostMapping
 public CuentaC saveCuentaC(@RequestBody CuentaC cuentaC) {
     return cuentaCService.saveCuentaC(cuentaC);
 }

 @DeleteMapping("/{id}")
 public void deleteCuentaC(@PathVariable Long id) {
     cuentaCService.deleteCuentaC(id);
 }
}

