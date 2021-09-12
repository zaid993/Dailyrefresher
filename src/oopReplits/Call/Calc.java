package oopReplits.Call;
class Calc {

    private String names;
    private int x,y, result;




    public int getResult() {
        return result;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }




    public void plus(){
       result=x+y;
    }
    public void minus(){
        result=x-y;
    }
}