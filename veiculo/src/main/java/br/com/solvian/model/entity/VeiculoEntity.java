package br.com.solvian.model.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.annotations.Proxy;

import br.com.solvian.control.enumeration.TipoCombustivelEn;
import br.com.solvian.control.enumeration.TipoPinturaEn;
import br.com.solvian.control.enumeration.TipoVeiculoEn;

/**
 * 
 * @author Gutemberg A Da Silva
 * 
 */

@Entity
@Table(schema = "sc_solvian", name = "tb_veiculo")
@XmlRootElement
@Proxy(lazy = false)
public class VeiculoEntity extends AbstractEntity<Long> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "pk_veiculo", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sc_solvian.sq_veiculo")
	@SequenceGenerator(name = "sc_solvian.sq_veiculo", sequenceName = "sc_solvian.sq_veiculo", allocationSize = 1, initialValue = 0)
	@Basic(optional = false)
	private Long id;

	@Column(name = "chassi")
	private String chassi = "";

	@Column(name = "cor")
	private String cor = "";

	@Column(name = "potencia_motor")
	private String potenciaMotor = "";

	@Column(name = "cilindradas")
	private String cilindradas = "";

	@Column(name = "peso_liquido")
	private String pesoLiquido = "";

	@Column(name = "peso_bruto")
	private String pesoBruto = "";

	@Column(name = "numero_serie")
	private String numeroSerie = "";

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_combustivel")
	private TipoCombustivelEn tipoCombustivel;

	@Column(name = "numero_motor")
	private String numeroMotor = "";

	@Column(name = "capacidade_maxima_tracao")
	private String capacidadeMaximaTracao = "";

	@Column(name = "distancia_eixos")
	private String distanciaEixos = "";

	@Column(name = "ano_modelo")
	private String anoModelo = "";

	@Column(name = "ano_fabricacao")
	private String anoFabricacao = "";

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_pintura")
	private TipoPinturaEn tipoPintura;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_veiculo")
	private TipoVeiculoEn tipoVeiculo;

	@Column(name = "especie_veiculo")
	private String especieVeiculo = "";

	@Column(name = "condicao_vin")
	private String condicaoVin = "";

	@Column(name = "condicao_veiculo")
	private String condicaoVeiculo = "";

	@Column(name = "codigo_marca_modelo")
	private String codigoMarcaModelo = "";

	@Column(name = "lotacao")
	private Integer lotacao = new Integer(0);

	/**
	 * REFERENCIA - FK
	 */

	/**
	 * REFERENCIA - LIST
	 */

	/**
	 * TRANSIENT
	 */

	/**
	 * CONSTRUTOR
	 */

	public VeiculoEntity() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * GETS AND SETS
	 */

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(String potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	public String getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(String cilindradas) {
		this.cilindradas = cilindradas;
	}

	public String getPesoLiquido() {
		return pesoLiquido;
	}

	public void setPesoLiquido(String pesoLiquido) {
		this.pesoLiquido = pesoLiquido;
	}

	public String getPesoBruto() {
		return pesoBruto;
	}

	public void setPesoBruto(String pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public TipoCombustivelEn getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(TipoCombustivelEn tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getNumeroMotor() {
		return numeroMotor;
	}

	public void setNumeroMotor(String numeroMotor) {
		this.numeroMotor = numeroMotor;
	}

	public String getCapacidadeMaximaTracao() {
		return capacidadeMaximaTracao;
	}

	public void setCapacidadeMaximaTracao(String capacidadeMaximaTracao) {
		this.capacidadeMaximaTracao = capacidadeMaximaTracao;
	}

	public String getDistanciaEixos() {
		return distanciaEixos;
	}

	public void setDistanciaEixos(String distanciaEixos) {
		this.distanciaEixos = distanciaEixos;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public TipoPinturaEn getTipoPintura() {
		return tipoPintura;
	}

	public void setTipoPintura(TipoPinturaEn tipoPintura) {
		this.tipoPintura = tipoPintura;
	}

	public TipoVeiculoEn getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(TipoVeiculoEn tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getEspecieVeiculo() {
		return especieVeiculo;
	}

	public void setEspecieVeiculo(String especieVeiculo) {
		this.especieVeiculo = especieVeiculo;
	}

	public String getCondicaoVin() {
		return condicaoVin;
	}

	public void setCondicaoVin(String condicaoVin) {
		this.condicaoVin = condicaoVin;
	}

	public String getCondicaoVeiculo() {
		return condicaoVeiculo;
	}

	public void setCondicaoVeiculo(String condicaoVeiculo) {
		this.condicaoVeiculo = condicaoVeiculo;
	}

	public String getCodigoMarcaModelo() {
		return codigoMarcaModelo;
	}

	public void setCodigoMarcaModelo(String codigoMarcaModelo) {
		this.codigoMarcaModelo = codigoMarcaModelo;
	}

	public Integer getLotacao() {
		return lotacao;
	}

	public void setLotacao(Integer lotacao) {
		this.lotacao = lotacao;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}