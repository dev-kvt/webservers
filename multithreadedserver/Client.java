
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.BufferUnderflowException;



public class Client {
	
	public  Runnable getRunnable() {
		return  new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int port = 8010;
				try {
					InetAddress address =  InetAddress.getByName("localhost");
					Socket socket = new Socket(address,port);
					try(						
						PrintWriter toSocketPrintWriter = new PrintWriter(socket.getOutputStream(), true);
						BufferedReader fromBufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					) 
					{
						toSocketPrintWriter.println("Hello from client"+socket.getLocalSocketAddress());
						String lineString = fromBufferedReader.readLine();
						System.out.println("Response from Server"+ lineString);
						
					}catch(IOException e){
						e.printStackTrace();
					}
					
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			
		};
	}
	
	
	
	
   public static void main(String[] args) {
	   Client client = new Client();
	   for(int i=0 ; i< 100 ; i++ ) {
		   try {
			   Thread thread = new Thread(client.getRunnable());
			   thread.start();
		   }catch(Exception ex) {
			   ex.printStackTrace();
		   }
	   }
   }
}

