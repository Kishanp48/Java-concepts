abstract class Car  // Abstract Class
{
    public abstract void drive();   // Abstract Method

    public abstract void fly();

    public void PlayMusic()
    {
        System.out.println("play music");
    }
}

abstract class Kia extends Car  // Abstract Class
{
    public void drive()
    {
        System.out.println("Driving..");
    }

}

class UpdatedKia extends Kia    // Concrete Class
{
    public void fly()
    {
        System.out.println("fly..");
    }
}


public class Abstract_
{
    public static void main(String args[])
    {
        // Abstract:-     

        // Abstract Method is created only if it needs to be Declared, not Defined.
        // Abstract Method can only Declared in the Abstract Class.

        // Abstract Class can have the normal Methods or only normal Methods or only Abstract Methods.

        // Abstract Method are then Defined in Sub/Child Class. *Compulsory.

        // * You cannot create the Object of Abstract Class. *
        // * you can create the Object of Abstract class only when implementing the Anonymous Class. *

        // If a Sub-class cannot Define all the Abstract Methods of super-Class than,
        // that class has to be convert into Abstract Class.
        // but than you cannot create the Object of that Sub-Class.

        Car carens = new UpdatedKia();

        carens.PlayMusic();
        carens.drive();
        carens.fly();


    }
}

  