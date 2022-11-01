package ta04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercise4 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNum2;
	private JTextField textFieldNum1;

	/**
	 * Create the frame.
	 */
	public Exercise4() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 566, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(422, 76, 87, 17);
		contentPane.add(lblResultado);

		textFieldNum1 = new JTextField();
		textFieldNum1.setColumns(10);
		textFieldNum1.setBounds(34, 75, 114, 19);
		contentPane.add(textFieldNum1);

		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(290, 75, 114, 19);
		contentPane.add(textFieldNum2);
		textFieldNum2.setColumns(10);

		JButton buttonSuma = new JButton("+");
		buttonSuma.setBounds(74, 130, 52, 31);
		contentPane.add(buttonSuma);

		JButton buttonResta = new JButton("-");
		buttonResta.setBounds(178, 130, 52, 31);
		contentPane.add(buttonResta);

		JButton buttonDivision = new JButton("/");
		buttonDivision.setBounds(273, 130, 52, 31);
		contentPane.add(buttonDivision);

		JButton buttonMultiplicacion = new JButton("*");
		buttonMultiplicacion.setBounds(372, 130, 52, 31);
		contentPane.add(buttonMultiplicacion);

		JButton buttonAbout = new JButton("About");
		buttonAbout.setBounds(154, 201, 76, 34);
		contentPane.add(buttonAbout);

		JButton buttonSalir = new JButton("Salir");
		buttonSalir.setBounds(371, 203, 70, 31);
		contentPane.add(buttonSalir);

		JLabel lblSigno = new JLabel("");
		lblSigno.setBounds(202, 62, 28, 31);
		contentPane.add(lblSigno);

		// Operaciones botones

		buttonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblSigno.setText("+");
				try {
					String resultado = "= " + Integer.toString(
							((Integer.parseInt(textFieldNum1.getText()) + Integer.parseInt(textFieldNum2.getText()))));
					lblResultado.setText(resultado);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error en el imput");
				}
			}
		});

		buttonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblSigno.setText("-");
				try {
					String resultado = "= " + Integer.toString(
							((Integer.parseInt(textFieldNum1.getText()) - Integer.parseInt(textFieldNum2.getText()))));
					lblResultado.setText(resultado);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error en el imput");
				}
			}
		});

		buttonMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblSigno.setText("*");
				try {
					String resultado = "= " + Integer.toString(
							((Integer.parseInt(textFieldNum1.getText()) * Integer.parseInt(textFieldNum2.getText()))));
					lblResultado.setText(resultado);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error en el imput");
				}
			}
		});

		buttonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblSigno.setText("/");
				try {
					String resultado = "= " + Integer.toString(
							((Integer.parseInt(textFieldNum1.getText()) / Integer.parseInt(textFieldNum2.getText()))));
					lblResultado.setText(resultado);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error en el imput");
				}
			}
		});
		
		buttonAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Programa creado por Oscar Vilamitjana\n Version 1.0 \n Noviembre 2022");
			}
		});
		
		
		buttonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		        System.exit(0);
			}
		});

		
	}
}
