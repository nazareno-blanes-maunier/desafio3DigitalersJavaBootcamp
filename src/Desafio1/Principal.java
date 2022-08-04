package Desafio1;
public class Principal {
    public static void main(String[] args) throws Exception {
        Banco a = new Banco();
        a.Codigo = 1;
        a.Nombre = "BNA";

        System.out.println("Datos del Banco:  ");
        System.out.println("Codigo: " + a.Codigo);
        System.out.println("Nombre: " + a.Nombre);

        System.out.println("");
        
        Cliente c = new Cliente();
        c.Nombre = "Juan Perez";
        c.Telefono = "1536795291";
        c.Direccion = "Av. de Mayo 654";
        c.DNI = "22666555";
    }
}
