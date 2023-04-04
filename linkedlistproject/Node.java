//Lori-Ann Nembhard
package linkedlistproject;




/**
 *
 * @author lori2
 */
public class Node<E> 
{
    private E data;
    private Node<E> next;
    
    /**
     * This constructor receives two parameter and initializes them by using the
     * private data members
     * @param intialData The data for the node
     * @param initialNext The link to the next node
     */
    
    public Node(E intialData, Node<E>initialNext )
    {
        data = intialData;
        next = initialNext;
                
    
    }
    
    /**
     * This method gets the data of the node
     * @return The data
     */
    public E getData()
    {
        return data;
    }
    
    /**
     * This method gets the reference of the next node
     * @return The reference of the next node
     */
    public Node<E> getNext()
    {
        return next;
    }
    
    /**
     * This method sets the data in the node
     * @param newData The data
     */
    public void setData(E newData)
    {
        data = newData;
    }
    
    /**
     * This method sets the reference to the next node
     * @param newNext The reference to the next node
     */
    public void setNext(Node<E> newNext)
    {
        next = newNext;
    }
}
