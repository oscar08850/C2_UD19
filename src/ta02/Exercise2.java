package ta02;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Exercise2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public Exercise2() {
		
		ArrayList<String> listaPeliculas = new ArrayList<String>();
	    
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscribeElTtulo = new JLabel("Peliculas");
		lblEscribeElTtulo.setBounds(418, 43, 95, 25);
		contentPane.add(lblEscribeElTtulo);
		
		textField = new JTextField();
		textField.setBounds(55, 143, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		

		JComboBox comboBox = new JComboBox<>();
		comboBox.setBounds(335, 143, 191, 24);
		contentPane.add(comboBox);
		JButton btnAadir = new JButton("Añadir");
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pelicula = textField.getText();
				
			    listaPeliculas.add(pelicula);
			    comboBox.addItem(pelicula);
			    
			    textField.setText("");

			}
		});
		btnAadir.setBounds(52, 227, 117, 25);
		contentPane.add(btnAadir);
		
		JLabel lblEscribeElTtulo_1 = new JLabel("Escribe el título de una pelicula");
		lblEscribeElTtulo_1.setBounds(23, 43, 240, 25);
		contentPane.add(lblEscribeElTtulo_1);
		
	}
}
