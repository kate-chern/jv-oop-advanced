package core.basesyntax;

public class Rectangle implements Figure {
    private final String color;
    private final int smallSide;
    private final int bigSide;

    public Rectangle(String color, int smallSide, int bigSide) {
        this.color = color;
        this.smallSide = smallSide;
        this.bigSide = bigSide;
    }

    @Override
    public double getArea() {
        return smallSide * bigSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, small side: "
                + smallSide + " units, big side: " + bigSide + " units, color: " + color);
    }
}