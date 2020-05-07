package TemaSpring;

import PrinterSPRNG.Energy;

public class Email {
    Printer p;
    public Email(Printer printerdinafara) {
        p = printerdinafara;
        p.write("Printam: ");
    }
}
