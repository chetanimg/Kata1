package kata1;
import java.time.LocalDate;
public class Kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1994, 10, 17);
        Person person = new Person("Chetani", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
