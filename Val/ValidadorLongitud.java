package Val;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ValidadorLongitud extends Thread {
    private String contraseña;
    private ConcurrentLinkedQueue<String> log;

    public ValidadorLongitud(String contraseña, ConcurrentLinkedQueue<String> log) {
        this.contraseña = contraseña;
        this.log = log;
    }

    @Override
    public void run() {
        String resultado = (contraseña.length() < 8)
            ? "Debe tener al menos 8 caracteres."
            : "Tiene los caracteres suficientes !.";
        System.out.println(resultado);
        log.add("Longitud: " + resultado);
    }
}

