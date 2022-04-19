package Javapilha;

public class TestaContaComExcecaoChecked {

    public static void main(String[] args) {

        Conta c = new Conta();
        try {
            c.depositar(200.0);
        } catch(MinhaExcecao ex) {
            System.out.println("tratamento ....");
        }

    }
}