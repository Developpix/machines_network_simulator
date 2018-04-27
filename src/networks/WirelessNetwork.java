package networks;

import cards.NetworkCard;

/** A class to create a wireless network to connect 2 network's cards.
@author Developpix
@version 0.1
*/
public class WirelessNetwork extends Network {

    private NetworkCard emettorCard;

    /** Constructor for the WirelessNetwork's class.
    @param hisNumber a number for the wireless network.
    @param theEmettor the emettor's card.
    */
    public WirelessNetwork(int hisNumber, NetworkCard theEmettor) {

        super(hisNumber);
        this.emettorCard = theEmettor;
        theEmettor.connect(this);

    }

    /** Method to add a network's card in the wireless network.
    @param theNetworkCard the network's card, you wanted to add.
    @return true if the network's card was added and false if not.
    */
    public boolean addNetworkCard(NetworkCard theNetworkCard) {

        this.hisNetworkCards.add(theNetworkCard);

        return true;

    }

    /** Method to get the maximum number of network's card connected.
    @return -1 to explain that there is no limit.
    */
    public int getMaxNumberOfNetworkCard() {

        return -1;

    }

}
