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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversor_Monedas extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtMoneda;
	private JTextField txtResultado;
	private JComboBox cboDe;
	private JComboBox cboA;

	double cantidad = 0;
	double conversion = 0;
	String de = "Dolar americano";
	String a = "Soles";
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
					Conversor_Monedas frame = new Conversor_Monedas();
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
	public Conversor_Monedas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 326);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblConversor = new JLabel("Conversor de Monedas");
		lblConversor.setForeground(new Color(0, 0, 255));
		lblConversor.setFont(new Font("Arial", Font.BOLD, 16));
		lblConversor.setBounds(149, 10, 184, 13);
		contentPane.add(lblConversor);

		JLabel lblMoneda = new JLabel("Ingrese la moneda:");
		lblMoneda.setForeground(new Color(128, 0, 128));
		lblMoneda.setFont(new Font("Arial", Font.BOLD, 13));
		lblMoneda.setBounds(10, 67, 129, 13);
		contentPane.add(lblMoneda);

		txtMoneda = new JTextField();
		txtMoneda.setForeground(new Color(128, 64, 64));
		txtMoneda.setFont(new Font("Arial", Font.PLAIN, 14));
		txtMoneda.setBounds(149, 64, 184, 19);
		contentPane.add(txtMoneda);
		txtMoneda.setColumns(10);

		JLabel lblConvertir = new JLabel("Conversión:");
		lblConvertir.setForeground(new Color(128, 0, 128));
		lblConvertir.setFont(new Font("Arial", Font.BOLD, 13));
		lblConvertir.setBounds(188, 222, 95, 13);
		contentPane.add(lblConvertir);

		txtResultado = new JTextField();
		txtResultado.setForeground(new Color(128, 64, 64));
		txtResultado.setFont(new Font("Arial", Font.PLAIN, 14));
		txtResultado.setColumns(10);
		txtResultado.setBounds(270, 218, 163, 19);
		contentPane.add(txtResultado);

		JLabel lblConvertir_2 = new JLabel("Convertir");
		lblConvertir_2.setForeground(new Color(128, 0, 0));
		lblConvertir_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblConvertir_2.setBounds(10, 108, 64, 13);
		contentPane.add(lblConvertir_2);

		JLabel lblD1 = new JLabel("De:");
		lblD1.setForeground(new Color(255, 0, 0));
		lblD1.setFont(new Font("Arial", Font.BOLD, 13));
		lblD1.setBounds(10, 142, 45, 13);
		contentPane.add(lblD1);

		JLabel lbld2 = new JLabel("A:");
		lbld2.setForeground(Color.RED);
		lbld2.setFont(new Font("Arial", Font.BOLD, 13));
		lbld2.setBounds(230, 142, 45, 13);
		contentPane.add(lbld2);

		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(this);
		btnMostrar.setBackground(new Color(255, 255, 128));
		btnMostrar.setForeground(new Color(106, 90, 205));
		btnMostrar.setFont(new Font("Arial", Font.BOLD, 13));
		btnMostrar.setBounds(20, 218, 85, 21);
		contentPane.add(btnMostrar);

		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setForeground(new Color(106, 90, 205));
		btnSalir.setFont(new Font("Arial", Font.BOLD, 13));
		btnSalir.setBackground(new Color(255, 255, 128));
		btnSalir.setBounds(299, 258, 85, 21);
		contentPane.add(btnSalir);

		cboDe = new JComboBox();
		cboDe.addActionListener(this);
		cboDe.setModel(new DefaultComboBoxModel(new String[] {"Soles", "Dolar americano", "Peso mexicano", "Euro", "Won", "Yen japones", "Yuan chino"}));
		cboDe.setToolTipText("");
		cboDe.setFont(new Font("Arial", Font.PLAIN, 12));
		cboDe.setBounds(45, 138, 117, 21);
		contentPane.add(cboDe);

		cboA = new JComboBox();
		cboA.addActionListener(this);
		cboA.setModel(new DefaultComboBoxModel(new String[] {"Dolar americano", "Peso mexicano", "Euro", "Won", "Yen japones", "Yuan chino"}));
		cboA.setToolTipText("");
		cboA.setFont(new Font("Arial", Font.PLAIN, 12));
		cboA.setBounds(267, 138, 117, 21);
		contentPane.add(cboA);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setForeground(new Color(106, 90, 205));
		btnLimpiar.setFont(new Font("Arial", Font.BOLD, 13));
		btnLimpiar.setBackground(new Color(255, 255, 128));
		btnLimpiar.setBounds(123, 258, 85, 21);
		contentPane.add(btnLimpiar);
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
		if (e.getSource() == cboA) {
			do_cboA_actionPerformed(e);
		}
		if (e.getSource() == cboDe) {
			do_cboDe_actionPerformed(e);
		}
	}
	protected void do_cboDe_actionPerformed(ActionEvent e) {
		de = cboDe.getSelectedItem().toString();
		
	}
	protected void do_cboA_actionPerformed(ActionEvent e) {
		a = cboA.getSelectedItem().toString();
	}
	protected void do_btnLimpiar_actionPerformed(ActionEvent e) {
		txtMoneda.setText( " ");
        txtResultado.setText( " ");
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
		
		cantidad = Double.parseDouble(txtMoneda.getText());
		int divisa1= cboDe.getSelectedIndex();
		int divisa2= cboA.getSelectedIndex();
		
		//puente
		Conversion puente = new Conversion();
		
		puente.setCantidad(cantidad);
		puente.setDivisa1(divisa1);
		puente.setDivisa2(divisa2);
		
		//ejecutar metodo
		double resultado = puente.convertir();
		
		//Resultado
		txtResultado.setText("$" + resultado) ;
	}
}
