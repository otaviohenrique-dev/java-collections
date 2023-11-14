package queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Lorenzo Henrique
 * **/
public class ExemploProrityQueue {
    public static void main (String args[]){
        //Ordenação natural
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("short");
        queue.add("very long indeed");
        queue.add("medium");
        while (queue.size() != 0){
            System.out.println(queue.remove());
        }
    }
}
