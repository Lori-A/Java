//Lori-Ann Nembhard
package stringnode;

/**
 *
 * @author lori2
 */
public class StringNode 
{
    private String data;
    private StringNode link;
    
   /**
    * The constructor receives three parameters and initializes them by using 
    * the private data members
    * @param intialData The data for the StringNode
    * @param initialLink The link for the StringNode
    */
    StringNode(String intialData,StringNode initialLink) 
    {
        data = intialData;
        link = initialLink;
    }
    
    /**
     * This method gets the data of the StringNode
     * @return The data 
     */
    public String getData()
    {
        return data;
    
    }
    
    /**
     * This method gets the link of the StringNode
     * @return The link
     */
    public StringNode getLink ()
    {
        return link;
    }
    
    /**
     * This method sets the data in the StringNode
     * @param newData The data
     */
    public void setData(String newData)
    {
        data = newData;
    }
    
    /**
     * This method sets the link in the StringNode
     * @param newLink The link for the StringNode
     */
    public void setLink (StringNode newLink)
    {
        link = newLink;
    }
    
    
}
