package br.com.quirino.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class CLIENTE implements Serializable {
    
    private static final long SerialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name = "COD_CLIENTE", nullable = false)
    private Long COD_CLIENTE;
    @Column(name = "CPFCNPJ", nullable = true, length = 16)
    private String CPFCNPJ;
    @Column(name = "NOMERAZAOSOCIAL", nullable = true, length = 60)
    private String NOMERAZAOSOCIAL;
    @Column(name = "CONHECIDONOMEFANTASIA", nullable = true, length = 60)
    private String CONHECIDONOMEFANTASIA;
    @Column(name = "NUMERO", nullable = true, length = 10)
    private String NUMERO;
    @Column(name = "DATANASCIMENTO", nullable = true)
    private Timestamp DATANASCIMENTO;
    @Column(name = "DDDCELULAR", nullable = true, length = 4)
    private String DDDCELULAR;
    @Column(name = "TIPOPESSOA", nullable = true)
    private Integer TIPOPESSOA;
    @Column(name = "RGINSCRICAOESTADUAL", nullable = true, length = 20)
    private String RGINSCRICAOESTADUAL;
    @Column(name = "ORGAOEMISSORINSCRICAOMUNICIP", nullable = true, length = 20)
    private String ORGAOEMISSORINSCRICAOMUNICIP;
    @Column(name = "DATAEXPEDICAO", nullable = true)
    private Timestamp DATAEXPEDICAO;
    @Column(name = "SEXO", nullable = true, length = 1)
    private String SEXO;
    @Column(name = "ENDERECO", nullable = true, length = 60)
    private String ENDERECO;
    @Column(name = "EMAIL", nullable = true, length = 200)
    private String EMAIL;
    @Column(name = "COMPLEMENTO", nullable = true, length = 30)
    private String COMPLEMENTO;
    @Column(name = "BAIRRO", nullable = true, length = 30)
    private String BAIRRO;
    @Column(name = "PONTOREFERENCIA", nullable = true, length = 100)
    private String PONTOREFERENCIA;
    @Column(name = "CODIGOPROFISSAO", nullable = true)
    private Integer CODIGOPROFISSAO;
    @Column(name = "CIDADE", nullable = true, length = 30)
    private String CIDADE;
    @Column(name = "UF", nullable = true, length = 2)
    private String UF;
    @Column(name = "CODIGOSTATUS", nullable = true)
    private Integer CODIGOSTATUS;

    @OneToOne
    private FUNCIONARIOS funcionario;

    @Column(name = "CEP", nullable = true, length = 8)
    private String CEP;
    @Column(name = "DDDRESIDENCIAL", nullable = true, length = 4)
    private String DDDRESIDENCIAL;
    @Column(name = "TELEFONERESIDENCIAL", nullable = true, length = 10)
    private String TELEFONERESIDENCIAL;
    @Column(name = "TELEFONECELULAR", nullable = true, length = 10)
    private String TELEFONECELULAR;
    @Column(name = "ENDERECOCORRESPONDENCIA", nullable = true)
    private Integer ENDERECOCORRESPONDENCIA;
    @Column(name = "DDDCOMERCIAL", nullable = true, length = 4)
    private String DDDCOMERCIAL;
    @Column(name = "UFRG", nullable = true, length = 2)
    private String UFRG;
    @Column(name = "TELEFONECOMERCIAL", nullable = true, length = 10)
    private String TELEFONECOMERCIAL;
    @Column(name = "RAMALCOMERCIAL", nullable = true, length = 4)
    private String RAMALCOMERCIAL;
    @Column(name = "DDDFAX", nullable = true, length = 4)
    private String DDDFAX;
    @Column(name = "TELEFONEFAX", nullable = true, length = 10)
    private String TELEFONEFAX;
    @Column(name = "DATACADASTRO", nullable = true)
    private Timestamp DATACADASTRO;
    @Column(name = "PROFISSAO", nullable = true, length = 60)
    private String PROFISSAO;

    @Column(name = "NUMEROCNH", nullable = true, length = 30)
    private String NUMEROCNH;

    @Column(name = "REGISTROCNH", nullable = true, length = 30)
    private String REGISTROCNH;

    @Column(name = "CATEGORIACNH", nullable = true, length = 15)
    private String CATEGORIACNH;

    @Column(name = "CATEGORIACNH", nullable = true, length = 15)
    private Timestamp VENCIMENTOCNH;

    @Column(name = "ECLIENTE", nullable = true)
    private Integer ECLIENTE;

    @Column(name = "ETERCEIRO", nullable = true)
    private Integer ETERCEIRO;

    @Column(name = "EMOTORISTA", nullable = true)
    private Integer EMOTORISTA;

    @Column(name = "EVITIMA", nullable = true)
    private Integer EVITIMA;

    @Column(name = "EFUNCIONARIO", nullable = true)
    private Integer EFUNCIONARIO;

    @Column(name = "ESUGURADORA", nullable = true)
    private Integer ESUGURADORA;

    @Column(name = "ESTADO_CIVIL", nullable = true, length = 20)
    private String ESTADO_CIVIL;

    @Column(name = "EOFICINA", nullable = true)
    private Integer EOFICINA;

    @Column(name = "EFORNECEDOR", nullable = true)
    private Integer EFORNECEDOR;

    @Column(name = "COMPLEMENTO2", nullable = true, length = 200)
    private String COMPLEMENTO2;

    @Column(name = "OBSERVACAO", nullable = true, length = 200)
    private String OBSERVACAO;

    public CLIENTE() {
    }

    public Long getCOD_CLIENTE() {
        return COD_CLIENTE;
    }

    public void setCOD_CLIENTE(Long COD_CLIENTE) {
        this.COD_CLIENTE = COD_CLIENTE;
    }

    public String getCPFCNPJ() {
        return CPFCNPJ;
    }

    public void setCPFCNPJ(String CPFCNPJ) {
        this.CPFCNPJ = CPFCNPJ;
    }

    public String getNOMERAZAOSOCIAL() {
        return NOMERAZAOSOCIAL;
    }

    public void setNOMERAZAOSOCIAL(String NOMERAZAOSOCIAL) {
        this.NOMERAZAOSOCIAL = NOMERAZAOSOCIAL;
    }

    public String getCONHECIDONOMEFANTASIA() {
        return CONHECIDONOMEFANTASIA;
    }

    public void setCONHECIDONOMEFANTASIA(String CONHECIDONOMEFANTASIA) {
        this.CONHECIDONOMEFANTASIA = CONHECIDONOMEFANTASIA;
    }

    public String getNUMERO() {
        return NUMERO;
    }

    public void setNUMERO(String NUMERO) {
        this.NUMERO = NUMERO;
    }

    public Timestamp getDATANASCIMENTO() {
        return DATANASCIMENTO;
    }

    public void setDATANASCIMENTO(Timestamp DATANASCIMENTO) {
        this.DATANASCIMENTO = DATANASCIMENTO;
    }

    public String getDDDCELULAR() {
        return DDDCELULAR;
    }

    public void setDDDCELULAR(String DDDCELULAR) {
        this.DDDCELULAR = DDDCELULAR;
    }

    public Integer getTIPOPESSOA() {
        return TIPOPESSOA;
    }

    public void setTIPOPESSOA(Integer TIPOPESSOA) {
        this.TIPOPESSOA = TIPOPESSOA;
    }

    public String getRGINSCRICAOESTADUAL() {
        return RGINSCRICAOESTADUAL;
    }

    public void setRGINSCRICAOESTADUAL(String RGINSCRICAOESTADUAL) {
        this.RGINSCRICAOESTADUAL = RGINSCRICAOESTADUAL;
    }

    public String getORGAOEMISSORINSCRICAOMUNICIP() {
        return ORGAOEMISSORINSCRICAOMUNICIP;
    }

    public void setORGAOEMISSORINSCRICAOMUNICIP(String ORGAOEMISSORINSCRICAOMUNICIP) {
        this.ORGAOEMISSORINSCRICAOMUNICIP = ORGAOEMISSORINSCRICAOMUNICIP;
    }

    public Timestamp getDATAEXPEDICAO() {
        return DATAEXPEDICAO;
    }

    public void setDATAEXPEDICAO(Timestamp DATAEXPEDICAO) {
        this.DATAEXPEDICAO = DATAEXPEDICAO;
    }

    public String getSEXO() {
        return SEXO;
    }

    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }

    public String getENDERECO() {
        return ENDERECO;
    }

    public void setENDERECO(String ENDERECO) {
        this.ENDERECO = ENDERECO;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getCOMPLEMENTO() {
        return COMPLEMENTO;
    }

    public void setCOMPLEMENTO(String COMPLEMENTO) {
        this.COMPLEMENTO = COMPLEMENTO;
    }

    public String getBAIRRO() {
        return BAIRRO;
    }

    public void setBAIRRO(String BAIRRO) {
        this.BAIRRO = BAIRRO;
    }

    public String getPONTOREFERENCIA() {
        return PONTOREFERENCIA;
    }

    public void setPONTOREFERENCIA(String PONTOREFERENCIA) {
        this.PONTOREFERENCIA = PONTOREFERENCIA;
    }

    public Integer getCODIGOPROFISSAO() {
        return CODIGOPROFISSAO;
    }

    public void setCODIGOPROFISSAO(Integer CODIGOPROFISSAO) {
        this.CODIGOPROFISSAO = CODIGOPROFISSAO;
    }

    public String getCIDADE() {
        return CIDADE;
    }

    public void setCIDADE(String CIDADE) {
        this.CIDADE = CIDADE;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public Integer getCODIGOSTATUS() {
        return CODIGOSTATUS;
    }

    public void setCODIGOSTATUS(Integer CODIGOSTATUS) {
        this.CODIGOSTATUS = CODIGOSTATUS;
    }

    public FUNCIONARIOS getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FUNCIONARIOS funcionario) {
        this.funcionario = funcionario;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getDDDRESIDENCIAL() {
        return DDDRESIDENCIAL;
    }

    public void setDDDRESIDENCIAL(String DDDRESIDENCIAL) {
        this.DDDRESIDENCIAL = DDDRESIDENCIAL;
    }

    public String getTELEFONERESIDENCIAL() {
        return TELEFONERESIDENCIAL;
    }

    public void setTELEFONERESIDENCIAL(String TELEFONERESIDENCIAL) {
        this.TELEFONERESIDENCIAL = TELEFONERESIDENCIAL;
    }

    public String getTELEFONECELULAR() {
        return TELEFONECELULAR;
    }

    public void setTELEFONECELULAR(String TELEFONECELULAR) {
        this.TELEFONECELULAR = TELEFONECELULAR;
    }

    public Integer getENDERECOCORRESPONDENCIA() {
        return ENDERECOCORRESPONDENCIA;
    }

    public void setENDERECOCORRESPONDENCIA(Integer ENDERECOCORRESPONDENCIA) {
        this.ENDERECOCORRESPONDENCIA = ENDERECOCORRESPONDENCIA;
    }

    public String getDDDCOMERCIAL() {
        return DDDCOMERCIAL;
    }

    public void setDDDCOMERCIAL(String DDDCOMERCIAL) {
        this.DDDCOMERCIAL = DDDCOMERCIAL;
    }

    public String getUFRG() {
        return UFRG;
    }

    public void setUFRG(String UFRG) {
        this.UFRG = UFRG;
    }

    public String getTELEFONECOMERCIAL() {
        return TELEFONECOMERCIAL;
    }

    public void setTELEFONECOMERCIAL(String TELEFONECOMERCIAL) {
        this.TELEFONECOMERCIAL = TELEFONECOMERCIAL;
    }

    public String getRAMALCOMERCIAL() {
        return RAMALCOMERCIAL;
    }

    public void setRAMALCOMERCIAL(String RAMALCOMERCIAL) {
        this.RAMALCOMERCIAL = RAMALCOMERCIAL;
    }

    public String getDDDFAX() {
        return DDDFAX;
    }

    public void setDDDFAX(String DDDFAX) {
        this.DDDFAX = DDDFAX;
    }

    public String getTELEFONEFAX() {
        return TELEFONEFAX;
    }

    public void setTELEFONEFAX(String TELEFONEFAX) {
        this.TELEFONEFAX = TELEFONEFAX;
    }

    public Timestamp getDATACADASTRO() {
        return DATACADASTRO;
    }

    public void setDATACADASTRO(Timestamp DATACADASTRO) {
        this.DATACADASTRO = DATACADASTRO;
    }

    public String getPROFISSAO() {
        return PROFISSAO;
    }

    public void setPROFISSAO(String PROFISSAO) {
        this.PROFISSAO = PROFISSAO;
    }

    public String getNUMEROCNH() {
        return NUMEROCNH;
    }

    public void setNUMEROCNH(String NUMEROCNH) {
        this.NUMEROCNH = NUMEROCNH;
    }

    public String getREGISTROCNH() {
        return REGISTROCNH;
    }

    public void setREGISTROCNH(String REGISTROCNH) {
        this.REGISTROCNH = REGISTROCNH;
    }

    public String getCATEGORIACNH() {
        return CATEGORIACNH;
    }

    public void setCATEGORIACNH(String CATEGORIACNH) {
        this.CATEGORIACNH = CATEGORIACNH;
    }

    public Timestamp getVENCIMENTOCNH() {
        return VENCIMENTOCNH;
    }

    public void setVENCIMENTOCNH(Timestamp VENCIMENTOCNH) {
        this.VENCIMENTOCNH = VENCIMENTOCNH;
    }

    public Integer getECLIENTE() {
        return ECLIENTE;
    }

    public void setECLIENTE(Integer ECLIENTE) {
        this.ECLIENTE = ECLIENTE;
    }

    public Integer getETERCEIRO() {
        return ETERCEIRO;
    }

    public void setETERCEIRO(Integer ETERCEIRO) {
        this.ETERCEIRO = ETERCEIRO;
    }

    public Integer getEMOTORISTA() {
        return EMOTORISTA;
    }

    public void setEMOTORISTA(Integer EMOTORISTA) {
        this.EMOTORISTA = EMOTORISTA;
    }

    public Integer getEVITIMA() {
        return EVITIMA;
    }

    public void setEVITIMA(Integer EVITIMA) {
        this.EVITIMA = EVITIMA;
    }

    public Integer getEFUNCIONARIO() {
        return EFUNCIONARIO;
    }

    public void setEFUNCIONARIO(Integer EFUNCIONARIO) {
        this.EFUNCIONARIO = EFUNCIONARIO;
    }

    public Integer getESUGURADORA() {
        return ESUGURADORA;
    }

    public void setESUGURADORA(Integer ESUGURADORA) {
        this.ESUGURADORA = ESUGURADORA;
    }

    public String getESTADO_CIVIL() {
        return ESTADO_CIVIL;
    }

    public void setESTADO_CIVIL(String ESTADO_CIVIL) {
        this.ESTADO_CIVIL = ESTADO_CIVIL;
    }

    public Integer getEOFICINA() {
        return EOFICINA;
    }

    public void setEOFICINA(Integer EOFICINA) {
        this.EOFICINA = EOFICINA;
    }

    public Integer getEFORNECEDOR() {
        return EFORNECEDOR;
    }

    public void setEFORNECEDOR(Integer EFORNECEDOR) {
        this.EFORNECEDOR = EFORNECEDOR;
    }

    public String getCOMPLEMENTO2() {
        return COMPLEMENTO2;
    }

    public void setCOMPLEMENTO2(String COMPLEMENTO2) {
        this.COMPLEMENTO2 = COMPLEMENTO2;
    }

    public String getOBSERVACAO() {
        return OBSERVACAO;
    }

    public void setOBSERVACAO(String OBSERVACAO) {
        this.OBSERVACAO = OBSERVACAO;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + (this.COD_CLIENTE != null ? this.COD_CLIENTE.hashCode() : 0);
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
        final CLIENTE other = (CLIENTE) obj;
        if (this.COD_CLIENTE != other.COD_CLIENTE && (this.COD_CLIENTE == null || !this.COD_CLIENTE.equals(other.COD_CLIENTE))) {
            return false;
        }
        return true;
    }

    
    
    
}
