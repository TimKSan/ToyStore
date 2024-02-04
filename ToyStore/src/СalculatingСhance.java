//Подсчет шанса на выигрыш

import java.util.Random;

public class СalculatingСhance implements СalculatingWinСhance {

    @Override
    public String calcWonChance(int toyName) {

        Random rand = new Random();
        String chanceAnswer = "";

        if (toyName == 1) {
            int chanceMath = rand.nextInt(100) + 1;
            if (chanceMath > 0 && chanceMath < 6) {
                chanceAnswer = "Победа!";

                LogginWonToy.log("Велосипед\n");

                ToysStore tStore = new ToysStore();
                tStore.setToyID(toyName);
                tStore.setToyName("Велосипед");
                

            } else {
                chanceAnswer = "\nПовезет в другой раз";
            }

        } else if (toyName == 2) {
            int chanceMath = rand.nextInt(100) + 1;
            if (chanceMath > 0 && chanceMath < 21) {
                chanceAnswer = "Победа!";

                LogginWonToy.log("Машинка\n");

                ToysStore tStore = new ToysStore();
                tStore.setToyID(toyName);
                tStore.setToyName("Машинка");
                
            } else {
                chanceAnswer = "\nПовезет в другой раз";
            }
            
        } else if (toyName == 3) {
            int chanceMath = rand.nextInt(100) + 1;
            if (chanceMath > 0 && chanceMath < 51) {
                chanceAnswer = "Победа!";

                LogginWonToy.log("Брелок\n");

                ToysStore tStore = new ToysStore();
                tStore.setToyID(toyName);
                tStore.setToyName("Брелок");
                
                tStore.sendForDistribut(tStore.getToyID(), tStore.getToyName());
            } else {
                chanceAnswer = "\nПовезет в другой раз";
            }
        }
        return chanceAnswer;
    }
}