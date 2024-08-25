package ClientServer.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Класс описывающий работу графического интерфейса приложения.
 * Является абстракцией GUI
 */
public class ClientGUI extends JFrame implements ClientView{
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private JTextArea logArea;
    private JTextField tfIPAddress, tfPort, tfLogin, tfMessage;
    private JPasswordField password;
    private JButton btnLogin, btnSend;
    private JPanel headerPanel;

    private ClientController clientController;

    public ClientGUI() {
        setting();
        createPanel();

        setVisible(true);
    }


    /**
     * Настройка основных параметров GUI
     */
    private void setting() {
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Chat");
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    private void createPanel() {
        add(createHeaderPanel(), BorderLayout.NORTH);
        add(createLog());
        add(createFooter(), BorderLayout.SOUTH);
    }

    private Component createHeaderPanel() {
        headerPanel = new JPanel(new GridLayout(2, 3));
        tfIPAddress = new JTextField("127.0.0.1");
        tfPort = new JTextField("8189");
        tfLogin = new JTextField("Petr Petrov");
        password = new JPasswordField("123456");
        btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        headerPanel.add(tfIPAddress);
        headerPanel.add(tfPort);
        headerPanel.add(new JPanel());
        headerPanel.add(tfLogin);
        headerPanel.add(password);
        headerPanel.add(btnLogin);

        return headerPanel;
    }

    private Component createLog() {
        logArea = new JTextArea();
        logArea.setEditable(false);
        return new JScrollPane(logArea);
    }

    private Component createFooter() {
        JPanel panel = new JPanel(new BorderLayout());
        tfMessage = new JTextField();
        tfMessage.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == '\n') {
                    sendMessage();
                }
            }
        });
        btnSend = new JButton("send");
        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
        panel.add(tfMessage);
        panel.add(btnSend, BorderLayout.EAST);
        return panel;
    }


    public void disconnectFromServer(){
        clientController.disconnectFromServer();
    }
    public void isVisibleHeaderPanel(boolean visible){
        headerPanel.setVisible(visible);
    }

    public void login(){
        if (clientController.connectToServer(tfLogin.getText())){
            headerPanel.setVisible(false);
        }
    }

    private void sendMessage(){
        clientController.sendMessage(tfMessage.getText());
        tfMessage.setText("");
    }



    /**
     * Метод вывода текста на экран GUI. Вызывается из контроллера
     * @param msg текст, который требуется отобразить на экране
     */
    @Override
    public void showMessage(String msg) {
        logArea.append(msg + "\n");
    }

    /**
     * Метод, описывающий отключение клиента от сервера со стороны сервера
     */
    @Override
    public void disconnectedFromServer(){
        isVisibleHeaderPanel(true);
    }

    /**
     * Метод срабатывающий при важных событиях связанных с графическим окном (например окно в фокусе)
     * @param e  the window event
     */
    @Override
    protected void processWindowEvent(WindowEvent e) {
        super.processWindowEvent(e);
        if (e.getID() == WindowEvent.WINDOW_CLOSING){
            this.disconnectedFromServer();
        }
    }



    // region setters
    @Override
    public void setClientController(ClientController clientController) {
        this.clientController = clientController;
    }

    // endregion

}