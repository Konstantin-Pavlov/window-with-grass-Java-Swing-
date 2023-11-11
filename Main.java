import javax.swing.*;
import java.awt.*;

public class Main {

    private static Image image;
    private static ImageIcon imageIcon;

    public static void main(String[] args) {

        // Загрузка изображения
        imageIcon = new ImageIcon("grass.jpg");

        // Создание окна
        JFrame frame = new JFrame("Grass texture");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание компонента для отображения изображения
        // JLabel label = new JLabel(imageIcon);
        // JLabel label1 = new JLabel(imageIcon);
        // label.setBounds(0, 0, 100, 100); // Установка координат и размеров метки
        // label1.setBounds(200, 0, 100, 100); // Установка координат и размеров метки

        for (int y = 0; y < 600; y += 100) {
            for (int x = 0; x < 800; x += 100) {
                JLabel label = new JLabel(imageIcon);
                label.setBounds(x, y, 100, 100); // Установка координат и размеров метки
                frame.add(label);// Добавление компонента на окно
            }
        }

        // Добавление компонента на окно
        // frame.add(label);
        // frame.add(label1);

        // Установка размеров окна
        frame.setSize(800, 600);

        // Отображение окна
        frame.setVisible(true);

    }
}