package Printer2;

import PrinterSPRNG.Energy;

public class Email {
    Energy e;
    public Email(Energy energieDinExterior) {
        e = energieDinExterior;
        e.showEnergy();
    }
}
