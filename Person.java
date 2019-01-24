
public class Person
{
  private float height;
  private float weight;


  //default constructor
  Person()
  {
    height = 1.0f;
    weight = 1.0f;
  }

  Person(float height, float weight)
  {
    this();
    setHeight(height);
    setWeight(weight);
  }

  protected void setWeight(float weight)
  {
    this.weight = weight;
  }
  protected void setHeight(float height)
  {
    this.height = height;
  }

  public float calcBMI()
  {
    return weight / (height * height);
  }

}
