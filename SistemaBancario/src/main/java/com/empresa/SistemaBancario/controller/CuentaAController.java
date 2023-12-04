package com.empresa.SistemaBancario.controller;

import com.empresa.SistemaBancario.model.CuentaA;
import com.empresa.SistemaBancario.service.CuentaAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuentasA")
public class CuentaAController {
 private final CuentaAService cuentaAService;

 @Autowired
 public CuentaAController(CuentaAService cuentaAService) {
     this.cuentaAService = cuentaAService;
 }

 @GetMapping
 public List<CuentaA> getAllCuentasA() {
     return cuentaAService.getAllCuentasA();
 }

 @GetMapping("/{id}")
 public CuentaA getCuentaAById(@PathVariable Long id) {
     return cuentaAService.getCuentaAById(id);
 }

 @PostMapping
 public CuentaA saveCuentaA(@RequestBody CuentaA cuentaA) {
     return cuentaAService.saveCuentaA(cuentaA);
 }

 @DeleteMapping("/{id}")
 public void deleteCuentaA(@PathVariable Long id) {
     cuentaAService.deleteCuentaA(id);
 }
}

