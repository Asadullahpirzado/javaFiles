public class ShapeArray {
    private Shape[] shapeList;
    private int nbShapes;

    public ShapeArray(int size) {
        shapeList = new Shape[size];
        nbShapes = 0;
    }

    public boolean addShape(Shape s) {
        if (nbShapes < shapeList.length) {
            shapeList[nbShapes++] = s;
            return true;
        }
        return false;
    }

    public int getCircleCounter() {
        int count = 0;
        for (int i = 0; i < nbShapes; i++) {
            if (shapeList[i] instanceof Circle) {
                count++;
            }
        }
        return count;
    }

    public double getAvgRectArea() {
        int count = 0;
        double totalArea = 0.0;
        for (int i = 0; i < nbShapes; i++) {
            if (shapeList[i] instanceof Rectangle) {
                Rectangle r = (Rectangle) shapeList[i];
                totalArea += r.getLength() * r.getWidth();
                count++;
            }
        }
        if (count == 0) return 0.0;
        return totalArea / count;
    }

    public void removeAllRect() {
        int j = 0;
        for (int i = 0; i < nbShapes; i++) {
            if (!(shapeList[i] instanceof Rectangle)) {
                shapeList[j++] = shapeList[i];
            }
        }
        nbShapes = j;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < nbShapes; i++) {
            result += shapeList[i].toString() + "\n";
        }
        return result;
    }

    public void displayRectsInfo() {
        for (int i = 0; i < nbShapes; i++) {
            if (shapeList[i] instanceof Rectangle) {
                System.out.println(shapeList[i]);
            }
        }
    }
}
