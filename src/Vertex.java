package src;

public class Vertex {

    enum Color {
        GREEN,
        ORANGE,
        RED
    };
    
    private int number;
    private int[] neighbours;
    private int explorer;
    private Color color;

    public Vertex(int number, int[] neighbours) {
        this.number = number;
        this.neighbours = neighbours;
        this.explorer = 0;
        this.color = Color.GREEN;
    }

    public int getNumber() { return this.number; }
    public int[] getNeighbours() { return neighbours; }
    public int getExplorer() { return this.explorer; }
    public Color getColor() { return this.color; }

    public void setExplorer(int explorer) { this.explorer = explorer; }
    public void setColor(Color color) { this.color = color; }

}
