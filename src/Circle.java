public class Circle {
    double radius = 1.0;

    public Circle() {}

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getRadius() {

        return this.radius;
    }

    void setRadius(double radius) {

        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
    public double getCircumference(){

        return 2 * this.radius * Math.PI;
    }

    public String toString() {
        return "Circle ["+"Radius = " + this.radius+"]";
    }
}
