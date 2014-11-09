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
public interface InspectableTree extends InspectablePositionalContainer {

    // access methods
    /**
     * @return return the tree's root
     */
    public Position root();

    /**
     * @param v the position of the node we are asking for if has a father
     * @return return the node's father
     */
    public Position parent(Position v);

    /**
     * @param v the node's position in question
     * @return return the node's children
     */
    public PositionIterator children(Position v);

    // search methods
    /**
     * @param v the position of the node
     * @return is the node internal?
     */
    public boolean isInternal(Position v);

    /**
     * @param v the position of the node
     * @return is the node external?
     */    
    public boolean isExternal(Position v);

    /**
     * @param v is the position of the node whe are asking for if is a root of the tree or not
     * @return is the node the root of the tree?
     */    
    public boolean isRoot(Position v);
}
