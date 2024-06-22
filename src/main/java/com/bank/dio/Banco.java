package com.bank.dio;

import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;
    public static int qtdContas = 0;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        qtdContas++;
    }

    public void removerConta(Conta conta) {
        contas.remove(conta);
        qtdContas--;
    }

    public void imprimirContas() {
        for (Conta conta : contas) {
            conta.imprimirExtrato();
        }
    }

    public void imprimirSaldoTotal() {
        double saldoTotal = 0;
        for (Conta conta : contas) {
            saldoTotal += conta.getSaldo();
        }
        System.out.println("Saldo total: " + saldoTotal);
    }

    public void imprimirSaldoMedio() {
        double saldoTotal = 0;
        for (Conta conta : contas) {
            saldoTotal += conta.getSaldo();
        }
        System.out.println("Saldo médio: " + saldoTotal / qtdContas);
    }

    public void imprimirMaiorSaldo() {
        double maiorSaldo = 0;
        for (Conta conta : contas) {
            if (conta.getSaldo() > maiorSaldo) {
                maiorSaldo = conta.getSaldo();
            }
        }
        System.out.println("Maior saldo: " + maiorSaldo);
    }

    public void imprimirMenorSaldo() {
        double menorSaldo = contas.get(0).getSaldo();
        for (Conta conta : contas) {
            if (conta.getSaldo() < menorSaldo) {
                menorSaldo = conta.getSaldo();
            }
        }
        System.out.println("Menor saldo: " + menorSaldo);
    }

    public void imprimirSaldoAcima(double valor) {
        for (Conta conta : contas) {
            if (conta.getSaldo() > valor) {
                conta.imprimirExtrato();
            }
        }
    }

    public void imprimirSaldoAbaixo(double valor) {
        for (Conta conta : contas) {
            if (conta.getSaldo() < valor) {
                conta.imprimirExtrato();
            }
        }
    }

    public void imprimirSaldoNegativo() {
        for (Conta conta : contas) {
            if (conta.getSaldo() < 0) {
                conta.imprimirExtrato();
            }
        }
    }

    public void imprimirSaldoPositivo() {
        for (Conta conta : contas) {
            if (conta.getSaldo() > 0) {
                conta.imprimirExtrato();
            }
        }
    }

    public void imprimirSaldoZerado() {
        for (Conta conta : contas) {
            if (conta.getSaldo() == 0) {
                conta.imprimirExtrato();
            }
        }
    }

    public void imprimirSaldoNegativoTotal() {
        double saldoTotal = 0;
        for (Conta conta : contas) {
            if (conta.getSaldo() < 0) {
                saldoTotal += conta.getSaldo();
            }
        }
        System.out.println("Saldo negativo total: " + saldoTotal);
    }

    public void imprimirSaldoPositivoTotal() {
        double saldoTotal = 0;
        for (Conta conta : contas) {
            if (conta.getSaldo() > 0) {
                saldoTotal += conta.getSaldo();
            }
        }
        System.out.println("Saldo positivo total: " + saldoTotal);
    }

    public void imprimirSaldoZeradoTotal() {
        double saldoTotal = 0;
        for (Conta conta : contas) {
            if (conta.getSaldo() == 0) {
                saldoTotal += conta.getSaldo();
            }
        }
        System.out.println("Saldo zerado total: " + saldoTotal);
    }

    public void imprimirSaldoNegativoMedio() {
        double saldoTotal = 0;
        int qtdContasNegativas = 0;
        for (Conta conta : contas) {
            if (conta.getSaldo() < 0) {
                saldoTotal += conta.getSaldo();
                qtdContasNegativas++;
            }
        }
        System.out.println("Saldo negativo médio: " + saldoTotal / qtdContasNegativas);
    }

    public void imprimirSaldoPositivoMedio() {
        double saldoTotal = 0;
        int qtdContasPositivas = 0;
        for (Conta conta : contas) {
            if (conta.getSaldo() > 0) {
                saldoTotal += conta.getSaldo();
                qtdContasPositivas++;
            }
        }
        System.out.println("Saldo positivo médio: " + saldoTotal / qtdContasPositivas);
    }

    public void imprimirSaldoZeradoMedio() {
        double saldoTotal = 0;
        int qtdContasZeradas = 0;
        for (Conta conta : contas) {
            if (conta.getSaldo() == 0) {
                saldoTotal += conta.getSaldo();
                qtdContasZeradas++;
            }
        }
        System.out.println("Saldo zerado médio: " + saldoTotal / qtdContasZeradas);
    }

    public void imprimirSaldoNegativoMaior() {
        double maiorSaldo = 0;
        for (Conta conta : contas) {
            if (conta.getSaldo() < 0 && conta.getSaldo() > maiorSaldo) {
                maiorSaldo = conta.getSaldo();
            }
        }
        System.out.println("Maior saldo negativo: " + maiorSaldo);
    }

    public void imprimirSaldoPositivoMaior() {
        double maiorSaldo = 0;
        for (Conta conta : contas) {
            if (conta.getSaldo() > 0 && conta.getSaldo() > maiorSaldo) {
                maiorSaldo = conta.getSaldo();
            }
        }
        System.out.println("Maior saldo positivo: " + maiorSaldo);
    }

    public void imprimirSaldoZeradoMaior() {
        double maiorSaldo = 0;
        for (Conta conta : contas) {
            if (conta.getSaldo() == 0 && conta.getSaldo() > maiorSaldo) {
                maiorSaldo = conta.getSaldo();
            }
        }
        System.out.println("Maior saldo zerado: " + maiorSaldo);
    }

    public void imprimirSaldoNegativoMenor() {
        double menorSaldo = 0;
        for (Conta conta : contas) {
            if (conta.getSaldo() < 0 && conta.getSaldo() < menorSaldo) {
                menorSaldo = conta.getSaldo();
            }
        }
        System.out.println("Menor saldo negativo: " + menorSaldo);
    }

    public void imprimirSaldoPositivoMenor() {
        double menorSaldo = 0;
        for (Conta conta : contas) {
            if (conta.getSaldo() > 0 && conta.getSaldo() < menorSaldo) {
                menorSaldo = conta.getSaldo();
            }
        }
        System.out.println("Menor saldo positivo: " + menorSaldo);
    }

    public void imprimirSaldoZeradoMenor() {
        double menorSaldo = 0;
        for (Conta conta : contas) {
            if (conta.getSaldo() == 0 && conta.getSaldo() < menorSaldo) {
                menorSaldo = conta.getSaldo();
            }
        }
        System.out.println("Menor saldo zerado: " + menorSaldo);
    }

    public void mostrarQuantidadeContas() {
        System.out.println("Quantidade de contas: " + qtdContas);
    }
}
