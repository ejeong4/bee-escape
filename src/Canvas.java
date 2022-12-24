import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.*;

class Canvas extends JPanel {
	Graphics g;
	Image bg;
	
	Hex hex;
	Hand hand;
	Bee bee;
	TopHand topHand;
	
	int currentBeeY;
	int currentHandY;
	int currentHandX;
	
    private Color color;
    
//    List<Hand> hands[];
    
    public Canvas() {
    	hand = new Hand();
    	bee = new Bee();
    	hex = new Hex();
    	topHand = new TopHand();
    	
        setBackground(Color.BLACK);
        
        bg = new ImageIcon("Assets/bg.jpeg").getImage();
    }

    public void drawPlayer(Graphics g) {
    	this.g = g;
    	g.drawImage(bee.image, bee.x, bee.y, null);
    }
    
    public void drawHand(Graphics g) {
    	this.g = g;
    	g.drawImage(hand.image, hand.x, hand.y, null);
    	g.drawImage(topHand.image, topHand.x + topHand.distance, topHand.y, null);
    }
    
    public void accelerate() {
    	bee.y = bee.y - bee.velocity;
		drawPlayer(g);
		currentBeeY = bee.y;
		
		bee.rect = new Rectangle(bee.x, currentBeeY, bee.width, bee.height);
//		System.out.println(bee.rect.getBounds());
		
		repaint();
    }
    
    public void decelerate() {
    	bee.y = bee.y + bee.decelerate;
		drawPlayer(g);
		currentBeeY = bee.y;
		
		bee.rect = new Rectangle(bee.x, currentBeeY, bee.width, bee.height);
//		System.out.println(bee.rect.getBounds());
		repaint();
    }
    
    public void moveHands() {
    	hand.x = hand.x - hand.velocity;
    	
    	g.drawImage(hand.image, hand.x, hand.y, null);
    	g.drawImage(topHand.image, topHand.x + topHand.distance, topHand.y, null);
    	g.drawImage(hex.image, hand.x, hex.y, null);
    	
    	currentHandX = hand.x;
    	currentHandY = hand.y;
    	
    	hand.rect = new Rectangle(currentHandX, currentHandY, hand.width, hand.height);
//    	System.out.println(hand.rect.getBounds());
    	repaint();
    }

    
    public void collide() {
    	if (bee.rect.intersects(hand.rect)) {
    		System.out.println("Bottom Collided");
    	}
    	else {
//    		System.out.println(bee.rect.getBounds());
//    		System.out.println(hand.rect.getBounds());
    	}
    }
    
    public void paint(Graphics g) {
    	super.paint(g);
    	Graphics2D g2d = (Graphics2D) g;
    	g.drawImage(bg, 0, 0, null);

    	for (int i = 0; i < 50; i ++) {
    		g.drawImage(hand.image, hand.x + (i * 250), hand.y, null);
    		g.drawImage(topHand.image, hand.x + (i * 250) + topHand.distance, topHand.y, null);
    		g.drawImage(hex.image, hand.x + (i * 350), hex.y, null);
    		
    	}
    	
		drawPlayer(g);
    }


}
