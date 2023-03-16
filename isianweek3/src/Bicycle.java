public class Bicycle {
    private int xLoc;
    private int yLoc;
    private int speed;

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    public void setSpeed(int speed) {
        if(speed > 0){
            this.speed = speed;
        }
    }

    public int getxLoc() {
        return xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public int getSpeed() {
        return speed;
    }

    public void move(int x, int y){
        this.xLoc = x;
        this.yLoc = y;
        System.out.print("Bicycle Position(x)" + x);
        System.out.print("Bicycle Position(y)" + y);
    }
    public void acc(int v){
        this.speed = v;
        System.out.print("Kecepatan Sepeda" + v);
    }
    Bicycle(int x, int y, int k){
        this.xLoc = x;
        this.yLoc = y;
        this.speed = k;
    }
}
