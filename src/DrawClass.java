import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

	//Class to draw
public class DrawClass extends JPanel {
	
	public ArrayList<BarShape> list=new ArrayList<BarShape>();
	private int yPos=5;
	
	
//	Method to add all shapes into the list
	public void addShape(BarShape obj) {
		list.add(obj);
	}
	
	
//	Inherited method from the class JPanel which is over-ridden for printing the shapes
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		for(BarShape b:list) {
			g.fillRect(25, yPos, b.getxLenght(), 25);
			yPos+=30;
		}
	}
}

// If we want to print distinct values (same values with different chart) all we need to to
// is to change g.fillRect parameters for x position and yPos-height
