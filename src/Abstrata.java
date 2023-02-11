public abstract class Abstrata {
    //ATRIBUTOS
    private String nome;
    private String raca;
    protected boolean vacinado;
    protected boolean castrado;
    protected int idade, animais;
    private String sexo, tipoAnimal;

    //CONSTRUTOR
    public Abstrata(boolean vacinado, boolean castrado) {
        this.vacinado = vacinado;
        this.castrado = castrado;
    }

    public Abstrata() {

    }

    //MÉTODOS ABSTRATOS
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    //MÉTODOS GETTERS E SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    //RAÇA
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    //VACINADO
    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public boolean getVacinado() {
        return vacinado;
    }

    //CASTRADO
    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public boolean getCastrado() {
        return castrado;
    }

    //IDADE
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    //SEXO
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    //TIPO ANIMAL
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }
}

