public class Lion extends Animal{
    public Lion(){
        animalName = "Lion";
    }
    @Override
    public void animalSound(){
        System.out.println(animalName + " is roaring");
    }
}
