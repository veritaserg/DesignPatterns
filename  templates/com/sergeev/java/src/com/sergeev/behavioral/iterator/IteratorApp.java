package com.sergeev.behavioral.iterator;

public class IteratorApp {
    public static void main(String[] args) {
        Tasks c = new Tasks();
        Iterator it = c.getIterator();
        while(it.hasNext()){
            System.out.println((String)it.next());
        }
    }
}
