public class Rocket implements Spaceship{
    public String type;
    public int weight;
    public int maxWeight;
    public int cost;

    @Override
    public boolean launch(){
        // launch and land methods in the Rocket class should always return true. When U1 and U2 classes extend the
        // Rocket class they will override these methods to return true or false based on the actual probability of
        // each type.
        return true;
    }

    @Override
    public boolean land(){
        // launch and land methods in the Rocket class should always return true. When U1 and U2 classes extend the
        // Rocket class they will override these methods to return true or false based on the actual probability of
        // each type.
        return true;
    }

    @Override
    public boolean canCarry(Item item){
        //    canCarry: a method that takes an Item as an argument and returns true if the rocket can carry
        //    such item or false if it will exceed the weight limit.
        if (item.weight+weight>maxWeight){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void carry(Item item){
        //    carry: a method that also takes an Item object and updates the current weight of the rocket.
        weight = weight + item.weight;
    }

    public int getCost() {
        return cost;
    }
}
