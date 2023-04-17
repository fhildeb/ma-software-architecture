# Mediator Pattern

The Mediator pattern is a design pattern that simplifies communication between multiple objects by encapsulating the interactions within a separate mediator object. This pattern promotes loose coupling, making it easier to maintain and extend complex communication networks. Typical applications include designing communication links for network messaging, chat rooms, or broadcasting systems.

## ProgramMain (Main)

In this console application, the Mediator pattern is implemented to create a chat room for different participants, such as students and administrators. The application demonstrates how a mediator object, Chatroom, manages communication between participants by registering them in a HashMap.

This encapsulation of the communication process allows for easy addition, removal, and modification of participants without affecting the overall structure. The implementation also features a broadcast option, enabling messages to be sent to all other participants at once.

### Terminal Output

```
Mediator Beispiel - Konsolenanwendung
Empfangsprotokoll von Admin: From Tim to Tom: Ich liebe dich
Empfangsprotokoll von Student: From Lea to Ina: Ich liebe dich auch
Empfangsprotokoll von Admin: From Lea to Tim: Ich liebe dich auch voll
Empfangsprotokoll von Student: From Ina to Lea: Ich liebe dich auch voll doll
Rundruf: Empfangsprotokoll von Admin: From Ina to Tom: Nachricht an alle
Rundruf: Empfangsprotokoll von Admin: From Ina to Tim: Nachricht an alle
Rundruf: Empfangsprotokoll von Student: From Ina to Lea: Nachricht an alle
```
