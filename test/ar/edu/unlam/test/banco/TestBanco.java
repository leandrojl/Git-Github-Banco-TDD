package ar.edu.unlam.test.banco;

import static org.junit.Assert.*;
import org.junit.Test;

import ar.edu.unlam.clases.Banco.Cliente;
import ar.edu.unlam.clases.Banco.Cuenta;
import ar.edu.unlam.clases.Banco.EntidadBancaria;
import ar.edu.unlam.clases.Banco.TipoDeCuenta;


public class TestBanco {

	@Test
	public void queSePuedaInstanciarUnClienteEnUnBancoYQueSePuedaVerTipoDeCuentaCreada() {
		//CREACION DEL OBJETO BANCO
		EntidadBancaria santander = new EntidadBancaria();
		
		//CREACION DE LA CUENTA CON EL CONSTRUCTOR QUE LE DICE QUE TIPO DE CUENTA ES, UN SALDO, Y EL TERCER PARAMETRO EL DESCUBIERTO QUE PUEDE TENER LA CUENTA CORRIENTE.
		Cuenta cuenta = new Cuenta(TipoDeCuenta.CUENTA_CORRIENTE, 200.0, 1000.0); //CREACION DE LA CUENTA
		
		//CREACION DEL OBJETO CLIENTE CON EL CONSTRUCTOR QUE LE INSTANCIA:
		//UN NOMBRE, APELLIDO, NRO_CLIENTE, PASSWORD, Y EL QUINTO PARAMETRO LE PASO EL OBJETO CUENTA QUE SE GUARDARA EN CLIENTE X CONSTRUCTOR.
		Cliente cliente =new Cliente("pepe", "diaz", 123, 555, cuenta); // CREACION DEL CLIENTE, EN EL PARAMETRO 5 LE AGREGO AL CLIENTE
		
		//COMENTARIO INFORMATIVO APARTE:PARA LA SIMPLICIDAD DEL EJERCICIO TAMBIEN SE PUEDE AGREGAR UN CLIENTE CON NOMBRE, APELLIDO Y LA CUENTA QUE TENDRIA ASIGNADA.
		//YA ESTA CREACO EL CONSTRUCTOR QUE RECIBE 3 PARAMETROS.
		// ClientecuentaSimple = new Cliente("pepe", "diaz", cuenta);
		
		//DENTRO DEL OBJETO CUENTA, GUARDO AL CLIENTE. ES LA ASOCIACION DE QUE EL CLIENTE TIENE EL OBJETO CUENTA
		//A SU VEZ, EL CLIENTE EN SU ATRIBUTO Cuenta cuenta, TIENE GUARDADO POR CONSTRUCTOR LA CUENTA EN EL PARAMETRO 5: Cliente cliente =new Cliente("pepe", "diaz", 123, 555, cuenta);
		cuenta.setCliente(cliente);
		
		//EN LA COLECCION QUE HAY DENTRO DEL OBJETO BANCO, GUARDO AL CLIENTE.
		santander.addCliente(cliente);
	    
		//el primer assert se fija que la cantidad de clientes esperados coincidan con el hashset de clientes creado de la entidad
		assertEquals(1, santander.getListaClientes().size()); 
		
		//el segundo assert devuelve que la cuenta creada sea la esperada
		assertEquals(TipoDeCuenta.CUENTA_CORRIENTE, cuenta.getTipoDeCuenta());
	}

 
	@Test
	public void queSePuedaExtraerDineroDeUnaCuentaSueldo() {
		Cuenta cuenta = new Cuenta(TipoDeCuenta.CUENTA_SUELDO, 200.0, 100.0); 
		//Cliente cliente1 =new Cliente("pepe", "diaz", 123456, 555,cuenta);
		
		
		assertTrue(cuenta.queLaCuentaSueldoMeDejeExtraerDinero(199.0)); 

	}
	
	//ANA
	@Test
	public void queSePuedaDepositarDineroEnUnaCuenta() {
	/////////////////////////
	}
	//DESTELLO
	@Test
	public void queUnaEntidadBancariaTengaUnClienteYDepositeDineroEnSuCuenta() {
		
	}
	//ANA
	@Test
	public void queUnaEntidadBancariaTengaUnClienteYExtraigaDineroDeSuCuenta() {
		
	}
	//DESTELLO
	@Test
	public void queSePuedaCrearUnaCuentaCorrienteYDespositarDinero() {
		
	}
	
	

}