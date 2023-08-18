public class Triglicerideos extends Exame {
    private double quantidadeTriglicerideos;

    public Triglicerideos(String nomePaciente, String tipoSanguineo, int anoNascimento,
                          double quantidadeTriglicerideos) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
        this.quantidadeTriglicerideos = quantidadeTriglicerideos;
    }

    @Override
    public void classificarResultado() {
        String classificacao = "";
        if (anoNascimento <= 9 && quantidadeTriglicerideos < 75) {
            classificacao = "Com jejum: inferior a 75 mg/dL";
        } else if (anoNascimento >= 10 && anoNascimento <= 19 && quantidadeTriglicerideos < 90) {
            classificacao = "Com jejum: inferior a 90 mg/dL";
        } else if (anoNascimento >= 20 && quantidadeTriglicerideos < 150) {
            classificacao = "Com Jejum: inferior a 150 mg/dL";
        }
        System.out.println("Classificação de Triglicerídeos: " + classificacao);
    }

    @Override
    public void mostrarResultado() {
        super.mostrarResultado();
        System.out.println("Resultado de Triglicerídeos: " + quantidadeTriglicerideos);
        classificarResultado();
    }

}
