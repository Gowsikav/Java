public class MethodOverloadingRunner
 {
    public static void main(String[] args) 
    {
        
        Calculate.compute((byte)1);
        Calculate.compute((short)2);
        Calculate.compute(3);
        Calculate.compute(4L);
        Calculate.compute(5.5f);
        Calculate.compute(6.6);
        Calculate.compute('A');
        Calculate.compute(true);
        Calculate.compute("Hello");
        Calculate.compute(10,20);

        Printer.display((byte)10);
        Printer.display((short)20);
        Printer.display(30);
        Printer.display(40L);
        Printer.display(50.5f);
        Printer.display(60.6);
        Printer.display('B');
        Printer.display(false);
        Printer.display("World");
        Printer.display(20,30);

        Converter.transform((byte)100);
        Converter.transform((short)200);
        Converter.transform(300);
        Converter.transform(400L);
        Converter.transform(500.5f);
        Converter.transform(600.6);
        Converter.transform('C');
        Converter.transform(true);
        Converter.transform("Java");
        Converter.transform(30,5);
    }
}