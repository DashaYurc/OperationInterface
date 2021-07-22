package lv.sda;

public class Division implements Calculator{
    private int firstNumber;
    private int secondNumber;

    public Division(int firstNumber, int secondNumber){
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
        if(secondNumber == 0){
            return 0;
        } else {
            return firstNumber / secondNumber;
        }
    }
}
