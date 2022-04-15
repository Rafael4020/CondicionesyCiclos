public class casos {

    public static void main(String[] args) {

        var estacion = "Otoño";

        switch (estacion) {
            case "Invierno":
                System.out.println("La estacion es invierno.");
                break;
            case "Otoño":
                System.out.println("La estacion es otoño.");
                break;
            case "Primavera":
                System.out.println("La estacion es primavera.");
                break;
            case "Verano":
                System.out.println("La estacion es verano.");
                break;

            default:
                System.out.println("No es una estacion...");
                break;
        }

    }
}
