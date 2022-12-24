import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Bee {
	Graphics g;
	Image image;
	Rectangle rect;
	int x;
	int y;
	int width;
	int height;
	int velocity;
	int decelerate;
	
	public Bee() {
		
		image = new ImageIcon("Assets/bee.png").getImage();
		x = 150;
		y = 100;
		velocity = 1;
		decelerate = 2;
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
