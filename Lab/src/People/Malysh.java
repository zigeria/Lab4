package People;

import Interfaces.Ability;
import Interfaces.Speed;
import Things.Rag;

import java.time.LocalDate;

public class Malysh extends Human implements Speed, Ability {
    private boolean RagInHand = false;
    private double speed = 0;
    private double cleanArea = 0;
    private final double POWER;

    public Malysh(String name, LocalDate birthday, double power) {
        super(name, birthday);
        this.POWER = power;
    }

    public double getPOWER() {
        return POWER;
    }
    public void clean(int time){
        System.out.println("Malysh began to collect water from the hallway floor with a rag ");//"Малыш стал собирать тряпкой воду с пола прихожей ");

        cleanArea = getSpeed() * time;
    }
    public double getCleanArea() {
        return cleanArea;
    }
    public void TakeRag(Rag rag){
        System.out.println(getName() + " picked it up "/*" взял в руки "*/ + rag.getItemName());
        RagInHand = true;
    }
    public boolean isRagInHand() {
        return RagInHand;
    }

    @Override
    public void movement() {
        System.out.println( getName() + " ran to the window");//" побежал к окну");
    }
    @Override
    public void say() {
        System.out.println("Oh, how so? - Said"/*"Ой, что ты? - Сказал"*/ + getEmotion().toString() + " " + getName());
    }
    @Override
    public void wawe() {
        if (RagInHand)
            System.out.println(" and" + getEmotion().toString () + " waved a rag at him");//" и" + getEmotion().toString() + " замахал ему тряпкой");
        else
            System.out.println(" and waved at him");//" и замахал ему");
    }
    @Override
    public void sight() {
        setEmotion(Emotions.HAPPINESS);
        System.out.print( getName() + " saw Carlson");//" увидел Карлсона");
        wawe();
    }
    @Override
    public void setSpeed(double speedDry) {
        speed = Math.random() * speedDry;
    }
    @Override
    public double getSpeed() {
        return speed;
    }
}
