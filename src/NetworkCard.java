package cards;

import machines.Machine;

/** A class to create a network's card.
@author Developpix
@version 0.2
*/
public abstract class NetworkCard {

    private int id;
    private Machine hisMachine;

    /** Constructor for the NetworkCard's class.
    @param hisID a unique ID for the card.
    */
    public NetworkCard(int hisID) {

        this.id = hisID;

    }

    /** Method to put the network card in a machine.
    @param theMachine a machine in which to put the network card.
    */
    public void putInTheMachine(Machine theMachine) {

        this.hisMachine = theMachine;

    }

    /** Method to convert the network's card in a string.
	@return the string that represent the network's card.
	*/
	public String toString() {

		return "Network's card:\n\tID -> " + this.id;

    }

}
