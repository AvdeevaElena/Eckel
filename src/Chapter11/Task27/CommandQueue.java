package Chapter11.Task27;

import java.util.LinkedList;
import java.util.Queue;

public class CommandQueue {

    Queue<Command> printComQ(Command command, Command command2,Command command3,Command command4) {

        Queue<Command> qCom = new LinkedList<Command>();
        ((LinkedList<Command>) qCom).add(0,command );
        ((LinkedList<Command>) qCom).add(0,command2 );
        ((LinkedList<Command>) qCom).add(0,command3 );
        ((LinkedList<Command>) qCom).add(0,command4 );


        return qCom;
    }
}
