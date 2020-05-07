package PrinterSPRNG;

public class SolarEnergy implements Energy{
    int valoare;
    public SolarEnergy(int valoare){
        System.out.println("Instantiem o energie soara " + valoare);
        this.valoare = valoare;
    }
    @Override
    public void showEnergy() {
        System.out.println("suntem in solar: " + valoare);
    }
}
