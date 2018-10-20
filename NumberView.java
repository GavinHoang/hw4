package hw4AnotherVersion;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class NumberView {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JFrame barframe = new JFrame();
		frame.setLayout(new GridLayout(3, 2));
		barframe.setLayout(new GridLayout(3, 2));
		
		for(int i = 0; i < 3; i++)
		{
			//model.updateNumber(index, x);
			JLabel lb1 = new JLabel("Number " + (i + 1));
		
			GraphView bar = new GraphView();
			JLabel label = new JLabel(bar);
			barframe.add(label);
			JTextField jt = new JTextField(20);
			frame.add(lb1);
			frame.add(jt);
			
			jt.getDocument().addDocumentListener(new DocumentListener(){

				@Override
				public void changedUpdate(DocumentEvent arg0) {
					// TODO Auto-generated method stub
					warn();
				}

				@Override
				public void insertUpdate(DocumentEvent arg0) {
					// TODO Auto-generated method stub
					warn();
				}

				@Override
				public void removeUpdate(DocumentEvent arg0) {
					// TODO Auto-generated method stub
					warn();
				}
				
				public void warn()
				{
					if(jt.getText().equals(""))
					{
						bar.setLength(0);
						label.repaint();
					}
					else {
						bar.setLength(Integer.parseInt(jt.getText()));
						label.repaint();
					}
					
				}
				
			});
		}
		
		frame.setSize(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	
		barframe.setSize(500, 100);
		barframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		barframe.setResizable(false);
		barframe.setVisible(true);
		
		
	}	
			

}
