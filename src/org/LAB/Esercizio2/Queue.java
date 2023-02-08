package org.LAB.Esercizio2;

import java.util.List;

public class Queue<T> {
    private List<T> queue;

    public Queue(List<T> queue) {
        this.queue = queue;
    }

    public T dequeue() throws Exception {
        if(empty()){
            throw new Exception("Coda vuota");
        }
        T elem = queue.get(0);
        queue.remove(0);
        return elem;
    }

    public void enqueue(T elem){
        queue.add(queue.size(), elem);
    }
    public boolean empty(){
        return queue.isEmpty();
    }

    public void printQueue(){
        for(T el: queue){
            System.out.print("  "+el);
        }
        System.out.println();
    }
}
