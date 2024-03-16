/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageplaylist;

/**
 *
 * @author sambo
 */
import java.util.*;

public class Rap implements QueueInterface {

    private ArrayList<String> rapPlaylist;

    /* Creates a new instance of MyQueue class */
    public Rap() {
        rapPlaylist = new ArrayList<String>();
    }

    public boolean isEmpty() {
        return rapPlaylist.isEmpty();
    }

    public int size() {
        return rapPlaylist.size();
    }

    public Object frontElement() {
        if (rapPlaylist.size() > 0) {
            return rapPlaylist.get(0);
        } else {
            return null;
        }
    }

    public void enqueue(Object element) {
        rapPlaylist.add((String) element);
    }

    public Object dequeue() {
        if (rapPlaylist.size() > 0) {
            return rapPlaylist.remove(0);
        } else {
            return null;
        }
    }
}
