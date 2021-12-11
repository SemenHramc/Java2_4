package ru.netology.sqr;

public class SQRService {
    public int calculateSquare (int lowerLimit, int upperLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i*i >= lowerLimit && i*i <= upperLimit) {
                count++;
            }
        }
        return count;
    }
}
