/*
 * Free
 * @author Jorge Ricardo Escobar Carrasco. * 
 * AL12509938@unadmexico.mx * 
 */
package simpletree;

/**
 *
 * @author ricardo
 */
public interface InspectableTree extends InspectablePositionalContainer {
    // access methods
    /** return the tree's root */
    public Position root();
    /** return the node's father */
    public Position parent();
    /** return the node's children */
    public PositionIterator children();
    
    // search methods
    /** is the node internal? */
    public boolean isInternal();
    /** is the node external? */
    public boolean isExternal();
    /** is the node the root of the tree? */
    public boolean isRoot();
}
