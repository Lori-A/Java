//Lori-Ann Nembhard
package linkedlistproject;

/**
 *
 * @author lori2
 */
public class SinglyLinkedList<E extends Comparable<E>> 
{

    private Node<E> head;
    private Node<E> tail;
    private int numElements;

    /**
     * The no-arg constructor does not receive any parameter but initializes the
     * private data members so that the linked list is empty
     */
    public SinglyLinkedList() 
    {
        head = null;
        tail = null;
        numElements = 0;
    }

    /**
     * This method gets the number of elements
     *
     * @return The number of elements
     */
    public int getSize() 
    {
        return numElements;
    }

    /**
     * This method adds a new element to the list
     *
     * @param newElement The element that will be added to the list
     */
    public void add(E newElement) 
    {

        if (tail == null) 
        {
            head = new Node<E>(newElement, null);
            tail = head;

        } 
        else 
        {
            tail.setNext(new Node<E>(newElement, null));
            tail = tail.getNext();
        }
        numElements++;
    }

    /**
     * This method searches the linked list for a specific element
     *
     * @param target The element that this method will search for
     * @return found: This can be either true, if the element exists, or false,
     * if it doesn't
     */
    public boolean exists(E target) 
    {
        boolean found = false;
        Node<E> cursor = head;

        while (!found && cursor != null) 
        {
            if (cursor.getData().equals(target)) 
            {
                found = true;

            } 
            else 
            {
                cursor = cursor.getNext();
            }

        }

        return found;

    }

    /**
     * This method counts how many times the specific element was found
     *
     * @param target The element that the method will look for
     * @return The number of times the element was found or 0 if the element
     * wasn't found.
     */
    public int countOccurences(E target) 
    {
        Node<E> cursor = head;
        int numOccurrences = 0;

        for (int i = 0; i < numElements; i++) 
        {
            if (cursor.getData().equals(target)) 
            {

                numOccurrences++;
            }

            cursor = cursor.getNext();

        }
        return numOccurrences;
    }

    /**
     * This method removes an element from the linked list
     *
     * @param target The element that the method will search for
     * @return The method will return true if the target was found and removed
     * and false if it wasn't found
     */
    public boolean remove(E target) 
    {
        boolean found = false;
        Node<E> cursor = head;
        Node<E> previous = null;

        while (!found && cursor != null) 
        {
            if (cursor.getData().equals(target)) 
            {
                found = true;
            }
            else 
            {
                previous = cursor;
                cursor = cursor.getNext();
            }
        }
        if (found && cursor != null) 
        {
            if (previous == null) 
            {
                head = head.getNext();
            } 
            else 
            {
                previous.setNext(cursor.getNext());
            }

            if (tail == cursor) 
            {
                tail = previous;
            }
            numElements--;
        }
        return found;
    }

    /**
     * the iteratorPrototype method "copies" the linked list and passes the
     * copied linked list to a new Lister<E>
     *
     * @return a Lister<E> using a copy of the linked list
     */
    public Lister<E> iterator() 
    {
        // declare variables
        Node headOfListToReturn; // beginning of new "copied" list
        Node cursorOfListToCopy; // active node of list to copy
        Node lastNodeOfListToReturn; // end of new "copied" list
        // establish the copied list
        headOfListToReturn = null;
        if (head != null) 
        {
            // create the head of the new list
            headOfListToReturn = new Node(head.getData(), null);
            // use lastNodeOfListToReturn as a pointer to the last node in the 
            /*copied list*/
            lastNodeOfListToReturn = headOfListToReturn;
            // use currentCursor as the pointer to the existing list
            cursorOfListToCopy = head.getNext();
            // if we have a node...
            while (cursorOfListToCopy != null) 
            {
                // create a new node from the end of the new list
                lastNodeOfListToReturn.setNext(new Node(cursorOfListToCopy.getData(), null));
                // move lastNodeOfListToReturn to the new last node
                lastNodeOfListToReturn = lastNodeOfListToReturn.getNext();
                // move the cursorOfListToCopy to the next node
                cursorOfListToCopy = cursorOfListToCopy.getNext();
            }
        }
        return new Lister(headOfListToReturn);
    }

}
