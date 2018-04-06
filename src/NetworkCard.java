package cards;

import machines.Machine;
import networks.Network;

/** A class to create a network's card.
@author Developpix
@version 0.2
*/
public class NetworkCard {

    private int id;
    private boolean connected;
    private Machine hisMachine;
    private Network hisNetwork;

    /** Constructor for the NetworkCard's class.
    @param hisID a unique ID for the card.
    */
    public NetworkCard(int hisID) {

        this.id = hisID;
        this.connected = false;

    }

    /** Method to put the network card in a machine.
    @param theMachine a machine in which to put the network card.
    */
    public void putInTheMachine(Machine theMachine) {

        this.hisMachine = theMachine;

    }

    /** Method to connect the network's card to a network.
    @param theNetwork the network to connect.
    @return true if the network's card was connected to the network and false if not.
    */
    public boolean connect(Network theNetwork) {

        if (theNetwork.addNetworkCard(this)) {

            this.hisNetwork = theNetwork;
            this.connected = true;

            return true;

        };

        return false;

    }

    /** Method to disconnect from the network.
    */
    public void disconnect() {

        this.hisNetwork.removeNetworkCard(this);
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

		return "Network's card:\n\tID -> " + this.id + "\n\tIs connected -> " + this.connected;

    }

}
