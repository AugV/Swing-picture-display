import javax.swing.*;

public class Frame {
    private JFrame frame;

    public Frame(String name, JScrollPane jScrollPane) {
        frame = new JFrame(name);
        frame.add(jScrollPane);
    }

    public Frame(String name, JPanel jPanel) {
        frame = new JFrame(name);
        frame.add(jPanel);
    }

    public void setFrameParams() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(frame.getPreferredSize());
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    public void setFrameParamsButton() {
        frame.setMinimumSize(frame.getPreferredSize());
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

}
