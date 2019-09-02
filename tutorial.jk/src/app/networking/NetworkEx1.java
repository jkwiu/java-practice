package app.networking;

import java.net.*;

class NetworkEx1{
    public static void main(String args[]) {
        URL url = null;
        String address = "http://www.codechobo.com/sample/hello.html";
        try{
            url = new URL(address);
            URLConnection conn = url.openConnection();

            System.out.println(conn);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}