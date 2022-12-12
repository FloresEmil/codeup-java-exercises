import java.util.Arrays;

public class ArraysExercises {

//    public static Person[] addPerson(Person[] people, Person person) {
//
//        Person[] newArray = new Person[People.lenght
//                +1];
//        System.arraycopy(people, 0, newArray, 0, people.lenght);
//        newArray[people.leght] = person;
//        return newArray;
//    }



        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(Arrays.toString(numbers));

            Person pim = new Person("pim");
            Person pam = new Person("pam");
            Person pum = new Person("pum");


            Person[] people = {pim, pam, pum};

            for (Person person : people) {
                System.out.println(person.getName());
            }

            addPerson(people, "");

        }

    public static void addPerson(Person[] people, String name) {
        Person[] personCopy = Arrays.copyOf(people, people.length + 1);
        personCopy[personCopy.length - 1] = new Person(name);
        for (Person person : personCopy) {
            System.out.println(person.getName());
        }
    }




}
