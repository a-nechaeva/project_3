package Animal;

import Animal.Skills.Speakable;
import Animal.Skills.Thinkable;

public class Kenga extends Animal implements Speakable, Thinkable {
    public Kenga(String name, int age) {
        super(name, age);
    }
    @Override
    public void say(String text) {
        System.out.print(text);
    }
    @Override
    public void think(String somebody) {
        System.out.println("Кенга думает, что " + somebody + " нужно подкрепиться!");
    }

}
