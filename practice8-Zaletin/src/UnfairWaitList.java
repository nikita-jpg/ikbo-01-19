public class UnfairWaitList<Object> extends WaitList{

    public UnfairWaitList(){}

    public void remove(Object el){
        content.remove(el);
    }

    public void moveToBack(Object el){
        content.remove(el);
        content.add(el);
    }
}
