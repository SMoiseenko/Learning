package by.moiseenko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Runner {

  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());

  public static void main(String[] args) throws Exception {
    final SocketExample se = new SocketExample();
    //    new Thread(
    //            () -> {
    //              try {
    //                se.serverSide("WTF???");
    //              } catch (IOException e) {
    //                e.printStackTrace();
    //              }
    //            })
    //        .start();

    new Thread(
            () -> {
              try {
                System.out.println("You can send 5 messages.");
                se.clientSide();
              } catch (IOException e) {
                e.printStackTrace();
              }
            })
        .start();
  }

  private static void smallShitExample() throws Exception {
    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
    while (networkInterfaces.hasMoreElements()) {
      StringBuilder sb = new StringBuilder();
      NetworkInterface ne = networkInterfaces.nextElement();
      sb.append("\n").append("Interface name : ").append(ne.getName()).append("\n");
      Enumeration<InetAddress> inetAddresses = ne.getInetAddresses();
      while (inetAddresses.hasMoreElements()) {
        sb.append("IP4 : ").append(inetAddresses.nextElement()).append("\n");
        sb.append("IP6 : ").append(inetAddresses.nextElement());
      }
      LOG.debug(sb.toString());
    }
    LOG.debug(InetAddress.getLocalHost().getHostAddress());
    LOG.debug(InetAddress.getByName("tut.by"));
    byte[] ipKotoserver = new byte[] {(byte) 192, (byte) 168, (byte) 0, (byte) 247};
    InetAddress kotoserver = InetAddress.getByAddress(ipKotoserver);
    // wrong example, only my pc available
    LOG.debug("Is " + kotoserver.getHostAddress() + " available: " + kotoserver.isReachable(1000));

    String urlAddress = "http://s13.ru";
    URL urls13 = new URL(urlAddress);
    BufferedReader br = new BufferedReader(new InputStreamReader(urls13.openStream()));
    String line = "";
    while ((line = br.readLine()) != null) {
      LOG.debug(line);
    }

    URLConnection connection = urls13.openConnection();
    connection.setConnectTimeout(1_000);
    LOG.debug(urls13 + " -=- " + connection.getContentType());
  }
}
