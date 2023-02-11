import javax.swing.*;
import java.util.ArrayList;

public class Animal extends Abstrata {

    public Animal(boolean vacinado, boolean castrado) {
        super(vacinado, castrado);
    }

    public Animal() {
        super();
    }

    //MÉTODO GERAL
    public void novoCadastro() {
        //CRIAÇÃO DO ARRAY
        ArrayList<Object> novoAnimal = new ArrayList<> ();
        animais = 0;
        int cadastro = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar um Pet? [1 - SIM; 0 - NÃO]"));
        if (cadastro == 1) {


            JOptionPane.showMessageDialog(null, "Certo! Vamos iniciar o cadastro do seu Pet!\n");

            this.setTipoAnimal(JOptionPane.showInputDialog("TIPO do Pet: [Cachorro, Gato ou Coelho?"));

            this.setNome(JOptionPane.showInputDialog(null, "NOME do seu Pet: "));

            this.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "IDADE do seu Pet: ")));

            this.setRaca(JOptionPane.showInputDialog(null, "RAÇA do seu Pet: "));

            this.setSexo(JOptionPane.showInputDialog(null, "SEXO do seu Pet: "));

            this.vacinado = JOptionPane.showInputDialog("Seu Pet é VACINADO?: ") != null;

            this.castrado = JOptionPane.showInputDialog("Seu Pet é CASTRADO?: ") != null;

            int resp = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar mais um Pet [1 - SIM ; 0 - NÃO]?"));
            while(resp == 1) {
                JOptionPane.showMessageDialog(null, "Certo! Vamos iniciar o cadastro do outro Pet!\n");
                novoCadastro();
            }
        animais++;
        novoAnimal.add(cadastro);
                JOptionPane.showMessageDialog(null, "------------------- NOVO CADASTRO -------------------\n"
                        + "\nTIPO do animal: " + this.getTipoAnimal() + "\nNOME do animal: " + this.getNome() + "\nIDADE do animal: " + this.getIdade()
                        + "\nSEXO do animal: " + this.getSexo() + "\nRAÇA do animal: " + this.getRaca() + "\nVACINADO? " + this.getVacinado()
                        + "\nCASTRADO? " + this.getCastrado());
        }else if (cadastro == 0) {
            JOptionPane.showMessageDialog(null, "Processo finalizado com sucesso! Obrigada por escolher o Abrigo Eu Amo Animais PE!");
            JOptionPane.showMessageDialog(null, "Total de Pets cadastrados: " + novoAnimal.size());
        }
    }

    //MÉTODOS ABSTRATOS (PROVENIENTES DA CLASSE ABSTRATA)
    @Override
    public void locomover() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void emitirSom() {

    }

}
