package visualizer;

import javax.swing.JFrame;
import java.awt.Color;

public class MainFrame extends JFrame {
    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private int id = 0;

    public MainFrame() {
        setTitle("Graph-Algorithms Visualizer");
        setName("Graph-Algorithms Visualizer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);

        GraphPanel graphPanel = new GraphPanel(WIDTH, HEIGHT);
        add(graphPanel);

        Vertex vertex0 = new Vertex(0, 0, id++);
        vertex0.draw(graphPanel);

        Vertex vertex1 = new Vertex(WIDTH - Vertex.SIZE, 0, id++);
        vertex1.draw(graphPanel);

        Vertex vertex2 = new Vertex(0, HEIGHT - Vertex.SIZE, id++);
        vertex2.draw(graphPanel);

        Vertex vertex3 = new Vertex(WIDTH - Vertex.SIZE, HEIGHT - Vertex.SIZE, id++);
        vertex3.draw(graphPanel);

        setVisible(true);
    }


}