package core.basesyntax;

public class RightTriangle implements Figure {
    private final Colors color;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(Colors color, double firstLeg, double secondLeg){
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + calculateArea() + " sq. units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + color);
    }
}
