package cts.test2_practice.strategy.STB;

public class PlataCardBancar implements Strategy{
    @Override
    public void plateste(String modDePlata) {
        System.out.println("Calatorul a platit " + modDePlata);
    }
}
