package candidatura;

public class processoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900.0);
        analisarCandidato(2000.0);
        analisarCandidato(1200.0);

    }

    // metodo, double salario é parametro do metodo
    static void analisarCandidato(double salarioPermitido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPermitido) {
            System.out.println("ligar para candidato");

        } else if (salarioBase == salarioPermitido)
            System.out.println("agendar o resultado");
        else {
            System.out.println("aguardando resultado dos candidados");
        }

    };

}