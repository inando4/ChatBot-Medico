package com.empresa.SistemaBancario.service;

import com.empresa.SistemaBancario.model.BancoA;
import com.empresa.SistemaBancario.repository.BancoARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BancoAService {
 private final BancoARepository bancoARepository;

 @Autowired
 public BancoAService(BancoARepository bancoARepository) {
     this.bancoARepository = bancoARepository;
 }

 public List<BancoA> getAllBancosA() {
     return bancoARepository.findAll();
 }

 public BancoA getBancoAById(Long id) {
     return bancoARepository.findById(id).orElse(null);
 }

 public BancoA saveBancoA(BancoA bancoA) {
     return bancoARepository.save(bancoA);
 }

 public void deleteBancoA(Long id) {
     bancoARepository.deleteById(id);
 }
}

