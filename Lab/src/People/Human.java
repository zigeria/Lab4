package People;

import java.time.LocalDate;

public abstract class Human {
    private final String NAME;
    private final LocalDate BIRTHDAY;
    private Emotions emotion = Emotions.QUIETLY;
    private boolean AtTheTable;

    public Human(String name, LocalDate birthday) {
        this.NAME = name;
        this.BIRTHDAY = birthday;
    }
    public String getName() {
        return NAME;
    }
    public LocalDate getBirthday() {
        return BIRTHDAY;
    }
    public void setEmotion(Emotions emotion) {
        this.emotion = emotion;
    }
    public Emotions getEmotion() {
        return emotion;
    }
    public abstract void movement();
    public abstract void say();
    public void satDownAtTable(){
        System.out.println(getName() + " sat down at the table");//" сел за стол");
        AtTheTable = true;
    }
    public boolean isAtTheTable() {
        return AtTheTable;
    }

    @Override
    public int hashCode() {
        return getBirthday().hashCode() + getName().hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        return this.toString().equals(obj.toString());
    }
    @Override
    public String toString() {
        return getName() + " " + getBirthday().getDayOfMonth() + "-" + getBirthday().getMonthValue();
    }
    public enum Emotions {
        QUIETLY (" calmly"),
        HAPPINESS (" enthusiastic"),
        SADLY (" sad"),
        SURPRISED (" with surprise"),
        AFRAID (" scared"),
        SHAMEFULLY (" shameful"),
        ANGRY (" angry");
        /*
        QUIETLY(" спокойно"),
        HAPPINESS(" восторженно"),
        SADLY(" грустно"),
        SURPRISED(" с удивлением"),
        AFRAID(" напуганно"),
        SHAMEFULLY(" стыдно"),
        ANGRY(" сердито");
         */
        private final String S;
        Emotions (String s){
            this.S = s;
        }
        @Override
        public String toString() {
            return S;
        }
    }
}
