package Val;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ValidadoEspeciales extends Thread {
    private String contraseña;
    private ConcurrentLinkedQueue<String> log;

    public ValidadoEspeciales(String contraseña, ConcurrentLinkedQueue<String> log) {
        this.contraseña = contraseña;
        this.log = log;
    }

    @Override
    public void run() {
        String resultado = (!contraseña.matches(".*[!@#$%^&*(),.?\":{}|<>].*"))
            ? "Debe tener al menos un caracter especial."
            : "Tiene al menos un caracter especial !.";
        System.out.println(resultado);
        log.add("Caracter especial: " + resultado);
    }
}