import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    Feline feline = new Feline();

    @Test
    public  void testGetFamily() {
        String family = feline.getFamily();
        assertEquals(family,"Кошачьи");
    }

    @Test
    public  void testGetKittensCount() {
        int kittens = feline.getKittens();
        assertEquals(kittens,1);
    }

    @Test
    public void testGetKittensCountNegative() {
        int kittens = feline.getKittens(-1);
        assertEquals(kittens, -1);
    }

    @Test
    public  void testEatMeat() throws Exception {
        List<String> felineFood = feline.eatMeat();
        assertEquals(felineFood, List.of("Животные", "Птицы", "Рыба"));
    }
}
