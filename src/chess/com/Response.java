package chess.com;

import java.io.*;

public class Response implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Object data;
    private Command cmd;
    private ResponseType responseType;

    public Response(Command cmd, Object data) {
        this.cmd = cmd;
        this.data = data;
        if (cmd instanceof CommandGetBoardContext) {
            responseType = ResponseType.Json;
        }
        else {
            responseType = ResponseType.Text;
        }
    }

    public Object getData() {
        return data;
    }

    public Command getCommand() {
        return cmd;
    }
    
    public ResponseType getResponseType() {
        return responseType;
    }
}