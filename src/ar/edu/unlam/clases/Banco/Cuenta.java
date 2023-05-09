package ar.edu.unlam.clases.Banco;

public class Cuenta {

	protected Cliente cliente; 
	protected TipoDeCuenta tipoDeCuenta; 
	protected Double saldo; 
    protected Double descubierto;
    
    
    //CONSTRUCTOR PARA CONSTRUIR CUENTA CON CLIENTE, SALDO Y DESCUBIERTO.
    public Cuenta(Cliente cliente, Double saldo, Double descubierto) {
    	this.cliente = cliente;
    	this.saldo=saldo; 
    	this.descubierto=descubierto; 
    }
    
    //CONSTRUCTOR PARA CONSTRUIR CUENTA CON SALDO Y DESCUBIERTO.
    public Cuenta(Double saldo, Double descubierto) {
    	this.saldo=saldo; 
    	this.descubierto=descubierto; 
    }
    
    public Cuenta(TipoDeCuenta tipoDeCuenta, Double saldo, Double descubierto) {
    	this.tipoDeCuenta = tipoDeCuenta;
    	this.saldo=saldo; 
    	this.descubierto=descubierto; 
    }
    
    
    public Cuenta() {
    	
    }

	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}



	public double getDescubierto() {
		return descubierto;
	}



	public void setDescubierto(Double descubierto) {
		this.descubierto = descubierto;
	}
    

	public boolean queLaCuentaSueldoMeDejeExtraerDinero(Double montoAExtraer){
		if(this.getTipoDeCuenta()==TipoDeCuenta.CUENTA_SUELDO && saldo>= montoAExtraer) { 
			return true;
			}
		else return false; 
    }

	public TipoDeCuenta getTipoDeCuenta() {
		return tipoDeCuenta;
	}

	public void setTipoDeCuenta(TipoDeCuenta tipoDeCuenta) {
		this.tipoDeCuenta = tipoDeCuenta;
	}
	
	
	
	
}
	
	




