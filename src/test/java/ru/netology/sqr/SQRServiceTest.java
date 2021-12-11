package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource (value = {"200, 300, 3", "0, 100, 1", "0, 99, 0", "100, 3500, 50"})
    void shouldCalculateSquare(int lowerLimit, int upperLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculateSquare(lowerLimit,upperLimit);
        assertEquals(expected, actual);
    }
}