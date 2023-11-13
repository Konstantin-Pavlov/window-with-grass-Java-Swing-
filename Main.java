import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Загрузка изображения
        ImageIcon imageIcon = new ImageIcon("grass.jpg");

        // Создание окна
        JFrame frame = new JFrame("Grass texture");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        for (int y = 0; y < 600; y += 100) {
            for (int x = 0; x < 800; x += 100) {
                JLabel label = new JLabel(imageIcon); // Создание компонента для отображения изображения
                label.setBounds(x, y, 100, 100); // Установка координат и размеров метки
                frame.add(label); // Добавление компонента на окно
            }
        }

        frame.setSize(800, 600); // Установка размеров окна

        frame.setVisible(true); // Отображение окна
    }

    // private static void centerFrameOnScreen(JFrame frame) {
    // // Get the size of the screen
    // Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    // // Calculate the position to center the frame
    // int x = (screenSize.width - frame.getWidth()) / 2;
    // int y = (screenSize.height - frame.getHeight()) / 2;

    // // Set the frame's location
    // frame.setLocation(x, y);
    // }
}