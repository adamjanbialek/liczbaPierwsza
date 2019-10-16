import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiczbaPierwsza {

    public static Boolean czyLiczbaPierwsza(int a){
        List<Integer> dzielniki=new ArrayList<Integer>();
        boolean czyPierwsza = false;
        for(int i=1; i<=a; i++) {
            if(a%i==0){
                dzielniki.add(i);
            }
        }

        if(dzielniki.size()<3 && dzielniki.contains(1) && dzielniki.contains(a)){
            czyPierwsza=true;
        }

        return czyPierwsza;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę, żeby sprawdzić, czy to liczba pierwsza: ");
        int sprawdzona = scanner.nextInt();
        System.out.println(czyLiczbaPierwsza(sprawdzona));
    }

}
