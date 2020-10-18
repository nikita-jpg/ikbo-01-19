public class Main {

    public static void main(String[] args){
        WaitList waitList = new WaitList();
        waitList.add("string");
        waitList.add('c');
        waitList.add(123);
        waitList.add(true);
        System.out.println(waitList);

        BoundedWaitList boundedWaitList = new BoundedWaitList(5);
        boundedWaitList.add("string");
        boundedWaitList.add('c');
        boundedWaitList.add(123);
        boundedWaitList.add(true);
        System.out.println(boundedWaitList);

        UnfairWaitList unfairWaitList = new UnfairWaitList();
        unfairWaitList.add("string");
        unfairWaitList.add('c');
        unfairWaitList.add(123);
        unfairWaitList.add(true);
        System.out.println(unfairWaitList);
    }

}
