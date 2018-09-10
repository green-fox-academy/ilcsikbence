package battle;

public class MarvelHero extends Hero {
  MarvelHero(String name) {
    super(name, 40);
  }

  MarvelHero(String name, double motivation) {
    super(name, motivation);
  }

  @Override
  public void punch(Punchable other) {
    if (other instanceof DCHero)
      super.punch(other);
  }
}