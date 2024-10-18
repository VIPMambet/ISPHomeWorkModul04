// Интерфейс для печати
interface IPrinter {
    void print(String content);
}

// Интерфейс для сканирования
interface IScanner {
    void scan(String content);
}

// Интерфейс для отправки факсов
interface IFax {
    void fax(String content);
}

// Многофункциональный принтер
class AllInOnePrinter implements IPrinter, IScanner, IFax {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan(String content) {
        System.out.println("Scanning: " + content);
    }

    @Override
    public void fax(String content) {
        System.out.println("Faxing: " + content);
    }
}

// Базовый принтер
class BasicPrinter implements IPrinter {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
}

public class Main {
    public static void main(String[] args) {
        IPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print("Document");

        AllInOnePrinter allInOnePrinter = new AllInOnePrinter();
        allInOnePrinter.print("Document");
        allInOnePrinter.scan("Document");
        allInOnePrinter.fax("Document");
    }
}
