package henbreeds;

import hen.Hen;

public class RussianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                " Моя страна - Россия."
                + " Я несу " + getCountOfEggsPerMonth()
                + " яиц в месяц.";
    }

}
