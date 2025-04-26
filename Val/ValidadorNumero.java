package Val;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ValidadorNumero extends Thread {
    private String contraseña;
    private ConcurrentLinkedQueue<String> log;

    public ValidadorNumero(String contraseña, ConcurrentLinkedQueue<String> log) {
        this.contraseña = contraseña;
        this.log = log;
    }

    @Override
    public void run() {
        String resultado = (!contraseña.matches(".*\\d.*"))
            ? "Debe tener al menos un numero."
            : "Tiene al menos un numero !.";
        System.out.println(resultado);
        log.add("Numero: " + resultado);
    }
}
