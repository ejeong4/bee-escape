import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Hex {
	Graphics g;
	Image image;
	Rectangle rect;
	int x;
	int y;
	int width;
	int height;
	
	public Hex() {
		image = new ImageIcon("Assets/hex.png").getImage();
		x = 1000;
		y = 220;
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
