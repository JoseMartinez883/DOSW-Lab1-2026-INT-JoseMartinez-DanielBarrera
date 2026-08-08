package Laboratorio1.reto3;


public class StringUtils {


    public String reverse(String message){
        StringBuffer message2 = new StringBuffer(message);
        return message2.reverse().toString();

     public String reverseAndReplicate(String message){

         String messageAmplificationReverse = reverse(messageAmplification);
         System.out.println("Descrifrado final: " + messageAmplificationReverse);

         return messageAmplification;
     }
}