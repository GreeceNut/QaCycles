package ru.netology.QaCycles.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class TestWeekendService {

    @ParameterizedTest
   // @CsvSource({
 //           "3, 10000, 3000, 20000",
 //           "2, 100000, 60000, 150000"
    // })

   @CsvFileSource(files="src/test/resources/Weekend.csv")
    public void testCountWeekend (int expected, int income, int expenses, int threshold){
        WeekendService service = new WeekendService();

        int actual = service.calculate(income, expenses,threshold);

        Assertions.assertEquals(expected, actual);
    }
}
