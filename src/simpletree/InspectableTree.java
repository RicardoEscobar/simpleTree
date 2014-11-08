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
     * @return return the node's father
     */
    public Position parent();

    /**
     * @return return the node's children
     */
    public PositionIterator children();

    // search methods
    /**
     * @return is the node internal?
     */
    public boolean isInternal();

    /**
     * @return is the node external?
     */
    public boolean isExternal();

    /**
     * @return is the node the root of the tree?
     */
    public boolean isRoot();
}
