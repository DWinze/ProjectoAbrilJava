import java.io.IOException;

public class DAOException extends IOException {
	
	public DAOException() {
		super("Error dao");
	}
	
	public DAOException(String m) {
		super("Error dao: " + m);
	}
	
}
