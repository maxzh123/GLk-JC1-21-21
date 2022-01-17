package by.itAcademy.homeworks.dataFormats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Task74 {

    final static Logger logger = LoggerFactory.getLogger(Task74.class);

    public static void main(String[] args) {
        //LocalDate ld=LocalDate.now();
        for (int i=0;i<5000;i++){
            LocalDate ld=LocalDate.of(2020,02,02);
            logger.trace("Что-то не важное {} {}",ld.toString(),3);
            logger.info(ld.format(DateTimeFormatter.ofPattern("yyyy-MMMM-dd").
                    withLocale(new Locale("es"))));
            logger.error("Ошыпко!");
        }

    }
}
