package visualizer;

import javax.swing.JPanel;
import java.awt.Color;

public class GraphPanel extends JPanel {

    public GraphPanel(int width, int height) {
        this.setName("Graph");
        this.setBackground(Color.BLACK);
        this.setSize(width, height);
        this.setLayout(null);
    }
}
