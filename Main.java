import javax.swing.*;
import java.awt.*;

public class Main {

    private static Image image;
    private static ImageIcon imageIcon;

    public static void main(String[] args) {



        // Загрузка изображения
        imageIcon = new ImageIcon("grass.jpg");

        // Создание окна
        JFrame frame = new JFrame("Пример");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание компонента для отображения изображения
        JLabel label = new JLabel(imageIcon);
        JLabel label1 = new JLabel(imageIcon);
        label.setBounds(0, 0, 100, 100); // Установка координат и размеров метки
        label1.setBounds(200, 0, 100, 100); // Установка координат и размеров метки

        // Добавление компонента на окно
        frame.add(label);
        frame.add(label1);

        // Установка размеров окна
        frame.setSize(800, 600);

        // Отображение окна
        frame.setVisible(true);

        // // Create a JFrame object
        // JFrame frame = new JFrame("самая полезная в мире программа");

        // // Загрузка изображения
        // image = Toolkit.getDefaultToolkit().getImage("grass.jpg");

        // // Использование изображения
        // // Пример: отображение изображения на панели
        // MyPanel panel = new MyPanel(image);
        // panel.repaint();

        // frame.setSize(800, 600);

        // frame.add(panel);

        // // Make the window visible
        // frame.setVisible(true);
        // frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}