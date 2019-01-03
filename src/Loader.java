
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = getKitten();
        Cat cat6 = cat5.createTwin(cat5.getWeight(), cat5.getMinWeight(), cat5.getMaxWeight(), cat5.getWeightEaten());

        System.out.println(cat5.getWeight());
        System.out.println(cat6.getWeight());

        cat5.feed(1500.0);

        System.out.println(cat5.getWeight());
        System.out.println(cat6.getWeight());

        System.out.println("Count cats: " + Cat.getCount());

        cat1.meow();
        cat2.drink(5000.0);
        cat3.goToilet();
        cat4.feed(6000.0);
        cat5.drink(3000.0);

        System.out.println("Status cat1: " + cat1.getStatus());
        System.out.println("Status cat2: " + cat2.getStatus());
        System.out.println("Status cat3: " + cat3.getStatus());
        System.out.println("Status cat4: " + cat4.getStatus());
        System.out.println("Status cat5: " + cat5.getStatus());

        System.out.println("Count cats: " + Cat.getCount());

    }

    public static Cat getKitten()
    {
        Cat exclusiveCat = new Cat(100.0 + 100.0 * Math.random());
        return exclusiveCat;
    }
}