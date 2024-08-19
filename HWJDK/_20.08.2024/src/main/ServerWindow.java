import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ServerWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 300;
    private static final int WINDOW_WIDTH = 400;

    private JButton btnStart;
    private JButton btnStop;
    private JTextArea log;

    private static final String LOG_PATH = "H:\\Workplace\\Homework\\HWJDK\\_06.12.2023\\src\\main\\log.txt";
    private List<ClientGUI> clientGUIList;
    private boolean isServerWorking;

    ServerWindow() {
        isServerWorking = false;
        clientGUIList = new ArrayList<>();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Server");
        setResizable(false);
        setBackground(Color.WHITE);

        createPanel();

        setVisible(true);
    }

    private void createPanel() {
        log = new JTextArea();
        add(log);
        add(createButtons(), BorderLayout.SOUTH);
    }

    private Component createButtons() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        btnStart = new JButton("Start");
        btnStop = new JButton("Stop");

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isServerWorking) {
                    appendLog("Сервер уже был запущен");
                } else {
                    isServerWorking = true;
                    appendLog("Сервер запущен!");
                }
            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isServerWorking) {
                    appendLog("Сервер уже был остановлен");
                } else {
                    isServerWorking = false;
                    while (!clientGUIList.isEmpty()) {
                        disconnectUser(clientGUIList.get(clientGUIList.size() - 1));
                    }
                    appendLog("Сервер остановлен!");
                }
            }
        });

        panel.add(btnStart);
        panel.add(btnStop);
        return panel;
    }

    public void message(String text) {
        if (!isServerWorking) {
            return;
        }
        appendLog(text);
        sendToAll(text);
        saveLog(text);
    }

    private void sendToAll(String text) {
        for (ClientGUI clientGUI : clientGUIList) {
            clientGUI.answer(text);
        }
    }

    public void disconnectUser(ClientGUI clientGUI) {
        clientGUIList.remove(clientGUI);
        if (clientGUI != null) {
            clientGUI.disconnectFromServer();
        }
    }


    private void appendLog(String text) {
        log.append(text + "\n");
    }

    public boolean isUserConnected(ClientGUI clientGUI) {
        if (!isServerWorking) {
            return false;
        }
        clientGUIList.add(clientGUI);
        return true;
    }

    private void saveLog(String text) {
        try (FileWriter writer = new FileWriter(LOG_PATH, true)) {
            writer.write(text + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String readLog() {
        StringBuilder stringBuilder = new StringBuilder();

        try (FileReader reader = new FileReader(LOG_PATH)) {
            int c;

            while ((c = reader.read()) != -1) {
                stringBuilder.append((char) c);
            }

            stringBuilder.delete(stringBuilder.length(), stringBuilder.length());
            return stringBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getLog() {
        return readLog();
    }
}
