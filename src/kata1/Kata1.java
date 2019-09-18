package kata1;

import java.util.Date; //ctrol shfit i

public class Kata1 {

    public static void main(String[] args) {
        Person person= new Person("Pablo", new Date(99,2,16));
        System.out.println(person.getName()+" tiene "+person.getAge());
    }
    
}
