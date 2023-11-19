import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ExampleDownloadingImageFromTheInternet {
    static JFrame frame = new JFrame();// создаем форму
    static final int size = 50;// размер текстуры
    // задаем размер окна
    static final int width = 800;
    static final int height = 600;
    static final String url = "https://avatars.mds.yandex.net/i?id=6b677e370e194933d0aec45d1a46a59f-5314773-images-thumbs&n=13";

    // класс для добавления текстур
    private static class AddTextura {
        public JLabel label;

        public AddTextura(BufferedImage im, int i, int j) {// получаем на вход картинку и шаги циклов
            label = new JLabel(new ImageIcon(im));// создаем объект с текстурой
            label.setBounds(i * size, j * size, size, size);// устанавливаем его координаты
            frame.add(label);// добавляем на форму
        }
    }

    public static void main(String[] args) throws IOException {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// способ выхода из формы
        frame.setTitle("Текстура");// заголовок формы
        frame.setSize(width, height);
        centerFrameOnScreen(frame);
        BufferedImage im = getImageViaUrl(url);
        for (int i = 0; i <= width / size; i++)
            for (int j = 0; j <= height / size; j++)
                new AddTextura(im, i, j);// создаем объект с текстурой и размещаем его в цикле
        frame.setVisible(true);// делаем форму видимой
    }

    private static BufferedImage getImageViaUrl(String url) throws MalformedURLException, IOException {
        // скачиваем картинку с травой и обрезаем ее
        return ImageIO.read(new URL(url)).getSubimage(0, 0, size, size);
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