public class Point {

    double x, y;

    public void main(String[] args) {
        
    }
    

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }


    public void getX(){
        System.out.print(this.x);
    }

    public void setX(int x){
        this.x = x;

    }

    public void getY(){
        System.out.print(this.y);
    }

    public void setY(int y){
        this.y = y;
    }

    public void distance(int x, int y){
        double distance;
        double x1, x2, y1, y2;

        x1 = this.x;
        x2 = x;
        y1 = this.y;
        y2 = y;

        distance = Math.sqrt( (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.print(distance);
    }

    public void distance(Point other){
        double distance;
        double x1, x2, y1, y2;

        x1 = this.x;
        x2 = other.x;
        y1 = this.y;
        y2 = other.y;

        distance = Math.sqrt( (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.print(distance);
    }

    public void ToString() {
        System.out.print("x = " + x + "  y = " + y);
    }

}