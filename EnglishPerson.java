
public class EnglishPerson extends Person
{

  EnglishPerson()
  {
    super();
  }

  EnglishPerson(float height, float weight)
  {
    this();
    setHeight(height);
    setWeight(weight);
  }

  public void setHeight(float height)
  {
    super.setHeight(height * (float)0.025); //convert inches to meters
  }
  public void setWeight(float weight)
  {
    super.setWeight(weight * (float)0.45); //pounds to kg
  }
}
