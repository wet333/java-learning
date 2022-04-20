package wetagustin.javacompletereference12ed;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class GettingAddresses {
    // Argument : enter the url of the site you want to know the ip
    public static void main(String[] args) {

        String siteURL = args[0];
        try {
            System.out.println("Searching ip of " + siteURL + " from " + InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try {
            InetAddress address1 = InetAddress.getByName(siteURL);
            System.out.println(address1.getHostName());
            System.out.println(address1.getHostAddress());
            System.out.println(Arrays.toString(address1.getAddress()));
        } catch (UnknownHostException e) {
            System.out.println("Cannot find that address");
        }


    }
}
