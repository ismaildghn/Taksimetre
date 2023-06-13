import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        int km;
        double kmUcret = 2.20, total = 10;


        Scanner imp = new Scanner(System.in);

        System.out.print("Gideceğiniz mesafeyi KM cinsinden yazınız");
        km = imp.nextInt();

        total += km * kmUcret;
        total = (total < 20) ? 20 : total;
        System.out.println(total + "TL");

    }
}
