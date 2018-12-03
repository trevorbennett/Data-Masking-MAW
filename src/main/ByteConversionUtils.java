package main;

public class ByteConversionUtils {

    static Long stringToLongHash(String input) {

        if(input == null) {
            return 0L;
        }
        long hashedOutput = 0L;
        for (Character c : input.toCharArray()) {
            hashedOutput = 31L * hashedOutput + c;
        }
        return hashedOutput;
    }

}
