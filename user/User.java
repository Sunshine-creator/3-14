package cww.user;
import cww.action.IAction;
import cww.book.BookList;

abstract public class User {
    protected String name;
    protected IAction[] actions;//用户支持的操作
    abstract  public int menu();//各自的菜单
    public  void doAction(int choice, BookList bookList){
        actions[choice].work(bookList);
    }
}
