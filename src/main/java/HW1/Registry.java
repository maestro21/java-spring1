package HW1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("Registry")
public class Registry {
    // @Autowired
    private Refferal refferal;

    public Refferal getRefferal() {
        return refferal;
    }
    @Autowired(required = false)
    @Qualifier("Refferal")
    public void setRefferal(Refferal refferal) {
        this.refferal = refferal;
    }

    public void issue_direction() {
        Random rand = new Random();
        Integer room = rand.nextInt(10);
        System.out.println("Направление выдано");
        refferal.direct(room);
    }
}
