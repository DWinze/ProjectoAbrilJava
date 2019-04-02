
public class Persona {
		
	
	protected int codigo; // 4
	protected String Nombre; //50 +2 utf	
	protected int edad;			//4
	protected String domicilio; //50+2
	protected byte eCivil;  //1
	
	
	public Persona(int codigo, String nombre, int edad, String domicilio, byte estadocivil) {
		super();
		this.codigo = codigo;
		Nombre = nombre;
		this.edad = edad;
		this.domicilio = domicilio;
		this.eCivil = estadocivil;
	}


	public Persona() {
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public byte getEstadocivil() {
		return eCivil;
	}


	public void setEstadocivil(byte estadocivil) {
		this.eCivil = estadocivil;
	}
	
	
	
}						   
							
							