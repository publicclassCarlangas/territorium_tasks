import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante {
    private int identificacion;
    private String nombre;
    private String email;


    // Constructor
    public Estudiante(int identificacion, String nombre, String email) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.email = email;
    }

    // Métodos de acceso (getter y setter) para los atributos
    public int getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para cargar datos de n aprendices ingresados por teclado
    public static ArrayList<Estudiante> cargarDatos(int n) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        System.out.println("¿Cuantos estudiantes vas a ingresar?");
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.println("Ingrese datos para el estudiante #" + (i + 1));
            System.out.print("Identificación: ");
            int identificacion = scanner.nextInt();
            scanner.nextLine();  
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();

            Estudiante estudiante = new Estudiante(identificacion, nombre, email);
            estudiantes.add(estudiante);
        }

        return estudiantes;
    }

    // Método para consultar un aprendiz por número de identificación y mostrar datos
    public static void consultarEstudiante(ArrayList<Estudiante> estudiantes, int identificacion) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getIdentificacion() == identificacion) {
                System.out.println("Datos del estudiante:");
                System.out.println("Identificación: " + estudiante.getIdentificacion());
                System.out.println("Nombre: " + estudiante.getNombre());
                System.out.println("Email: " + estudiante.getEmail());
                return;  // Salir del método después de encontrar al estudiante
            }
        }

        System.out.println("No se encontró un estudiante con la identificación proporcionada.");
    }

    // Método para actualizar la identificación y el nombre de un estudiante
    public void actualizarDatos(int nuevaIdentificacion, String nuevoNombre) {
        setIdentificacion(nuevaIdentificacion);
        setNombre(nuevoNombre);
    }

    // Método para imprimir el listado de los aprendices
    public static void imprimirListado(ArrayList<Estudiante> estudiantes) {
        System.out.println("Listado de aprendices:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Identificación: " + estudiante.getIdentificacion());
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Email: " + estudiante.getEmail());
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        ArrayList<Estudiante> listaEstudiantes = cargarDatos(2);
        imprimirListado(listaEstudiantes);

        int identificacionConsulta = 123;
        consultarEstudiante(listaEstudiantes, identificacionConsulta);

        // Ejemplo de actualización de datos.
        Estudiante estudianteParaActualizar = listaEstudiantes.get(0);
        estudianteParaActualizar.actualizarDatos(456, "Nuevo Nombre");
        imprimirListado(listaEstudiantes);
    }
}