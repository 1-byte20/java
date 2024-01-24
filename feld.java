import java.util.Scanner;

import javax.print.attribute.HashPrintJobAttributeSet;

public class feld{
    public static void main(String[] args) {
        System.out.println("Hello Geri!");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kedvenc zeneszáma: ");
        String zene = scanner.nextLine();

        System.out.println("Kedvenc zeneszáma: "+ zene);

        System.out.print("Kedvenc étele: ");
        String etel = scanner.nextLine();

        System.out.println("Kedvenc étele: "+ etel);

        System.out.print("Kedvenc hobbija: ");
        String hobbi = scanner.nextLine();

        System.out.println("Kedvenc hobbija: "+ hobbi);

        System.out.print("Kedvenc filme: ");
        String film = scanner.nextLine();

        System.out.println("Kedvenc filme: "+ film);

        System.out.print("Kedvenc uticélja: ");
        String utic = scanner.nextLine();

        System.out.println("Kedvenc uticélja: "+ utic);

        







    }
}
