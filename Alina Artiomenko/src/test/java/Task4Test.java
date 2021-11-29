import org.junit.jupiter.api.Test;
import by.itAcademy.homeworks.types.Task4;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Task4Test {

    Task4 tas4Test = new Task4();

    @ParameterizedTest
    @CsvSource({"2, 3, 11", "3, 4, 19"})
    void resultSumAndMultiplication(int firstNumber, int secondNumber, int result) {
        int resultOfTwoNumbers = tas4Test.resultSumAndMultOfTwoNumbers(firstNumber, secondNumber);
        assertEquals(result, resultOfTwoNumbers);
        System.out.println("Результат сложение суммы и произведения чисел = " + resultOfTwoNumbers);
    }
}