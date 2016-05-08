import java.io.Serializable;



public class Questionario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	
	private String categoria;
    private String pergunta;
    private String resposta;
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}


	public Integer getCodigo() {
		return codigo;
	}
}