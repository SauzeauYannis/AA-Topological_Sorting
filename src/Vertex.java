package src;

/**
 * Vertex class with the number of their successors
 * @author Yannis Sauzeau
 */
public class Vertex {

    enum Color {
        GREEN,
        ORANGE,
        RED
    };
    
    private int number;
    private int[] successors;
    private int explorer;
    private Color mark;

    public Vertex(int number, int[] successors) {
        this.number = number;
        this.successors = successors;
        this.explorer = 0;
        this.mark = Color.GREEN;
    }

    public int getNumber() { return this.number; }
    public int[] getSuccessors() { return successors; }
    public int getExplorer() { return this.explorer; }
    public Color getMark() { return this.mark; }

    public void setExplorer(int explorer) { this.explorer = explorer; }
    public void setMark(Color color) { this.mark = color; }

}
