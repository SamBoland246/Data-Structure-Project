/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package manageplaylist;

/**
 *
 * @author sambo
 */
public interface QueueInterface {

    public boolean isEmpty();

    public int size();

    public Object frontElement();

    public void enqueue(Object newItem);

    public Object dequeue();
    
    public String displayStack();
}
