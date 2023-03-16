public class Motorcycle {
    private int xLoc;
    private int yLoc;
    private int plateNum;
    private int speed;

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    public void setPlateNum(int plateNum) {
        String x = Integer.toString(plateNum);
        if (x.length() >= 0 && x.length() < 9){
            this.plateNum = plateNum;
        }else{
            System.out.println("Yg benirrr");
        }
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

    public int getPlateNum() {
        return plateNum;
    }

    public int getSpeed() {
        return speed;
    }

    public void move(int x, int y){
        this.xLoc = x;
        this.yLoc = y;
        System.out.print("Motorcycle Position(x)" + x);
        System.out.print("Motorcycle Position(y)" + y);
    }
    public void acc(int v){
        this.speed = v;
        System.out.print("Kecepatan Motor" + v);
    }
    Motorcycle(int x, int y, int p, int k){
        this.xLoc = x;
        this.yLoc = y;
        this.plateNum = p;
        this.speed = k;
    }
}
