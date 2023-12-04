package com.empresa.SistemaBancario.dto;

public class TransaccionResponse {
    private String mensaje;

	public TransaccionResponse(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	
    
    // constructor, getters y setters
}