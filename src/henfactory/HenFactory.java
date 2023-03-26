package henfactory;

import hen.Hen;
import henbreeds.BelarusianHen;
import henbreeds.MoldovanHen;
import henbreeds.RussianHen;
import henbreeds.UkrainianHen;

public class HenFactory {

    public static Hen getHen(String breed){
        if(breed.equals("Russian")) return new RussianHen();
        if(breed.equals("Ukrainian")) return new UkrainianHen();
        if(breed.equals("Moldovan")) return new MoldovanHen();
        if(breed.equals("Belarusian")) return new BelarusianHen();
        else return null;
    }

}
