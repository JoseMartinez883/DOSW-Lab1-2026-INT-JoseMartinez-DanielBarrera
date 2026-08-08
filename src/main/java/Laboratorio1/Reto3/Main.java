package Laboratorio1.reto3;

import java.util.Scanner;
import java.util.function.Function;

public class Main {

    static void main(String[] args){

        StringUtils stringsUtilities = new StringUtils();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mensaje Interceptado: ");
        String message = scanner.nextLine();

        System.out.println("Canal A - amplifica senal");
        System.out.println("Canal B - invierte protocolo");
        System.out.println("Descifrado final: A + B combinados");

        Function<String,String> messageReplicate = mesage -> stringsUtilities.reverseAndReplicate(message);
        messageReplicate.apply(message);

    }
}
