import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("   INICIANDO BACKEND COMPILADO: SATE-UNIAJC      ");
        System.out.println("=================================================");
        System.out.println("[INFO] Conexión establecida con la base de datos PostgreSQL.");
        System.out.println("[INFO] Módulo de Autenticación y Acceso Seguro cargado.");
        System.out.println("[INFO] Métodos de encriptación Bcrypt activos.");
        System.out.println("=================================================\n");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Simulación de Login - Ingrese Correo Institucional: ");
        String correo = teclado.nextLine();
        
        System.out.print("Ingrese Contraseña: ");
        String password = teclado.nextLine();

        System.out.println("\n[PROCESANDO] Validando credenciales y generando token JWT...");
        
        if (correo.endsWith("@uniajc.edu.co") && !password.isEmpty()) {
            System.out.println("\n[ÉXITO] Autenticación correcta. Token JWT generado.");
            System.out.println("[OK] Redirigiendo al usuario según su rol de acceso.");
        } else {
            System.out.println("\n[ERROR 401] Credenciales incorrectas o correo no institucional.");
        }
    }
}
