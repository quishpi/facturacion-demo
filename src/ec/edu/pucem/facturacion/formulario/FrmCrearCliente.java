package ec.edu.pucem.facturacion.formulario;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ec.edu.pucem.facturacion.dominio.Cliente;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmCrearCliente extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtCedula;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtEmail;
	private JTable table;
	private DefaultTableModel model;
	private Cliente cliente;

	public FrmCrearCliente() {
		setTitle("Crear Clientes");
		setBounds(100, 100, 402, 451);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Cedula");
		lblNewLabel.setBounds(10, 11, 72, 14);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nombres");
		lblNewLabel_1.setBounds(10, 33, 72, 14);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Apellidos");
		lblNewLabel_2.setBounds(10, 62, 72, 14);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Direccion");
		lblNewLabel_3.setBounds(10, 87, 72, 14);
		getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Telefono");
		lblNewLabel_4.setBounds(10, 119, 72, 14);
		getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setBounds(10, 144, 72, 14);
		getContentPane().add(lblNewLabel_5);

		txtCedula = new JTextField();
		txtCedula.setBounds(92, 5, 98, 20);
		getContentPane().add(txtCedula);
		txtCedula.setColumns(10);

		txtNombres = new JTextField();
		txtNombres.setBounds(92, 30, 232, 20);
		getContentPane().add(txtNombres);
		txtNombres.setColumns(10);

		txtApellidos = new JTextField();
		txtApellidos.setBounds(92, 56, 232, 20);
		getContentPane().add(txtApellidos);
		txtApellidos.setColumns(10);

		txtDireccion = new JTextField();
		txtDireccion.setBounds(92, 81, 232, 20);
		getContentPane().add(txtDireccion);
		txtDireccion.setColumns(10);

		txtTelefono = new JTextField();
		txtTelefono.setBounds(92, 113, 232, 20);
		getContentPane().add(txtTelefono);
		txtTelefono.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setBounds(92, 138, 232, 20);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);

		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setBounds(10, 199, 89, 23);
		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearCliente();
			}
		});
		btnNewButton_1.setBounds(109, 199, 89, 23);
		getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setBounds(208, 199, 89, 23);
		getContentPane().add(btnNewButton_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 233, 317, 177);
		getContentPane().add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Cedula", "Nombres", "Apellidos" }));
		scrollPane.setViewportView(table);
		model = (DefaultTableModel) table.getModel();

	}

	private void crearCliente() {
		cliente = new Cliente();
		cliente.setCedula(this.txtCedula.getText());
		cliente.setNombres(this.txtNombres.getText());
		cliente.setApellidos(this.txtApellidos.getText());
		cliente.setDireccion(this.txtDireccion.getText());
		cliente.setTelefono(this.txtTelefono.getText());
		cliente.setEmail(this.txtEmail.getText());
		agregarFila();

	}

	private void agregarFila() {
		Object[] fila = new Object[3];
		fila[0] = cliente.getCedula();
		fila[1] = cliente.getNombres();
		fila[2] = cliente.getApellidos();
		model.addRow(fila);

	}
}
