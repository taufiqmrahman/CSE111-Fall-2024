public class MagicalTester {
  public static void main(String[] args) {
    Dragon drake = new Dragon("Drake", 500, 75);
    Phoenix fawkes = new Phoenix("Fawkes", 200, 5);
    drake.displayInfo();
    drake.makeSound();
    drake.performMagic();
    drake.fly();
    System.out.println("=====================");
    fawkes.displayInfo();
    fawkes.makeSound();
    fawkes.performMagic();
    fawkes.regenerate();
  }
}
