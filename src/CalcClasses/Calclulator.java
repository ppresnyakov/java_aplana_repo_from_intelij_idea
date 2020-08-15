package CalcClasses;

public class Calclulator {

    private double result;
    private boolean IsResultOk = true;
    private String Operation;


    public Calclulator(Number A, Number B, String Operation) {
        this.Operation = Operation;

        if (Operation.equals("+")) {result = A.getNumber() + B.getNumber();}
        else if (Operation.equals("-")) {result = A.getNumber() - B.getNumber();}
        else if (Operation.equals("*")) {result = A.getNumber() * B.getNumber();}
        else if (Operation.equals("/")) {result = A.getNumber() / B.getNumber();}
        else {System.out.println("Неверный математический оператор."); IsResultOk = false;}
    }
    public double getResult() {
        return result;
    }
    public boolean getISResultOk() {
        return IsResultOk;
    }
    public String getOperation() {
        return Operation;
    }
}
