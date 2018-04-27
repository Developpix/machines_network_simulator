# A project to create a simulator of machine's network.

## A short description of the project.

There is machine's object which contains some network's card.
An network can be a bluetooth network, a wireless network or a cable network.

Every network's card can be connected to one network, but the type of the network which can be
connected to the network's card depend of the type of the network's card.

### There is three type of network's card :
* A bluetooth network's card which can be connected to a bluetooth network,
* A wireless network's card which can be connected to a wireless network,
* A ethernet network's card which can be connected to a cable network.

The maximum number of network's card per network depend of the network's type.

### There is three type of network :
* A wireless network which can contains an unlimited number of network's cards,
* A bluetooth network which can contains two bluetooth network's cards,
* A cable network which can contains two network's cards.

## Machine's presentation

The machine represent an connected object like phone, computer, ...

Actually, there is one class to represent a machine, it's the Machine's class. But in the future it will have some classes which will heritate from this class.

All machine have a unique number which identify the machine. To create a machine, there is two constructors, the first take only the number 
as parameter, the second take the number and a list of network's cards which was puted in the machine.
```
	Machine m1 = new Machine(1);	// Create a machine with the number 1

	ArrayList<NetworkCard> listOfNetworkCards = new ArrayList<NetworkCard>();	// Create a list of network's cards
	listOfNetworkCards.add(new NetworkCard(1));
	listOfNetworkCards.add(new NetworkCard(2));
	
	Machine m2 = new Machine(2, listOfNetworkCards);	// Create a machine with the number 2 and the network's card 1 and 2
```
