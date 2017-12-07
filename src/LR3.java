
public class LR3 {
    public static void main(String[] args)
    {

        System.out.println("Работа с десятичными чиселами:");
        Number A = new NumberActivity(10);
        Number B = new NumberActivity(10);
        A.getNumber();
        System.out.println("###");
        B.getNumber();
        System.out.println("###");
        A.sum(B);
        A.getNumber();

        System.out.println("\n\nРабота с объектами класса Octal из восьмиричных чисел:");
        Octal Oct1 = new Octal();
        Octal Oct2 = new Octal();
        Oct1.sum(Oct2);
        Oct1.getNumber();

        System.out.println("\n\nРабота с объектами класса BitString из двоичных чисел:");
        BitString BS1 = new BitString();
        BitString BS2 = new BitString();
        BS1.sum(BS2);
        BS1.getNumber();
    }
}
