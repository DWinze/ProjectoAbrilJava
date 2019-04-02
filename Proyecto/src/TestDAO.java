import java.io.FileNotFoundException;
import java.io.IOException;

public class TestDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//recomendable hacer un daomanager para manejar otros daos
			
				DAOPersona daop = null;
				try {
					daop = new DAOPersona();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
					try {
						daop.creaArchivo();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
			
	}

}
