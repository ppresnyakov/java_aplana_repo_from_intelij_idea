import org.junit.*;
import CalcClasses.Calclulator;
import CalcClasses.Number;
import org.junit.rules.ExpectedException;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;

import java.io.IOException;


/**
 * Created by Pasha 01/09/2020
 */
public class CalculatorTest {

    @Test
    public  void TestPlus(){
        String Operation = "+";
        Double BeginNumber = 5.5;
            for (int j = -5; j < 5; j++) {
                Number A = new Number(BeginNumber);
                Number B = new Number(j);
                Calclulator calculator = new Calclulator(A, B, Operation);
                        Assert.assertEquals("Тест на сложение. Число 1: " + A.getNumber() + " число 2: " + B.getNumber(), A.getNumber() + B.getNumber(), calculator.getResult(), 0);
                }
            }
    @Test
    public  void TestMinus(){
        String Operation = "-";
        Double BeginNumber = 5.5;
        for (int j = -5; j < 5; j++) {
            Number A = new Number(BeginNumber);
            Number B = new Number(j);
            Calclulator calculator = new Calclulator(A, B, Operation);
            Assert.assertEquals("Тест на вычитание. Число 1: " + A.getNumber() + " число 2: " + B.getNumber(), A.getNumber() - B.getNumber(), calculator.getResult(), 0);
        }
    }
    @Test (expected = ArithmeticException.class)
    public  void TestDivision(){
        String Operation = "/";
        Double BeginNumber = 5.5;
        for (int j = -5; j < 5; j++) {
            Number A = new Number(BeginNumber);
            Number B = new Number(j);
            Calclulator calculator = new Calclulator(A, B, Operation);
            Assert.assertEquals("Тест на деление. Число 1: " + A.getNumber() + " число 2: " + B.getNumber(), A.getNumber() / B.getNumber(), calculator.getResult(), 0);
        }
    }
    @Test
    public  void TestMulti(){
        String Operation = "*";
        Double BeginNumber = 5.5;
        for (int j = -5; j < 5; j++) {
            Number A = new Number(BeginNumber);
            Number B = new Number(j);
            Calclulator calculator = new Calclulator(A, B, Operation);
            Assert.assertEquals("Тест на умножение. Число 1: " + A.getNumber() + " число 2: " + B.getNumber(), A.getNumber() * B.getNumber(), calculator.getResult(), 0);
        }
        }

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public  void ZeroDivision() throws ArithmeticException{
        String Operation = "/";
        for (int j = -5; j < 5; j++) {
            Number A = new Number(j);
            Number B = new Number(0);
            thrown.expect(ArithmeticException.class);
            Calclulator calculator = new Calclulator(A, B, Operation);
            thrown = ExpectedException.none();
            };

        }
    }



