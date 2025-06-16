public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int l, int w, Point c) {
        super(c);
        this.length = l;
        this.width = w;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public boolean contains(Point point) {
        int dx = Math.abs(point.getX() - p.getX());
        int dy = Math.abs(point.getY() - p.getY());
        return dx <= length / 2 && dy <= width / 2;
    }

    @Override
    public String toString() {
        return "Rectangle[Center=" + p + ", Length=" + length + ", Width=" + width + "]";
    }
}
