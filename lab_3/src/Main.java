import Animal.*;
import Animal.Skills.Emotion;
import Food.Food;
import Place.Place;
import Place.Location;

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
        System.out.println(tigra.eat(fishOil) + fishOil.time(1) + "," + fishOil.time(2) + "," + fishOil.time(3));
        System.out.println(ru.eat(kasha) + kasha.time(1));
        kenga.think(tigra.getName());
        System.out.println(tigra.eat(kasha) + kasha.time(4));

    }
}
