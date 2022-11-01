package ta03;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;

public class Exercise3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Exercise3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(27, 32, 149, 23);
		contentPane.add(rdbtnWindows);

		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(27, 60, 149, 23);
		contentPane.add(rdbtnLinux);

		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(27, 90, 149, 23);
		contentPane.add(rdbtnMac);

		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnLinux);
		bgroup.add(rdbtnMac);
		bgroup.add(rdbtnWindows);

		JCheckBox chckbxProgramacin = new JCheckBox("Programación");
		chckbxProgramacin.setBounds(27, 127, 129, 23);
		contentPane.add(chckbxProgramacin);

		JCheckBox chckbxDiseoGrafico = new JCheckBox("Diseño Grafico");
		chckbxDiseoGrafico.setBounds(27, 157, 129, 23);
		contentPane.add(chckbxDiseoGrafico);

		JCheckBox chckbxAdministracin = new JCheckBox("Administración");
		chckbxAdministracin.setBounds(27, 184, 198, 23);
		contentPane.add(chckbxAdministracin);

		JSlider slider = new JSlider(0,10,5); //Inicializo slider de 0 a 10 y por defecto en 5
		slider.setBounds(27, 225, 295, 102);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(5); //Cada cuanto marco los numeros del slider
		slider.setMinorTickSpacing(1); //Incrementos de cantidad.
		contentPane.add(slider);
		
		JButton btnTerminar = new JButton("Terminar");
		btnTerminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mostrarEncuesta(chckbxProgramacin,chckbxDiseoGrafico,chckbxAdministracin,slider,bgroup);
			}

			
		});
		btnTerminar.setBounds(284, 89, 117, 25);
		contentPane.add(btnTerminar);
		
		
		

	}

	// Método que verifica que cajas están seleccionadas y muestra toda la
	// información

	
	
	
	private void mostrarEncuesta(JCheckBox programacion, JCheckBox disGrafico, JCheckBox Administracion, JSlider slider, ButtonGroup bgroup) {
		String programacionString = "";
		String diseñograficoString = "";
		String administracionString = "";
		if (programacion.isSelected()) {
			programacionString = programacion.getText();
		}
		else if (disGrafico.isSelected()) {
			diseñograficoString = disGrafico.getText();
		}
		else if (Administracion.isSelected()) {
			administracionString = Administracion.getText();
		}

		JOptionPane.showMessageDialog(null,
				"Sistema operativo: " + botonSeleccionado(bgroup) + "\nEspecialidades: " + programacionString + " "
						+ diseñograficoString + " " + administracionString + "\nHoras dedicadas: " + slider.getValue());
		
		
	}
	

	// Método para comprobar cual de todos los botones del grupo ha de devolver el
	// texto.

	public String botonSeleccionado(ButtonGroup buttonGroup) {
		for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
			AbstractButton button = buttons.nextElement();

			if (button.isSelected()) {
				return button.getText();
			}
		}
		return null;

	}
}
