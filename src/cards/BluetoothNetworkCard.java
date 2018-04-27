package cards;

import machines.Machine;
import networks.BluetoothNetwork;

/** A class to create a bluetooth network's card.
@author Developpix
@version 0.2
*/
public class BluetoothNetworkCard extends NetworkCard {

    private boolean connected;
    protected BluetoothNetwork hisNetwork;

    /** Constructor for the BluetoothNetworkCard's class.
    @param hisID a unique ID for the card.
    */
    public BluetoothNetworkCard(int hisID) {

        super(hisID);
        this.connected = false;

    }

    /** Method to connect the network's card to a network.
    @param theNetwork the network to connect.
    @return true if the network's card was connected to the network and false if not.
    */
    public boolean connect(BluetoothNetwork theNetwork) {

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
    public BluetoothNetwork getNetwork() {

        return this.hisNetwork;

    }

    /** Method to see if the network's card is connected to a network.
    @return true if it was connected and false if not.
    */
    public boolean getConnected() {

        return this.connected;

    }

    /** Method to convert the bluetooth network's card in a string.
	@return the string that represent the bluetooth network's card.
	*/
    public String toString() {

        return super.toString() + "\n\tIs connected -> " + this.connected;

    }

}
