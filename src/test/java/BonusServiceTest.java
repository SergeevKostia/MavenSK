import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.BonusService;

public class BonusServiceTest {

    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {

        BonusService service = new BonusService();
        int expected = 30;
        long actual = service.calculate(1000, true);
        //System.out.println(bonus);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForRegisteredAndOverLimit() {

        BonusService service = new BonusService();
        int expected = 500;
        long actual = service.calculate(1000000, true);
        //System.out.println(bonus);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForUnRegisteredAndOverLimit() {

        BonusService service = new BonusService();
        int expected = 500;
        long actual = service.calculate(1000000, false);
        //System.out.println(bonus);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForUnRegisteredAndUnderLimit() {

        BonusService service = new BonusService();
        int expected = 10;
        long actual = service.calculate(1000, false);
        //System.out.println(bonus);
        Assertions.assertEquals(expected, actual);
    }
}