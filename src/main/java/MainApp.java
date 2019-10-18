import java.util.Scanner;

public class MainApp {

    public static boolean podajLiczbeDoSprawdzenia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę dla której chcesz wyliczyć silnie.");
        int a = scanner.nextInt();
        int wyliczSilnia = Silnia.czySilnia(a);
        System.out.println(wyliczSilnia);

        boolean wynik=LiczbaPierwsza.czyLiczbaPierwsza(a);

        return wynik;


    }

    public static void main(String[] args) {
        podajLiczbeDoSprawdzenia();
    }


}
