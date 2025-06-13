package ejercicio.pkg1.guia;
import java.util.Scanner;

public class ViajeroFrecuente{
    private String dni;
    private String nom;
    private String ape;
    private Integer millas; 
    private Integer num;
    
    public ViajeroFrecuente() {
    }

    
    public ViajeroFrecuente(Integer num, String dni, String nom, String ape, Integer millas) {
        this.num = num;
        this.dni = dni;
        this.nom = nom;
        this.ape = ape;
        this.millas = millas;
    }
    public String getNombre() {
    return nom;
    }
    public String getApe() {
    return ape;
    }
    public Integer getMillas() {
    return millas;
    }
    public Integer getNum() {
    return num;
    }
    public String getDni() {
    return dni;
    }
    public void setNom(String nom) {
    this.nom = nom;
    }
    public void setNum(Integer num) {
    this.num = num;
    }
    public void setDNI(String dni) {
    this.dni = dni;
    }
    public void setmillas(Integer millas) {
    this.millas = millas;
    }
    //METODO Q MUESTRA DATOS
    public void mostrardatos() {
        System.out.println("Número de viajero: " + this.num);
        System.out.println("DNI: " + this.dni);
        System.out.println("Nombre: " + this.nom);
        System.out.println("Apellido: " + this.ape);
        System.out.println("Millas acumuladas: " + this.millas);
    }

    
    //METODO QUE CARGA VIAJEROS 
        public void cargadatos() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese DNI del viajero: ");
            this.dni = sc.nextLine();
            System.out.println("Ingrese Nombre del viajero: ");
            this.nom = sc.nextLine();
            System.out.println("Ingrese Apellido del viajero: ");
            this.ape = sc.nextLine();
            System.out.println("Ingrese número del viajero: ");
            this.num = sc.nextInt();
            System.out.println("Ingrese millas del viajero: ");
            this.millas = sc.nextInt();
            System.out.println("Viajero cargado.");
        }
        
    //METODO QUE ACUMULA MILLAS
    public void acumulaMillas(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese cantidad de millas recorridas: ");
        int millaa = sc.nextInt();
        this.millas += millaa;      // Suma al atributo millas
        System.out.println("Millas actualizadas: " + this.millas);
    }
    public void decrementamillas(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese cantidad de millas a canjear: ");
        int millaa = sc.nextInt();
        this.millas -= millaa;      // Suma al atributo millas
        System.out.println("Millas actualizadas: " + this.millas);
    }
    
    
    public static void main(String[] args) {
        System.out.println("------------MENU------------");
        
        Gestor gestor = new Gestor();
        int opc;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("elegir opcion: ");
        System.out.println("1.Ingresar datos ");
        System.out.println("2.Mostrar viajero ");
        System.out.println("3.Consultar millas via DNI ");
        System.out.println("4.Acumular millas ");
        System.out.println("5.Canjear millas ");
        System.out.println("6.Mejor viajero ");
        System.out.println("7.Salir ");            
        opc = sc.nextInt(); 
        sc.nextLine(); // importante para limpiar buffer
            if(opc == 1){
            ViajeroFrecuente viajero = new ViajeroFrecuente();
            viajero.cargadatos();
            gestor.agregarViajero(viajero);
            }
            if(opc == 2){
                System.out.print("Ingrese DNI a buscar: ");
                String dniBuscado = sc.nextLine();
                gestor.buscarporDNI(dniBuscado);
            }
            if(opc == 3){
                System.out.print("Ingrese DNI a consultar millas: ");
                String dniBuscado = sc.nextLine();
                gestor.mostrarMillasPorDNI(dniBuscado);
            }
            if(opc == 4){
                System.out.print("Ingrese DNI para acumular millas: ");
                String dniBuscado = sc.nextLine();
                gestor.acumularmillasporDNI(dniBuscado);
            }
            if(opc == 5){
                System.out.print("Ingrese DNI para canjear millas: ");
                String dniBuscado = sc.nextLine();
                gestor.canjearmillasporDNI(dniBuscado);
            }
            if(opc == 6){
                gestor.mejorViajero();
            }
            if(opc == 7){
                System.exit(0);
            }
            
        }while (opc<=7);
    }  
}






