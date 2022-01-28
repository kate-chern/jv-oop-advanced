package core.basesyntax;

public class RightTriangle implements Figure {
    private final String color;
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + "sq.units, first leg: "
                + firstLeg + " units, second leg: " + secondLeg + " units, color: " + color);
    }
}