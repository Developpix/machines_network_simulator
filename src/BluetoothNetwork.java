package networks;

/** A class to create a bluetooth network to connect 2 network's cards.
@author Developpix
@version 0.1
*/
public class BluetoothNetwork extends Network {

    /** Constructor for the BluetoothNetwork's class.
    @param hisNumber a number for the bluetooth network.
    */
    public BluetoothNetwork(int hisNumber) {

        super(hisNumber);

    }

    /** Method to get the maximum number of network's card connected.
    @return the maximum number of network's card which can be connected.
    */
    public int getMaxNumberOfNetworkCard() {

        return 2;

    }
}
