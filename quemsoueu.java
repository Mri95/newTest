import java.net.*;
 
public class QuemSouEu {
    public static void main(String[] args)
          throws Exception {
        if (args.length != 1) {
            System.err.println("Utilização:" +
       "QuemSouEu NomeDaMáquina");
            System.exit(1);
}
        InetAddress a =
       InetAddress.getByName(args[0]);
        System.out.println(a);
    }
}
