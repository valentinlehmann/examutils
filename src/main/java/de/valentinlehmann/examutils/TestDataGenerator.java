package de.valentinlehmann.examutils;

import java.util.Random;

public class TestDataGenerator {
    public static void main(String[] args) {
    }

    public static int[] randomIntArray(boolean guaranteeZero) {
        return randomIntArray(guaranteeZero, new Random().nextInt(0, 50));
    }

    public static int[] randomIntArray(boolean guaranteeZero, int length) {
        Random random = new Random();
        int[] result = new int[length];

        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(-10, 10);
        }

        if (guaranteeZero) {
            result[random.nextInt(0, result.length)] = 0;
        }

        return result;
    }

    public static char[] randomCharArray() {
        return randomCharArray(new Random().nextInt(0, 50));
    }

    public static char[] randomCharArray(int length) {
        Random random = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] result = new char[length];

        for (int i = 0; i < result.length; i++) {
            result[i] = alphabet.charAt(random.nextInt(0, alphabet.length()));
        }

        return result;
    }
}
