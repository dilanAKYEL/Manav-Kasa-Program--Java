import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut= 2.14;
        double elma=3.67;
        double domates= 1.11;
        double muz=0.95;
        double patlican=5.00;
        int armutKg , elmaKg , domatesKg , muzKg , patlicanKg ;
        Scanner input = new Scanner(System.in);
        System.out.print("armut kilo giriniz:");
        armutKg= input.nextInt();

        System.out.print(" elma kilo:");
        elmaKg= input.nextInt();

        System.out.print(" domates kilo:");
        domatesKg= input.nextInt();

        System.out.print(" muz kilo:");
        muzKg= input.nextInt();

        System.out.print(" patlican  kilo:");
        patlicanKg= input.nextInt();

        double tutar= armut*armutKg + elma*elmaKg+domates*domatesKg+muz*muzKg+patlican*+patlicanKg;
        System.out.print("Toplam Tutar:"+tutar);


    }
}
