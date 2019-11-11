public class Triangle {
    private String sides;
    private String angle;
    public void TriangleSides(double a, double b, double c){
        if (a == 0 || b == 0 || c == 0){
            sides = "Not a Triangle";
        }
        else if ( a >= (b+c) || b >= (a+c) || c >= (a+b)){
            sides = ("Not a Triangle");
        }
        else if (a == b && b == c){
            sides = ("Equilateral");
        }
        else if (b == c || a == b || c == a){
            sides = ("Isosceles");
        }
        else{
            sides = ("Scalene");
        }
    }

    public void TriangleAngle(double a, double b, double c){

        if ((a*a) == (b*b) + (c*c) || (b*b) == (a*a) + (c*c) || (c*c) == (b*b) + (a*a) ){
            angle = ("Right");
        }
        else{
            angle = ("Obtuse");
        }

    }
    public double getArea (double a, double b , double c) {
        double s = 0;
        double Area;
        s = (a+b+c)/2;
        Area = Math.sqrt(s*((s-a)*(s-b)*(s-c)));
        return Area;

    }

    @Override
    public String toString() {
        return sides + " " + angle;
    }
}
