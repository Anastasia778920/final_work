package Java.Beasts;

public class Donkey extends Beasts {

    public Donkey(int id, String name, String birthdate, int loadCapacity) {
        super(id, name, birthdate, loadCapacity);
    }
    
    public void Comands(){
        System.out.println("Выполняемые команды животного");
    }
}