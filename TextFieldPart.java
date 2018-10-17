package hw4Myversion;

import java.awt.GridLayout;
import java.awt.TextComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


// in this frame, we have an array of text field 
public class TextFieldPart extends JTextField implements Subject{

	
	Model model = new Model();
	private ArrayList<ChangeListener> listeners;
	
	
	public void addChangeListener(ChangeListener listener)
	   {
	      listeners.add(listener);
	   }
	
	@Override
	public void Attach() {}
	@Override
	public void Dettach() {}

	@Override
	public void Notify() {
		// TODO Auto-generated method stub
			getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {		notifyObservers();		}

			@Override
			public void insertUpdate(DocumentEvent arg0) {		notifyObservers();		}

			@Override
			public void removeUpdate(DocumentEvent arg0) {		notifyObservers();		}	
			public void notifyObservers() { 
				//set the bar length to the updated length. observer: DrawBar
				model.value = Double.parseDouble(getText()); // update the model
				 ChangeEvent event = new ChangeEvent(this);
			      for (ChangeListener listener : listeners)
			         listener.stateChanged(event);
			}
	      });
	     
		
	}

}
