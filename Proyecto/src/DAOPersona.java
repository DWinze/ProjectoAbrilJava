
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class DAOPersona {
// create, read,update,delete
	
	//numero de registros máximos
	public static int NRTMAXIMO = 100;
	public static String ARCHIVO= "personas.datos";
	private RandomAccessFile raf;
	
	public DAOPersona() throws FileNotFoundException {
		this.raf= new RandomAccessFile(ARCHIVO, "rw");
		
	}
	
	public int bytesRegistro() {
		//codigo+nombre+edad+domicilio+estadocivil
		return 4+50+2+4+50+2+1;
	}
	public void creaArchivo() throws IOException {
		for(int nr=0; nr<=NRTMAXIMO; nr++) {
			raf.seek(nr * bytesRegistro());
			raf.write(0);
		}
		
	}
	
	public void fin() throws IOException {
		raf.close();
	}
	
	public void graba(Persona p) throws IOException {
		validaRango(p.getCodigo());
		raf.seek(p.getCodigo() * bytesRegistro());
		raf.write(1);
		raf.writeInt(p.getCodigo());
		String nombre = String.format("%1-50s", p.getNombre());
		raf.writeUTF(nombre);
		raf.writeInt(p.getEdad());
		String domicilio = String.format("%1-50s", p.getDomicilio());
		raf.writeUTF(domicilio);
		raf.writeByte(p.getEstadocivil());//0 1 2
	}
	
	
	
	public void modifica(Persona p) throws IOException {
		graba(p);
	}
	
	public Persona lee(int codigo) throws IOException {
		validaRango(codigo);
		raf.seek(codigo * bytesRegistro());
		//sigue leyendo info
		
		return new Persona();
	}
	
		public void borra(int codigo) throws IOException {
		validaRango(codigo);
		raf.seek(codigo * bytesRegistro());
		raf.writeByte(2);	
	}
		
	/*	public void borraTodo(int codigo) throws IOException {
	 * 
	 * for(){
			validaRango(codigo);
			raf.seek(codigo * bytesRegistro());
			raf.writeByte(2);	
			}
		}
		
		*/
	public void validaRango(int codigo) throws IOException {
		if(codigo <=0 || codigo > NRTMAXIMO)
			throw new DAOException("numero de registro no permitido");
	}
	
	public boolean estaActivo(int codigo) throws IOException {
		raf.seek(codigo* bytesRegistro());
		byte usado = raf.readByte();
		
		return usado != 0;
	}
	
}
