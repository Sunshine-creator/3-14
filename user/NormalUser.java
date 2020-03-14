package cww.user;

import cww.action.*;

public class NormalUser extends User {

    public NormalUser(String name) {
        this.name =name;
        this.actions = new IAction[]{
                new ExitAction(),
                new BorrowAction(),
                new ReturnAction(),
                new FindAction()
        };
    }
}
