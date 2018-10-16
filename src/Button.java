import javax.swing.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Button {
    private JButton button;

    public Button(ArrayList<BufferedImage> images, int index, String frameName, int[] buttonWidthHeight) {
        button = new JButton();
        button.setIcon(new ImageIcon(images.get(index)));
        button.setPreferredSize(new Dimension(buttonWidthHeight[0], buttonWidthHeight[1]));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel single = new JLabel();
                single.setIcon(new ImageIcon(images.get(index)));
                JPanel panelSingle = new JPanel(new GridLayout());
                panelSingle.add(single);
                Frame popupFrame = new Frame(frameName, panelSingle);
                popupFrame.setFrameParamsButton();
            }
        });
    }

    public JButton getButton() {
        return button;
    }
}
