/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;

import java.time.LocalDate;
// Start of user code (user defined imports)
import java.util.ArrayList;

// End of user code

/**
 * Description of Clinica.
 * 
 * @author USUARIO
 */
public class Clinica {
	public Clinica(String nombre, String rfc, LocalDate fechaNacimiento) {
		super();
		Nombre = nombre;
		this.rfc = rfc;
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Description of the property Nombre.
	 */
	public String Nombre = "";

	/**
	 * Description of the property rfc.
	 */
	public String rfc = "";

	/**
	 * Description of the property fechaNacimiento.
	 */
	public LocalDate fechaNacimiento = null;

	/**
	 * Description of the property fechaConsulta.
	 */
	public java.time.LocalDate fechaConsulta = null;

	// Start of user code (user defined attributes for Clinica)

	// End of user code

	/**
	 * The constructor.
	 */
	public Clinica() {
		// Start of user code constructor for Clinica)
		super();
		// End of user code
	}

	/**
	 * Description of the method agregarConsulta.
	 * @param fecha 
	 * @param sintomas 
	 * @param temperatura 
	 * @param peso 
	 * @param estatura 
	 */
	
	private ArrayList<LocalDate>fecha=new ArrayList<LocalDate>();
	private ArrayList<String>Sintomas=new ArrayList<String>();
	private ArrayList<Integer>temperatura=new ArrayList<Integer>();
	private ArrayList<Float>peso=new ArrayList<Float>();
	private ArrayList<Float>estatura=new ArrayList<Float>();
	
	public void agregarConsulta(java.time.LocalDate fecha, String sintomas, int temperatura, float peso,
			float estatura) {
		// Start of user code for method agregarConsulta
		this.fecha.add(LocalDate.now());
		this.Sintomas.add(sintomas);
		this.temperatura.add(temperatura);
		this.peso.add(peso);
		this.estatura.add(estatura);
		// End of user code
	}

	/**
	 * Description of the method receta.
	 * @param medicamentos 
	 * @param recomendaciones 
	 * @return 
	 */
	public String receta(String medicamentos, String recomendaciones) {
		// Start of user code for method receta
		String receta = "Sin nada que mostrar";
		if(medicamentos!=null  ||recomendaciones!=null){
			receta="Medicamentos: "+ medicamentos+" "+" Recomendaciones: "+ recomendaciones;
		}
		return receta;
		// End of user code
	}

	/**
	 * Description of the method obtenEdad.
	 * @param anios 
	 * @return 
	 */
	public int obtenEdad(int anios) {
		// Start of user code for method obtenEdad
	int obtenEdad=0;
		if(anios>0) {
		obtenEdad=(LocalDate.now().getYear()-anios);
		}
		return obtenEdad;
		// End of user code
	}

	// Start of user code (user defined methods for Clinica)

	// End of user code
	/**
	 * Returns Nombre.
	 * @return Nombre 
	 */
	public String getNombre() {
		return this.Nombre;
	}

	/**
	 * Sets a value to attribute Nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.Nombre = newNombre;
	}

	/**
	 * Returns rfc.
	 * @return rfc 
	 */
	public String getRfc() {
		return this.rfc;
	}

	/**
	 * Sets a value to attribute rfc. 
	 * @param newRfc 
	 */
	public void setRfc(String newRfc) {
		this.rfc = newRfc;
	}

	/**
	 * Returns fechaNacimiento.
	 * @return fechaNacimiento 
	 */
	public java.time.LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	/**
	 * Sets a value to attribute fechaNacimiento. 
	 * @param newFechaNacimiento 
	 */
	public void setFechaNacimiento(java.time.LocalDate newFechaNacimiento) {
		this.fechaNacimiento = newFechaNacimiento;
	}

	/**
	 * Returns fechaConsulta.
	 * @return fechaConsulta 
	 */
	public java.time.LocalDate getFechaConsulta() {
		return this.fechaConsulta;
	}

	/**
	 * Sets a value to attribute fechaConsulta. 
	 * @param newFechaConsulta 
	 */
	public void setFechaConsulta(java.time.LocalDate newFechaConsulta) {
		this.fechaConsulta = newFechaConsulta;
		
	}

	@Override
	public String toString() {
		return "Clinica [Nombre=" + Nombre + ", rfc=" + rfc + ", fechaNacimiento=" + fechaNacimiento
				 +",Consulta= Fecha de consulta"+fecha +"\n,Sintomas= "+Sintomas+" ,Temperatura="+temperatura 
				+", Peso= "+peso+", Estatura="+estatura+"]";
	}

}
