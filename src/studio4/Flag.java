package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
	
		StdDraw.setPenColor(25, 25, 60);
		StdDraw.filledRectangle(0.5, .5, .44, .34);
		StdDraw.setPenColor(0,0,200);
		StdDraw.filledCircle(.5, .5, .095);
		StdDraw.setPenColor(200,100,250);
		StdDraw.setPenRadius(.006);
		StdDraw.rectangle(.5, .5, 0.38, .25);
		StdDraw.setPenColor(100,0,100);
		StdDraw.filledRectangle(.25, .5, .08, .34);
		StdDraw.filledRectangle(.75, .5, .08, .34);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(.006);
		StdDraw.rectangle(.5, .5, 0.44, .34);

	}
}