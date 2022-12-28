import Animal.*;
import Animal.Skills.Emotion;
import Food.*;
import Place.*;

public class Main {
    public static void main(String[] args) {
        Kenga kenga = new Kenga("Кенга", 40);
        Tigra tigra = new Tigra("Тигра", 30);
        Ru ru = new Ru("Ру", 7);

        Food fishOil = new Food("Рыбий жир", 1000);
        Food kasha = new Food("Каша", 100);

        tigra.lookAt("потолок");
        tigra.eyes(false);
        tigra.licks();
        tigra.setEmotion(Emotion.SMILE);
        System.out.println(tigra.expressEmotion());
        ru.setEmotion(Emotion.NOTSURPRISED);
        tigra.say(ru.expressEmotion());
        Place place = new Place(Location.KENGAHOUSE);
        System.out.println(tigra.toLive(place));
        TimeToEat breakfast = new TimeToEat(Times.BREAKFAST);
        TimeToEat lunch = new TimeToEat(Times.LUNCH);
        TimeToEat dinner = new TimeToEat(Times.DINNER);
        TimeToEat sometimes = new TimeToEat(Times.SOMETIMES);
        System.out.println(tigra.eat(fishOil, breakfast));
        System.out.println(tigra.eat(fishOil, lunch));
        System.out.println(tigra.eat(fishOil, dinner));
        System.out.println(ru.eat(kasha, breakfast));
        kenga.think(tigra.getName());
        System.out.println(tigra.eat(kasha,sometimes));

    }
}
