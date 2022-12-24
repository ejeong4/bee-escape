import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Hand {
	Image image;
	Rectangle rect;
	int x;
	int y;
	int width;
	int height;
	int velocity;
	
	public Hand() {
		System.out.println("In hand");
		
		image = new ImageIcon("Assets/hand.png").getImage();
		x = 1000;
		y = 300;
		velocity = 1;
		width = image.getWidth(null);
		height = image.getHeight(null);
		rect = new Rectangle();
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
