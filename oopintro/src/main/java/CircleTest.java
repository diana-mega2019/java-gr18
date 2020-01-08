public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0, "red");
        System.out.println(circle1);
        System.out.println("Aria" + circle1.getAria());
        System.out.println("Perimetrul " + circle1.getPerimeter());

        Circle circle2 = new Circle(7.0, "green");
        System.out.println(circle2);
        System.out.println("Aria " + circle2.getAria());
        System.out.println("Perimetrul: " + circle2.getPerimeter());

        Circle circle3 = new Circle(3.0, "black");
        System.out.println(circle3);
        System.out.println("Aria " + circle3.getAria());
        System.out.println("Perimetrul " + circle3.getPerimeter());

        Circle circle4 = new Circle(9.0, "pink");
        System.out.println(circle4);
        System.out.println("Aria " + circle4.getAria());
        System.out.println("Perimetrul " + circle4.getPerimeter());

        Circle circle5 = new Circle(2.0, "red");
        System.out.println(circle5);
        System.out.println("Aria " + circle5.getAria());
        System.out.println("Perimetrul " + circle5.getPerimeter());

        Circle circle6 = new Circle(8.0, "purple");
        System.out.println(circle6);
        System.out.println("Aria " + circle6.getAria());
        System.out.println("Perimetrul " + circle6.getPerimeter());

        Circle circle7 = new Circle(4.0, "grey");
        System.out.println(circle7);
        System.out.println("Aria " + circle7.getAria());
        System.out.println("Perimetrul " + circle7.getPerimeter());

        Circle circle8 = new Circle(6.0, "yellow");
        System.out.println(circle8);
        System.out.println("Aria " + circle8.getAria());
        System.out.println("Perimetrul " + circle8.getPerimeter());

        Circle circle9 = new Circle(5.0, "white");
        System.out.println(circle9);
        System.out.println("Aria " + circle9.getAria());
        System.out.println("Perimetrul " + circle9.getPerimeter());

        Circle circle10 = new Circle(7.0, "blue");
        System.out.println(circle10);
        System.out.println("Aria " + circle10.getAria());
        System.out.println("Perimetrul " + circle10.getPerimeter());

        createArrayOfCircle();

    }

    private static void createArrayOfCircle() {
        Circle[] circleArray = new Circle[10];
        for (int i = 0; i <= circleArray.length - 1; i++) {
            if (i % 2 == 0) {
                Circle circleEven = new Circle(i + 1, "blue");
                circleArray[i] = circleEven;
            } else {
                Circle circleOdd = new Circle(i + 1, "green");
                circleArray[i] = circleOdd;
            }
            System.out.println(circleArray[i]);

        }
    }
}
