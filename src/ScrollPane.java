import javax.swing.*;

public class ScrollPane {
    private JScrollPane scrollPane;

    public ScrollPane(JPanel jpanel, int scrollSpeed) {
        scrollPane = new JScrollPane(jpanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getVerticalScrollBar().setUnitIncrement(scrollSpeed);
        scrollPane.setViewportView(jpanel);
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }
}
