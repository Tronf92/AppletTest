import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by adrian on 3/2/16.
 */
public class MyApplet extends Applet {
    int mouseX = 0, mouseY = 0;
    String click = "Click";

    public void init(){
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                mouseClick(mouseEvent);
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
    }

    public void paint(Graphics g){
        g.drawString(click,mouseX,mouseY);
    }

    public void mouseClick(MouseEvent event){
        mouseX = event.getX();
        mouseY = event.getY();
        this.repaint();
    }

    public void destroy(){

    }
}
