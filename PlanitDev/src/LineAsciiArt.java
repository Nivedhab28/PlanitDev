import java.awt.Graphics;

import javax.swing.JFrame;

public class LineAsciiArt extends JFrame {
	public LineAsciiArt() {
		setTitle("Line in Ascii");
		setSize(480,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	public void paint(Graphics g) {
		g.drawLine(0, 120, 240, 120);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LineAsciiArt LA = new LineAsciiArt();
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");

System.out.println("-------------------------");
	}

}
