package machines;

import java.util.ArrayList;

import cards.NetworkCard;

/** A class to create an object like a machine.
@author Developpix
@version 0.1
*/
public class Machine {

	private int number;
	private ArrayList<NetworkCard> hisNetworkCards;

	/** First constructor for the Machine's class.
	@param hisNumber a unique number for the machine.
	*/
	public Machine(int hisNumber) {

		this.number = hisNumber;
		this.hisNetworkCards = new ArrayList();

	}

	/** Second constructor for the Machine's class.
	@param hisNumber a unique number for the machine.
	@param listOfNetworkCards a list of the network cards for the machine.
	*/
	public Machine(int hisNumber, ArrayList<NetworkCard> listOfNetworkCards) {

		this.number = hisNumber;
		for (int i = 0; i < listOfNetworkCards.size(); i++) {

			this.addNetworkCard(listOfNetworkCards.get(i));

		}

	}

	/** Method to get the number of the machine.
	@return the number of the machine.
	*/
	public int getNumber() {

		return this.number;

	}

	/** Method to get the number of the network cards of the machine.
	@return the number of the network cards of the machine.
	*/
	public int getNumberNetworkCards() {

		return this.hisNetworkCards.size();

	}

	/** Method to get a network cards of the machine.
	@param networkCardNumber the network's card's number.
	@return a network cards of the machine.
	*/
	public NetworkCard getTheNetworkCard(int networkCardNumber) {

		return this.hisNetworkCards.get(networkCardNumber);

	}

	/** Method to add a network card in the machine.
	@param theNetworkCard the network card which will be added.
	*/
	public void addNetworkCard(NetworkCard theNetworkCard) {

		this.hisNetworkCards.add(theNetworkCard);
		theNetworkCard.putInTheMachine(this);

	}

	/** Method to convert the machine in a string.
	@return the string that represent the machine.
	*/
	public String toString() {

		String chaine = "Machine:\n\tNumber -> " + this.number + "\n";

		for (int i = 0; i < this.hisNetworkCards.size(); i++) {

			chaine += "\tNetwork's card n°" + (i+1) + this.hisNetworkCards.get(i) + "\n";

		}

		return chaine;

	}

}
