package examen;

public abstract class persona {

	public String Nombre; 
	public String tienePelo; 
	public String esAlto;
	public String esCastaño;
	public String tocaGuitarra;
	
	public persona() {
		this.Nombre=null;
		this.tienePelo=null;
		this.esAlto=null;
		this.esCastaño=null;
		this.tocaGuitarra=null;	
	}
	
	public void setNombre(String nombreAl) {
		Nombre= nombreAl;
	}
		
	public String getNombre() {
		return Nombre;
	}
	
	public void setPelo(String atributo) {
		tienePelo= atributo;
	}
	
	public String getPelo() {
		return tienePelo;
	}
	
	public void setAltura(String atributo) {
		esAlto= atributo;
	}
	
	public String getAltura() {
		return esAlto;
	}
	
	public void setCastaño(String atributo) {
		esCastaño= atributo;
	}
	
	public String getCastaño() {
		return esCastaño;
	}
		
	public void setGuitarra(String atributo) {
		tocaGuitarra= atributo;
	}
	
	public String tocaGuitarra() {
		return tocaGuitarra;
		
	}
	

	}
