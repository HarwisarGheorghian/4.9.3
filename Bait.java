/*
 * Activity 4.9.3
 */
public class Bait extends LakeObject
{
    @Override
    public String say(){
      return "You now have a bait!";
    }

    public Bait(){
      super();
      setCost(10);
    }
}
