package appcr.adminpc.chatbot;

public interface ResponseCallback {
    void onResponse(String response);
    void onError(Throwable throwable);
}
