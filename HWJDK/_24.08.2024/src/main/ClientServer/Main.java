package ClientServer;

import ClientServer.client.ClientController;
import ClientServer.client.ClientGUI;
import ClientServer.logger.FileStorage;
import ClientServer.server.ServerController;
import ClientServer.server.ServerGUI;

public class Main {
    public static void main(String[] args) {
        ServerController serverController = new ServerController(new ServerGUI(), new FileStorage());

        new ClientController(new ClientGUI(), serverController);
        new ClientController(new ClientGUI(), serverController);
    }
}
