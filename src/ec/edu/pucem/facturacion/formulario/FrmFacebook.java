package ec.edu.pucem.facturacion.formulario;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import ec.edu.pucem.facturacion.dominio.Cliente;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class FrmFacebook extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private static JLabel lblMensajeRecibido;

	public FrmFacebook() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton btnAlerta = new JButton("Alerta");
		btnAlerta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Mensaje","Titulo",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnAlerta.setBounds(113, 28, 132, 23);
		getContentPane().add(btnAlerta);
		
		JButton btnConfirmacion = new JButton("Confirmacion");
		btnConfirmacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dialogResult=JOptionPane.showConfirmDialog(null, "Estas seguro?","Cofirme",JOptionPane.YES_NO_OPTION);
				if(dialogResult==JOptionPane.YES_OPTION) {
					System.out.println("Pulso en SI");
				}else {
					System.out.println("Pulsado en NO");
				}
				
			}
		});
		btnConfirmacion.setBounds(113, 62, 132, 23);
		getContentPane().add(btnConfirmacion);
		
		JButton btnNewButton = new JButton("Enviar Objeto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enviarObjeto();
			}
		});
		btnNewButton.setBounds(113, 96, 132, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Recibir Objeto");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recibirObjeto();
			}
		});
		btnNewButton_1.setBounds(112, 134, 133, 23);
		getContentPane().add(btnNewButton_1);
		
		lblMensajeRecibido = new JLabel("New label");
		lblMensajeRecibido.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblMensajeRecibido.setBounds(85, 181, 260, 23);
		getContentPane().add(lblMensajeRecibido);

	}
	private void enviarObjeto() {
		Cliente cliente=new Cliente();
		cliente.setNombres("Luis");
		cliente.setApellidos("Quishpi");
		cliente.setCedula("00001");
		
		FrmDemo frmDemo=new FrmDemo(cliente, "hola");
		frmDemo.setVisible(true);
	}
	
	private void recibirObjeto() {
		FrmDialogo frmDialogo=new FrmDialogo(new JDialog(),true);
		frmDialogo.setVisible(true);
	}
	
	public static void llenarFormulario(String nombre, String valor) {
		lblMensajeRecibido.setText(nombre +" - " + valor);
	}
}
