package lv.sda;

public class Main {

    public static void main(String[] args) {

        Add myAdd = new Add(7,2);
        System.out.println("The sum is: " + myAdd.operation());

        Subtract mySub = new Subtract(9,3);
        System.out.println("The subtract is: " + mySub.operation());

        Multiplication myMulti = new Multiplication(4,5);
        System.out.println("The multiplication is: " + myMulti.operation());

        Division myDiv = new Division(20,5);
        System.out.println("The division is: " + myDiv.operation());

        Square mySqr = new Square(5);
        System.out.println("The square is: " + mySqr.operation());

        Squareroot mySqrRoot = new Squareroot(16);
        System.out.println("The square root is: " + mySqrRoot.operation());

    }
}
