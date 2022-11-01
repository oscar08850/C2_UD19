package ta01;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Exercise1 extends JFrame {

	private JPanel contentPane; 


	public Exercise1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscribeUnNombre = new JLabel("Escribe un nombre para saludar");
		lblEscribeUnNombre.setBounds(121, 22, 237, 40);
		contentPane.add(lblEscribeUnNombre);
		
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(81, 91, 289, 40);
		contentPane.add(textPane);
				
		
				
		
		JButton btnNewButton = new JButton("¡Saludar!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombre = textPane.getText();
				JOptionPane.showMessageDialog(null,"¡Hola " + nombre + "!");
			}
		});
		btnNewButton.setBounds(153, 176, 117, 25);
		contentPane.add(btnNewButton);
		
		
		
	
	}
}
