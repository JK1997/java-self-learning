package Encapsulation;

public class PersonTwo {

    public static void main(String[] args) {
        Person myPerson = new Person("Jun Kai");
        //myPerson.name = "Keane";
        myPerson.setName("keane");
        System.out.println(myPerson.getName());
    }
}
