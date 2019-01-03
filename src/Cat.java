
public class Cat
{
    private Double originWeight;
    private Double weight;
    private Double weightEaten;

    private Double minWeight;
    private Double maxWeight;

    private static Integer count = 0;

    public Cat()
    {
        count++;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        weightEaten = 0.0;
    }

    public Cat(Double weight)
    {
        count++;
        this.weight = weight;
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        weightEaten = 0.0;
    }

    public Cat createTwin(Double weight, Double minWeight, Double maxWeight, Double weightEaten)
    {
        Cat cat = new Cat();
        cat.weight = weight;
        cat.originWeight = weight;
        cat.minWeight = minWeight;
        cat.maxWeight = maxWeight;
        cat.weightEaten = weightEaten;

        return cat;
    }

    public static Integer getCount()
    {
        return count;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        weightEaten = weightEaten + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public Double getMinWeight()
    {
        return minWeight;
    }

    public Double getMaxWeight()
    {
        return maxWeight;
    }

    public Double getWeightEaten()
    {
        return weightEaten;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            count = count - 1;
            return "Dead";
        }
        else if(weight > maxWeight) {
            count = count - 1;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public void goToilet()
    {
        weight = weight - 1;
        System.out.println("Meow,  done,  meow!");
    }
}