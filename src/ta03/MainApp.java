package ta03;

import java.awt.EventQueue;

public class MainApp {
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise3 exercise3 = new Exercise3();
					exercise3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
