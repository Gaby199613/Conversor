package es.espai.windowbuilder;

import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class Conversor_Multiple {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor_Multiple window = new Conversor_Multiple();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Conversor_Multiple() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		
		lblNewLabel = new JLabel("Conversor Múltiple");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setLabelFor(lblNewLabel);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Conversor de Monedas", "Conversor de Temperaturas", "Converdor de unidades de medidas"}));
		comboBox.setEditable(true);
		frame.getContentPane().add(comboBox, BorderLayout.SOUTH);
		
		lblNewLabel_1 = new JLabel("Ingrese la cantidad de monedas:");
		
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblNewLabel_1, BorderLayout.WEST);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}
}
