public class Main {
    public static void main(String[] args) {

        Glicemia glicemia = new Glicemia("João", "A+", 1980, 130);
        glicemia.mostrarResultado();

        System.out.println();

        Colesterol colesterol = new Colesterol("Maria", "O+", 1995, 80, 50, 'M');
        colesterol.mostrarResultado();

        System.out.println();

        Triglicerideos triglicerideos = new Triglicerideos("Pedro", "B-", 2010, 100);
        triglicerideos.mostrarResultado();
    }

}