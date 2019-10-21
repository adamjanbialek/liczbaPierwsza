import java.util.Scanner;

public class Silnia {

    public static void podajLiczbe() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj liczbę dla której chcesz wyliczyć silnie.");
        int a=scanner.nextInt();
        czyDaSieWyliczycSilnie(a);
    }


    public static boolean czyDaSieWyliczycSilnie(int a) {
        boolean check=true;
        if (a<0) {
            check=false;
        }
        if(check){
            czySilnia(a);
        }
        return check;
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

        return silnia;

    }

}
