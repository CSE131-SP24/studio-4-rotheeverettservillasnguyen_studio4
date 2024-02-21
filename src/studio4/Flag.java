package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.enableDoubleBuffering();
		
		while(true) {
		
			StdDraw.clear();
			
			StdDraw.setXscale(0, 40);
			StdDraw.setYscale(0, 25);
			
			StdDraw.setPenColor(128, 128, 128);
			StdDraw.filledRectangle(2, 5, 1, 1);
			StdDraw.filledRectangle(5, 5, 3, 1);
			StdDraw.filledRectangle(8, 5, 1, 1);
			StdDraw.setPenColor(128, 0, 0);
			StdDraw.filledCircle(7, 5, 0.5);
			
			StdDraw.show();
			
			
			while(!StdDraw.mousePressed()) {
				StdDraw.pause(10);
			}
			
			StdDraw.clear();
			
			StdDraw.setPenColor(128, 128, 128);
			StdDraw.filledRectangle(2, 5, 1, 1);
			StdDraw.filledRectangle(5, 5, 3, 1);
			StdDraw.filledRectangle(8, 5, 1, 1);
			
			StdDraw.setPenColor(128, 0, 0);
			StdDraw.filledCircle(7, 5, 0.5);
			
			StdDraw.setPenColor(0, 0, 128);
			StdDraw.filledRectangle(24, 5, 15, 1);
			StdDraw.filledRectangle(40, 5, 1, 0);
			
			
			StdDraw.show();
			while(!StdDraw.mousePressed()) {
				StdDraw.pause(10);
			}
		}
	}
	
}