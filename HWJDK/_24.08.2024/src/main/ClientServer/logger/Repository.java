package ClientServer.logger;

public interface Repository {
    void saveLog(String text);
    String getLog();
}
