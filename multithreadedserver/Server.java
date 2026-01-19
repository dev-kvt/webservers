
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;

public class Server{
	public Consumer<Socket> getConsumer(){
		return(clientSocket)->{
			try {
				PrintWriter toClientPrintWriter = new PrintWriter(clientSocket.getOutputStream());
				toClientPrintWriter.println("Hello from Server");
				toClientPrintWriter.close();
				clientSocket.close();

			}
			catch(IOException ex) {
			ex.printStackTrace();
			}
		};
	
	};
	
	
	
	
	public static void main (String[] args) throws IOException {
		try 
		{
		int port = 8010;
		ServerSocket serverSocket = new ServerSocket(port);
		System.out.println("Server is listening on port " + port );
		while(true) {
			Socket acceptedSocket = serverSocket.accept();
			Thread thread = new Thread();
		}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
}

