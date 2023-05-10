package ar.edu.unlam.clases.Banco;

import java.util.HashSet;

public class Cliente {

	protected String nombre;
	protected String apellido;
	protected Integer nro_cliente;
	protected Integer password;
	protected boolean cliente_vip;
    protected Cuenta cuenta;
    protected Integer numeroDeCuenta;

	
    public Cliente (String nombre, String apellido, int nro_cliente, int password,Cuenta cuenta){
	this.nombre=nombre; 
	this.apellido=apellido; 
	this.nro_cliente=nro_cliente; 
	this.password=password;
	this.cuenta = cuenta;
	}
    
    public Cliente(String nombre, String apellido, Cuenta cuenta) {
    	this.nombre = nombre;
    	this.apellido = apellido;
    	this.cuenta = cuenta;
    }
	
	
    public Cliente (boolean cliente_vip){
		
	} 
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getNro_cliente() {
		return nro_cliente;
	}

	public void setNro_cliente(Integer nro_cliente) {
		this.nro_cliente = nro_cliente;
	}

	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}

	public boolean isCliente_vip() {
		return cliente_vip;
	}
	public void setCliente_vip(boolean cliente_vip) {
		this.cliente_vip = cliente_vip;
	} 
	
	

	
	
}