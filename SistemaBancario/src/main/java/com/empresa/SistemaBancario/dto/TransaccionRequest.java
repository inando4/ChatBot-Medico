package com.empresa.SistemaBancario.dto;

public class TransaccionRequest {
    private Long cuentaOrigen;
    private Long cuentaDestino;
    private Double monto;
    
	public Long getCuentaOrigen() {
		return cuentaOrigen;
	}
	public void setCuentaOrigen(Long cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}
	public Long getCuentaDestino() {
		return cuentaDestino;
	}
	public void setCuentaDestino(Long cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}

    
    // getters y setters
}