package PrinterSPRNG;

public class NuclearEnergy implements Energy{
    int valoare;
    public NuclearEnergy(int valoare){
        System.out.println("Instantiem o energie nucleara " + valoare);
        this.valoare = valoare;
    }
    @Override
    public void showEnergy() {
        System.out.println("suntem in nucleara: " + valoare);
    }
}
