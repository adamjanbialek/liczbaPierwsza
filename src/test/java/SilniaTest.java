import org.junit.Assert;
import org.junit.Test;

public class SilniaTest {

    @Test
    public void shouldCalcFactorial() {
        int expected=120;
        Assert.assertEquals(expected,Silnia.czySilnia(5));
    }

    @Test
    public void shouldCalcFactorialWhenZero() {
        int expected=1;
        Assert.assertEquals(expected,Silnia.czySilnia(0));
    }

    @Test
    public void shouldCheckIfStrongCanBeCalculated(){
        boolean expected = false;
        Assert.assertEquals(expected,Silnia.czyDaSieWyliczycSilnie(-1));
    }

//    @Test
//    public void shouldNaturalNumber(){
//        boolean expected=true;
//        Assert.assertEquals(expected,MainApp.podajLiczbeDoSprawdzenia());
//    }
}
