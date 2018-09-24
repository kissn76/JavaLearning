import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class DrawingLines extends Applet {

    int width, height;

    @Override
    public void init() {
        setSize(400, 400);
        this.width = getSize().width;
        this.height = getSize().height;
        setBackground(Color.blue);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.white);
        for (int i = 0; i < 25; ++i) {
            g.drawLine(this.width, this.height, i * this.width / 25, 0);
        }
    }
}
