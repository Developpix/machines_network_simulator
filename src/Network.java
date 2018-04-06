package networks;

import java.util.ArrayList;

import cards.NetworkCard;

/** A class to create a network to connect 2 network's cards.
@author Developpix
@version 0.3
*/
public abstract class Network {

    private int number;
    private ArrayList<NetworkCard> hisNetworkCards;

    /** Constructor for the Network's class.
    @param hisNumber a number for the network.
    */
    public Network(int hisNumber) {

        this.number = hisNumber;
        this.hisNetworkCards = new ArrayList();

    }

    /** Method to add a network's card in the network.
    @param theNetworkCard the network's card, you wanted to add.
    @return true if the network's card was added and false if not.
    */
    public boolean addNetworkCard(NetworkCard theNetworkCard) {

        if (this.hisNetworkCards.size() <= 2) {

            this.hisNetworkCards.add(theNetworkCard);

            return true;

        }

        return false;

    }

    /** Method to remove a network's card from the network.
    @param theNetworkCard the network card that will be removed.
    */
    public void removeNetworkCard(NetworkCard theNetworkCard) {

        this.hisNetworkCards.remove(theNetworkCard);

    }

    /** Method to get the number of network's card connected.
    @return the number of the network's card connected.
    */
    public int getNumberNetworkCards() {

        return this.hisNetworkCards.size();

    }

    /** Method to get a network's card connected.
    @param networkCardNumber the number of the network connected.
    @return the network's card connected.
    */
    public NetworkCard getNumberNetworkCards(int networkCardNumber) {

        return this.hisNetworkCards.get(networkCardNumber);

    }

    /** Method to get the maximum number of network's card connected.
    @return the maximum number of network's card which can be connected.
    */
    public abstract int getMaxNumberOfNetworkCard();

    /** Method to convert the network in a string.
	@return the string that represent the network.
	*/
	public String toString() {

		String chaine = "Network:\n\tNumber -> " + this.number + "\n";

		for (int i = 0; i < this.hisNetworkCards.size(); i++) {

			chaine += "\tNetwork's card n°" + (i+1) + "\n\t" + this.hisNetworkCards.get(i) + "\n";

		}

		return chaine;

	}

}
