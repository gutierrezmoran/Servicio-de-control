package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.ScrollPaneConstants;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class UI extends JFrame {

	protected JPanel contentPane;
	protected JTextField nombre;
	protected JTextField movil;
	protected JButton agregarCliente;
	protected JTextArea clientesEnEspera;
	protected JTextArea clientesAtendidos;
	protected JButton atenderCliente;
	protected JLabel tiempoMedioAtendidos;
	protected JLabel tiempoMedioEsperando;
	private JLabel informadorError;
	protected JLabel itemsAtendidos;
	protected JLabel itemsEsperando;

	public UI() {
		setTitle("Servicio de control");
		setMinimumSize(new Dimension(800, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 0, 0, 0));
		contentPane.add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorte = new JPanel();
		panelNorte.setOpaque(false);
		panelNorte.setBorder(new EmptyBorder(0, 5, 5, 5));
		panelPrincipal.add(panelNorte, BorderLayout.NORTH);
		panelNorte.setLayout(new BorderLayout(5, 5));
		
		JPanel panelCampos = new JPanel();
		panelCampos.setBackground(SystemColor.inactiveCaption);
		panelCampos.setBorder(new EmptyBorder(15, 10, 15, 10));
		panelNorte.add(panelCampos, BorderLayout.CENTER);
		panelCampos.setLayout(new GridLayout(2, 1, 0, 10));
		
		JPanel panelNombre = new JPanel();
		panelNombre.setOpaque(false);
		panelCampos.add(panelNombre);
		panelNombre.setLayout(new BorderLayout(0, 0));
		
		JLabel etiquetaNombre = new JLabel("Nombre");
		etiquetaNombre.setBorder(null);
		etiquetaNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelNombre.add(etiquetaNombre, BorderLayout.NORTH);
		
		nombre = new JTextField();
		nombre.setBorder(new EmptyBorder(4, 4, 4, 4));
		nombre.setMinimumSize(new Dimension(40, 20));
		panelNombre.add(nombre);
		nombre.setColumns(10);
		
		JPanel panelMovil = new JPanel();
		panelMovil.setOpaque(false);
		panelCampos.add(panelMovil);
		panelMovil.setLayout(new BorderLayout(0, 0));
		
		JLabel etiquetaMovil = new JLabel("M\u00F3vil");
		etiquetaMovil.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelMovil.add(etiquetaMovil, BorderLayout.NORTH);
		
		movil = new JTextField();
		movil.setBorder(new EmptyBorder(4, 4, 4, 4));
		movil.setColumns(10);
		panelMovil.add(movil);
		
		agregarCliente = new JButton("A\u00F1adir cliente");
		agregarCliente.setFocusPainted(false);
		agregarCliente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		agregarCliente.setBorderPainted(false);
		agregarCliente.setForeground(Color.WHITE);
		agregarCliente.setBackground(new Color(60, 179, 113));
		agregarCliente.setFont(new Font("Arial Black", Font.BOLD, 25));
		panelNorte.add(agregarCliente, BorderLayout.EAST);
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBorder(new EmptyBorder(10, 10, 10, 10));
		panelCentral.setBackground(SystemColor.activeCaption);
		panelPrincipal.add(panelCentral, BorderLayout.CENTER);
		GridBagLayout gbl_panelCentral = new GridBagLayout();
		gbl_panelCentral.columnWidths = new int[]{392, 392, 0};
		gbl_panelCentral.rowHeights = new int[]{0, 150, 0, 0, 0, 0};
		gbl_panelCentral.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panelCentral.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		panelCentral.setLayout(gbl_panelCentral);
		
		atenderCliente = new JButton("Atender cliente");
		atenderCliente.setFocusPainted(false);
		atenderCliente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		atenderCliente.setForeground(Color.WHITE);
		atenderCliente.setFont(new Font("Arial", Font.BOLD, 16));
		atenderCliente.setBackground(SystemColor.textHighlight);
		atenderCliente.setBorderPainted(false);
		GridBagConstraints gbc_atenderCliente = new GridBagConstraints();
		gbc_atenderCliente.insets = new Insets(0, 0, 5, 0);
		gbc_atenderCliente.fill = GridBagConstraints.BOTH;
		gbc_atenderCliente.gridwidth = 2;
		gbc_atenderCliente.gridx = 0;
		gbc_atenderCliente.gridy = 0;
		panelCentral.add(atenderCliente, gbc_atenderCliente);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 4;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		panelCentral.add(panel, gbc_panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		
		clientesEnEspera = new JTextArea();
		clientesEnEspera.setFont(new Font("Monospaced", Font.BOLD, 13));
		clientesEnEspera.setEditable(false);
		clientesEnEspera.setBorder(new EmptyBorder(10, 10, 10, 10));
		clientesEnEspera.setColumns(3);
		
		
		JScrollPane scrollPaneEspera = new JScrollPane(clientesEnEspera);
		panel.add(scrollPaneEspera);
		scrollPaneEspera.setBorder(null);
		
		JLabel lblClientesEsperando = new JLabel("Clientes esperando");
		lblClientesEsperando.setBorder(new EmptyBorder(5, 0, 5, 0));
		lblClientesEsperando.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClientesEsperando.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPaneEspera.setColumnHeaderView(lblClientesEsperando);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		tiempoMedioEsperando = new JLabel("");
		panel_2.add(tiempoMedioEsperando, BorderLayout.WEST);
		tiempoMedioEsperando.setBorder(new EmptyBorder(3, 3, 3, 3));
		tiempoMedioEsperando.setHorizontalAlignment(SwingConstants.LEFT);
		tiempoMedioEsperando.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 9));
		
		itemsEsperando = new JLabel("");
		itemsEsperando.setFont(new Font("Tahoma", Font.BOLD, 9));
		panel_2.add(itemsEsperando, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 4;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 1;
		panelCentral.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		clientesAtendidos = new JTextArea();
		clientesAtendidos.setFont(new Font("Monospaced", Font.BOLD, 13));
		clientesAtendidos.setEditable(false);
		clientesAtendidos.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		JScrollPane scrollPaneAtendidos = new JScrollPane(clientesAtendidos);
		panel_1.add(scrollPaneAtendidos);
		scrollPaneAtendidos.setBorder(null);
		
		JLabel lblClientesAtendidos = new JLabel("Clientes atendidos");
		lblClientesAtendidos.setBorder(new EmptyBorder(5, 0, 5, 0));
		lblClientesAtendidos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClientesAtendidos.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPaneAtendidos.setColumnHeaderView(lblClientesAtendidos);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_1.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		tiempoMedioAtendidos = new JLabel("");
		panel_3.add(tiempoMedioAtendidos, BorderLayout.WEST);
		tiempoMedioAtendidos.setBorder(new EmptyBorder(3, 3, 3, 3));
		tiempoMedioAtendidos.setHorizontalAlignment(SwingConstants.LEFT);
		tiempoMedioAtendidos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 9));
		
		itemsAtendidos = new JLabel("");
		itemsAtendidos.setFont(new Font("Tahoma", Font.BOLD, 9));
		panel_3.add(itemsAtendidos, BorderLayout.EAST);
		
		JPanel panelSur = new JPanel();
		panelSur.setBorder(new EmptyBorder(5, 10, 5, 10));
		panelPrincipal.add(panelSur, BorderLayout.SOUTH);
		panelSur.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPrctica = new JLabel("Ejercicio 5 - Jos\u00E9 Emilio Guti\u00E9rrez");
		lblPrctica.setBorder(null);
		lblPrctica.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrctica.setForeground(Color.GRAY);
		lblPrctica.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 9));
		panelSur.add(lblPrctica, BorderLayout.WEST);
		
		informadorError = new JLabel("N\u00FAmero de tel\u00E9fono inv\u00E1lido");
		panelSur.add(informadorError, BorderLayout.EAST);
		informadorError.setBorder(new EmptyBorder(3, 3, 3, 3));
		informadorError.setVisible(false);
		informadorError.setForeground(new Color(220, 20, 60));
		informadorError.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 9));
		
		JLabel lblEmpresa = new JLabel("SERVICIO DE CONTROL");
		contentPane.add(lblEmpresa, BorderLayout.NORTH);
		lblEmpresa.setBorder(new EmptyBorder(0, 10, 0, 0));
		lblEmpresa.setOpaque(true);
		lblEmpresa.setForeground(Color.WHITE);
		lblEmpresa.setBackground(Color.DARK_GRAY);
		lblEmpresa.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmpresa.setFont(new Font("Arial Black", Font.BOLD, 45));
	}

	public JTextArea getClientesEnEspera() {
		return clientesEnEspera;
	}

	public void setClientesEnEspera(JTextArea clientesEnEspera) {
		this.clientesEnEspera = clientesEnEspera;
	}

	public JTextArea getClientesAtendidos() {
		return clientesAtendidos;
	}

	public void setClientesAtendidos(JTextArea clientesAtendidos) {
		this.clientesAtendidos = clientesAtendidos;
	}
	
	public boolean comprobarValorDeCampos() {
		return !isEmptyJTextField(this.nombre) && !isEmptyJTextField(this.movil);
	}
	
	private boolean isEmptyJTextField(Object campo) {
		return ((JTextField) campo).getText().isEmpty();
	}
	
	public void ocultarInformadorDeErrores() {
		informadorError.setVisible(false);
	}
	
	public void mostrarInformadorDeErrores() {
		informadorError.setVisible(true);
	}

}
