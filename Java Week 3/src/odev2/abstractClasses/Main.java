package odev2.abstractClasses;

public class Main {
    public static void main(String[] args) {
        WomenCalculator womenCalculator = new WomenCalculator();
        womenCalculator.hesapla();

        GameCalculator[] gameCalculators = new GameCalculator[]{new KidsGameCalculator(), new ManGameCalculator(), new WomenCalculator()};
        for (GameCalculator gameCalculator:gameCalculators){
            gameCalculator.hesapla();
            gameCalculator.gameOver();

        }


    }
}
