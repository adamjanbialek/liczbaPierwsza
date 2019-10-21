import java.util.Scanner;

public class MainApp {

    public static void podajLiczbeDoSprawdzenia() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę dla której chcesz wyliczyć silnie.");

        int a = scanner.nextInt();

        boolean ch = Silnia.czyDaSieWyliczycSilnie(a);

        int wyliczona;

        if(ch){
            wyliczona=Silnia.czySilnia(a);
            System.out.println("Silnia "+a+" to: "+wyliczona);
        } else {
            System.out.println("Nie da się wyliczyć silni dla tej liczby.");
        }

        boolean wynik=LiczbaPierwsza.czyLiczbaPierwsza(a);

        System.out.println("Czy to liczba pierwsza: "+wynik);


    }

    public static void main(String[] args) {
        podajLiczbeDoSprawdzenia();
    }


}
