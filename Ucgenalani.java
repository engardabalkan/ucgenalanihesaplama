import java.util.Scanner;

public class Ucgenalani {
    public static void main(String[] args) {
        double akenari, bkenari, ckenari,u,alan;

        Scanner a = new Scanner(System.in);
        System.out.println("Lütfen a kenarı uzunluğunu giriniz:");
        akenari = a.nextDouble();

        Scanner b = new Scanner(System.in);
        System.out.println("Lütfen b kenarı uzunluğunu giriniz:");
        bkenari = b.nextDouble();

        Scanner c = new Scanner(System.in);
        System.out.println("Lütfen c kenarı uzunluğunu giriniz:");
        ckenari = c.nextDouble();

        u = (akenari+bkenari+ckenari) / 2;
        alan=Math.sqrt(u*(u-akenari)*(u-bkenari)*(u-ckenari));


        System.out.println("Üçgen alanı:" + alan);
    }
}
