import java.awt.Image;
import java.awt.Toolkit;

public class Main{

    private static Image image;

    public static void main(String[] args) {
        
        // Загрузка изображения
        image = Toolkit.getDefaultToolkit().getImage("grass.jpg");

        // Использование изображения
        // Пример: отображение изображения на панели
        MyPanel panel = new MyPanel(image);
        panel.repaint();

    }
}