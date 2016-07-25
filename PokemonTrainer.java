class PokemonTrainer {

  private String name;
  private int expierence;
  private int lvl;
  private Pokemon[] pokemons;
  private int pokemonCount;
  private int lvlUp;

  public PokemonTrainer(String name) {
    this.name = name;
    this.expierence = 0;
    this.lvl = 1;
    this.pokemons = new Pokemon[7];
    this.pokemonCount = 0;
    this.lvlUp = 50;
  }

  public String getName() {
    return this.name;
  }

  public int getExpierence() {
    return this.expierence;
  }

  public int getLvl() {
    return this.lvl;
  }

  public int getPokemonCount() {
    return this.pokemonCount;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void increaseExpierence() {
    this.expierence += 10;
  }

  public void increaseLvl() {
    this.lvl += 1;
    this.lvlUp += lvlUp;
  }

  public void catchPokemon(Pokemon pokemon) {
    if(pokemonCount >= 7) return;
    this.pokemons[this.pokemonCount] = pokemon;
    this.pokemonCount += 1;
    this.increaseExpierence();
    if(this.expierence == this.lvlUp) {
      this.increaseLvl();
    }
  }


}