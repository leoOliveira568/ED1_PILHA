import java.util.Stack;

public class InverterPalavrasComPilha {
    public static void main(String[] args) {
        String exemplo1 = "UM CIENTISTA DA COMPUTACAO E UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";
        String exemplo2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLÓNCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OÃS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED .SAIOG";

        try {
            System.out.println(inverterPalavras(exemplo1));
            System.out.println(inverterPalavras(exemplo2));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static String inverterPalavras(String entrada) {
        if (entrada == null || entrada.trim().isEmpty()) {
            throw new IllegalArgumentException("A entrada não pode ser nula ou vazia.");
        }

        Stack<Character> pilha = new Stack<>();
        StringBuilder resultado = new StringBuilder();

        for (char caractere : entrada.toCharArray()) {
            if (caractere == ' ') {
                while (!pilha.isEmpty()) {
                    resultado.append(pilha.pop());
                }
                resultado.append(' ');
            } else {
                pilha.push(caractere);
            }
        }

        while (!pilha.isEmpty()) {
            resultado.append(pilha.pop());
        }

        return resultado.toString();
    }
}
