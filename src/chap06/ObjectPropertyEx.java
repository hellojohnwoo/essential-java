package chap06;

class Point {
    private int x,y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ObjectPropertyEx {
    public static void main(String[] args) {
        Point point = new Point(11,22);
        System.out.println(point.getClass().getName());
        System.out.println(point.hashCode());
        System.out.println(point.toString());
    }
}
