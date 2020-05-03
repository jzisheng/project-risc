# Project RISC (Really Interesting Strategic Conquest Game)
This is a online multiplayer strategic conquest game made in ECE651 Software Engineering inspired by the board game "RISK". 

![Gameplay footage](https://github.com/jzisheng/project-risc/blob/master/images/gameplay.gif)

*Gameplay footage of a user making a move, attacking, and conquering.*

Each game server can support 2-5 players. Players have the ability to switch between active games.

This game features the following features
* Online Mutiplayer (Players can play against each other online)
* Scouts (Players can send scout units into unknown territory)
![Gameplay footage](https://github.com/jzisheng/project-risc/blob/master/images/spy.gif)
* Fog of War (Players can only see information of territories near them)
![Gameplay footage](https://github.com/jzisheng/project-risc/blob/master/images/fog-of-war.gif)





Our UML diagram can be viewed here [UML Diagram](https://docs.google.com/drawings/d/1ES76J9AJ3MGDxcjzBDHp8wPLWJiUc8oNKI2NgELMtjI/edit?usp=sharing)

# Requirements
* Java 11

# Running

First start a hostmaster, this module is reponsible for tracking all game servers

`./gradlew run-hostmaster`

Start a game server for clients to connect to. Follow the text prompts

`./gradlew run-server`


Each player starts a game client to connect to the server

`./gradlew run-client`

### Teammates
Zisheng Jason Chang

Yisong Zou

Jiateng Mao

Aiden Mao
