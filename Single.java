package edu.najah.cap;
import java.util.ArrayList;

public class Single{
    	public static void main(String[] args) {
		
		Connection httpConnection1 = Connections.getInstance(Connections.http); 
		Connection httpConnection2 = Connections.getInstance(Connections.http); 
		Connection scpConnection1 = Connections.getInstance("scp"); 
		Connection telnetConnection1 = Connections.getInstance("telnet"); 
		Connection sshConnection1 = Connections.getInstance("ssh"); 
		Connection scpConnection1 = Connections.getInstance("scp"); 

        boolean isReleased = Connections.release(Connections.http); 
		if(Connection == null) {
			return true;
		}
		
		Connection ftpConnection1 = Connections.getInstance("ftp"); 

		if(httpConnection1 == httpConnection2) { 
            return true;
		}; 
		
		ArrayList<String> current= Connections.getCurrentConnection(); 
		system.out.println(current);
		
             scpConnection1.send("hi");
            ftpConnection1.send("hi");	
        }
}
