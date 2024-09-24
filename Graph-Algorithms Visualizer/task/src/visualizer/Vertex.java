package visualizer;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

public class Vertex extends JPanel {
    private int x;
    private int y;
    private int id;
    public static final int SIZE = 50;

    public Vertex(int x, int y, int id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public void draw(JPanel frame) {
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.WHITE);
                g.fillOval(0, 0, getWidth(), getHeight());
            }
        };

        panel.setLayout(new BorderLayout());
        panel.setOpaque(false);
        panel.setName("Vertex " + id);

        JLabel label = new JLabel(String.valueOf(id));
        label.setName("VertexLabel " + id);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        panel.add(label, BorderLayout.CENTER);

        panel.setBounds(this.x, this.y, this.SIZE, this.SIZE);
        frame.add(panel);
    }

}
