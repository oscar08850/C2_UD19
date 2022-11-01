package ta02;

import java.awt.EventQueue;

public class MainApp {
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise2 exercise2 = new Exercise2();
					exercise2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
