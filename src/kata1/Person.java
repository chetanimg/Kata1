
package kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person  {
    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public int getAge() {
        // un año tiene 31536000000 milisegundos
        LocalDate today = LocalDate.now();
        return (int) (Period.between(birthdate, today)).getYears();
    }
    
}
