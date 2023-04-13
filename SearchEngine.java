import java.util.ArrayList;

import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler{
   ArrayList<String> strings;

   public String handleRequest(URI url){
        if (url.getPath().equals("/")){
            return "This is the root";
        }
        if (url.getPath().equals("/add")){
            String[] parameters = url.getQuery().split("=");
            if(parameters[0].equals("s")){
                strings.add(parameters[1]);
                return String.format("", parameters[1]);
            }
            if(parameters[0].equals("search")){
                String out;
                for (String string : strings){
                    if()
                }
            }
        }
        if (url.getPath().equals("/add")){
            String[] parameters = url.getQuery().split("=");
            if(parameters[0].equals("s")){
                strings.add(parameters[1]);
                return String.format("", parameters[1]);
            }
            if(parameters[0].equals("search")){
                String out;
                for (String string : strings){
                    if()
                }
            }
        }
        return "404: not found";
   }
}

public class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
