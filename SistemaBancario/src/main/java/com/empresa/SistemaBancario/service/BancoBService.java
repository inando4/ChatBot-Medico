package com.empresa.SistemaBancario.service;

import com.empresa.SistemaBancario.model.BancoB;
import com.empresa.SistemaBancario.repository.BancoBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BancoBService {
 private final BancoBRepository bancoBRepository;

 @Autowired
 public BancoBService(BancoBRepository bancoBRepository) {
     this.bancoBRepository = bancoBRepository;
 }

 public List<BancoB> getAllBancosB() {
     return bancoBRepository.findAll();
 }

 public BancoB getBancoBById(Long id) {
     return bancoBRepository.findById(id).orElse(null);
 }

 public BancoB saveBancoB(BancoB bancoB) {
     return bancoBRepository.save(bancoB);
 }

 public void deleteBancoB(Long id) {
     bancoBRepository.deleteById(id);
 }
}
