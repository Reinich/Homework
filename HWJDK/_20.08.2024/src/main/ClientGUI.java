import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ClientGUI extends JFrame {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;
    private ServerWindow server;
    private boolean connected;
    private String name;

    private JPasswordField passwordField;
    private JTextField loginField, portField, ipAddressField, messageField;
    private JButton connectBtn, sendMsgBtn;
    private JTextArea log;
    private JPanel headerPanel;

    public ClientGUI(ServerWindow server) {
        this.server = server;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setLocation(server.getX() - 500, server.getY());
        setTitle("Client Chat");
        setResizable(false);
        setBackground(Color.WHITE);
        createPanel();
        setVisible(true);
    }


    private void appendLog(String text) {
        log.append(text + "\n");
    }


    private void createPanel() {
        add(createHeaderPanel(), BorderLayout.NORTH);
        add(createLog());
        add(createFooter(), BorderLayout.SOUTH);

    }

    private Component createHeaderPanel() {
        headerPanel = new JPanel(new GridLayout(2, 3));
        ipAddressField = new JTextField("127.0.0.1");
        portField = new JTextField("8189");
        loginField = new JTextField("Ivan Ivanovich");
        passwordField = new JPasswordField("123456");
        connectBtn = new JButton("Login");
        connectBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                connectToServer();
            }
        });

        headerPanel.add(ipAddressField);
        headerPanel.add(portField);
        headerPanel.add(new JPanel());
        headerPanel.add(loginField);
        headerPanel.add(passwordField);
        headerPanel.add(connectBtn);

        return headerPanel;
    }

    private void connectToServer() {
        if (server.isUserConnected(this)){
            appendLog("Вы подключились к серверу.");
            headerPanel.setVisible(false);
            connected = true;

            name = loginField.getText();
            String log = server.getLog();

            if (log != null){
                appendLog(log);
            }
        }else {
            appendLog("Не удалось подключиться.");
        }
    }

    public void disconnectFromServer() {
        if (connected){
            headerPanel.setVisible(true);
            connected = false;
            server.disconnectUser(this);
            appendLog("Вы отключены о сервера.");
        }
    }

    private Component createLog() {
        log = new JTextArea();
        log.setEditable(false);
        return new JScrollPane(log);

    }

    private Component createFooter() {
        JPanel panel = new JPanel(new BorderLayout());

        messageField = new JTextField();
        messageField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == '\n') {
                    sendMessage();
                }
            }
        });

        sendMsgBtn = new JButton("Send");
        sendMsgBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        panel.add(messageField);
        panel.add(sendMsgBtn, BorderLayout.EAST);
        return panel;
    }

    public void sendMessage() {
        if (connected) {
            String text = messageField.getText();
            if (!text.equals("")) {
                server.message(name + ": " + text);
                messageField.setText("");
            }
        } else {
            appendLog("Нет подключения к серверу.");
        }

    }
    public void answer(String text){
        appendLog(text);
    }

    @Override
    public int getDefaultCloseOperation() {
        disconnectFromServer();
        return super.getDefaultCloseOperation();
    }
}
