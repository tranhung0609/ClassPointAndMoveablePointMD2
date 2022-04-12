public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(50.5f, 30f);
        System.out.println(point2D);

        Point3D point3D = new Point3D(30f,40f,25.5f);
        System.out.println(point3D);

        MoveablePoint moveablePoint=new MoveablePoint(2,3,4.5f,5.5f);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
