public class SingletonClient {
    public static void main(String[] args) {

        /* lazy instatiaton */
        Input singleton = Input.getInstance();
        singleton.showMessage();
    }
}
