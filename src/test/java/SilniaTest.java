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
    public void shouldCalcFactorialWhenNumberIsBelowZero(){
        String expected = "Dla podanej liczby nie można wyliczyć silni";
        Assert.assertEquals(expected,Silnia.czySilnia(-1));
    }

    @Test
    public void shouldNaturalNumber(){
        boolean expected=true;
        Assert.assertEquals(expected,MainApp.podajLiczbeDoSprawdzenia());
    }
}
