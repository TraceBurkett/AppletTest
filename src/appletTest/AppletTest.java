package appletTest;
import javax.swing.JApplet;
import java.awt.Graphics;
public class AppletTest  extends JApplet
{
	public void paint (Graphics g)
	{
		super.paint(g);
		g.fillRect(10, 20, 250, 350);
		g.drawLine(10, 20, 250, 350);
	}//paint
}//class
