package People;

import Interfaces.Ability;
import Interfaces.LeaveHome;
import Interfaces.Speed;
import Things.Item;
import Things.Plant;

import java.time.LocalDate;

public class Carlson extends Human implements LeaveHome, Ability {
    private boolean attentiveness = false;
    private boolean notAtHome = false;


    public Carlson(String name, LocalDate birthday) {
        super(name, birthday);
    }

    public boolean isNotAtHome() {
        return notAtHome;
    }

    public void destroyPlant(Plant plant) {
        System.out.println(getName() + " threw out the flower" /*" выкинул цветок"*/);
        plant.perish();
    }

    public void remember() {
        System.out.println(getName() + " remembers that it's his birthday"/*" вспоминает, что у него день рождения"*/);
    }

    public void lucky() {
        System.out.println("Carlson was lucky that he was not there when my mother returned from the travel agency");//"Карлсону повезло, что его не было, когда мама вернулась из бюро путешествий");
    }

    @Override
    public void movement() {
        if (attentiveness) {
            System.out.println(getName() + " swooped down and sped past the window");//" спикировал вниз и промчался мимо окна");

        } else
            System.out.println(getName() + " flew");//" летел");
    }

    @Override
    public void say() {
        System.out.println("Does your mother never throw flower pots out of the windows? - "+ getEmotion().toString () + " said" + getName());//"Неужели твоя мама никогда не швыряет из окон цветочные горшки? - " + getEmotion().toString() + " сказал " + getName());
    }

    @Override
    public void LeaveHome() {
        notAtHome = true;
        System.out.println(getName() + " flew away");//" улетел");
    }

    @Override
    public void wawe() {
        System.out.println(getName() + " waved his plump hand in response");//" махнул в ответ своей пухленькой ручкой");
    }

    @Override
    public void sight() {
        attentiveness = true;
        System.out.print(getName() + " saw Malysh,");//" увидел Малыша,");
        movement();
        attentiveness = false;

    }

    public static class Propeller extends Item implements Speed {
        private final int BLADES;
        private final String MODEL;
        private double speed;

        public Propeller(String itemName, Color color, int blades, String model, int maxSpeed) {
            super(itemName, color);
            this.BLADES = blades;
            this.MODEL = model;
            setSpeed(maxSpeed);
        }

        public int getBLADES() {
            return BLADES;
        }
        public String getMODEL() {
            return MODEL;
        }

        @Override
        public void setSpeed(double maxspeed) {
            this.speed = maxspeed * Math.random();
        }
        @Override
        public double getSpeed() {
            return speed;
        }
    }
}