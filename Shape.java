public abstract class Shape {
    protected Point p;

    public Shape(Point p) {
        this.p = p;
    }

    public Point getCenter() {
        return p;
    }

    public abstract boolean contains(Point p);
}
