package tech.devinhouse.service.Ex01;

public class Funcionario {

    private String fullName;
    private Long cpf;
    private float wage;


    public void promote(float percent){
            float perc = (percent / 100);
            this.wage = (this.wage * (1+perc));
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }
}
