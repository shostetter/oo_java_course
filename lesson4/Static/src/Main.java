public class Main {
    public static void main(String[] args){
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        System.out.println("Person 4's local (" + person4.localCount + ") " +
                "\nPerson 4's static (" + person4.instanceCount + ") " +
                "\nPerson 1's local (" + person1.localCount + ") " +
                "\nPerson 1's static (" + person4.instanceCount + ") " +
                "\nPerson Class's static ("+Person.instanceCount+")");

    }
}
