import javax.swing.*;

public class Gato extends Animal {
    //MÉTODOS ABSTRATOS SENDO IMPLEMENTADOS (mesmo método, comportamentos diferentes - polimorfismo)

    public Gato(boolean vacinado, boolean castrado) {
        super(vacinado, castrado);

    }

    public Gato() {

    }


    @Override
    public void locomover() {
        JOptionPane.showMessageDialog(null, "Andando.");
    }

    @Override
    public void alimentar() {
        JOptionPane.showMessageDialog(null, "Ração light para gato.");
    }

    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null, "Miados (MIAU MIAU).");
    }
}
