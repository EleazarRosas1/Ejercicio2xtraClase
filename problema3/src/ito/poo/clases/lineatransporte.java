package ito.poo.clases;

import java.time.LocalDate;

public class lineatransporte {


	private String marca = "";

	private int modelo = 0;

	private int cantidadmaximacarga = 0;

	private LocalDate fechadeadquisicion = null;

	private String listadeviajes = "";

	public lineatransporte() {
		// Start of user code constructor for lineatransporte)
		super();
		// End of user code
	}
	public lineatransporte(String marca, int modelo, int cantidadmaximacarga, LocalDate fechadeadquisicion,
			String listadeviajes) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cantidadmaximacarga = cantidadmaximacarga;
		this.fechadeadquisicion = fechadeadquisicion;
		this.listadeviajes = listadeviajes;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String newMarca) {
		this.marca = newMarca;
	}


	public int getModelo() {
		return this.modelo;
	}


	public void setModelo(int newModelo) {
		this.modelo = newModelo;
	}


	public int getCantidadmaximacarga() {
		return this.cantidadmaximacarga;
	}


	public void setCantidadmaximacarga(int newCantidadmaximacarga) {
		this.cantidadmaximacarga = newCantidadmaximacarga;
	}


	public LocalDate getFechadeadquisicion() {
		return this.fechadeadquisicion;
	}

	public void setFechadeadquisicion(LocalDate newFechadeadquisicion) {
		this.fechadeadquisicion = newFechadeadquisicion;
	}


	public String getListadeviajes() {
		return this.listadeviajes;
	}


	public void setListadeviajes(String newListadeviajes) {
		this.listadeviajes = newListadeviajes;
	}

	@Override
	public String toString() {
		return "lineatransporte [marca=" + marca + ", modelo=" + modelo + ", cantidadmaximacarga=" + cantidadmaximacarga
				+ ", fechadeadquisicion=" + fechadeadquisicion + ", listadeviajes=" + listadeviajes + "]";
	}

}
