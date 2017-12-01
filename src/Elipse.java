import java.applet.Applet;
import java.awt.*;

/**
 * Created by adrian on 3/2/16.
 */
public class Elipse extends Applet {
    public void paint(Graphics g){
        g.setColor(Color.red);

        Dimension d = getSize();
        int xmax = d.width - 1;
        int ymax = d.height - 1;

        for (int x1 = 0, y1 = 0; x1 <xmax/2-10;x1 += 10, y1 += 10){
            g.drawOval(x1,y1,xmax-2*x1,ymax-2*y1);
        }
    }
}
