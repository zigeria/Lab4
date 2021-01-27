package People;

import java.time.LocalDate;

public class Dad  extends Human{
    public Dad(String name, LocalDate birthday) {
        super(name, birthday);
    }

    @Override
    public void movement() {
        System.out.println("Dad, came home for lunch");//"Папа пришел пообедать");
    }
    @Override
    public void say() {
        System.out.println("Let's not talk about it anymore - Dad said.");//"Давай не будем больше об этом говорить - сказал папа");
    }

}
