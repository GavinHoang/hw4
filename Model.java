package hw4Myversion;


// the subject?????
import java.util.ArrayList;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Model
{
	Double value;  
	ArrayList<ChangeListener> listeners;
	public Model(){ listeners = new ArrayList<ChangeListener>(); }
	public double getvalue(){ return value;}
   
	public void attach(ChangeListener c)
	{
		listeners.add(c);
	}

	public void update()
	{
		// notify observers  
		for (ChangeListener l : listeners)
		{      
			l.stateChanged(new ChangeEvent(this));
		}

	}

}

