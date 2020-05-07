package TemaSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext
                ("beanTema.xml");

        EmailPrinter emailPrinter = Context.getBean("EmailPrinter", EmailPrinter.class);
        PaperPrinter paperPrinter = Context.getBean("PaperPrinter", PaperPrinter.class);
        PapyrusPrinter papyrusPrinter = Context.getBean("PapyrusPrinter", PapyrusPrinter.class);
        emailPrinter.write("Printam cu Email Printer");
    }
}
