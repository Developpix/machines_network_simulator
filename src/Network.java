package networks;

import java.util.ArrayList;

import cards.NetworkCard;

/** A class to create a network to connect 2 network's cards.
@author Developpix
@version 0.1
*/
public class Network {

    private int number;
    private ArrayList<NetworkCard> hisNetworkCards;

    /** First constructor for the Network's class.
    @param hisNumber a number for the network.
    */
    public Network(int hisNumber) {

        this.number = hisNumber;
        this.hisNetworkCards = new ArrayList();

    }

    /** Second constructor for the Network's class.
    @param hisNumber a number for the network..
    @param theFirstNetworkCard the first network's card contained in the network.
    */
    public Network(int hisNumber, NetworkCard theFirstNetworkCard) {

        this(hisNumber);
        this.hisNetworkCards.add(theFirstNetworkCard);

    }

    /** Third constructor for the Network's class.
    @param hisNumber a number for the network..
    @param theFirstNetworkCard the first network's card contained in the network.
    @param theSecondNetworkCard the second network's card contained in the network.
    */
    public Network(int hisNumber, NetworkCard theFirstNetworkCard, NetworkCard theSecondNetworkCard) {

        this(hisNumber, theFirstNetworkCard);
        this.hisNetworkCards.add(theSecondNetworkCard);

    }

    /** Method to add a network's card in the network.
    @param theNetworkCard the network's card, you wanted to add.
    @return true if the network's card was added and false if not.
    */
    public boolean addNetworkCard(NetworkCard theNetworkCard) {

        if (this.hisNetworkCards <= 2) {

            this.hisNetworkCards.add(theNetworkCard);

            return true;

        }

        return false;

    }

    /** Method to remove a network's card from the network.
    @param networkCardNumber the number of the network card which be removed.
    */
    public void removeNetworkCard(int networkCardNumber) {

        this.hisNetworkCards.get(networkCardNumber).disconnect();
        this.hisNetworkCards.remove(networkCardNumber);

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
    public int getNumberNetworkCards(int networkCardNumber) {

        return this.hisNetworkCards.get(networkCardNumber);

    }

}
