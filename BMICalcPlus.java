
public class BMICalcPlus
{
  public static void main(String[] args)
  {
    Person bob = new Person(2, 65);
    Person tim = new EnglishPerson(72, 200);

    System.out.println(bob.calcBMI());
    System.out.println(tim.calcBMI());
  }
}
