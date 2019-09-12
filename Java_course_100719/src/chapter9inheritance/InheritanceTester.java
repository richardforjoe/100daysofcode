package chapter9inheritance;

public class InheritanceTester {

    public static void main(String[] args){

        //Create a new person
        Person person = new Person();
        Employee employee = new Employee();
        Mother mom = new Mother();
        mom.setName("Maureen");

        System.out.println(mom.getName() + "is a " + mom.getGender());
    }
}
