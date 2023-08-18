public class Colesterol extends Exame {
    private double quantidadeLDL;
    private double quantidadeHDL;
    private char risco;

    public Colesterol(String nomePaciente, String tipoSanguineo, int anoNascimento,
                      double quantidadeLDL, double quantidadeHDL, char risco) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
        this.quantidadeLDL = quantidadeLDL;
        this.quantidadeHDL = quantidadeHDL;
        this.risco = risco;
    }

    @Override
    public void classificarResultado() {
        String classificacaoLDL = "";
        if (risco == 'B') {
            classificacaoLDL = quantidadeLDL < 100 ? "Baixo risco" : "Risco médio";
        } else if (risco == 'M') {
            classificacaoLDL = quantidadeLDL < 70 ? "Risco médio" : "Risco alto";
        } else if (risco == 'A') {
            classificacaoLDL = quantidadeLDL < 50 ? "Risco alto" : "Risco muito alto";
        }
        System.out.println("Classificação de Colesterol LDL: " + classificacaoLDL);

        String classificacaoHDL = (anoNascimento <= 19 && quantidadeHDL > 45) ||
                (anoNascimento > 19 && quantidadeHDL > 40) ?
                "HDL - BOM" : "HDL - Ruim";
        System.out.println("Classificação de Colesterol HDL: " + classificacaoHDL);
    }

    @Override
    public void mostrarResultado() {
        super.mostrarResultado();
        System.out.println("Resultado de Colesterol LDL: " + quantidadeLDL);
        System.out.println("Resultado de Colesterol HDL: " + quantidadeHDL);
        classificarResultado();
    }
}

