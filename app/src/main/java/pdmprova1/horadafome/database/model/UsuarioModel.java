package pdmprova1.horadafome.database.model;

import java.util.Date;

public class UsuarioModel {

    public static final String tabela = "tb_mesas";

    public static final String
    COLUNA_ID = "_id",
    COLUNA_NOME = "nome",
	COLUNA_TELEFONE = "telefone",
	COLUNA_HORA_DA_RESERVA = "hora_da_reserva",
    COLUNA_N_PESSOAS = "n_pessoas",
	COLUNA_AREA_EXTERNA = "area_externa",
	COLUNA_RODIZIO = "rodizio",
	COLUNA_LA_CARTE = "a_la_carte";

    public static final String
    CREATE_TABLE = "create table "+tabela
                    +" ( "
                    +COLUNA_ID+" integer primary key autoincrement, "
                    +COLUNA_NOME+" text not null, "
					+COLUNA_HORA_DA_RESERVA+" datetime not null, "
					+COLUNA_N_PESSOAS+" integer not null, "
					+COLUNA_AREA_EXTERNA+" boolean not null, "
					+COLUNA_RODIZIO+" boolean not null, "
					+COLUNA_LA_CARTE+" boolean not null, "
                    +COLUNA_TELEFONE+" text not null "
                    +" );";

    public static final String
    DROP_TABLE = "drop table if exists "+tabela+";";

    /**
     * ENCAPSULAMENTO.
     */

    private long id;
    private String nome;
    private String telefone;
	private Integer n_pessoas;
	private Date hora_da_reserva;
	private Boolean area_externa;
	private Boolean rodizio;
	private Boolean a_la_carte;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getN_pessoas() {
		return n_pessoas;
	}

	public void setN_pessoas(Integer n_pessoas) {
		this.n_pessoas = n_pessoas;
	}

	public Date getHora_da_reserva() {
		return hora_da_reserva;
	}

	public void setHora_da_reserva(Date hora_da_reserva) {
		this.hora_da_reserva = hora_da_reserva;
	}

	public Boolean getArea_externa() {
		return area_externa;
	}

	public void setArea_externa(Boolean area_externa) {
		this.area_externa = area_externa;
	}

	public Boolean getRodizio() {
		return rodizio;
	}

	public void setRodizio(Boolean rodizio) {
		this.rodizio = rodizio;
	}

	public Boolean getA_la_carte() {
		return a_la_carte;
	}

	public void setA_la_carte(Boolean a_la_carte) {
		this.a_la_carte = a_la_carte;
	}
//Gerar getters e setters aqui

}
