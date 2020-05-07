package Printer2;

import PrinterSPRNG.Energy;

public class PrinterB implements Printer {
    int valoare;
    public PrinterB(int valoare){
        System.out.println("Instantiem un printer B " + valoare);
        this.valoare = valoare;
    }
    @Override
    public void showPrinter() {
        System.out.println("suntem in B: " + valoare);
    }
}