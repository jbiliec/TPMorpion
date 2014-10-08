package fr.imie.morpion.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {
	
	public View(){
		
	}
	
	public void MakeIHM(){
		
		JFrame frame = new JFrame("Morpion");
		frame.setVisible(true);
		frame.setSize(new Dimension(900,600));
		
		JPanel mainPanel = new JPanel();
		JPanel headPanel = new JPanel();
		JPanel scorePanel = new JPanel();
		JPanel gridPanel = new JPanel();
		
		JTextField txtNameA = new JTextField();
		JTextField txtNameB = new JTextField();
		JLabel lblNameA = new JLabel("Joueur A:");
		JLabel lblNameB = new JLabel("Joueur B:");
		
		headPanel.setLayout(new GridLayout(1,4));
		gridPanel.setLayout(new GridLayout(3,3));
		mainPanel.setLayout(new BorderLayout());
		
		headPanel.add(lblNameA);
		headPanel.add(txtNameA);
		headPanel.add(lblNameB);
		headPanel.add(txtNameB);
		
	}

}
