package banco;

public class ContaBanco {
    private int numeroConta;
    private int agencia;
    private String titular;
    private String cpf;
    private Double saldo;
    private Double limiteChequeEspecial;
    private Double chequeEspecial;
    private boolean statusChequeEspecial;
    private boolean statusConta;

    public ContaBanco(int numeroConta, int agencia, String titular, String cpf, Double valorDeposito) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.titular = titular;
        this.cpf = cpf;
        this.statusConta = true;
        this.statusChequeEspecial = false;

        depositar(valorDeposito);
        calcularChequeEspecial(valorDeposito);
    }

    public void consultarSaldo() {
        Double saldoTotal = saldoTotal();
        System.out.println("Saldo total R$: " + saldoTotal);
        System.out.println("Saldo R$: " + getSaldo());
        System.out.println("Cheque Especial R$: " + getChequeEspecial());
    }

    public void depositar(Double valorDeposito) {
        if (isStatusConta()) {
            setSaldo(valorDeposito);
            System.out.println("Deposito realizado com sucesso!");
        } else {
            System.out.println("Impossivel realizar o deposito, CONTA INATIVA");
        }
    }

    public void sacar(Double valorSaque, String oparaco) {
        if (isStatusConta()) {
            if (valorSaque <= saldoTotal()) {
                if(valorSaque <= getSaldo()) {
                    setSaldo(getSaldo() - valorSaque);
                    System.out.println(oparaco + " no valor de R$: " + valorSaque + " realizado com sucesso, Saldo restate = " + getSaldo());
                } else {
                    Double descontoCheque = valorSaque - getSaldo();
                    setSaldo(getSaldo() - (valorSaque - descontoCheque));

                    sacarChequeEspecial(descontoCheque);
                }
            } else {
                System.out.println("Saldo Insuficiente!");
            }
        } else {
            System.out.println("A conta não esta ativa. Cancelando opereção ...");
        }
    }

    private void sacarChequeEspecial(Double valorDescontoCheque) {
        setChequeEspecial(getChequeEspecial() - valorDescontoCheque);
        setSaldo(-(valorDescontoCheque * 1.20));
        setStatusChequeEspecial(true);
        consultarSaldo();
    }

    public void calcularChequeEspecial (Double valorDeposito) {
        Double valorCheque = 0.0;
        if (valorDeposito > 500.00) {
            valorCheque = valorDeposito / 2;
            setLimiteChequeEspecial(valorCheque);
            setChequeEspecial(getLimiteChequeEspecial());
        } else if (valorDeposito <= 500) {
            setLimiteChequeEspecial(50.00);
            setChequeEspecial(getLimiteChequeEspecial());
        }
        System.out.println("Cheque Especial definido em R$: " + valorCheque);
    }

    public void consultarChequeEspecial () {
        System.out.println("Limite do cheque especial: " + getLimiteChequeEspecial());
        System.out.println("Saldo disponivel para uso: " + getChequeEspecial());
    }

    public Double saldoTotal () {
        return getSaldo() + getChequeEspecial();
    }

    public void pagarBoleto(String codBoleto, Double valorBoleto) {
        sacar(valorBoleto, "Pagamento do boleto");
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public void setStatusConta(Boolean statusConta) {
        this.statusConta = statusConta;
    }

    public boolean isStatusChequeEspecial() {
        return statusChequeEspecial;
    }

    public void setStatusChequeEspecial(boolean statusChequeEspecial) {
        this.statusChequeEspecial = statusChequeEspecial;
    }

    public Double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
