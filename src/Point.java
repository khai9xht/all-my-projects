public class Point {
    private double x,y;
    public Point (){
        x=0; y=0;
    }
    public Point (double a, double b){
        x=a; y=b;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
}
