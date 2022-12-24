import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class MoveHands implements ActionListener {
	Timer timer;
	Canvas c;
	Graphics g;
	
	public MoveHands(Canvas c) {
		timer = new Timer(6, this);
		this.c = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		c.moveHands();
//		System.out.println("In move");
		
	}
}
