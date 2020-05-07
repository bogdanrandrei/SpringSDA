package Printer2;

import PrinterSPRNG.Energy;

public class PrinterA implements Printer {
    int valoare;
    public PrinterA(int valoare){
        System.out.println("Instantiem un printer A " + valoare);
        this.valoare = valoare;
    }
    @Override
    public void showPrinter() {
        System.out.println("suntem in A: " + valoare);
    }
}

