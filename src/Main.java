public class Main {
    public static void main(String[]args){
        Point pointA = new Point("A", 5, -7);
        Point pointB = new Point("B", 5, -7);
        Point pointC = new Point("C", 5, 4);

        System.out.println(pointA);
        System.out.println(pointB);
        System.out.println(pointC);

        System.out.println(pointA.equals(pointB));
        System.out.println(pointA.equals(pointC));
        System.out.println(pointB.equals(pointC));
        System.out.println(pointA.equals("Point C"));
        System.out.println(pointA.equals(null));

    }
}
