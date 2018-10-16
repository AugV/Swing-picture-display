import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]) throws IOException {

        //Parametrai
        String filePath = "C:\\Users\\Augustinas\\OneDrive\\javaProjects\\Visma\\src\\dog_urls.json";
        String fieldKey = "urls";
        String frameName = "Dogs";
        String popupframeName = "TheDog";
        int[] gridLayoutParams = {2, 2, 1, 1};
        int scrollSpeed = 20;
        int[] buttonWidthHeight = {500, 500};
        int numberOfDogsToLoad = 30;

        //Is .json failo istraukiamas URL sarasas
        ArrayList<String> dogUrlList = new JsonObject(filePath).getObjectArray(fieldKey);

        //Paveiksleliai sudedami Paveiksleliu arraylista
        ArrayList<BufferedImage> imageList = new ImageBuffer(dogUrlList, numberOfDogsToLoad).getImageList();

        //Sukuriamas pagrindas i kuri bus dedami musu mygtukai/paveiksliukai
        JPanel panel = new JPanel(
                new GridLayout(imageList.size() / gridLayoutParams[0], gridLayoutParams[1], gridLayoutParams[2], gridLayoutParams[3]));

        //Sukuriami mygtukai/paveiksliukai
        for (int i = 0; i < imageList.size(); i++) {
            Button button = new Button(imageList, i, popupframeName, buttonWidthHeight);
            panel.add(button.getButton());
        }
        //Scrollinimo funkcionalumas
        ScrollPane scrollPane = new ScrollPane(panel, scrollSpeed);

        //Remas i kuri viska sudedame
        Frame frame = new Frame(frameName, scrollPane.getScrollPane());
        frame.setFrameParams();
    }
}