public class Glicemia extends Exame {
    private double quantidadeGlicose;

    public Glicemia(String nomePaciente, String tipoSanguineo, int anoNascimento, double quantidadeGlicose) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
        this.quantidadeGlicose = quantidadeGlicose;
    }

    @Override
    public void classificarResultado() {
        if (quantidadeGlicose < 100) {
            System.out.println("Classificação: Normoglicemia");
        } else if (quantidadeGlicose >= 100 && quantidadeGlicose < 126) {
            System.out.println("Classificação: Pré-diabetes");
        } else {
            System.out.println("Classificação: Diabetes estabelecido");
        }
    }

    @Override
    public void mostrarResultado() {
        super.mostrarResultado();
        System.out.println("Resultado de Glicemia: " + quantidadeGlicose);
        classificarResultado();

    }
}
