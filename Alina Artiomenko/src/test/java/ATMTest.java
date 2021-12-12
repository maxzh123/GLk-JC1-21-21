import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import by.itAcademy.homeworks.objects.ATM;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    ATM atm01 = new ATM(10,25,13);

    @ParameterizedTest
    @CsvSource({"370, 'Зачислено 370'",
                "80, 'Деньги не зачислены! Принемаются только деньги номиналом 20, 50, 100!'",
                "0, 'Деньги не зачислены! Принемаются только деньги номиналом 20, 50, 100!'",
                "1100, 'Зачислено 1100'",
                "15, 'Деньги не зачислены! Принемаются только деньги номиналом 20, 50, 100!'"})

    void addMoney(int money, String msg) {
        assertEquals(msg, atm01.addMoney(money));
    }

    @ParameterizedTest
    @CsvSource({"370, 'Выдано: 3 * 100, 1 * 50, 1 * 20'",
            "80, 'Увы! Нет необходимых купюр для выдачи денег'",
            "1100, 'Выдано: 11 * 100, 0 * 50, 0 * 20'",
            "15, 'Увы! Нет необходимых купюр для выдачи денег'",
            "20, 'Выдано: 0 * 100, 0 * 50, 1 * 20'"})
    void withdrawalMoney(int value, String msg){
        assertEquals(msg, atm01.withdrawalMoney(value));
    }
}