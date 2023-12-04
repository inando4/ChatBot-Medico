package com.empresa.SistemaBancario.controller;

import com.empresa.SistemaBancario.model.BancoB;
import com.empresa.SistemaBancario.service.BancoBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bancosB")
public class BancoBController {
 private final BancoBService bancoBService;

 @Autowired
 public BancoBController(BancoBService bancoBService) {
     this.bancoBService = bancoBService;
 }

 @GetMapping
 public List<BancoB> getAllBancosB() {
     return bancoBService.getAllBancosB();
 }

 @GetMapping("/{id}")
 public BancoB getBancoBById(@PathVariable Long id) {
     return bancoBService.getBancoBById(id);
 }

 @PostMapping
 public BancoB saveBancoB(@RequestBody BancoB bancoB) {
     return bancoBService.saveBancoB(bancoB);
 }

 @DeleteMapping("/{id}")
 public void deleteBancoB(@PathVariable Long id) {
     bancoBService.deleteBancoB(id);
 }
}

