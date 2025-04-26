package Val;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ValidadorMinusculas extends Thread {
    private String contraseña;
    private ConcurrentLinkedQueue<String> log;

    public ValidadorMinusculas(String contraseña, ConcurrentLinkedQueue<String> log) {
        this.contraseña = contraseña;
        this.log = log;
    }

    @Override
    public void run() {
        long count = contraseña.chars().filter(Character::isLowerCase).count();
        String resultado = (count < 3)
            ? "Debe tener al menos 3 letras minusculas."
            : "Tiene al menos 3 letras minusculas !.";
        System.out.println(resultado);
        log.add("Minusculas: " + resultado);
    }
}
