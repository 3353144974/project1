package operation.As3;

public class Circle {
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    private int r;
    public Circle(){

    }
    public Circle(int r){
        this.r=r;
    }
    public void showArea(){
        double s=3.14;
        System.out.println("半径为:"+r+",面积为:"+r*s*r);
    }
    public void showPerimeter(){
        double s=3.14;
        System.out.println("半径为:"+r+",周长为:"+r*s*2);
    }
}
