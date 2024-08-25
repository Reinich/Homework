package ClientServer.client;

import ClientServer.server.ServerController;

public class ClientController {
    private boolean connected;
    private String name;
    private ClientView clientView;
    private ServerController serverController;

    public ClientController(ClientView clientView, ServerController server){
        this.serverController = server;
        this.clientView = clientView;
        clientView.setClientController(this);
    }

    public boolean connectToServer(String name) {
        this.name = name;

        if (serverController.isUserConnected(this)) {
            showOnWindow("Вы успешно подключились!\n");
            connected = true;
            String log = serverController.getLog();
            if (log != null) {
                showOnWindow(log);
            }
            return true;
        } else {
            showOnWindow("Подключение не удалось");
            return false;
        }
    }

    public void disconnectedFromServer() {
        if (connected) {
            connected = false;
            clientView.disconnectedFromServer();
            showOnWindow("Вы были отключены от сервера!");
        }
    }

    public void disconnectFromServer() {
        serverController.disconnectUser(this);
    }

    public void answerFromServer(String text) {
        showOnWindow(text);
    }

    public void sendMessage(String text) {
        if (connected) {
            if (!text.isEmpty()) {
                serverController.showMessage(name + ": " + text);
            }
        } else {
            showOnWindow("Нет подключения к серверу");
        }
    }

    private void showOnWindow(String text) {
        clientView.showMessage(text);
    }


    // region getters

    public String getName() {
        return name;
    }
    // endregion
}