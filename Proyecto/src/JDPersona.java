import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JDPersona extends JDialog {
	private JPanel panel;
	private JButton btnAlta;
	private JButton btnBaja;
	private JButton btnLimpiar;
	private JButton btnAcceder;
	private JButton btnSalir;
	private JPanel panel_1;
	private JLabel lblCodigo;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDPersona dialog = new JDPersona();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public JDPersona() {
		setBounds(100, 100, 450, 300);
		
		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		btnAlta = new JButton("Alta");
		panel.add(btnAlta);
		
		btnBaja = new JButton("Baja");
		panel.add(btnBaja);
		
		btnLimpiar = new JButton("Limpiar");
		panel.add(btnLimpiar);
		
		btnAcceder = new JButton("Acceder");
		panel.add(btnAcceder);
		
		btnSalir = new JButton("Salir");
		panel.add(btnSalir);
		
		panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(155, 8, 33, 14);
		panel_1.add(lblCodigo);
		
		textField = new JTextField();
		textField.setBounds(198, 8, 74, 14);
		panel_1.add(textField);
		textField.setColumns(10);

	}

}
