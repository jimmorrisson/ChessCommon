package chess.com;

public class CommandSetPosition extends Command 
{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public CommandSetPosition(Position from, Position to) 
    {
        super();
        this.from = from;
        this.to = to;
    }
}