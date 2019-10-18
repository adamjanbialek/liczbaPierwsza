import java.util.Scanner;

public class Silnia {

    public static String wrongNumber(){
        return "Dla podanej liczby nie można wyliczyć silni";
    }
    public static int czySilnia(int x) {
        int a=x;

        int silnia =1;
        if(a==0){
            silnia=1;
        }
        for (int i=1; i<=a; i++) {
            silnia*=i;
        }

        if(x<0){
            wrongNumber();
            return a;
        }

        return silnia;
    }

    public static void podajLiczbeDoSprawdzenia() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj liczbę dla której chcesz wyliczyć silnie.");
        int a=scanner.nextInt();
        czySilnia(a);
    }
}
