import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAsCurrency.class, TestAsPercent.class, TestMaxOf.class, TestMinOf.class, TestRandBetween.class,
		TestToLength.class })
public class AllTests {

}
