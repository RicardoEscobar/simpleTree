package simpletree;

/*  Both of these imports do not work under Netbeans 8.0.1, I ignore why
 I'm supposed to import these libreries in order to extend InspectableContainer

import jdsl.core.api.*;
import jdsl.core.ref.*;
 */
import jdsl.core.api.*;


/**
 *
 * @author Jorge Ricardo Escobar Carrasco. AL12509938@unadmexico.mx
 */
public interface InspectablePositionalContainer extends InspectableContainer {

    // access methods

    /**
     * @return returns a position iterator with container positions *
     */
    public PositionIterator positions();
}