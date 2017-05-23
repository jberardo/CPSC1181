package question02;

import javax.swing.JFrame;

public class TrianglePrinter
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(400, 400);
      frame.setTitle("Lab 02 - Triangle");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      TriangleComponent trianguleComponent = new TriangleComponent();
      //CirclesComponent circlesComponent = new CirclesComponent();

      //frame.add(circlesComponent);
      frame.add(trianguleComponent);
      
      
      frame.setVisible(true);
   }
}
