package PrinterSPRNG;

public class WindEnergy implements Energy {
    int valoare;
    public WindEnergy(int valoare){
        System.out.println("Instantiem o energie wind " + valoare);
        this.valoare = valoare;
    }
    @Override
    public void showEnergy() {
        System.out.println("suntem in wind: " + valoare);
    }
}
