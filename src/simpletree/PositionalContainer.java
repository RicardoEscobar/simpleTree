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
    /** swaping elements in two nodes */
    public void swapElements(Position v, Position w);
    /** replace with and get the element in a node */
    public Object replaceElement(Position v, Object e);    
}