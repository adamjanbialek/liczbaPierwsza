
    import org.junit.Test;
import org.junit.Assert;

    public class LiczbaPierwszaTest {
        @Test
        public void shouldCheckIfLiczbaPierwsza(){

            Assert.assertTrue(LiczbaPierwsza.czyLiczbaPierwsza(7));
            Assert.assertTrue(LiczbaPierwsza.czyLiczbaPierwsza(1));
        }
    }

