package fr.imie.morpion.view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
	}

}
