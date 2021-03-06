package utility;

/**
 * Created by CAMT on 3/13/2017.
 */
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class GradeCalculatorTest {
    @Test
    public void testCalculator(){
        GradeCalculator gc = new GradeCalculator();
        assertThat(gc.calculate(20,21,32,25),is('A'));
        assertThat(gc.calculate(25,28,32),is('B'));
        assertThat(gc.calculate(65,1),is('C'));
        assertThat(gc.calculate(0,7,32,5),is('F'));
  assertThat(grade.calculate(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1),is('C'));
        assertThat(grade.calculate(25,28,32),is('B'));
        assertThat(grade.calculate(40, 26),is('C'));
        assertThat(grade.calculate(20,12,6),is('F'));
       assertThat(grade.calculate(80,35,5),is('x'));
        assertThat(grade.calculate(81),is('B'));
        assertThat(grade.calculate(-5),is('U'));
    }
}