package Printer2;

import PrinterSPRNG.Energy;

public class PrinterC implements Printer {
    int valoare;
    public PrinterC(int valoare){
        System.out.println("Instantiem un printer C " + valoare);
        this.valoare = valoare;
    }
    @Override
    public void showPrinter() {
        System.out.println("suntem in C: " + valoare);
    }
}