package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class MainFrame {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public MainFrame() {
		MainFrame window = new MainFrame();
		window.frame.setVisible(true);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
