import javax.swing.*;

public class Coelho extends Animal {
    public Coelho(boolean vacinado, boolean castrado) {
        super(vacinado, castrado);

    }

    public Coelho() {

    }

    //MÉTODOS ABSTRATOS SENDO IMPLEMENTADOS (mesmo método, comportamentos diferentes - polimorfismo)
    @Override
    public void locomover() {
        JOptionPane.showMessageDialog(null, "Saltando.");
    }

    @Override
    public void alimentar() {
        JOptionPane.showMessageDialog(null, "Cenoura e outros legumes.");
    }

    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null, "Som de Coelho.");
    }
}
