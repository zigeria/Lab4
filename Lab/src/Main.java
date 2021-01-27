import Free.Air;
import Free.Floor;
import MyExeption.MomIsNotAngryUncheckedException;
import People.*;
import Things.Item;
import Things.Plant;
import Things.Rag;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Carlson Carlson = new Carlson("Carlson", LocalDate.of(2000,1,25));
        Mom Mom = new Mom("Mom", LocalDate.of(1988,3,15));
        Malysh Malysh = new Malysh("Malysh", LocalDate.of(2010,10,26), 3);
        Dad Dad = new Dad("Dad",LocalDate.of(1980,11,23));
        Floor hall = new Floor(50);
        Mom.LeaveHome();
        Mom.setTimeInOffice(5);
        hall.flood(100);
        System.out.println(hall.toString());
        Rag rag = Rag.findRag();
        Rag rag2 = new Rag("tryapka iz kofty", Item.Color.YELLOW, Rag.Materials.WOOL);
        if (!rag.equals(rag2))
            Malysh.TakeRag(rag);
        Plant Begonia = new Plant("Begonia", Item.Color.BLUE);
        Carlson.destroyPlant(Begonia);
        Malysh.setEmotion(Human.Emotions.AFRAID);
        Malysh.say();
        Carlson.setEmotion(Human.Emotions.SURPRISED);
        Carlson.say();
        Carlson.LeaveHome();
        Malysh.movement();
        Carlson.sight();
        Carlson.Propeller propeller = new Carlson.Propeller("Propeller with push button", Item.Color.SILVER, 3, "K-26", 10);
        if (propeller.getSpeed() > 5){
            Air.whistle();
        }
        Malysh.sight();
        Carlson.wawe();
        Carlson.LeaveHome();
        if (Carlson.getBirthday().getDayOfMonth() == LocalDate.now().getDayOfMonth() && Carlson.getBirthday().getMonthValue() == LocalDate.now().getMonthValue()){
            Carlson.remember();
        }
        if (!Malysh.isRagInHand())
            Malysh.TakeRag(rag2);
        rag.dry(Malysh.getPOWER());
        Malysh.setSpeed(rag.getSpeedDry());
        Malysh.clean(Mom.getTimeInOffice());
        hall.dry(Malysh.getCleanArea());
        Mom.movement();
        if (Begonia.isDead() && hall.isWet()) {
            Mom.setEmotion(Human.Emotions.ANGRY);
            if (Mom.isAtHome() && Carlson.isNotAtHome())
                Carlson.lucky();
        }
        Mom.say();

        if (!Mom.getEmotion().equals(Human.Emotions.ANGRY))
            throw new MomIsNotAngryUncheckedException();

        Mom.understood();
        Dad.movement();
        Mom.tellDad();
        Malysh.setEmotion(Human.Emotions.SADLY);
        Malysh.say();
        Dad.say();
        Mom.setEmotion(Human.Emotions.QUIETLY);
        Dad.satDownAtTable();
        Malysh.satDownAtTable();
        Mom.satDownAtTable();
        for (int i = 2; i <= 10; i += 2) {
            System.out.println( i + " weeks later");
            Mom.say();
        }
    }
}
