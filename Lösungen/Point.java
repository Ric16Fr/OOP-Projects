

public class Point {
    int x;
    int y;
    int z;
    
    public Point(){
        super();
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void negate(){
        x*=-1;
        y*=-1;
        z*=-1;
    }
    
    public double norm(){
        return Math.sqrt(x*x + y*y + z*z);
    }
    
    public void print(){
        System.out.println("("+x+","+y+","+z+")");
    }
}
