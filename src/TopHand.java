import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class TopHand {
	Image image;
	Rectangle rect;
	int x;
	int y;
	int distance;
	int width;
	int height;
	
	public TopHand() {
		image = new ImageIcon("Assets/hand-flipped.png").getImage();
		System.out.println(image);
		distance = 125;
		x = 1000 + distance;
		y = -50;
		width = image.getWidth(null);
		height = image.getHeight(null);
		rect = new Rectangle(x, y, width, height);
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
