package app.ito.poo;
import clases.ito.poo.CuentasBancarias;
import clases.ito.poo.CuentaBancaria;
import java.time.LocalDate;

public class Aplicacion {
	static CuentasBancarias c;
	
	
	static void run(){
	Syst
	c= new CuentasBancarias();
	System.out.println(c.isFree());
	c.addItem(new CuentaBancaria(66,"Elias rojas",4000,LocalDate.of(2021, 4, 24)));
	c.addItem(new CuentaBancaria(34,"Mariana Rodriguez",46000,LocalDate.of(2021, 5, 30)));
	c.addItem(new CuentaBancaria(32,"Sofia Morales",70000,LocalDate.of(2021, 12, 2)));
	c.addItem(new CuentaBancaria(31,"Karolina Lopez",18000,LocalDate.of(2021, 3, 12)));
	c.addItem(new CuentaBancaria(29,"Jocelyn Flores",3000,LocalDate.of(2021, 2, 1)));
	System.out.println(c.isFree());
	for(int i=0;i<c.getSize();i++)
		System.out.println(c.getItem(i));


	System.out.print("\nchequeo de deposito:"+ c.Deposito(3, 5/*cantidad a depositar*/));
	System.out.print("\nChequeo de retiro"+c.Retiro(3, 90000));
	
	
	c.EliminarCuenta(3);
	System.out.println("\n\n\n\n");
		for(int i=0;i<c.getSize();i++)
		System.out.println(c.getItem(i));
		
		
		System.out.println("EL MONTO TOTAL DE LAS CUENTAS ES DE :$"+c.MontosTotales());
		System.out.println("EL MONTO PROMEDIO DE LAS CUENTAS ES DE: $"+c.PromedioMontosTotales());
		System.out.println("CUENTAS CON UN MONTO MAYOR A $10,000.00:"+c.CuentaMillonaria());
		System.out.println("saldo maximo: "+c.Saldomax());
		System.out.println("saldo minimo: "+c.Saldomin());
	}
	

}
