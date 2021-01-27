package Things;
import Interfaces.Drying;
import MyExeption.NoColorException;

public class Rag extends Item implements Drying {
    private final Materials MATERIAL;
    private int absorbency;
    private double speedDry = 0;
    public Rag(String itemName, Color color, Materials material) {
        super(itemName, color);
        this.MATERIAL = material;
        setAbsorbency(material);
        }
    public static Rag findRag(){
        try {
            Rag rag = new Rag("Tryapka", Item.RandomColor(10), Rag.Materials.WOOL);
            return rag;
        }
        catch (NoColorException e){
            System.out.println(e.getMessage());
            System.out.println("I am correcting the situation");//"Исправляю ситуацию");
            Rag rag =new Rag("Tryapka", Color.SILVER, Rag.Materials.WOOL);
            System.out.println("Malysh found a beautiful rag");//"Малыш нашел красивую тряпочку");
            return rag;
        }
    }

    public Materials getMATERIAL() {
        return MATERIAL;
    }
    public void setAbsorbency(Materials material) {
        switch (material){
            case SILK: this.absorbency = 1; break;
            case LINEN: this.absorbency = 2; break;
            case COTTON: this.absorbency = 4; break;
            case VISCOSE: this.absorbency = 6; break;
            case MICROFIBER: this.absorbency = 8; break;
            case WOOL: this.absorbency = 10; break;
        }

    }
    public int getAbsorbency() {
        return absorbency;
    }
    public double getSpeedDry() {
        return speedDry;
    }

    @Override
    public void dry(double power) {
        speedDry = getAbsorbency() * 0.5 * power;
    }
    @Override
    public int hashCode() {
        return getColor().hashCode() + getMATERIAL().hashCode();
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Rag)) return false;
        Rag p = (Rag) obj;
        return this.getColor().equals(p.getColor()) && this.getMATERIAL().equals(p.getMATERIAL());
    }
    @Override
    public String toString() {
        return this.getItemName() + " " + this.getColor() + " " + this.getMATERIAL();
    }

    public enum Materials {
        WOOL ("Wool"),
        SILK ("Silk"),
        VISCOSE("Viscose"),
        MICROFIBER ("Microfiber"),
        COTTON ("Cotton"),
        LINEN ("Linen");
        /*
        WOOL("Шерсть"),
        SILK("Шелк"),
        VISCOSE("Вискоза"),
        MICROFIBER("Микрофибра"),
        COTTON("Хлопок"),
        LINEN("Лен");
         */

        private final String S;
        Materials (String s){
            this.S = s;
        }

        @Override
        public String toString() {
            return S;
        }
    }
}
