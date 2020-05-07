package PrinterSPRNG;

public class Runner {
    public static void main(String[] args) {
        Energy ne = new NuclearEnergy(25);
        Energy se = new SolarEnergy(5);
        Energy we = new WindEnergy(15);
        Bec p = new Bec(se);
        Bec z = new Bec(ne);
        Bec h = new Bec(we);
    }
}
