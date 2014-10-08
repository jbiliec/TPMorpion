package fr.imie.morpion.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
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
		JLabel lblSpace = new JLabel("         ");
		
		headPanel.setLayout(new GridLayout(1,5));
		gridPanel.setLayout(new GridLayout(3,3));
		mainPanel.setLayout(new BorderLayout());
		scorePanel.setLayout(new GridLayout(2,10));
		
		headPanel.add(lblNameA);
		headPanel.add(txtNameA);
		headPanel.add(lblSpace);
		headPanel.add(lblNameB);
		headPanel.add(txtNameB);
		
		
		mainPanel.add(headPanel,BorderLayout.NORTH);
		mainPanel.add(gridPanel,BorderLayout.CENTER);
		mainPanel.add(scorePanel,BorderLayout.EAST);
		
		frame.setContentPane(mainPanel);
		Graphics headerCell = null;
		this.PaintHeader(headerCell);
		
	}
	
	public void PaintHeader(Graphics g){
		g.setColor(Color.black);
		g.drawRect(0, 50, 900, 50);
	}

}
