package hw4Myversion;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class Test {
		private static ArrayList<TextFieldPart> items  = new ArrayList<>();
		private static ArrayList<ChangeListener> listeners = new ArrayList<>();

	public static void main(String[] args) {	
		
		JTextField text1 = new TextFieldPart();
		JTextField text2 = new TextFieldPart();
		JTextField text3 = new TextFieldPart();
		
		items.add((TextFieldPart) text1);
		items.add((TextFieldPart) text2);
		items.add((TextFieldPart) text3);
		
	    JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(3, 2));		
		JLabel lb1 = new JLabel("Number 1");	
		JLabel lb2 = new JLabel("Number 2");		
		JLabel lb3 = new JLabel("Number 3");
		JLabel lb4 = new JLabel();
		
		jp.add(lb1);
		jp.add(text1);
		jp.add(lb2);
		jp.add(text2);
		jp.add(lb3);
		jp.add(text3);
		
	     JFrame textframe = new JFrame();
	     
	     textframe.add(jp);
	     textframe.setSize(400, 100);
	     textframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     textframe.setResizable(false);
	      //frame.pack();
	     textframe.setVisible(true);
	     
	     JFrame barframe = new JFrame();
	     Bar bar = new Bar();
	     lb4.setIcon(bar);
	     
	     barframe.add(lb4);
	     barframe.setSize(400, 300);
	     barframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     barframe.setResizable(false);
	      //frame.pack();
	     barframe.setVisible(true);
		
	}

}
