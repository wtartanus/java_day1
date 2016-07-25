import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PokemonTrainerTest {
  PokemonTrainer wojtek;
  Pokemon pikachu;

  @Before
  public void setup() {
    wojtek = new PokemonTrainer("Wojtek");
    pikachu = new Pokemon("Pikachu");
  }

  @Test
  public void hasName() {
    assertEquals("Wojtek", wojtek.getName());
  }

  @Test
  public void setName() {
    wojtek.setName("Basia");
    assertEquals("Basia", wojtek.getName());
  }

  @Test
  public void startWithZeroExpierence() {
    assertEquals(0, wojtek.getExpierence());
  }

  @Test
  public void addTenExpierence() {
    wojtek.increaseExpierence();
    assertEquals(10, wojtek.getExpierence());
  }

  @Test
  public void startWithLvlOne() {
    assertEquals(1, wojtek.getLvl());
  }

  @Test 
  public void canCatchPokemon() {
    wojtek.catchPokemon(pikachu);
    assertEquals(1, wojtek.getPokemonCount());
  }

  @Test
  public void whenCoughtPikemonIncreaseExpierence() {
    wojtek.catchPokemon(pikachu);
    assertEquals(10, wojtek.getExpierence());
  }

  @Test
  public void whenExpierenceIsFiftyIncreaseLvl() {
    for( int i=0; i < 7; i++) {
      wojtek.catchPokemon(pikachu);
    }
    assertEquals(2, wojtek.getLvl());
  }

  @Test
  public void preventAddMorePokemons() {
    for( int i=0; i < 9; i++) {
      wojtek.catchPokemon(pikachu);
    }
    assertEquals(7, wojtek.getPokemonCount());
  }

}
















