import java.util.Random;

public class U1 extends Rocket{
    // U1
    //    Rocket cost = $100 Million
    //    Rocket weight = 10 Tonnes
    //    Max weight (with cargo) = 18 Tonnes
    //    Chance of launch explosion = 5% * (cargo carried / cargo limit)
    //    Chance of landing crash = 1% * (cargo carried / cargo limit)

//    override the land and launch methods to calculate the corresponding chance of exploding and return either
//    true or false based on a random number using the probability equation for each.
    public U1(){
        type = "U-1";
        weight = 10; // in tonnes
        maxWeight = 18; // in tonnes

    }
    public boolean land() {
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        double landProb = (weight / maxWeight) * 0.01;

        if (landProb >= rand) {
            System.out.println("U-1 crashed!");
            return false;
        } else {
            System.out.println("U-1 landed");
            return true;
        }
    }

    public boolean launch(){
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        double launchProb = (weight / maxWeight) * 0.05;

        if (launchProb >= rand) {
            System.out.println("U-1 exploded!");
            return false;
        } else {
            System.out.println("U-1 launched");
            return true;
        }

    }
}
