package ClientServer.server;


import ClientServer.logger.FileStorage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerGUI extends JFrame implements ServerView{
    private static final int WINDOW_HEIGHT = 300;
    private static final int WINDOW_WIDTH = 400;

    private JButton btnStart;
    private JButton btnStop;
    private JTextArea logArea;

    private ServerController serverController;


    public ServerGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Server");
        setResizable(false);
        setBackground(Color.WHITE);

        serverController = new ServerController(this, new FileStorage());

        createPanel();

        setVisible(true);
    }

    private void createPanel() {
        logArea = new JTextArea();
        add(logArea);
        add(createButtons(), BorderLayout.SOUTH);
    }

    private Component createButtons() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        btnStart = new JButton("Start");
        btnStop = new JButton("Stop");

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                serverController.startServer();
            }
        });
        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                serverController.stopServer();
            }
        });

        panel.add(btnStart);
        panel.add(btnStop);
        return panel;
    }


    @Override
    public void showMessage(String text) {
        logArea.append(text + "\n");
    }

    @Override
    public void setServerController(ServerController serverController) {
        this.serverController = serverController;
    }


    // region getters
    public ServerController getServerGUI(){
        return serverController;
    }
    // endregion


}