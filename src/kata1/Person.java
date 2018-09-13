
package kata1;

import java.util.Date;

public class Person  {
    private final String name;
    private final Date birthdate;

    public Person(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    
    public int getAge() {
        // un año tiene 31536000000 milisegundos
        return (int) ((new Date().getTimezoneOffset()- birthdate.getTime())/ 31536000000L);
    }
    
}
