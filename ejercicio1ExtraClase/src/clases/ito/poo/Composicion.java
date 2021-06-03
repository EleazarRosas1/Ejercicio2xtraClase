package clases.ito.poo;

import java.util.Date;

import java.util.ArrayList;


public class Composicion {

	


	public Composicion(String titulo, Float duracionPista, String generoMusical,
			java.util.Date date, java.util.Date date2) {
		super();
		this.titulo = titulo;
		this.duracionPista = duracionPista;
		this.interpretes = interpretes;
		this.generoMusical = generoMusical;
		this.fechaDeRegistro = (Date) date;
		this.fechaDeEstreno = (Date) date2;
	}


	private String titulo;
	private Float duracionPista;
    private static java.util.List<String> interpretes= new ArrayList<String>();
	private String generoMusical;
	private Date fechaDeRegistro;
	private Date fechaDeEstreno;
	
		
	
	public  void solicitarCompositor(String nuevoInterprete) {
	   
		interpretes.add(nuevoInterprete);
	    
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public Float getDuracionPista() {
		return duracionPista;
	}



	public void setDuracionPista(Float duracionPista) {
		this.duracionPista = duracionPista;
	}



	public static java.util.List<String> getInterpretes() {
		return interpretes;
	}



	public static void setInterpretes(java.util.List<String> interpretes) {
		Composicion.interpretes = interpretes;
	}



	public String getGeneroMusical() {
		return generoMusical;
	}



	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}



	public Date getFechaDeRegistro() {
		return fechaDeRegistro;
	}



	public void setFechaDeRegistro(Date fechaDeRegistro) {
		this.fechaDeRegistro = fechaDeRegistro;
	}



	public Date getFechaDeEstreno() {
		return fechaDeEstreno;
	}



	public void setFechaDeEstreno(Date fechaDeEstreno) {
		this.fechaDeEstreno = fechaDeEstreno;
	}



	@Override
	public String toString() {
		return "Composicion [titulo=" + titulo + ", duracionPista=" + duracionPista + ", generoMusical=" + generoMusical
				+ ", fechaDeRegistro=" + fechaDeRegistro + ", fechaDeEstreno=" + fechaDeEstreno + "]";
	}
}

