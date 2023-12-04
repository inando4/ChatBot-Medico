package com.empresa.SistemaBancario.controller;

import com.empresa.SistemaBancario.model.BancoA;
import com.empresa.SistemaBancario.service.BancoAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bancosA")
public class BancoAController {
 private final BancoAService bancoAService;

 @Autowired
 public BancoAController(BancoAService bancoAService) {
     this.bancoAService = bancoAService;
 }

 @GetMapping
 public List<BancoA> getAllBancosA() {
     return bancoAService.getAllBancosA();
 }

 @GetMapping("/{id}")
 public BancoA getBancoAById(@PathVariable Long id) {
     return bancoAService.getBancoAById(id);
 }

 @PostMapping
 public BancoA saveBancoA(@RequestBody BancoA bancoA) {
     return bancoAService.saveBancoA(bancoA);
 }

 @DeleteMapping("/{id}")
 public void deleteBancoA(@PathVariable Long id) {
     bancoAService.deleteBancoA(id);
 }
}

