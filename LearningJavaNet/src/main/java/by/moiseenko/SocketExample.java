package by.moiseenko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class SocketExample {

  private static final Logger LOG = LogManager.getLogger(SocketExample.class.getName());
int port = 8080;

  public void serverSide(String message) throws IOException {
    ServerSocket serverSocket = new ServerSocket(port);
    Socket socket = serverSocket.accept();
    PrintStream ps = new PrintStream(socket.getOutputStream());
    ps.println(message);
    socket.close();

  }

  public void clientSide() throws IOException {
    Socket socket = new Socket(InetAddress.getLocalHost(), port);
    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    LOG.debug(br.readLine());
    socket.close();
  }

}
