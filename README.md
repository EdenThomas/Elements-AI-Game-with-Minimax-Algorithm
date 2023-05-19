# Elements-Game-with-Minimax-Algorithm

This is a simple zero sum 2 person game of perfect information. The game consists of 3 elements and each player chooses an available element to counter the displayed element. Depending on the relationship between elements a change of game state is applied. The game terminates as soon as 5 moves are made by each player to reduce the game tree size but the number of moves can be changed by updating an if statement in the action listener for the select element button in the Elements class. The number of elements that each player starts with also can be changed by changing the initial values of variables representing these elements in the Logic class.

In the game, there are 3 elements - fire, water and wood. Each player has 9 fire, wood and water each. The player can choose fire, water or wood but the chosen element will decrease by one. The players also cant choose the displayed element. The game starts with fire. If the player chooses water, the player gets one fire and the new element will be water. If the player chooses wood, the opponent looses one fire and the new element will be fire. If the main element is wood, choosing water will get the player gets one wood and the new element will be water. If the player chooses fire, the opponent looses one wood and the new element will be fire. If the main element is water, choosing wood will get the player gets one water and the new element will be wood. If the player chooses fire, the opponent looses one water and the new element will be fire. The game continues each person had 5 turns (or the set number of turns) each. The player with the most elements combined at the end wins.

The game was developed in Java with the netbeans IDE and requires Java to run.

# Menu Screen
![Menu Screen](https://github.com/EdenThomas/Elements-Game-with-Minimax-Algorithm/assets/126813639/9423f0ce-dda5-4899-a7cc-198008d38283)
# Game Screen
![Game Screen](https://github.com/EdenThomas/Elements-Game-with-Minimax-Algorithm/assets/126813639/79f934b2-2c01-46e9-9d6b-c571d471cc29)

# End of game screen
![End of game](https://github.com/EdenThomas/Elements-Game-with-Minimax-Algorithm/assets/126813639/04ebf346-845f-4d6d-8cac-348a476c50ed)

# About screen
![About screen](https://github.com/EdenThomas/Elements-Game-with-Minimax-Algorithm/assets/126813639/ea0a49a4-9a51-447b-9b04-20e0cfb8c3b1)
