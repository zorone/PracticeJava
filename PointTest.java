import java.awt.Point;

public class PointTest {

    static Point p3 = new Point(30, 10);

    public static void main(String[] args) {
        //Point

        System.out.println("Point");
        System.out.println("--------------------");

        Point p;

        ConsPointWithDefault();

        ConsPointWithValue();

        MethodGetX();

        MethodSetX();

        MethodGetY();

        MethodSetY();

        MethodDistanceThroughXY();

    }
    public static void ConsPointWithDefault() {
        Point p1 = new Point();

        //Test Result
        System.out.print("Constructor p using Point();");
        System.out.print(" x = 0 :: x = " + p1.x);

        if (p1.x == 0){
            System.out.println("     ___PASS___");
        }
        else {
            System.out.println("  Failed");
        }

        System.out.print("Constructor p using Point();");
        System.out.print(" y = 0 :: y = " + p1.y);

        if (p1.y == 0){
            System.out.println("     ___PASS___");
        }
        else {
            System.out.println("  Failed");
        }
        //end test Point();
    }

    public static void ConsPointWithValue(){

        Point p2 = new Point(100, 1);

        //Test Result
        System.out.print("Constructor p using Point(int x, int y);");
        System.out.print(" x = 0 :: x = " + p2.x);

        if (p2.x == 100){
            System.out.println("     ___PASS___");
        }
        else {
            System.out.println("  Failed");
        }

        System.out.print("Constructor p using Point(int x, int y);");
        System.out.print(" y = 0 :: y = " + p2.y);

        if (p2.y == 1){
            System.out.println("     ___PASS___");
        }
        else {
            System.out.println("  Failed");
        }
        //end test Point(int x, int y);
    }

    public static void MethodGetX(){
        System.out.print("Method getX     x = ");
        p3.getX();

        if (p3.x == 30){
            System.out.println("     ___PASS___");
        }
        else{
            System.out.println("   Failed");
        }

    }

    public static void MethodSetX(){

        p3.setX(50);
        

        System.out.print("Method setX(50);     x = " + p3.x);

        if (p3.x == 50){
            System.out.println("     ___PASS___");
        }
        else{
            System.out.println("   Failed");
        }


        //p3.setX(30);
        

        System.out.print("Method setX(30);     x = " + p3.x);

        if (p3.x == 30){
            System.out.println("     ___PASS___");
        }
        else{
            System.out.println("   Failed");
        }
    }

    public static void MethodGetY(){
        System.out.print("Method getY     y = ");
        p3.getY();

        if (p3.y == 10){
            System.out.println("     ___PASS___");
        }
        else{
            System.out.println("   Failed");
        }

    }
    
    public static void MethodSetY(){

        
        //p3.setY(100);
        

        System.out.print("Method setY(100);     y = " + p3.y);

        if (p3.y == 100){
            System.out.println("     ___PASS___");
        }
        else{
            System.out.println("   Failed");
        }


        //p3.setY(10);
        

        System.out.print("Method setY(10);     y = " + p3.y);

        if (p3.y == 10){
            System.out.println("     ___PASS___");
        }
        else{
            System.out.println("   Failed");
        }
    }

    public static void MethodDistanceThroughXY() {

        double distance;
        double distanceTest;

        distance = p3.distance(70, 40);
        distanceTest = Math.sqrt((70-30)*(70-30) + (40-10)*(40-10));

        System.out.print("Method distance(70, 40);     distance = " + p3.distance(70, 40));

        if (distance == distanceTest){
            System.out.println("     ___PASS___");
        }
        else{
            System.out.println("   Failed");
        }

        distance = p3.distance(20, 4);
        distanceTest = Math.sqrt((20-30)*(20-30) + (4-10)*(4-10));

        System.out.print("Method distance(20, 4);     distance = " + distance);

        if (distance == distanceTest){
            System.out.println("     ___PASS___");
        }
        else{
            System.out.println("   Failed");
        }
    }


}