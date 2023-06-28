package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Ventana extends JFrame {

	private Container cp;
	private JPanel panelInf;
	private JScrollPane scrollPane;
	
	private JTable table;
	private DefaultTableModel dtm;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setTitle("Lista Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		
		
		cp= getContentPane();
		//setContentPane(contentPane);
		
		table = new JTable();
		dtm = new DefaultTableModel();
		
		

		dtm.addColumn("ID");
		dtm.addColumn("Edad");
		dtm.addColumn("Nombre");
		
		table.setModel(dtm);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		scrollPane = new JScrollPane();
		//scrollPane.setBounds(0, 0, 800, 400);
		
		scrollPane.setViewportView(table);
		
		
	 	panelInf = new JPanel();
	 	JButton bt = new JButton("Btn01");
	 	JButton bt02 = new JButton("Btn02");
	 	panelInf.add(bt);
	 	panelInf.add(bt02);
	 	
	 	cp.add(scrollPane, BorderLayout.CENTER);
	 	cp.add(panelInf, BorderLayout.SOUTH);
		
	}

}
