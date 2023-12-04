package com.empresa.SistemaBancario.service;

import com.empresa.SistemaBancario.model.BancoC;
import com.empresa.SistemaBancario.repository.BancoCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BancoCService {
 private final BancoCRepository bancoCRepository;

 @Autowired
 public BancoCService(BancoCRepository bancoCRepository) {
     this.bancoCRepository = bancoCRepository;
 }

 public List<BancoC> getAllBancosC() {
     return bancoCRepository.findAll();
 }

 public BancoC getBancoCById(Long id) {
     return bancoCRepository.findById(id).orElse(null);
 }

 public BancoC saveBancoC(BancoC bancoC) {
     return bancoCRepository.save(bancoC);
 }

 public void deleteBancoC(Long id) {
     bancoCRepository.deleteById(id);
 }
}

