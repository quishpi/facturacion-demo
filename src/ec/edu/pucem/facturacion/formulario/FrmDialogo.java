package ec.edu.pucem.facturacion.formulario;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmDialogo extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtValor;

	public FrmDialogo(Dialog owner, boolean modal) {
		super(owner,modal);
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Texto");
			lblNewLabel.setBounds(52, 51, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Valor");
			lblNewLabel_1.setBounds(52, 76, 46, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txtNombre = new JTextField();
			txtNombre.setBounds(124, 48, 117, 20);
			contentPanel.add(txtNombre);
			txtNombre.setColumns(10);
		}
		{
			txtValor = new JTextField();
			txtValor.setBounds(124, 73, 86, 20);
			contentPanel.add(txtValor);
			txtValor.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						enviarDatos();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public void enviarDatos() {
		FrmFacebook.llenarFormulario(txtNombre.getText(),txtValor.getText());
		dispose();
	}

}
