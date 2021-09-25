package edu.najah.cap.ass2;
import java.util.ArrayList;

public class Connections{
    
    private static Connections HTTP;
    private static Connections SSH;
    private static Connections TELNET;
    private static Connections SCP;
    private static Connections FTP;

    public static final String http=null;
     public static final String ssh=null;
     public static final String telten=null;
     public static final String scp=null;
     public static final String ftp=null;
    
    public static int count=0;
    public static ArrayList<String>List= new ArrayList<String>();
    
     public static Connections getInstance(String ConnPro){
         if (count==3){
             system.out.println("you have 3 connections");
     return null;
     }
         if (ConnPro =="HTTP"){
             if (HTTP ==null){
                 HTTP= new Connections();
                 List.add("HTTP");
                 count++;
             }
             return HTTP;
         }
             else if (ConnPro =="SSH"){
             if (SSH ==null){
                 SSH= new Connections();
                 List.add("SSH");
                 count++;
             }
             return SSH;
             }
           else if (ConnPro =="TELNET"){
             if (TELNET ==null){
                 TELNET= new Connections();
                 List.add("TELNET");
                 count++;
             }
             return TELNET;
             }
         else if (ConnPro =="CSP"){
             if (CSP ==null){
                 CSP= new Connections();
                 List.add("CSP");
                 count++;
             }
             return CSP;
             }
          else if (ConnPro =="FTP"){
             if (FTP ==null){
                 FTP= new Connections();
                 List.add("FTP");
                 count++;
             }
             return FTP;
             }     
         }
    
    
     public static boolean release(String ConnPro){
         if (count>3)
         return false ;
     }
     public static ArrayList<String> getCurrentConnection(){
         return null;
     }
     public void send(String string){
         
     }
     
 }
