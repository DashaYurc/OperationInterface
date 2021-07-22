package lv.sda;

public class Subtract implements Calculator{
    private int firstNumber;
    private int secondNumber;

    public Subtract(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public float operation(){
        return (float) Math.subtractExact(firstNumber,secondNumber);
    }
}
