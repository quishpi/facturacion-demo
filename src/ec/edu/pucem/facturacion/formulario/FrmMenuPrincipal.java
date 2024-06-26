package ec.edu.pucem.facturacion.formulario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import ec.edu.pucem.facturacion.formulario.FrmFacebook;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;

public class FrmMenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDesktopPane desktopPane;

	public FrmMenuPrincipal() {
		setTitle("SISTEMA DE FACTURACION ELECTRONICA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 443);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		mnArchivo.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnArchivo.add(mntmSalir);
		
		JMenu mnClientes = new JMenu("Clientes");
		mnClientes.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnClientes);
		
		JMenuItem mntmNuevoCliente = new JMenuItem("Crear nuevo");
		mntmNuevoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmCrearCliente frmCliente=new FrmCrearCliente();
				frmCliente.setVisible(true);
				desktopPane.add(frmCliente);
			}
		});
		mntmNuevoCliente.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnClientes.add(mntmNuevoCliente);
		
		JMenuItem mntmListaClientes = new JMenuItem("Lista clientes");
		mntmListaClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmListaCliente frmCliente=new FrmListaCliente();
				frmCliente.setVisible(true);
				desktopPane.add(frmCliente);
			}
		});
		mntmListaClientes.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnClientes.add(mntmListaClientes);
		
		JMenu mnProductos = new JMenu("Productos");
		mnProductos.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnProductos);
		
		JMenu mnRedes = new JMenu("Redes");
		mnRedes.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnRedes);
		
		JMenuItem mntmFacebook = new JMenuItem("Facebook");
		mntmFacebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmFacebook frmFacebook =new FrmFacebook();
				frmFacebook.setVisible(true);
				desktopPane.add(frmFacebook);
			}
		});
		mntmFacebook.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mntmFacebook.setIcon(new ImageIcon(FrmMenuPrincipal.class.getResource("/ec/edu/pucem/facturacion/imagen/facebook.png")));
		mnRedes.add(mntmFacebook);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, "name_12383198435400");
	}

}
