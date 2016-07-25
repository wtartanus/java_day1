import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PokemonTest {
  Pokemon pikachu;

  @Before
  public void setup() {
    pikachu = new Pokemon("Pikachu");
  }

  @Test
  public void hasName() {
    assertEquals("Pikachu", pikachu.getName());
  }
}