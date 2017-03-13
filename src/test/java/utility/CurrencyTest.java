package utility;

/**
 * Created by CAMT on 3/13/2017.
 */
import org.junit.Test;
import utility.Currency;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
public class CurrencyTest {
    @Test
        public void testExchange(){
        Currency currency = new Currency();
        assertThat(currency.exchange("USD",1.0,"USD"),closeTo(1.0,0.001));

        assertThat(currency.exchange("USD",2.0,"USD"),closeTo(2.0,0.001));

        assertThat(currency.exchange("THB",5.0,"EUR"),closeTo(3.5,0.001));

    }
}
