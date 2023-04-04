/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphs;
/**
 * a minimal number of stubs have been provided to get the starting point file
 * to run
 *
 * @author
 *
 */

public class WeightedGraph 
{

    private int[][] edges;
    private Object[] labels;
    private int[][] weight;
    
/**
 * This constructor receives on parameters and initializes the private data 
 * members
 * @param n The value
 */

    public WeightedGraph(int n) 
    {
        edges = new int[n][n];
        labels = new Object[n];
        weight = new int[n][n];
    }
/**
    * addEdge This method receives 2 locations. The second location is added
    * as a neighbor to the first Location passed.
    * @param source Location to receive a neighbour
    * @param target Location to be added as a neighbour
    */
    public void addEdge(int source, int target, int weight) 
    {
        edges[source][target] = weight;

    }
 /**
  * This method returns the label of the referenced vertex
  * @param vertex the vertex that we want the label for
  * @return  The label of the vertex
  */
    public Object getLabel(int vertex) 
    {
        return labels[vertex];

    }
/**
 * This method receives two locations. The second Location is checked
 * to see if it is a neighbor of the first Location
 * @param source Location to check for neighbour
 * @param target Other location that is being checked for neighbour
 * @return boolean if second location is a neighbour of the first location
 */
    public boolean isEdge(int source, int target) 
    {
        return (edges[source][target] > 0);
    }
    
   /**
    * the neighbors method builds an array of Location which are the neighbors of
    * the Location passed
    * @param vertex the Location to get the neighbors from
    * @return an array of int that contains the neighbors of vertex
    */
    public int[] neighbors(int vertex) 
    {

        int[] answer = {};
        int i;
        int count;

        count = 0;
        for (i = 0; i < labels.length; i++) 
        {
            if (edges[vertex][i] != 0) 
            {
                count++;
            }
        }

        // Allocate the array for the answer
        answer = new int[count];

        // Fill the array for the answer
        count = 0;
        for (i = 0; i < labels.length; i++)
        {
            if (edges[vertex][i] !=0)
            {
                answer[count++] = i;
            }
        }

        return answer;

    }
   /**
    * removeEdge method receives 2 locations.  The second location is removed
    * as a neighbor to the first Location passed.
    * @param source Location to lose a neighbor
    * @param target Location to be removed as a neighbor
    */
    public void removeEdge(int source, int target)
    {
        edges[source][target] = 0;
    }
/**
    * setLabel assigns a label associated with the vertex passed
    * @param vertex the vertex that we want to set the label for
    * @param newLabel the label for the vertex
    */
    public void setLabel(int vertex, Object newLabel) 
    {
        labels[vertex] = newLabel;
    }
/**
    * size method returns the number of vertices in the graph
    * @return number of vertices
    */
    public int size() 
    {
        return labels.length;
    }

    /**
     * This method receives two locations
     * @param source The first location of the edge
     * @param target The second location of the edge
     * @return an array of int that contains the neighbours of the vertex
     */
    public int getWeight(int source, int target) 
    {
        // stub

        return edges[source][target];
    }
/**
 * This method receives 2 locations along with their weighted value
 * @param source First location to set a value
 * @param target Second location to set a value
 * @param weight The value of each location
 */
    public void setWeight(int source, int target, int weight) 
    {
        edges[source][target] = weight;
    }

}
