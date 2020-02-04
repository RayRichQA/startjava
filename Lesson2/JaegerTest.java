public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34f, 2.312f, 5, 7, 4);
        Jaeger jaegerTwo = new Jaeger("Horizon Brave", "Mark-1", "China", 72.54f, 7.89f, 8, 4, 6);
        Jaeger jaegerThree = new Jaeger();
        jaegerThree.setModelName("Gipsy Danger (Jaeger)");
        jaegerThree.setMark("Mark-3");
        jaegerThree.setOrigin("United States of America");
        jaegerThree.setHeight(79.25f);
        jaegerThree.setWeight(1.980f);
        jaegerThree.setSpeed(7);
        jaegerThree.setStrength(8);
        jaegerThree.setArmor(6);
        Jaeger jaegerFour = new Jaeger();
        jaegerFour.setModelName("Striker Eureka");
        jaegerFour.setMark("Mark-5");
        jaegerFour.setOrigin("Australia");
        jaegerFour.setHeight(76.2f);
        jaegerFour.setWeight(1.850f);
        jaegerFour.setSpeed(10);
        jaegerFour.setStrength(10);
        jaegerFour.setArmor(9);

        System.out.println("First Robot: " + jaegerOne.toString());
        System.out.println("Second Robot: " + jaegerTwo.toString());
        System.out.println("Third Robot: " + jaegerThree.toString());
        System.out.println("Forth Robot: " + jaegerFour.toString());
        System.out.println(jaegerFour.isDestroyed());
        System.out.println("Robot " + jaegerThree.getModelName() + " from " + jaegerThree.getOrigin() + " made " + jaegerThree.move());
        System.out.println("Robot " + jaegerThree.getModelName() + " from " + jaegerThree.getOrigin() + " made " + jaegerThree.move());
        System.out.println("Robot " + jaegerThree.getModelName() + " from " + jaegerThree.getOrigin() + " made " + jaegerThree.move());
    }
}