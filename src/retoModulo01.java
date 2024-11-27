import java.util.Scanner;

public class retoModulo01 {


    private static final String[] PLANETAS = { "Marte", "Júpiter", "Saturno", "Venus", "Neptuno" };
    private static final double[] DISTANCIAS = { 225.0, 778.0, 1429.0, 556.32, 884.25 }; // Distancias en millones de km
    private static final String[] DESCRIPCIONES_PLANETAS = {
            "Es el cuarto planeta del sistema solar.",
            "Es el planeta más grande del sistema solar.",
            "Es conocido por sus impresionantes anillos.",
            "Es el planeta mas frio del sistema solar, lleve ruana.",
            "Es el planeta mas lejano del sol, 30 veces mas lejos que la tierra."
    };

    // Constantes para las naves espaciales
    private static final String[] NAVES = { "Alcerina, reserva de oxigeno 1000 Litros, combustible 10 Galones", "La ruidosa, reserva de oxigeno 3000 Litros, combustible 30 Galones", "Silent Hills, reserva de oxigeno 5000 Litros, combustible 100 Galones" };
    private static final double[] VELOCIDADES = { 30.0, 50.0, 70.0 }; // Velocidades en millones de km/día
    
    // Variables para la selección del usuario
    private static int planetaSeleccionado = -1;
    private static int naveSeleccionada = -1;
    private static int cantidadPasajeros = 1;


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    seleccionarPlaneta(scanner);
                    break;
                case 2:
                    seleccionarNave(scanner);
                    ingresarPasajeros(scanner);
                    break;
                case 3:
                    if (planetaSeleccionado != -1 && naveSeleccionada != -1) {
                        iniciarSimulacion();
                    } else {
                        System.out.println("Por favor, seleccione un planeta y una nave antes de iniciar su viaje.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println(" =======================");
        System.out.println("| VIAJE INTERPLANETARIO |");
        System.out.println(" =======================");
        System.out.println("1. Seleccionar un planeta de destino");
        System.out.println("2. Seleccionar una nave espacial y cantidad de pasajeros");
        System.out.println("3. Iniciar la simulación del viaje");
        System.out.println("4. Salir del programa");
        System.out.println("  .....................");
        System.out.println("  Seleccione una opción:");
        System.out.println("  .....................");
    }

        

        



        
    }
}
