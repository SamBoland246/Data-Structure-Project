/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageplaylist;

import java.util.ArrayList;

/**
 *
 * @author sambo
 */
public class LikedSongs implements StackInterface {
    private ArrayList<String> likedSongs;

    /**
     * Creates a new instance of Stack
     */
    public LikedSongs(){
        likedSongs = new ArrayList<String>();
    }

    public boolean isEmpty() {
        return likedSongs.isEmpty();
    }

    /**
     * always false as there is no limit on the size of this ArrayList based
     * stack
     */
    public boolean isFull() {
        return false;
    }

    /**
     * removes the item from the TOP (first position) of the stack and returns
     * it
     */
    public Object pop() {
        if (!(likedSongs.isEmpty())) {
            return likedSongs.remove(0);
        } else {
            return null;
        }
    }

    /**
     * puts/inserts an item onto the TOP (first position) of the stack
     */
    public void push(Object newItem) {
        likedSongs.add(0, (String) newItem);
    }

    public int size() {
        return likedSongs.size();
    }
}

