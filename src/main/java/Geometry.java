public class Geometry {

    public int area (int a, int b) {
        return a * b ;
    }

    public int perimeter (int a, int b) {
        return 2*(a + b) ;
    }

    public boolean isTriangle (int a, int b, int c) {
        return a + b > c && b+c > a && a+c > b ;
    }
}
