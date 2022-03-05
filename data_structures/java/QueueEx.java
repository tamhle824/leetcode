import java.util.*;

/* abstract data structure collections of objects inserted and removed using FIFO
a good example would be multi-tasking in OS whre jobs are batched together depending 
on conditions, using a first in first out method to execute commands may be more efficient
*/

public class QueueEx {

    public static void main(String arg[]){

        Queue<String> queue = new LinkedList<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        System.out.println(queue);

        queue.remove("three");
        System.out.println(queue);
        System.out.println("Queue Size: " + queue.size());
        System.out.println("Queue Contains element ' two' or not?" + queue.contains("two"));


        queue.clear();
    }
}
