public class Main {
    public static void main(String[] args){
        System.out.println("Main succesfully run");

        Methods calc1 = new Methods();
        Point point_a = new Point(5,10);


        System.out.println(calc1.sum(5,5));
        System.out.println(point_a);
        System.out.println(point_a.x + "," + point_a.y);
        point_a.showPointCoordinates();
    }
}