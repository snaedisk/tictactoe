Design Report
=======

##Introduction:

This report represents the initial design of our implementation of the game TicTacToe.
We made the decision to split the program into layers. Using java for the game logic, spark java for the middle layer and JavaScript for the front end layer. 
We split our team into smaller groups to deal with the programming of each layer.

##Initial design:

The game logic:
Contains a class that handles all the game logic. It returns the relevant information in one string when called.
Middle layer:
handles the communication between the game logic and the front-end layer as well as saving the game and actions of each game in the database.
Front-end layer:
The interface of the game. Sends a request to the rest service after each action.