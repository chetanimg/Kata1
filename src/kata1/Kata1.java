package kata1;
import java.util.Date;
public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Che", new Date(94,9,17));
        System.out.println((person.getName() + " tiene " + -1*person.getAge()));
    }
    
}
