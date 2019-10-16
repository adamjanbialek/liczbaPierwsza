import java.util.ArrayList;
import java.util.List;

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

}
