package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversor_Magnitudes extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtMagnitud;
	private JTextField txtResultado;
	private JComboBox cboM1;
	private JComboBox cboM2;
	double magnitud = 0;
	double conversion = 0;
	String m1;
	String m2;
	private JButton btnLimpiar;
	private JButton btnSalir;
	private JButton btnMostrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor_Magnitudes frame = new Conversor_Magnitudes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Conversor_Magnitudes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 201, 130));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConversor3 = new JLabel("Conversor de Magnitudes Físicas");
		lblConversor3.setBounds(100, 10, 268, 19);
		lblConversor3.setForeground(new Color(128, 0, 255));
		lblConversor3.setFont(new Font("Arial", Font.BOLD, 16));
		contentPane.add(lblConversor3);
		
		JLabel lblMagnitud = new JLabel("Ingrese la magnitud:");
		lblMagnitud.setForeground(new Color(0, 0, 128));
		lblMagnitud.setFont(new Font("Arial", Font.BOLD, 13));
		lblMagnitud.setBounds(10, 42, 162, 13);
		contentPane.add(lblMagnitud);
		
		txtMagnitud = new JTextField();
		txtMagnitud.setForeground(Color.BLACK);
		txtMagnitud.setFont(new Font("Arial", Font.PLAIN, 14));
		txtMagnitud.setColumns(10);
		txtMagnitud.setBounds(146, 39, 179, 19);
		contentPane.add(txtMagnitud);
		
		JLabel lblConvertir3 = new JLabel("Convertir:");
		lblConvertir3.setForeground(new Color(128, 0, 0));
		lblConvertir3.setFont(new Font("Arial", Font.BOLD, 13));
		lblConvertir3.setBounds(10, 79, 64, 13);
		contentPane.add(lblConvertir3);
		
		cboM1 = new JComboBox();
		cboM1.addActionListener(this);
		cboM1.setModel(new DefaultComboBoxModel(new String[] {"Masa ", "Longitud ", "Tiempo ", "Mol ", "Luminosidad ", "Corriente eléctrica "}));
		cboM1.setToolTipText("");
		cboM1.setFont(new Font("Arial", Font.PLAIN, 12));
		cboM1.setBounds(84, 75, 144, 21);
		contentPane.add(cboM1);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(this);
		btnMostrar.setForeground(new Color(0, 128, 255));
		btnMostrar.setFont(new Font("Arial", Font.BOLD, 13));
		btnMostrar.setBackground(new Color(0, 255, 255));
		btnMostrar.setBounds(311, 172, 85, 21);
		contentPane.add(btnMostrar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setForeground(new Color(0, 128, 255));
		btnSalir.setFont(new Font("Arial", Font.BOLD, 13));
		btnSalir.setBackground(new Color(128, 255, 255));
		btnSalir.setBounds(256, 232, 85, 21);
		contentPane.add(btnSalir);
		
		JLabel lblConvertir = new JLabel("Conversión:");
		lblConvertir.setForeground(new Color(128, 0, 128));
		lblConvertir.setFont(new Font("Arial", Font.BOLD, 13));
		lblConvertir.setBounds(34, 176, 95, 13);
		contentPane.add(lblConvertir);
		
		txtResultado = new JTextField();
		txtResultado.setForeground(new Color(128, 64, 64));
		txtResultado.setFont(new Font("Arial", Font.PLAIN, 14));
		txtResultado.setColumns(10);
		txtResultado.setBounds(117, 173, 173, 19);
		contentPane.add(txtResultado);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setForeground(new Color(0, 128, 255));
		btnLimpiar.setFont(new Font("Arial", Font.BOLD, 13));
		btnLimpiar.setBackground(new Color(128, 255, 255));
		btnLimpiar.setBounds(57, 232, 102, 21);
		contentPane.add(btnLimpiar);
		
		cboM2 = new JComboBox();
		cboM2.addActionListener(this);
		cboM2.setModel(new DefaultComboBoxModel(new String[] {"Mol ", "Luminosidad ", "Corriente eléctrica", "Masa ", "Longitud ", "Tiempo  "}));
		cboM2.setToolTipText("");
		cboM2.setFont(new Font("Arial", Font.PLAIN, 12));
		cboM2.setBounds(257, 75, 158, 21);
		contentPane.add(cboM2);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnMostrar) {
			do_btnMostrar_actionPerformed(e);
		}
		if (e.getSource() == btnSalir) {
			do_btnSalir_actionPerformed(e);
		}
		if (e.getSource() == btnLimpiar) {
			do_btnLimpiar_actionPerformed(e);
		}
		if (e.getSource() == cboM2) {
			do_cboM2_actionPerformed(e);
		}
		if (e.getSource() == cboM1) {
			do_cboM1_actionPerformed(e);
		}
	}
	protected void do_cboM1_actionPerformed(ActionEvent e) {
		m1 = cboM1.getSelectedItem().toString();
		
	}
	protected void do_cboM2_actionPerformed(ActionEvent e) {
		m2 = cboM2.getSelectedItem().toString();
	}
	protected void do_btnLimpiar_actionPerformed(ActionEvent e) {
		txtMagnitud.setText("");
		txtResultado.setText("");
	}
	protected void do_btnSalir_actionPerformed(ActionEvent e) {
		int r=JOptionPane.showOptionDialog(this ,
			    "Estas seguro de salir ....?", 
			    " Conversor de monedas",
			    JOptionPane.YES_NO_OPTION,
			    JOptionPane.QUESTION_MESSAGE, null, null,null);
			    if (r==0) System.exit(0);
	}
	protected void do_btnMostrar_actionPerformed(ActionEvent e) {
		magnitud= Double.parseDouble(txtMagnitud.getText());
		
		int m1= cboM1.getSelectedIndex();
		int m2 = cboM2.getSelectedIndex();
		
		//puente
		Calculo puente = new Calculo();
		
		puente.setM1(m1);
		puente.setM2(m2);
		puente.setMagnitud(magnitud);
		
		//ejecutar metodo
		double resultado = puente.convertir();
		
		//Resultado
		txtResultado.setText("" + resultado) ;
	}
}
