package id.ac.its.excel.game1;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Asteriod extends Sprite {
	
    private final int ASTEROID = 400;
	
	public Asteriod(int x, int y) {
		super(x, y);
		initAsteroid();
		// TODO Auto-generated constructor stub
	}


	private void initAsteroid() {
		loadImage("src/resources/asteroid.png"); 
        getImageDimensions();
	}


	public void move() {
		if (x < 0) {
			x = ASTEROID;
		}
		x--;
	}
}
