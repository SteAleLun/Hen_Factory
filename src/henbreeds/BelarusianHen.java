package henbreeds;

import hen.Hen;

public class BelarusianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 24;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                " Моя страна - Беларусь."
                + " Я несу " + getCountOfEggsPerMonth()
                + " яиц в месяц.";
    }
}
