import javax.swing.*;

public class Cachorro extends Animal {

    public Cachorro() {

    }

    //MÉTODOS ABSTRATOS SENDO IMPLEMENTADOS (mesmo método, comportamentos diferentes - polimorfismo)
    @Override
    public void locomover() {
        JOptionPane.showMessageDialog(null, "Correndo.");
    }

    @Override
    public void alimentar() {
        JOptionPane.showMessageDialog(null, "Ração para cachorro.");
    }

    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null, "Latidos (AU AU).");
    }
}