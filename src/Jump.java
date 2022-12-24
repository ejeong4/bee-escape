import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Jump implements ActionListener{
	Timer timer;
	Canvas c;
	
	public Jump(Canvas c) {
		timer = new Timer(1,this);
		this.c = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		c.accelerate();
	}
}
