import java.net.*;
import java.io.*;
public class GreetingClient {
	public static void main(String []args){
//		String serverName = args[0];
//		int port = Integer.parseInt(args[1]);
		String serverName = "127.0.0.1";
		int port = 6066;

		while(true){
			try{

				System.out.println("Connecting to " + serverName + "on port" + port);
				Socket client = new Socket(serverName,port);
//				System.out.println("Just connected to"+client.getRemoteSocketAddress());
				OutputStream outToServer;
				InputStream inFromServer;
				while(true){
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					outToServer = client.getOutputStream();
					DataOutputStream out = new DataOutputStream(outToServer);
					
	//				out.writeUTF("Hello from"+client.getLocalSocketAddress());
					out.writeUTF(br.readLine());
	
					
					inFromServer = client.getInputStream();
					DataInputStream in = new DataInputStream(inFromServer);
					System.out.println("Server says"+in.readUTF());
				}
	//			client.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
