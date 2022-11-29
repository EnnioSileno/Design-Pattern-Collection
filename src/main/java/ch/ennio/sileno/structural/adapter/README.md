# Adapter Pattern

Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.

### Structure

The adapter implements normally the interface of one object and wraps the other one. This approach uses the composition principle. The other approach uses multiple inheritance, which is not shown here.

![image](https://user-images.githubusercontent.com/61289714/204546856-8305c4b9-be46-48f0-a70f-88ae2be59605.png)

1. The __Client__ is a class that contains the existing business logic of the program.
2. The __Client Interface__ describes a protocol that other classes must follow to be able to collaborate with the client code.
3. The __Service__ is some useful class (usually 3rd-party or legacy). The Client can't use this class directly because it has an incompatible interface.
4. The __Adapter__ is a class that's able to work with both the client and the service: it implements the client interface, while wrapping the object with its incompatible type. The adapter receives calls from the client via the adapter interface and translates them into calls to the wrapped service object in a format it can understand.
5. The client code doesn't get coupled to the concrete adapter class as long as it works with the adapter via the client interface. This enables future extension.
