public class Exame {
    public String nomePaciente;
    public String tipoSanguineo;
    public int anoNascimento;

    public Exame(String nomePaciente, String tipoSanguineo, int anoNascimento) {
        this.nomePaciente = nomePaciente;
        this.tipoSanguineo = tipoSanguineo;
        this.anoNascimento = anoNascimento;
    }

    public void classificarResultado() {
        // Este método será implementado nas subclasses
    }

    public void mostrarResultado() {
        System.out.println("Nome do Paciente: " + nomePaciente);
    }
}
