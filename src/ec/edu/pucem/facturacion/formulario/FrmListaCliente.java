package ec.edu.pucem.facturacion.formulario;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FrmListaCliente extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	public FrmListaCliente() {
		setTitle("Lista de Clientes");
		setBounds(100, 100, 605, 353);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 64, 531, 177);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Cedula", "Nombres", "Apellidos" }));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Agregar nuevo");
		btnNewButton.setBounds(21, 30, 136, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(458, 263, 89, 23);
		getContentPane().add(btnNewButton_1);

	}
}
