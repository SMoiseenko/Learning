package by.moiseenko;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
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
    while (true) {
      PrintStream ps = new PrintStream(socket.getOutputStream());
      ps.println(message);
    }
  }

  public void clientSide() throws IOException {
    Socket socket = new Socket(InetAddress.getLocalHost(), port);
    OutputStream outputStream = socket.getOutputStream();
    PrintStream ps = new PrintStream(outputStream);
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      ps.println(scanner.nextLine());
      try{
        TimeUnit.MILLISECONDS.sleep(100);
      } catch (InterruptedException ie){
        LOG.error("thread was interrupter");
      }
    }
//    ps.close();
//    outputStream.close();
    socket.close();
  }
}
