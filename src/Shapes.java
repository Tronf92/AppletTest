import java.applet.Applet;
import java.awt.*;

/**
 * Created by adrian on 3/2/16.
 */
public class Shapes extends Applet{
    public void paint(Graphics g){
        Dimension d = getSize();
        int x = d.width;
        int y = d.height-1;
        System.out.println(x);
        System.out.println(y);
        g.setColor(Color.BLUE);
        g.fillRect(0,0,300,300);
        g.setColor(Color.white);
        g.fillOval(0,0,300,300);
        g.setColor(Color.red);
        g.fillRect(60,40,100,100);
        g.setColor(Color.GREEN);
        g.fillRect(130,90,100,100);
        g.setColor(Color.BLUE);
        g.fillRect(160,160,100,100);
    }

}
