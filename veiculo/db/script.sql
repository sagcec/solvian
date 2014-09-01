

CREATE SEQUENCE sc_solvian.sq_veiculo
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE sc_solvian.sq_veiculo
  OWNER TO postgres;


-- drop table sc_solvian.tb_veiculo;


CREATE TABLE sc_solvian.tb_veiculo
(
  pk_veiculo integer NOT NULL DEFAULT nextval('sc_solvian.sq_veiculo'::regclass),
  chassi character varying(17),
  cor character varying(40),
  potencia_motor character varying(4),
  cilindradas character varying(4),
  peso_liquido character varying(9),
  peso_bruto character varying(9),
  numero_serie character varying(9),
  tipo_combustivel character varying(2),
  numero_motor character varying(21),
  capacidade_maxima_tracao character varying(9),
  distancia_eixos character varying(4),
  ano_modelo character(4),
  ano_fabricacao character(4),
  tipo_pintura character varying(2),
  tipo_veiculo character varying(2),
  especie_veiculo character(1),
  condicao_vin character(1),
  condicao_veiculo character(1),
  codigo_marca_modelo character varying(6),
  lotacao integer,
  restricao character(1),
  sn_ativo boolean DEFAULT true,
  CONSTRAINT ctt_veiculo_pk PRIMARY KEY (pk_veiculo),
  CONSTRAINT ctt_cidadao_ck001 CHECK (sn_ativo = ANY (ARRAY[true, false]))
)
WITH (
  OIDS=FALSE
);
ALTER TABLE sc_solvian.tb_veiculo
  OWNER TO postgres;
