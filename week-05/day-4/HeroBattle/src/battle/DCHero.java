package battle;

public class DCHero extends Hero {
  DCHero(String name) {
    super(name, 45);
  }

  DCHero(String name, double motivation) {
    super(name, motivation);
  }

  @Override
  public void punch(Punchable other) {
    if (other instanceof MarvelHero)
      super.punch(other);
  }
}
