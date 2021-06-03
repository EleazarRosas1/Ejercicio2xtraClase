package app.ito.poo;

import java.util.Date;
import clases.ito.poo.Composicion;

public class MyApp {


	static void run() {
		
		
		 
		
		Composicion composicion1 = new Composicion ("Te encontre", 3.17f,"banda", new Date(), new Date());
		 
		
		
		composicion1.solicitarCompositor("Ulises");
		System.out.println(composicion1);
		
	
	}
	

	public static void main(String[] args) {
		run();
	} 

}
