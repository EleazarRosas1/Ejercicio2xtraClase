package ito.poo.clases;

import java.time.LocalDate;

public class viajes {

	private String ciudaddedestino = "";

	private String direccion = "";

	
	private LocalDate fechadeviaje = null;

	private LocalDate fechaderegreso = null;

	private int montodeviaje = 0;


	private String descripcioncarga = "";


	public viajes() {
		// Start of user code constructor for viajes)
		super();
		// End of user code
	}
	public viajes(String ciudaddedestino, String direccion, LocalDate fechadeviaje, LocalDate fechaderegreso,
			int montodeviaje, String descripcioncarga) {
		super();
		this.ciudaddedestino = ciudaddedestino;
		this.direccion = direccion;
		this.fechadeviaje = fechadeviaje;
		this.fechaderegreso = fechaderegreso;
		this.montodeviaje = montodeviaje;
		this.descripcioncarga = descripcioncarga;
	}

	public void asignacionvehiculo(String asignar) {
	
	}


	public String getCiudaddedestino() {
		return this.ciudaddedestino;
	}


	public void setCiudaddedestino(String newCiudaddedestino) {
		this.ciudaddedestino = newCiudaddedestino;
	}


	public String getDireccion() {
		return this.direccion;
	}


	public void setDireccion(String newDireccion) {
		this.direccion = newDireccion;
	}


	public LocalDate getFechadeviaje() {
		return this.fechadeviaje;
	}


	public void setFechadeviaje(java.time.LocalDate newFechadeviaje) {
		this.fechadeviaje = newFechadeviaje;
	}


	public LocalDate getFechaderegreso() {
		return this.fechaderegreso;
	}


	public void setFechaderegreso(java.time.LocalDate newFechaderegreso) {
		this.fechaderegreso = newFechaderegreso;
	}


	public int getMontodeviaje() {
		return this.montodeviaje;
	}


	public void setMontodeviaje(int newMontodeviaje) {
		this.montodeviaje = newMontodeviaje;
	}


	public String getDescripcioncarga() {
		return this.descripcioncarga;
	}

	public void setDescripcioncarga(String newDescripcioncarga) {
		this.descripcioncarga = newDescripcioncarga;
	}

	@Override
	public String toString() {
		return "viajes [ciudaddedestino=" + ciudaddedestino + ", direccion=" + direccion + ", fechadeviaje="
				+ fechadeviaje + ", fechaderegreso=" + fechaderegreso + ", montodeviaje=" + montodeviaje
				+ ", descripcioncarga=" + descripcioncarga + "]";
	}

}
