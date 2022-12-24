import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Keys implements KeyListener {
    private BeeGame game;
    private Gravity gravity;
    private Jump jump;
    private MoveHands moveHands;
    private Score score;


    public Keys(BeeGame game) {
        this.game = game;
        game.canvas.repaint();
        
        score = new Score(game);
        gravity = new Gravity(game.canvas);
        jump = new Jump(game.canvas);
        moveHands = new MoveHands(game.canvas);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed!");
        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == 10) {
        	moveHands.timer.start();
        	score.timer.start();
        	
        }
		if (e.getKeyCode() == 38) {
			gravity.timer.stop();
			jump.timer.start();
			
		}
    }
    @Override
    public void keyReleased(KeyEvent e) {
    	System.out.println("Key Released");
    	jump.timer.stop();
    	gravity.timer.start();
    	
    }
}
