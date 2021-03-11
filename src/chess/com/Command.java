package chess.com;

import java.io.Serializable;

public class Command implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    protected Position from;
    protected Position to;

    public Position getFrom() {
        return from;
    }

    public Position getTo() {
        return to;
    }
}