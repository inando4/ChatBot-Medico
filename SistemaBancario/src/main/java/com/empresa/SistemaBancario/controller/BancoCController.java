package com.empresa.SistemaBancario.controller;

import com.empresa.SistemaBancario.model.BancoC;
import com.empresa.SistemaBancario.service.BancoCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bancosC")
public class BancoCController {
 private final BancoCService bancoCService;

 @Autowired
 public BancoCController(BancoCService bancoCService) {
     this.bancoCService = bancoCService;
 }

 @GetMapping
 public List<BancoC> getAllBancosC() {
     return bancoCService.getAllBancosC();
 }

 @GetMapping("/{id}")
 public BancoC getBancoCById(@PathVariable Long id) {
     return bancoCService.getBancoCById(id);
 }

 @PostMapping
 public BancoC saveBancoC(@RequestBody BancoC bancoC) {
     return bancoCService.saveBancoC(bancoC);
 }

 @DeleteMapping("/{id}")
 public void deleteBancoC(@PathVariable Long id) {
     bancoCService.deleteBancoC(id);
 }
}

