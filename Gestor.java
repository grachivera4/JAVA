package ejercicio.pkg1.guia;
import java.util.List;       
import java.util.ArrayList;  
import java.util.Scanner;

public class Gestor {
    // Lista que contiene objetos de tipo ViajeroFrecuente
    private List<ViajeroFrecuente> grViajeroFrecuente;

    // Constructor que inicializa la lista vacía
    public Gestor() {
        grViajeroFrecuente = new ArrayList<>();
    }

    // Método para agregar un viajero a la lista
    public void agregarViajero(ViajeroFrecuente viajero) {
        grViajeroFrecuente.add(viajero);
    }
    
    public void cargarDatos() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese DNI del viajero: ");
    String dni = sc.nextLine();
    System.out.println("Ingrese Nombre del viajero: ");
    String nombre = sc.nextLine();
    System.out.println("Ingrese Apellido del viajero: ");
    String apellido = sc.nextLine();
    System.out.println("Ingrese número del viajero: ");
    int numero = sc.nextInt(); 
    System.out.println("Ingrese millas del viajero: ");
    int millas = sc.nextInt();

    // Crear viajero
    ViajeroFrecuente viajero = new ViajeroFrecuente(numero,dni,nombre,apellido,millas);

    // Agregarlo a la lista
    agregarViajero(viajero);

    System.out.println("Viajero cargado.");
}

    
    //METODO Q BUSCA VIAJERO POR DNI
    public void buscarporDNI(String dniBuscado) {
    boolean encontrado = false;
    int i = 0;
    while (i < grViajeroFrecuente.size() && !encontrado) {
        ViajeroFrecuente viajero = grViajeroFrecuente.get(i);
        if (viajero.getDni().equals(dniBuscado)) {
            System.out.println("Viajero encontrado:");
            viajero.mostrardatos();
            encontrado = true;
        } else {
            i++;
        }
    }
    if (!encontrado) {
        System.out.println("No se encontró un viajero con ese DNI.");
    }
}

    public void acumularmillasporDNI(String dniBuscado) {
    boolean encontrado = false;
    int i = 0;
    while (i < grViajeroFrecuente.size() && !encontrado) {
        ViajeroFrecuente viajero = grViajeroFrecuente.get(i);
        if (viajero.getDni().equals(dniBuscado)) {
            System.out.println("Viajero encontrado:");
            viajero.acumulaMillas();
            encontrado = true;
        } else {
            i++;
        }
    }
    if (!encontrado) {
        System.out.println("No se encontró un viajero con ese DNI.");
    }
    }
    

    public void canjearmillasporDNI(String dniBuscado) {
    boolean encontrado = false;
    int i = 0;
    while (i < grViajeroFrecuente.size() && !encontrado) {
        ViajeroFrecuente viajero = grViajeroFrecuente.get(i);
        if (viajero.getDni().equals(dniBuscado)) {
            System.out.println("Viajero encontrado:");
            viajero.decrementamillas();
            encontrado = true;
        } else {
            i++;
        }
    }
    if (!encontrado) {
        System.out.println("No se encontró un viajero con ese DNI.");
    }
}

    public void mostrarMillasPorDNI(String dniBuscado) {
    boolean encontrado = false;
    int i = 0;

    while (i < grViajeroFrecuente.size() && !encontrado) {
        ViajeroFrecuente viajero = grViajeroFrecuente.get(i);
        if (viajero.getDni().equals(dniBuscado)) {
            System.out.println("Millas acumuladas para el DNI " + dniBuscado + ": " + viajero.getMillas());
            encontrado = true;
        } else {
            i++;
        }
    }

    if (!encontrado) {
        System.out.println("No se encontró un viajero con ese DNI.");
    }
}

    
    public void mejorViajero() {
    if (grViajeroFrecuente.isEmpty()) {
        System.out.println("No hay viajeros en la lista.");
        return;
    }
        int i = 1; 
        ViajeroFrecuente mejorViajero = grViajeroFrecuente.get(0); 

        while (i < grViajeroFrecuente.size()) {
            ViajeroFrecuente actual = grViajeroFrecuente.get(i);
            if (actual.getMillas() > mejorViajero.getMillas()) {
                mejorViajero = actual; 
            }
            i++;
        }
    System.out.println("El mejor viajero es:");
    System.out.println("DNI: " + mejorViajero.getDni());
    System.out.println("Nombre: " + mejorViajero.getNombre() + " " + mejorViajero.getApe());
    System.out.println("Millas acumuladas: " + mejorViajero.getMillas());
    }
    
    // METODO Q MUESTRA TODOS LOS VIAJEROS
    public void mostrarViajeros() {
        for (ViajeroFrecuente v : grViajeroFrecuente) {
            System.out.println("Viajero: " + v.getNombre() + " " + v.getApe() +
                               " | DNI: " + v.getDni() +
                               " | Número: " + v.getNum() +
                               " | Millas: " + v.getMillas());
        }
    }
}
