package People;

import Interfaces.LeaveHome;
import MyExeption.MomIsNotAngryUncheckedException;


import java.time.LocalDate;

public class Mom extends Human implements LeaveHome {
    private boolean atHome = true;
    private int TimeInOffice;

    public Mom(String name, LocalDate birthday) {
        super(name, birthday);
    }
    public void setTimeInOffice(int timeinoffice) {
        this.TimeInOffice = timeinoffice;
    }
    public int getTimeInOffice() {
        return TimeInOffice;
    }
    public boolean isAtHome() {
        return atHome;
    }
    public void understood() throws MomIsNotAngryUncheckedException {
        System.out.println(getName() + " immediately realized who had done all this");//" сразу поняла, кто всё это натворил");
    }
    public void tellDad(){
        System.out.println("Maybe it's not good of me, because I've been getting used to Carlson lately, but you know, I'm ready to pay ten thousand crowns myself just to get rid of him -  Mom said");//"Может, это и нехорошо с моей стороны, — сказала " + getName() + ", — потому что я к Карлсону за последнее время стала понемногу привыкать, но знаете, я сейчас сама готова заплатить десять тысяч крон, только бы от него отделаться");
    }

    @Override
    public void movement() {
        System.out.println( getName() + " came");//" пришла");
        atHome = true;
    }
    @Override
    public void say() {
        if (isAtTheTable())
            System.out.println("During the meal, it is necessary to have fun - said Mom");//"Во время еды надо, чтобы было весело - сказала Мама");
        else if (getEmotion().equals(Emotions.ANGRY))
            System.out.println("Malysh, where's the begonia?! Why is there a flood at home? - angrily said Mom");//"Малыш, где бегония?! Почему дома потоп? - сердито сказала " + getName());
        else System.out.println("Hello, son! I'm home "+ getEmotion().toString () + " said " + getName());//"Здравствуй, сынок! Я дома " + getEmotion().toString() + " сказала " + getName());
    }
    @Override
    public void LeaveHome() {
        System.out.println( getName() + " went to a travel agency");//" ушла в бюро путешествий");
        atHome = false;
    }
}
