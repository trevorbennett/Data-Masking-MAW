package main;

import java.util.Random;

public class NameRandomizer {
    private enum Names {
        Bob, Trevor, Sarah, Mary, Joe, Sue, Emily, Jason
    }

    public String randomize(String realName) {
        Long nameHash = ByteConversionUtils.stringToLongHash(realName);

        Random generator = new Random(nameHash);
        Integer element = generator.nextInt(Names.values().length);
        Names outputName = Names.values()[element];
        return outputName.toString();
    }

}
