package Animal;

import Animal.Skills.Emotion;
import Animal.Skills.Speakable;
import Animal.Skills.Thinkable;

public class Tigra extends Animal implements Speakable, Thinkable {

    public Tigra(String name, int age) {
        super(name, age);
    }
    @Override
    public void say(String text) {
        System.out.println(getName() + " говорит " + text);
    }
    @Override
    public void think(String text) {
        System.out.println(text);
    }

    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
    }

    public Emotion getEmotion() {
        return emotion;
    }


    public void licks() {
        System.out.println(getName() + " облизывается.");
    }

}
