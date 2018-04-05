package cards;

import machines.Machine;
import networks.Network;

/** A class to create a network's card.
@author Developpix
@version 0.1
*/
public class NetworkCard {

    private int id;
    private boolean connected;
    private Machine hisMachine;
    private Network hisNetwork;

    /** First constructor for the NetworkCard's class.
    @param hisID a unique ID for the card.
    */
    public NetworkCard(int hisID) {

        this.id = hisID;
        this.connected = false;

    }

    /** Second constructor for the NetworkCard's class.
    @param hisID a unique ID for the card.
    @param theMachine the machine which contains the network's card.
    */
    public NetworkCard(int hisID, Machine theMachine) {

        this(hisID);
        this.hisMachine = theMachine;

    }

    /** Method to put the network card in a machine.
    @param theMachine a machine in which to put the network card.
    */
    public void putInTheMachine(Machine theMachine) {

        this.hisMachine = theMachine;

    }

    /** Method to connect the network's card to a network.
    @param theNetwork the network to connect.
    */
    public void connect(Network theNetwork) {

        this.hisNetwork = theNetwork;
        this.connected = true;

    }

    /** Method to disconnect from the network.
    */
    public void disconnect() {

        this.connected = false;

    }

    /** Method to get the network.
    @return the network connected.
    */
    public Network getNetwork() {

        return this.hisNetwork;

    }

    /** Method to see if the network's card is connected to a network.
    @return true if it was connected and false if not.
    */
    public boolean getConnected() {

        return this.connected;

    }

    /** Method to convert the network's card in a string.
	@return the string that represent the network's card.
	*/
	public String toString() {

		return "Network's card:\n\tID -> " + this.id + "\n" + "\n\tIs connected -> " + this.connected;

    }

}
