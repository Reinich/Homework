package ClientServer.server;

import ClientServer.client.ClientController;
import ClientServer.logger.Repository;

import java.util.ArrayList;
import java.util.List;

public class ServerController {
    private List<ClientController> clientControllerList;
    private ServerView serverView;
    private Repository repository;
    private boolean isServerWorking;

    public ServerController(ServerView serverView, Repository repository) {
        this.serverView = serverView;
        this.repository = repository;
        this.clientControllerList = new ArrayList<>();
        serverView.setServerController(this);
    }


    public void startServer() {
        if (isServerWorking()) {
            printText("Сервер уже был запущен");
        } else {
            isServerWorking = true;
            printText("Сервер запущен!");
        }
    }

    public void stopServer() {
        if (!isServerWorking()) {
            printText("Сервер уже был остановлен.");
        } else {
            isServerWorking = false;
            while (!clientControllerList.isEmpty()) {
                disconnectUser(clientControllerList.get(clientControllerList.size() - 1));
            }
            printText("Сервер остановлен.");
        }
    }

    public void showMessage(String text) {
        if (!isServerWorking) {
            return;
        }
        text += "";
        printText(text);
        sendToAll(text);
        saveInLog(text);
    }


    public void disconnectUser(ClientController clientController) {
        clientControllerList.remove(clientController);
        if (clientController != null){
            clientController.disconnectedFromServer();
            printText(clientController.getName() + " отключился.");
        }
    }

    public boolean isUserConnected(ClientController client) {
        if (!isServerWorking) {
            return false;
        }
        clientControllerList.add(client);
        printText(client.getName() + " присоединился.");
        return true;
    }

    private void sendToAll(String text) {
        for (ClientController client : clientControllerList) {
            client.answerFromServer(text);
        }
    }

    private void printText(String text) {
        serverView.showMessage(text + "\n");
    }

    public String getLog() {
        return repository.getLog();
    }

    private void saveInLog(String text) {
        repository.saveLog(text);
    }

    // region getters
    public boolean isServerWorking() {
        return isServerWorking;
    }

    public ServerController getServer() {
        return this;
    }

    // endregion

}
