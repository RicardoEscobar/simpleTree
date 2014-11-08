/*
 * Free
 * @author Jorge Ricardo Escobar Carrasco. * 
 * AL12509938@unadmexico.mx * 
 */
package simpletree;
import jdsl.core.api.*;

/**
 *
 * @author ricardo
 */
public interface PositionalContainer extends InspectablePositionalContainer {
    // update methods
    /** swaping elements in two nodes.
     * @param v Position of the first element
     * @param w Position of the second element*/
    public void swapElements(Position v, Position w);
    /** replace with and get the element in a node.
     * @param v The new object that is going to replace whatever is in the position
     * @param e Position of the object to be replaced
     * @return  The object that replaced the last one.*/
    public Object replaceElement(Position v, Object e);    
}