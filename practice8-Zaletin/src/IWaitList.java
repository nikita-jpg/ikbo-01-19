import java.util.Collection;

public interface IWaitList<Object> {
    void add(Object el);
    Object remove();
    boolean contains(Object el);
    boolean containsAll(Collection<Object> arr);
    boolean isEmpty();
}
