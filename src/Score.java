import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.Timer;


public class Score implements ActionListener {
	Timer timer;
	BeeGame game;
	
	public Score(BeeGame game) {
		this.game = game;
		timer = new Timer(4500, this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		game.score++;
		
		game.scorelabel.setText("Score: " + game.score);
		game.scorelabel.setFont(new Font("San Serif", Font.PLAIN, 28));
        
		game.scoreboard.add(game.enter);
        game.scoreboard.add(game.scorelabel);
	}

}
