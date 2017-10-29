import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class CircleDraw extends Frame {
  Shape circle = new Ellipse2D.Float(100.0f, 100.0f, 20.0f, 20.0f);
  
  public void paint(Graphics g) {
	  Graphics2D ga = (Graphics2D)g;
	  ga.setPaint(Color.red);
	  ga.draw(circle);
	  ga.setPaint(Color.blue);
	  ga.fill(circle); 
  }

	public static void main(String args[]) {
		Frame frame = new CircleDraw();
		frame.setSize(300, 250);
		frame.setVisible(true);
	}
}