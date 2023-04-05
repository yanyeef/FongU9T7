public class ThreeDPoint extends  Point{
    private int z;
    public ThreeDPoint(String label, int x, int y, int z){
        super(label, x, y);
        this.z = z;
    }

    @Override
    public String toString(){
        return super.toString() + ", z = " + z;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof ThreeDPoint)) {
            return false;
        }
        ThreeDPoint otherPoint = (ThreeDPoint) o;
        return super.equals(o) && this.z == otherPoint.z;
    }


}
