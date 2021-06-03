package app.ito.poo;

import java.time.LocalDate;

import ito.poo.clases.lineatransporte;
import ito.poo.clases.viajes;

public class MyApp {
	
	static void run() {
		lineatransporte lineax=(new lineatransporte("Ford",2002,1500,LocalDate.of(2020, 10, 22), "No ha realizado viajes" ));
		System.out.println (lineax);
		viajes viajesx=(new viajes("Puebla","Av principal #21",LocalDate.of(2021, 03, 22),LocalDate.of(2021, 03, 28),1000,"Juguetes"));
		System.out.println (viajesx);
	}

	public static void main(String[] args) {
		run();

	}

}
