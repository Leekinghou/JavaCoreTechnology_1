package AbstractClass_05;

public abstract class Rabbit extends LandAnimal implements ClimbTree{
    public void climb(){
        System.out.println("Rabbit:I can climb");
    }

    public void eat(){
        System.out.println("Rabbilt:I can eat");
    }
}
