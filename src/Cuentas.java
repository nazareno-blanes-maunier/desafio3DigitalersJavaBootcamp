import java.util.Date;

public class Cuentas {
   public Date fechaDeApertura;
   public String numero;
   public double saldo;
public double interes;
public int meses;

public void verDatos() {

    System.out.println("Fecha de apertura: " + fechaDeApertura);
    System.out.println("Numero de cuenta: " + numero);
    System.out.println("Saldo: " + saldo);
    System.out.println("Interes: " + interes);
    System.out.println("Meses: " + meses);
}

}

