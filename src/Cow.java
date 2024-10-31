public class Cow extends Animal{
    public Cow(){
        animalName = "Cow";
    }
    @Override
    public void animalSound(){
        System.out.println(animalName + " is mowing");
    }
}
