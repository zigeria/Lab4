package MyExeption;

public class MomIsNotAngryUncheckedException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Mom has nothing to be angry about! It's okay!";//"Маме не на что злиться! Все хорошо!";
    }
}
