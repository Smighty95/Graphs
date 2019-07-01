import javax.swing.JFrame;


// Class with main method where objects are created, added into the list and printed into the JFrame
public class StartDrawing {

	public static void main(String[] args) {
	
		JFrame f=new JFrame("Task2");
		DrawClass dc=new DrawClass();
		BarShape b1=new BarShape(100);
		BarShape b2=new BarShape(200);
		BarShape b3=new BarShape(50);
		BarShape b4=new BarShape(300);
		dc.addShape(b1);
		dc.addShape(b2);
		dc.addShape(b3);
		dc.addShape(b4);
		f.add(dc);
		f.setSize(600,450);
		f.setResizable(false);
		f.setVisible(true);

	}

}
