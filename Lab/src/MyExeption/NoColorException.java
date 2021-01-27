package MyExeption;

import Things.Item;

public class NoColorException extends Exception {
    @Override
    public String getMessage() {
        return "Set the color";//"Задайте цвет";
    }
}
