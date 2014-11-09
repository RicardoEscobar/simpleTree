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
public class TreeClass implements Tree {

    public static int depth(InspectableTree T, Position v) {
        if (T.isRoot(v)) {
            return 0;
        } else {
            return 1 + depth(T, T.parent(v));
        }

    }
    
    public static int height1(InspectableTree T) {
        int h = 0;
        PositionIterator positer = T.positions();
        while (positer.hasNext()) {
            Position v = positer.nextPosition();
            if (T.isExternal(v))
                h = Math.max(h, depth(T, v));
        }
        return h;
    }
    
    public static int height2(InspectableTree T, Position v) {
        if (T.isExternal(v))
            return 0;
        else {
            int h= 0;
            PositionIterator children = T.children(v);
            while (children.hasNext())
                h = Math.max(h, height2(T, children.nextPosition()));
        return 1 + h;
        }        
    }
    
    public static String preorderPrint(InspectableTree T, Position v) {
        String s = v.element().toString(); // those elements must implement toString
        PositionIterator children = T.children(v);
        while (children.hasNext())
            s += " " + preorderPrint(T, children.nextPosition());
        return s;
    }
    
    public static String parentheticRepresentation(InspectableTree T, Position v) {
        String s = v.element().toString(); // those elements must implement toString
        if (T.isInternal(v)) {
            PositionIterator children = T.children(v);
            // Opens the parenthesis and process the first tree recursively
            s += "(" + parentheticRepresentation(T, children.nextPosition());
            while (children.hasNext())
                // process recursively the rest of the sub trees
                s += " , "+ parentheticRepresentation(T, children.nextPosition());
            s += ")"; // closing the paranthesis            
        }
        return s;
    }
    
    public static String postorderPrint(InspectableTree T, Position v) {
        String s = "";
        PositionIterator children = T.children(v);
        while (children.hasNext())
            s += postorderPrint(T, children.nextPosition()) + " ";
        s += v.element(); // those elements must implement toString
        return s;
    }

    @Override
    public Position root() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Position parent(Position v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PositionIterator children(Position v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isInternal(Position v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isExternal(Position v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isRoot(Position v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PositionIterator positions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Accessor acsr) throws InvalidAccessorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ObjectIterator elements() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void swapElements(Position v, Position w) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object replaceElement(Position v, Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
