package Laboratorio1.Reto6;

public void fragmentoEstudianteA(String comando) {
    switch (comando.toUpperCase()) {
        case "SALUDAR":
            System.out.println("¡Saludos, viajero del Tiempo y del código!");
            break;
        case "DESPEDIR":
            System.out.println("Hasta la próxima compilación, viajero.");
            break;
        case "CANTAR":
            System.out.println("La la la... compilando melodías en tiempo real.");
            break;
        case "DANZAR":
            System.out.println("Girando en modo fiesta.");
            break;
        default:
            System.out.println("Comando no valido");
            break;
    }
}
