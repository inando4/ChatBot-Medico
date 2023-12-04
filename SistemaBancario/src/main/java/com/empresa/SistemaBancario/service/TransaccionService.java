package com.empresa.SistemaBancario.service;

import com.empresa.SistemaBancario.dto.TransaccionRequest;
import com.empresa.SistemaBancario.dto.TransaccionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransaccionService {
 private final CuentaAService cuentaAService;
 private final CuentaBService cuentaBService;
 private final CuentaCService cuentaCService;

 @Autowired
 public TransaccionService(CuentaAService cuentaAService, CuentaBService cuentaBService, CuentaCService cuentaCService) {
     this.cuentaAService = cuentaAService;
     this.cuentaBService = cuentaBService;
     this.cuentaCService = cuentaCService;
 }

 @Transactional
 public TransaccionResponse realizarTransaccion(TransaccionRequest transaccionRequest) {
     // Lógica para realizar la transacción entre cuentas de diferentes bancos
     // Puedes implementar reglas específicas según tus requisitos

     // Ejemplo: Transferir monto de una cuenta de BancoA a una cuenta de BancoB
     cuentaAService.retirarMonto(transaccionRequest.getCuentaOrigen(), transaccionRequest.getMonto());
     cuentaBService.depositarMonto(transaccionRequest.getCuentaDestino(), transaccionRequest.getMonto());

     // Puedes agregar más lógica según tus requisitos

     return new TransaccionResponse("Transacción realizada con éxito");
 }
}

