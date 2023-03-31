public class Point {
    private int x;
    private int y;
    private String label;

    public Point( String label,int x, int y){
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public String toString(){
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof  Point)){
            return false;
        }

        Point otherPoint = (Point) o;
        return (this.x== otherPoint.x) && (this.y == otherPoint.y);
    }


}
