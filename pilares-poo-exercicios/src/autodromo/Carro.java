package autodromo;

public class Carro {
    private boolean statusCarro;
    private int marcha;
    private int velocidade;

    public Carro() {
        this.statusCarro = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public void ligarCarro() {
        if (!statusCarro) {
            setStatusCarro(true);
            System.out.println("O carro está ligado");
        } else {
            System.out.println("O carro já está ligado");
        }
    }

    public void desligarCarro() {
        if (statusCarro) {
            if (getMarcha() == 0 && getVelocidade() == 0) {
                setStatusCarro(false);
                System.out.println("O carro foi desligado!");
            } else if (getMarcha() == 0 && getVelocidade() > 0) {
                System.out.println("O carro não pode ser desligado pois está em movimente");
            } else if (getMarcha() > 0 ) {
                System.out.println("O carro não pode ser desligado pois está com a macha engatada");
            }
        } else {
            System.out.println("Desculpe o carro já está desligado");
        }
    }

    public void acelerar() {
        if (statusCarro) {
            if (getMarcha() > 0) {
                if (getVelocidade() <= 120) {
                    setVelocidade((getVelocidade() + 1));
                    System.out.println("Velocidade atual: " + getVelocidade());
                    trocarMarcha();
                } else {
                    System.out.println("Velocidade maxima atingida");
                }
            } else {
                System.out.println("Desculpe a marcha está no neutro");
            }
        } else {
            System.out.println("Desculpe o carro está desligado");
        }
    }

    public void diminuirVelocidade() {
        if (statusCarro) {
            if (getVelocidade() > 0) {
                setVelocidade(getVelocidade() - 1);
                System.out.println("Velocidade atual: " + getVelocidade());
                trocarMarcha();
            } else {
                System.out.println("O carro está parado");
            }
        } else {
            System.out.println("Desculpe o carro está desligado");
        }
    }

    public void virarDirecao(String sentido) {
        if (statusCarro) {
            if (getVelocidade() > 0) {
                if (getVelocidade() <= 40) {
                    System.out.println("Virando para " + sentido);
                } else {
                    System.out.println("O carro não pode virar, pois está acima da velocidade permitida");
                }
            } else  {
                System.out.println("O carro não pode virar, pois está parado");
            }
        } else {
            System.out.println("Desculpe o carro está desligado");
        }
    }

    public int verificarVelocidade() {
        return getVelocidade();
    }

    public void trocarMarcha() {
        if (statusCarro) {
            if (getVelocidade() >= 0 && getVelocidade() <= 20){
                setMarcha(1);
                System.out.println("Marcha: " + getMarcha());
            } else if (getVelocidade() >= 21 && getVelocidade() <= 40) {
                setMarcha(2);
                System.out.println("Marcha: " + getMarcha());
            } else if (getVelocidade() >= 41 && getVelocidade() <= 60) {
                setMarcha(3);
                System.out.println("Marcha: " + getMarcha());
            } else if (getVelocidade() >= 61 && getVelocidade() <= 80) {
                setMarcha(4);
                System.out.println("Marcha: " + getMarcha());
            } else if (getVelocidade() >= 81 && getVelocidade() <= 100) {
                setMarcha(5);
                System.out.println("Marcha: " + getMarcha());
            } else if (getVelocidade() >= 101 && getVelocidade() <= 120) {
                setMarcha(6);
                System.out.println("Marcha: " + getMarcha());
            }
        } else {
            System.out.println("Desculpe o carro está desligado");
        }
    }

    public boolean isStatusCarro() {
        return statusCarro;
    }

    public void setStatusCarro(boolean statusCarro) {
        this.statusCarro = statusCarro;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
