package HW1;

import org.springframework.stereotype.Component;

@Component("Refferal")
public class Refferal_Dentist implements Refferal {
    public void direct(Integer room) {
        System.out.printf("Выдано направление к стоматологу в %d кабинет", room);
    }
}