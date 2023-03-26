package henbreeds;

import hen.Hen;

public class UkrainianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 22;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                " Моя страна - Украина."
                + " Я несу " + getCountOfEggsPerMonth()
                + " яиц в месяц.";
    }
}
