package task_13_2_2.src;

public class ImageGallery {

    public static void main(String[] args) {

        Image[] images = {
            // якщо виникає помилка завантаження, замініть відносний шлях на абсотютний шлях!
            new ImageDisplay("Lab13/src/task_13_2_2/resources/image1.jpeg"),
            new ImageDisplay("Lab13/src/task_13_2_2/resources/image2.jpeg"),
            new ImageDisplay("Lab13/src/task_13_2_2/resources/image3.jpeg"),
            new ImageDisplay("Lab13/src/task_13_2_2/resources/image4.jpeg"),
            new ImageDisplay("Lab13/src/task_13_2_2/resources/image5.jpeg"),
            new ImageDisplay("Lab13/src/task_13_2_2/resources/image6.jpeg"),
            new ImageDisplay("Lab13/src/task_13_2_2/resources/image7.jpeg"),
            new ImageDisplay("Lab13/src/task_13_2_2/resources/image8.jpeg"),
            new ImageDisplay("Lab13/src/task_13_2_2/resources/image9.jpeg"),
            new ImageDisplay("Lab13/src/task_13_2_2/resources/image10.jpeg"),
        };

        for (Image image : images) {
            image.display();
        }

    }

}
