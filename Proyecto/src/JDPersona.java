import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JDPersona extends JDialog {
	private JPanel panel;
	private JButton btnAlta;
	private JButton btnBaja;
	private JButton btnLimpiar;
	private JButton btnBuscar;
	private JButton btnSalir;
	private JPanel panel_1;
	private JLabel lblCodigo;
	private JTextField textField;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblNewLabel;
	private JLabel lblDomicilio;
	private JLabel lblEstadoCivil;
	private JComboBox comboBox;
	private JTextField Nombre;
	private JTextField Apellido;
	private JTextField Edad;
	private JTextField Domicilio;

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
		
		btnBuscar = new JButton("Buscar");
		panel.add(btnBuscar);
		
		btnAlta = new JButton("Alta");
		panel.add(btnAlta);
		
		btnBaja = new JButton("Baja");
		panel.add(btnBaja);
		
		btnLimpiar = new JButton("Limpiar");
		panel.add(btnLimpiar);
		
		btnSalir = new JButton("Salir");
		panel.add(btnSalir);
		
		panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		lblCodigo = new JLabel("Codigo");
		lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCodigo.setBackground(Color.LIGHT_GRAY);
		lblCodigo.setBounds(10, 8, 46, 14);
		panel_1.add(lblCodigo);
		
		textField = new JTextField();
		textField.setToolTipText("00");
		textField.setBounds(80, 8, 74, 14);
		panel_1.add(textField);
		textField.setColumns(10);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(31, 39, 46, 14);
		panel_1.add(lblNombre);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblApellido.setBounds(31, 64, 46, 14);
		panel_1.add(lblApellido);
		
		lblNewLabel = new JLabel("Edad");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(31, 91, 46, 14);
		panel_1.add(lblNewLabel);
		
		lblDomicilio = new JLabel("Domicilio");
		lblDomicilio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDomicilio.setBounds(31, 116, 67, 14);
		panel_1.add(lblDomicilio);
		
		lblEstadoCivil = new JLabel("Estado civil");
		lblEstadoCivil.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEstadoCivil.setBounds(31, 143, 67, 14);
		panel_1.add(lblEstadoCivil);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"soltero", "casado", "pareja de hecho"}));
		comboBox.setBounds(126, 140, 108, 20);
		panel_1.add(comboBox);
		
		Nombre = new JTextField();
		Nombre.addMouseListener(new NombreMouseListener());
		Nombre.setText("Juanito");
		Nombre.setToolTipText("Juanito");
		Nombre.setBounds(148, 36, 86, 20);
		panel_1.add(Nombre);
		Nombre.setColumns(10);
		
		Apellido = new JTextField();
		Apellido.setText("");
		Apellido.setBounds(148, 61, 86, 20);
		panel_1.add(Apellido);
		Apellido.setColumns(10);
		
		Edad = new JTextField();
		Edad.setText("");
		Edad.setBounds(148, 88, 86, 20);
		panel_1.add(Edad);
		Edad.setColumns(10);
		
		Domicilio = new JTextField();
		Domicilio.setText("");
		Domicilio.setBounds(148, 113, 86, 20);
		panel_1.add(Domicilio);
		Domicilio.setColumns(10);

	}
	private class NombreMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			
		}
	}
}
