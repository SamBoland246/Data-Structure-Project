/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageplaylist;

/**
 *
 * @author sambo
 */
public interface StackInterface {

    public boolean isEmpty();

    public boolean isFull();

    public void push(Object newItem);

    public Object pop();

    public int size();

   public String displayStack();
}