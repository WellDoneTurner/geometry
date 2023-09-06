package com.geometry.util;

import com.geometry.exception.CustomException;

public class Validator {

    public static void validateInput(int i) {
        if (i == 0) {
            throw new CustomException("Input length is empty");
        }
        if (i > 3) {
            throw new CustomException("Input length should not be > 3. Actual length is " + i);
        }
    }
}
