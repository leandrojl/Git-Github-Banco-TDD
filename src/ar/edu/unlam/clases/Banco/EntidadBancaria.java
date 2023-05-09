package ar.edu.unlam.clases.Banco;

import java.util.HashSet;


public class EntidadBancaria{
	
    protected String nombreEntidad; 
    protected Integer cod_entidad; 
	protected HashSet <Cliente> listaClientesVip; 
	protected HashSet <Cliente> listaClientes;
	protected HashSet <Cuenta> listaCuentas;
	
	
	public EntidadBancaria(int cod_entidad) {
		this.cod_entidad = cod_entidad;
		listaClientesVip= new HashSet<Cliente>();
	}
	public EntidadBancaria(String nombreEntidad,int cod_entidad) {
		this.nombreEntidad = nombreEntidad;
		this.cod_entidad = cod_entidad;
		listaClientesVip= new HashSet<Cliente>();
		listaCuentas = new HashSet<Cuenta>();
	}

	
	public EntidadBancaria() {
		listaClientes= new HashSet<Cliente>();
	}
	
	
	public void addCliente(Cliente cliente) {
	    listaClientes.add(cliente);
	}
	
	public void addClienteVip(Cliente cliente) {
	    listaClientesVip.add(cliente);
	}

	
	
	public HashSet<Cliente> getListaClientesVip() {
		return listaClientesVip;
	}


	public void setListaClientesVip(HashSet<Cliente> listaClientesVip) {
		this.listaClientesVip = listaClientesVip;
	}


	public HashSet<Cliente> getListaClientes() {
		return listaClientes;
	}


	public void setListaClientes(HashSet<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	public String getNombreEntidad() {
		return nombreEntidad;
	}
	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}
	public Integer getCod_entidad() {
		return cod_entidad;
	}
	public void setCod_entidad(Integer cod_entidad) {
		this.cod_entidad = cod_entidad;
	}
	public HashSet<Cuenta> getListaCuentas() {
		return listaCuentas;
	}
	public void setListaCuentas(HashSet<Cuenta> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}
	
	
	
	
}