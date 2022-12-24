import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Gravity implements ActionListener{
		Canvas c;
		Timer timer;
		
		public Gravity(Canvas c) {
			timer = new Timer(8,this);
			this.c = c;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			c.decelerate();
		}
	
}
