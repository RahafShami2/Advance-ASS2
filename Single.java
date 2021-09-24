package edu.najah.cap;
import java.util.ArrayList;

public class Single{
    	public static void main(String[] args) {
        boolean isReleased = Connections.release(Connections.http || Connections.scp || connections.telnet || connections.ssh||connections.ftp); 
		if(Connection == null) {
			return true;
		}
        Connection httpConnection1 = Connections.getInstance(Connections.http); 
		Connection httpConnection2 = Connections.getInstance(Connections.http); 
		if(httpConnection1 == httpConnection2) { 
            return true;
		}; 
		ArrayList<String> current= Connections.getCurrentConnection(); 
        httpConnection1.send("My message");
        }
