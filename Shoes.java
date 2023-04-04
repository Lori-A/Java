//Lori-Ann Nembhard
package linkedlistproject;

/**
 *
 * @author lori2
 */
public class Shoes implements Comparable <Shoes>
{

    private double size;
    private String brand;
    
    /**
     * The constructor receives two parameters and uses the private data members
     * to initialize them.
     *
     * @param initialSize The size of the shoes
     * @param initialBrand The brand of the shoes
     */
    public Shoes(double initialSize, String initialBrand) 
    {
        size = initialSize;
        brand = initialBrand;
        
        
    }

   
    
  
    /**
     * The setNewSize method sets the size of the shoes
     *
     * @param newSize The value that will be stored in size
     */
    public void setNewSize(double newSize) 
    {
        size = newSize;
    }

    /**
     * The setNewBrand method sets the brand of the shoes
     *
     * @param newBrand The brand of the shoes
     */
    public void setNewBrand(String newBrand) 
    {
        brand = newBrand;
    }

    /**
     * The getSize method gets the size of the shoes
     *
     * @return It returns the size of the shoes
     */
    public double getSize() 
    {
        return size;
    }

    /**
     * The getBrand method gets the brand of the shoes
     *
     * @return It returns the brand of the shoes
     */
    public String getBrand() 
    {
        return brand;
    }
    /**
     * The equals method compares the Shoes object to another object
     * @param obj The object to compare to
     * @return boolean 
     */
   public boolean equals(Object obj)
    {
        if (!(obj instanceof Shoes))
            throw new ClassCastException("A Car object expected.");

        Shoes anotherShoes = (Shoes) obj;  // cast the Object to a Car

        if (brand.equalsIgnoreCase(anotherShoes.getBrand())
            && size == anotherShoes.getSize())
            return true;
        else
            return false;
    }
   /**
    * 
    * @param myShoes
    * @return
    * @throws ClassCastException 
    */
    public int compareTo(Shoes anotherShoes)throws ClassCastException
    {
        if (!(anotherShoes instanceof Shoes))
            throw new ClassCastException("A shoes object expected.");

        if (brand.compareToIgnoreCase(anotherShoes.getBrand()) > 0)
            return 1;
        
        else if (brand.compareToIgnoreCase(anotherShoes.getBrand()) < 0)
            return -1;
        else if (getSize() > anotherShoes.getSize())
            return 1;
        else                 
            return -1;
    }

}
