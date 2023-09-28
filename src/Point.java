public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(int xy){
        x = xy;
        y = xy;
    }
    public Point(){
        x = 0;
        y = 0;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int setX(int newX){
        x = newX;
    }
    public int setY(int newY){
        y = newY;
    }
    public String coordinate(){
        return "(" + x + ", " + y + ")";
    }
}
