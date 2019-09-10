public class Exc4TestCircle {

    public static void main(String[] args) {
        Exc4Circle circleTest = new Exc4Circle(2.4);
        Exc4Circle circleTest2 = new Exc4Circle("Blue");

        System.out.println(circleTest.getColor() + " " + circleTest.getRadius());
        System.out.println(circleTest2.getColor() + " " + circleTest2.getRadius());

    }

}
