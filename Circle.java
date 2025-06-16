public class Circle extends Shape  {
    private int radius;

    public Circle(int radius, Point p) {
        super(p);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public boolean contains(Point point) {
        return p.distanceTo(point) <= radius;
    }

    @Override
    public String toString() {
        return "Circle[Center=" + p + ", Radius=" + radius + "]";
    }
}
