package ta01;

import java.awt.EventQueue;

public class MainApp {
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise1 exercise1 = new Exercise1();
					exercise1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
