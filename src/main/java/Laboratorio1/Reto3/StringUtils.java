package Laboratorio1.Reto3;


public class StringUtils {


    public String reverse(String message) {
        StringBuffer message2 = new StringBuffer(message);
        return message2.reverse().toString();

    }

    public String reverseAndReplicate (String message){

        String messageAmplificationReverse = reverse(message);
        System.out.println("Descrifrado final: \"" + messageAmplificationReverse + "\"");

        return messageAmplificationReverse;
    }

}