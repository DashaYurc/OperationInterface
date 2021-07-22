package lv.sda;

public class Squareroot implements Calculator{
    private int firstNumber;


    public Squareroot(int firstNumber){
        this.firstNumber = firstNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }



    public float operation(){
        return (float) Math.sqrt(firstNumber);
    }
}
