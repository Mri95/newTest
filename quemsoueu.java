import java.net.*;
 
public class QuemSouEu {
    public static void main(String[] args)
          throws Exception {
        if (args.length != 1) {
            System.err.println("Utilização:" +
       "Who i´m? ");
            System.exit(1);
}
        InetAddress a =
       InetAddress.getByName(args[0]);
        System.out.println(a);
    }
}
