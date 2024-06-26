package ec.edu.pucem.facturacion.formulario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ec.edu.pucem.facturacion.dominio.Cliente;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class FrmDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private Cliente cliente;
	private String saludo;

	public FrmDemo(Cliente clienteIngreso, String saludo) {
		
		this.cliente = clienteIngreso;
		this.saludo=saludo;
		
		setTitle("Sistema de Facturacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 299, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(65, 84, 46, 14);
		contentPane.add(lblNewLabel);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(67, 232, 89, 23);
		contentPane.add(btnCancelar);

		txtNombre = new JTextField();
		txtNombre.setBounds(145, 81, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(65, 112, 46, 14);
		contentPane.add(lblApellidos);

		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(145, 109, 86, 20);
		contentPane.add(txtApellidos);
				
		//Asigno valores
		txtNombre.setText(cliente.getNombres() + this.saludo);
		txtApellidos.setText(cliente.getApellidos());
	
	}
}
