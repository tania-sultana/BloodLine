package chatting;
import chatting.datas.Datas;
import chatting.gui.Client;
import chatting.gui.Server;
public class Main {
    public static void main(String[] args) {
        Datas client = new Datas();
        Datas server = new Datas();
        client.setImage("chatting/gui/images/suvro.png");
        client.setName("Suvro");
        client.setHost("127.0.0.1");
        client.setPort(2525);


        server.setImage("chatting/gui/images/tania.png");
        server.setName("Tania");
        server.setHost("127.0.0.1");
        server.setPort(2525);

        //We have to use this on gui button action.
        // For client will start new thread, and for server the server computer will run the server app.
        //And it will not also be the main function. this main function is created for testing purpose.
        //for testing the chat app individually
        Thread ser = new Thread(new Server(server));
        ser.start();

        Thread cli = new Thread(new Client(client));
        cli.start();

    }
}
