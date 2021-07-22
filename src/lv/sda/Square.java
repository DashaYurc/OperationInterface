package lv.sda;

public class Square implements Calculator{
    private int firstNumber;


    public Square(int firstNumber){
        this.firstNumber = firstNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public float operation(){
        return (float) Math.pow(firstNumber,2);
    }
}
