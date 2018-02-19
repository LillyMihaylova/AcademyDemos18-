package humans;

import humans.Human;
import humans.Student;

public class TestClass {

    public static void main(String[] args) {
        Human human = new Human();
        Student student = new Student();
        Worker worker = new Worker(123, 20);

        human.setFirstName("Pesho");
        human.setFamilyName("Peshov");

        System.out.println(human.getFirstName() + " " + human.getFamilyName());
        System.out.println(worker.wages());
    }
}
