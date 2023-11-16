import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Main {
    public static void main(String[] args) {
        // Загрузка изображения
        ImageIcon imageIcon = new ImageIcon("grass.jpg");

        // Создание окна
        JFrame frame = new JFrame("Grass texture");
        frame.setLayout(null);
        frame.setSize(800, 600); // Установка размеров окна

        // замощение окна текстурой травы
        for (int y = 0; y < 600; y += 100) {
            for (int x = 0; x < 800; x += 100) {
                JLabel label = new JLabel(imageIcon); // Создание компонента для отображения изображения
                label.setBounds(x, y, 100, 100); // Установка координат и размеров метки
                frame.add(label); // Добавление компонента на окно
            }
        }

        frame.setVisible(true); // Отображение окна
        centerFrameOnScreen(frame); // Отображение окна по центру
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private static void fillingTheWindow(ImageIcon imageIcon){
        // move for here?
    }

    private static void centerFrameOnScreen(JFrame frame) {
        // Get the size of the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calculate the position to center the frame
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;

        // Set the frame's location
        frame.setLocation(x, y);
    }
}