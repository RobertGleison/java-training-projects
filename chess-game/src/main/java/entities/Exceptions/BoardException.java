package entities.Exceptions;

public class BoardException extends RuntimeException{
    private static final long serialVersionUID = 2L;
    public BoardException(String msg){
        super(msg);
    }
}
