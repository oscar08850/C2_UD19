package ta04;

import java.awt.EventQueue;

public class MainApp {
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise4 Calculadora = new Exercise4();
					Calculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
