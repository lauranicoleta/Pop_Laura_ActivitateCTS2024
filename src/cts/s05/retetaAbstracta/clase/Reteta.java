package cts.s05.retetaAbstracta.clase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reteta implements RetetaAbstracta{

    private Map<String, Double> solutii;
    private String numeMedicament;

    public Reteta(){
        this.solutii = null;
        this.numeMedicament = "";
    }

    public Reteta(Map<String, Double> solutii, String numeMedicament) {
        this.solutii = solutii;
        this.numeMedicament = numeMedicament;
    }

    @Override
    public RetetaAbstracta clone() {
        Reteta retetaAbstracta = new Reteta();
        retetaAbstracta.setSolutii(this.solutii);
        retetaAbstracta.setNumeMedicament(this.numeMedicament);
        return retetaAbstracta;
    }

    public Map<String, Double> getSolutii() {
        return solutii;
    }

    public void setSolutii(Map<String, Double> solutii) {
        this.solutii = new HashMap<>();
        for (String solutie : solutii.keySet()) {
            this.solutii.put(solutie, solutii.get(solutie));
        }
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "solutii=" + solutii +
                ", numeMedicament='" + numeMedicament + '\'' +
                '}';
    }
}
