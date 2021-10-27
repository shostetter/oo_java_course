import java.util.Random;

public class U2 extends Rocket{
    // U2
    //    Rocket cost = $120 Million
    //    Rocket weight = 18 Tonnes
    //    Max weight (with cargo) = 29 Tonnes
    //    Chance of launch explosion = 4% * (cargo carried / cargo limit)
    //    Chance of landing crash = 8% * (cargo carried / cargo limit)
    //    override the land and launch methods to calculate the corresponding chance of exploding and return either
//    true or false based on a random number using the probability equation for each.
    public String type;
    public double weight;
    public double maxWeight;

    public U2(){
        type = "U-2";
        weight = 10000; // in tonnes
        maxWeight = 18000; // in tonnes
        cost = 100000000;
    }

    public boolean land() {
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        double landProb = (weight / maxWeight) * 0.08;

        if (landProb >= rand) {
            System.out.println("U-2 crashed!");
            return false;
        } else {
            System.out.println("U-2 landed");
            return true;
        }
    }

    public boolean launch(){
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        double launchProb = (weight / maxWeight) * 0.04;

        if (launchProb >= rand) {
            System.out.println("U-1 exploded!");
            return false;
        } else {
            System.out.println("U-1 launched");
            return true;
        }

    }
}
