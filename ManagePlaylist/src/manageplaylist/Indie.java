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

public class Indie implements QueueInterface {

    private ArrayList<String> indiePlaylist;

    /* Creates a new instance of MyQueue class */
    public Indie() {
        indiePlaylist = new ArrayList<String>();
    }

    public boolean isEmpty() {
        return indiePlaylist.isEmpty();
    }

    public int size() {
        return indiePlaylist.size();
    }

    public Object frontElement() {
        if (indiePlaylist.size() > 0) {
            return indiePlaylist.get(0);
        } else {
            return null;
        }
    }

    public void enqueue(Object element) {
        indiePlaylist.add((String) element);
    }

    public Object dequeue() {
        if (indiePlaylist.size() > 0) {
            return indiePlaylist.remove(0);
        } else {
            return null;
        }
    }
    
     public String displayStack() {
        int iCount;
        String sMessage = "";
        if (indiePlaylist.isEmpty()) {
            sMessage = sMessage.concat("There are no songs to repeat");
        } else {
            sMessage = " ";
            for (iCount = 0; iCount < indiePlaylist.size(); iCount++) {
                sMessage = sMessage.concat(indiePlaylist.get(iCount));
                sMessage = sMessage.concat(" \n");
            }
        }
        return sMessage;
    }
}

