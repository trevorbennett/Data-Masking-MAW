package test;

import main.NameRandomizer;
import org.junit.jupiter.api.Test;

public class NameRandomizerTest {


    @Test
    public void doesRandomize(){
        NameRandomizer randomizer = new NameRandomizer();
        String trevorOutput = randomizer.randomize("Trevor");
        String SonamOutput = randomizer.randomize("Sonam");

        if(true){

        }
    }
}
