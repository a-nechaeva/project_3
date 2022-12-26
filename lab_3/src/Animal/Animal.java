package Animal;

import Animal.Skills.Emotion;
import Food.Food;
import Place.Place;
import java.util.Objects;

public abstract class Animal {

    public Animal(String name, int age) {
        setName(name);
        setAge(age);
    }
    private String name;
    private Integer age;

    protected Emotion emotion;
    protected Food food;
    protected Place place;

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age + " лет.";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object animal) {
        if (this == animal) return true;
        if (animal == null) return false;
        if (!animal.getClass().equals(this.getClass())) return false;
        Animal one = (Animal) animal;
        return name.equals(one.name) && age == one.age;
    }

   public String eat(Food food) {
       this.food = food;
       return getName() + " ест " + food.toString();
   }
    public void eyes(boolean isOpen){
        if (isOpen)
            System.out.println(this.getName() + " открыл глаза!");
        else
            System.out.println(this.getName() + " закрыл глаза.");
    }
    public void lookAt(String at) {
        System.out.println(this.getName() + " посмотрел на " + at);
    }

    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
    }

    public String expressEmotion() {
        String action;
        switch (emotion) {
            case SAD -> action = " грустит!";
            case SMILE -> action = " улыбается!";
            case SURPRISED -> action = " удивлен!";
            case NOTSURPRISED -> action = " неудивлен!";
            case LAUGH -> action = " смеется!";
            default -> action = " испытывает неопределенные эмоции:))::(";
        }
        return getName() + action;
    }

    public String toLive(Place place) {
        this.place = place;
        return getName() + " живет " + place;
    }

}
