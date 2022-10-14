//Lori-Ann Nembhard
package stringnode;

/**
 *
 * @author lori2
 */
public class StringLinkedBag 
{

    private StringNode head;
    private StringNode tail;
    private int numElements;

    /**
     * The no-arg constructor receives no parameters but initializes the private
     * data members so that the String linked bag is empty
     */
    public StringLinkedBag() 
    {
        head = null;
        tail = null;
        numElements = 0;
    }

    /**
     * The getSize method gets the number of elements
     *
     * @return The number of elements
     */
    public int getSize() 
    {
        return numElements;
    }

    /**
     * This method adds a new element to the string linked bag
     *
     * @param newElement The new element to be added
     */
    public void add(String newElement) 
    {
        if (tail == null) 
        {
            head = new StringNode(newElement, null);
            tail = head;

        } 
        else 
        {
            tail.setLink(new StringNode(newElement, null));
            tail = tail.getLink();
        }
        numElements++;
    }

    /**
     * This method searches the linked bag to check whether or not a specific
     * element exists
     *
     * @param target The element that this method will search for.
     * @return found This can be either true, if the element exists, or false,
     * if it doesn't.
     */
    public boolean exists(String target) 
    {
        boolean found = false;
        StringNode cursor = head;
        StringNode previous = null;

        while (!found && cursor != null) 
        {
            if (cursor.getData().equalsIgnoreCase(target)) 
            {
                found = true;

            } 
            else 
            {
                previous = cursor;
                cursor = cursor.getLink();

            }

        }

        return found;
    }

    /**
     * This method removes an specific element from the linked bag
     *
     * @param target An element that the method will search for
     * @return The method will return true if the target was found and removed
     * and false if it wasn't found
     */
    public boolean remove(String target) 
    {
        StringNode cursor = head;
        StringNode previous = null;
        boolean found = false;

        while (!found && cursor != null) 
        {
            if (cursor.getData().equalsIgnoreCase(target)) 
            {
                found = true;
            } 
            else 
            {
                previous = cursor;
                cursor = cursor.getLink();

            }

        }
        if (found && cursor != null) 
        {
            if (previous == null) 
            {
                head = head.getLink();
            } 
            else 
            {
                previous.setLink(cursor.getLink());
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
     * This method was counts how many times the specific element was found
     *
     * @param target The element that the method will look for
     * @return The number of times the element was found or 0 if the element
     * wasn't found
     */
    public int countOccurrences(String target) 
    {

        StringNode cursor = head;
        int numOccurrences = 0;

        for (int i = 0; i < numElements; i++) 
        {
            if (cursor.getData().equalsIgnoreCase(target)) 
            {

                numOccurrences++;
            }

            cursor = cursor.getLink();
        }

        return numOccurrences;
    }

    public ListerPrototype2 iteratorPrototype() 
    {
        // declare variables
        StringNode headOfListToReturn; // beginning of new "copied" list
        StringNode cursorOfListToCopy; // active node of list to copy
        StringNode lastNodeOfListToReturn; // end of new "copied" list

        // establish the copied list
        headOfListToReturn = null;

        if (head != null) 
        {
            // create the head of the new list
            headOfListToReturn = new StringNode(head.getData(), null);
            // use lastNodeOfListToReturn as a pointer to the last node in the copied list
            lastNodeOfListToReturn = headOfListToReturn;
            // use currentCursor as the pointer to the existing list
            cursorOfListToCopy = head.getLink();
            // if we have a node...
            while (cursorOfListToCopy != null) 
            {
                // create a new node from the end of the new list
                lastNodeOfListToReturn.setLink(new StringNode(cursorOfListToCopy.getData(), null));
                // move lastNodeOfListToReturn to the new last node
                lastNodeOfListToReturn = lastNodeOfListToReturn.getLink();
                // move the cursorOfListToCopy to the next node
                cursorOfListToCopy = cursorOfListToCopy.getLink();
            }
        }

        return new ListerPrototype2(headOfListToReturn);
    }

}
