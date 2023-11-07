import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;


class MyPanel extends JPanel {
    private Image image;

    public MyPanel(Image image) {
        this.image = image;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Отображение изображения на панели
        g.drawImage(image, 0, 0, this);
    }
}