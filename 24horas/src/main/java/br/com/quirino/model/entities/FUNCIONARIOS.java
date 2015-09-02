package br.com.quirino.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FUNCIONARIOS")
class FUNCIONARIOS implements Serializable {

    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "ID_FUNCIONARIO", nullable = false)
    private Integer ID_FUNCIONARIO;
    @Column(name = "NOME_FUNCIONARIO", nullable = false, length = 80)
    private String NOME_FUNCIONARIO;
    @Column(name = "FUNCAO", nullable = true, length = 100)
    private String FUNCAO;
    @Column(name = "LOGIN", nullable = false, length = 20)
    private String LOGIN;
    @Column(name = "SENHA", nullable = false, length = 100)
    private String SENHA;
    @Column(name = "ADM", nullable = true)
    private Integer ADM;
    @Column(name = "COD_EMAIL", nullable = true)
    private Integer COD_EMAIL;
    @Column(name = "ID_GRUPO", nullable = true)
    private Integer ID_GRUPO;
    @Column(name = "APROVADO_AUTORIZ", nullable = true)
    private Integer APROVADO_AUTORIZ;
    @Column(name = "BAIXAR_CONTAS", nullable = true)
    private Integer BAIXAR_CONTAS;
    @Column(name = "EDITAR_CONTAS", nullable = true)
    private Integer EDITAR_CONTAS;
    @Column(name = "BAIXAR_COMISSOES", nullable = true)
    private Integer BAIXAR_COMISSOES;
    @Column(name = "QUITAR_CONTAS", nullable = true)
    private Integer QUITAR_CONTAS;

    public FUNCIONARIOS() {
    }

    public Integer getID_FUNCIONARIO() {
        return ID_FUNCIONARIO;
    }

    public void setID_FUNCIONARIO(Integer ID_FUNCIONARIO) {
        this.ID_FUNCIONARIO = ID_FUNCIONARIO;
    }

    public String getNOME_FUNCIONARIO() {
        return NOME_FUNCIONARIO;
    }

    public void setNOME_FUNCIONARIO(String NOME_FUNCIONARIO) {
        this.NOME_FUNCIONARIO = NOME_FUNCIONARIO;
    }

    public String getFUNCAO() {
        return FUNCAO;
    }

    public void setFUNCAO(String FUNCAO) {
        this.FUNCAO = FUNCAO;
    }

    public String getLOGIN() {
        return LOGIN;
    }

    public void setLOGIN(String LOGIN) {
        this.LOGIN = LOGIN;
    }

    public String getSENHA() {
        return SENHA;
    }

    public void setSENHA(String SENHA) {
        this.SENHA = SENHA;
    }

    public Integer getADM() {
        return ADM;
    }

    public void setADM(Integer ADM) {
        this.ADM = ADM;
    }

    public Integer getCOD_EMAIL() {
        return COD_EMAIL;
    }

    public void setCOD_EMAIL(Integer COD_EMAIL) {
        this.COD_EMAIL = COD_EMAIL;
    }

    public Integer getID_GRUPO() {
        return ID_GRUPO;
    }

    public void setID_GRUPO(Integer ID_GRUPO) {
        this.ID_GRUPO = ID_GRUPO;
    }

    public Integer getAPROVADO_AUTORIZ() {
        return APROVADO_AUTORIZ;
    }

    public void setAPROVADO_AUTORIZ(Integer APROVADO_AUTORIZ) {
        this.APROVADO_AUTORIZ = APROVADO_AUTORIZ;
    }

    public Integer getBAIXAR_CONTAS() {
        return BAIXAR_CONTAS;
    }

    public void setBAIXAR_CONTAS(Integer BAIXAR_CONTAS) {
        this.BAIXAR_CONTAS = BAIXAR_CONTAS;
    }

    public Integer getEDITAR_CONTAS() {
        return EDITAR_CONTAS;
    }

    public void setEDITAR_CONTAS(Integer EDITAR_CONTAS) {
        this.EDITAR_CONTAS = EDITAR_CONTAS;
    }

    public Integer getBAIXAR_COMISSOES() {
        return BAIXAR_COMISSOES;
    }

    public void setBAIXAR_COMISSOES(Integer BAIXAR_COMISSOES) {
        this.BAIXAR_COMISSOES = BAIXAR_COMISSOES;
    }

    public Integer getQUITAR_CONTAS() {
        return QUITAR_CONTAS;
    }

    public void setQUITAR_CONTAS(Integer QUITAR_CONTAS) {
        this.QUITAR_CONTAS = QUITAR_CONTAS;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.ID_FUNCIONARIO != null ? this.ID_FUNCIONARIO.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FUNCIONARIOS other = (FUNCIONARIOS) obj;
        if (this.ID_FUNCIONARIO != other.ID_FUNCIONARIO && (this.ID_FUNCIONARIO == null || !this.ID_FUNCIONARIO.equals(other.ID_FUNCIONARIO))) {
            return false;
        }
        return true;
    }
    
    

}
