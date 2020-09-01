import javafx.beans.binding.NumberBinding;
import org.junit.*;
import static org.junit.Assert.*;
import CalcClasses.Calclulator;
import CalcClasses.Number;

import java.io.IOException;


/**
 * Created by Pasha 01/09/2020
 */
public class CalculatorTest {

    @Test
    public  void TestAllOperations(){
        String[] OperationArray = new String[4];
        OperationArray[0] = "+";
        OperationArray[1] = "-";
        OperationArray[2] = "/";
        OperationArray[3] = "*";
        String CurrentOperation = null;
        Double BeginNumber = 5.5;
        for (int i = 0; i < 3; i++) {
            CurrentOperation = OperationArray[i];
            for (int j = -5; j < 5; j++) {
                Number A = new Number(BeginNumber);
                Number B = new Number(j);
                Calclulator calculator = new Calclulator(A, B, CurrentOperation);

                switch (CurrentOperation) {
                    case "+":
                        Assert.assertEquals("Тест на сложение. Число 1: " + A.getNumber() + " число 2: " + B.getNumber(), A.getNumber() + B.getNumber(), calculator.getResult(), 0);
                        break;
                    case "-":
                        Assert.assertEquals("Тест на вычитание. Число 1: " + A.getNumber() + " число 2: " + B.getNumber(), A.getNumber() - B.getNumber(), calculator.getResult(), 0);
                        break;
                    case "*":
                        Assert.assertEquals("Тест на умножение. Число 1: " + A.getNumber() + " число 2: " + B.getNumber(), A.getNumber() * B.getNumber(), calculator.getResult(), 0);
                        break;
                    case "/":
                        Assert.assertEquals("Тест на деление. Число 1: " + A.getNumber() + " число 2: " + B.getNumber(), A.getNumber() / B.getNumber(), calculator.getResult(), 0);
                        break;
                }
            }
        }
    }


}