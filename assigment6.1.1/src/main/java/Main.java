import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double x2 = 0;
        double y2 = 0;
        double x3 = 0;
        double y3 = 0;
        double x = 0;
        double y = 0;
        double D1 = 0;
        double D2 = 0;
        double D3= 0 ;
        int flag = 0;

        Scanner in = new Scanner(System.in);
        while (flag == 0) {
//            System.out.println("add sides");
//            a = in.nextInt();
//            b = in.nextInt();
//            c = in.nextInt();
            System.out.println("add points ");
            System.out.println("Point 1");
            x = in.nextInt();
            y = in.nextInt();
            System.out.println("Point 2");
            x2 = in.nextInt();
            y2 = in.nextInt();
            System.out.println("Point 3");
            x3 = in.nextInt();
            y3 = in.nextInt();
            if (x <= 0 || y <= 0 || x2 <= 0 || y2 <= 0 || x3 <= 0 || y3 <= 0){
                System.out.println("Syntax incorrect add new points");
            }
            else {
                flag = 1;
            }
        }

        Triangle num = new Triangle();
        Point punto1 = new Point(x , y);
        Point punto2 = new Point(x2 , y2);
        Point punto3 = new Point(x3 , y3);
        //distance 1
        D1 = punto1.distance(punto2);
        D2 = punto1.distance(punto3);
        D3 = punto2.distance(punto3);

        num.TriangleSides(D1 ,D2, D3);
        num.TriangleAngle(D1,D2,D3);

        System.out.println(num.getArea(D1 , D2 , D3));

    }
}