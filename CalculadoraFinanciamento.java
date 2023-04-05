public class CalculadoraFinanciamento{
    public static void main(String [] args){
        int valorDoCarro= 10000;
        int duracaoDoEmprestimo = 3;
        int taxaDeJuros = 5;
        int valorEntrada = 2000;

        if( duracaoDoEmprestimo <=0 || taxaDeJuros <= 0){
            System.out.println("Erro! Insira um empréstimo válido!");
        } else if(valorEntrada >= valorDoCarro){
            System.out.println("Valor de entrada: " + valorEntrada);
            System.out.println("Valor do carro: "+ valorDoCarro);
            System.out.printl   n("O carro pode ser pago integralmente");
        } else{
            int saldoRestante = valorDoCarro - valorEntrada;
            int numeroDeMeses = 12 * duracaoDoEmprestimo;
            int saldoMensal = saldoRestante / numeroDeMeses;
            int jurosMensal = saldoMensal * taxaDeJuros / 100;
            int pagamentoMensal = saldoMensal + jurosMensal;
            System.out.println(pagamentoMensal);
        }
    }
    }