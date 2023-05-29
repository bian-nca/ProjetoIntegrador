------------------------------------ BANCO DE DADOS ---------------------------------------------


create database siscons;  /* NOSSO BANCO DE DADOS */
use siscons;         /*OBS: sempre devemos selecionar o banco de dados que estamos trabalhando*/

/*Criaremos agora nossa tabela de usuarios*/

create table usuarios(
    idusuario int primary key not null auto_increment,
    usuario varchar(30) not null,
    senha varchar(30) not null,
    gerencia char(1) not null,
    administrativo char(1) not null,
    operacional char(1) not null
);

desc usuarios;

+----------------+-------------+------+-----+---------+----------------+
| Field          | Type        | Null | Key | Default | Extra          |
+----------------+-------------+------+-----+---------+----------------+
| idusuario      | int         | NO   | PRI | NULL    | auto_increment |
| usuario        | varchar(30) | NO   |     | NULL    |                |
| senha          | varchar(30) | NO   |     | NULL    |                |
| gerencia       | char(1)     | NO   |     | NULL    |                |
| administrativo | char(1)     | NO   |     | NULL    |                |
| operacional    | char(1)     | NO   |     | NULL    |                |
+----------------+-------------+------+-----+---------+----------------+

CREATE TABLE pessoafisica(
        idpf INT PRIMARY KEY AUTO_INCREMENT,
        nome VARCHAR(200) NOT NULL unique,
        cpf varchar(20) not null,
        cep varchar(10),
        rua varchar(100),
        bairro varchar(100),
        numero varchar(8),
        pais varchar(70),
        estado varchar(20),
        cidade varchar(100),
        ibge varchar(8),
        telefone varchar(15),
        email varchar(100),
	nascimento VARCHAR(15)
    );

 desc pessoafisica;
+------------+--------------+------+-----+---------+----------------+
| Field      | Type         | Null | Key | Default | Extra          |
+------------+--------------+------+-----+---------+----------------+
| idpf       | int          | NO   | PRI | NULL    | auto_increment |
| nome       | varchar(200) | NO   | UNI | NULL    |                |
| cpf        | varchar(20)  | NO   |     | NULL    |                |
| cep        | varchar(10)  | YES  |     | NULL    |                |
| rua        | varchar(100) | YES  |     | NULL    |                |
| bairro     | varchar(100) | YES  |     | NULL    |                |
| numero     | varchar(8)   | YES  |     | NULL    |                |
| pais       | varchar(70)  | YES  |     | NULL    |                |
| estado     | varchar(20)  | YES  |     | NULL    |                |
| cidade     | varchar(100) | YES  |     | NULL    |                |
| ibge       | varchar(8)   | YES  |     | NULL    |                |
| telefone   | varchar(15)  | YES  |     | NULL    |                |
| email      | varchar(100) | YES  |     | NULL    |                |
| nascimento | varchar(15)  | YES  |     | NULL    |                |
+------------+--------------+------+-----+---------+----------------+


 CREATE TABLE pessoajuridica(
        idpj INT PRIMARY KEY AUTO_INCREMENT,
        razao VARCHAR(200) NOT NULL unique,
        fantasia varchar(200),
        cnpj varchar(20) not null,
        cep varchar(10),
        rua varchar(100),
        bairro varchar(100),
        numero varchar(10),
        pais varchar(70),
        estado varchar(20),
        cidade varchar(100),
        ibge varchar(10),
        telefone varchar(20),
        IE varchar(20),
        email varchar(100)
);

desc pessoajuridica;
+----------+--------------+------+-----+---------+----------------+
| Field    | Type         | Null | Key | Default | Extra          |
+----------+--------------+------+-----+---------+----------------+
| idpj     | int          | NO   | PRI | NULL    | auto_increment |
| razao    | varchar(200) | NO   | UNI | NULL    |                |
| fantasia | varchar(200) | YES  |     | NULL    |                |
| cnpj     | varchar(20)  | NO   |     | NULL    |                |
| cep      | varchar(10)  | YES  |     | NULL    |                |
| rua      | varchar(100) | YES  |     | NULL    |                |
| bairro   | varchar(100) | YES  |     | NULL    |                |
| numero   | varchar(10)  | YES  |     | NULL    |                |
| pais     | varchar(70)  | YES  |     | NULL    |                |
| estado   | varchar(20)  | YES  |     | NULL    |                |
| cidade   | varchar(100) | YES  |     | NULL    |                |
| ibge     | varchar(10)  | YES  |     | NULL    |                |
| telefone | varchar(20)  | YES  |     | NULL    |                |
| IE       | varchar(20)  | YES  |     | NULL    |                |
| email    | varchar(100) | YES  |     | NULL    |                |
+----------+--------------+------+-----+---------+----------------+

create table produtos(
    codigo int primary key,
    descricao varchar(100) not null,
    ncm varchar(40),
    cest varchar(40),
    tipo_item varchar(100),
    qtd_estoque int not null,
    unidade varchar(50),
    marca varchar(100),
    vlr_custo float,
    vlr_venda_vista float,
    vlr_venda_prazo float
);


desc produtos;

+-----------------+--------------+------+-----+---------+----------------+
| Field           | Type         | Null | Key | Default | Extra          |
+-----------------+--------------+------+-----+---------+----------------+
| codigo          | int          | NO   | PRI | NULL    | auto_increment |
| descricao       | varchar(100) | NO   |     | NULL    |                |
| ncm             | int          | YES  |     | NULL    |                |
| cest            | int          | YES  |     | NULL    |                |
| tipo_item       | varchar(100) | YES  |     | NULL    |                |
| qtd_estoque     | int          | NO   |     | NULL    |                |
| unidade         | varchar(50)  | YES  |     | NULL    |                |
| marca           | varchar(100) | YES  |     | NULL    |                |
| vlr_custo       | float        | YES  |     | NULL    |                |
| vlr_venda_vista | float        | YES  |     | NULL    |                |
| vlr_venda_prazo | float        | YES  |     | NULL    |                |
+-----------------+--------------+------+-----+---------+----------------+


create table pagamentos(
    codigo int primary key not null auto_increment,
    descricao varchar(100) not null
);


 desc pagamentos;
+-----------+--------------+------+-----+---------+----------------+
| Field     | Type         | Null | Key | Default | Extra          |
+-----------+--------------+------+-----+---------+----------------+
| codigo    | int          | NO   | PRI | NULL    | auto_increment |
| descricao | varchar(100) | NO   |     | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+


/*Criando tabela de bancos*/


create table bancos(
    codbanco int primary key not null auto_increment,
    descricao varchar(100) not null,
    telefone varchar(20),
    cep varchar(10),
    endereco varchar(200),
    cidade varchar(100),
    estado char(2)
);

 desc bancos;
+-----------+--------------+------+-----+---------+----------------+
| Field     | Type         | Null | Key | Default | Extra          |
+-----------+--------------+------+-----+---------+----------------+
| codbanco  | int          | NO   | PRI | NULL    | auto_increment |
| descricao | varchar(100) | NO   |     | NULL    |                |
| telefone  | varchar(20)  | YES  |     | NULL    |                |
| cep       | varchar(10)  | YES  |     | NULL    |                |
| endereco  | varchar(200) | YES  |     | NULL    |                |
| cidade    | varchar(100) | YES  |     | NULL    |                |
| estado    | char(2)      | YES  |     | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+


create table vendedores(
	idvendedor int primary key auto_increment not null,
	nome varchar(100) not null
);

desc vendedores;
+------------+--------------+------+-----+---------+----------------+
| Field      | Type         | Null | Key | Default | Extra          |
+------------+--------------+------+-----+---------+----------------+
| idvendedor | int          | NO   | PRI | NULL    | auto_increment |
| nome       | varchar(100) | NO   |     | NULL    |                |
+------------+--------------+------+-----+---------+----------------+

/* criando tabela para cadastrar a empresa */

create table EMPRESA(
  idempresa int primary key not null,
  descricao varchar(100) not null,
  fantasia varchar(100),
  CNPJ varchar(20) not null,
  CEP varchar(10),
  rua varchar(40),
  numero int(5),
  bairro varchar(40),
  cidade varchar(40),
  estado char(2),
  complemento varchar(100),
  IBGE varchar(10),
  inscricao varchar(20),
  regimetrib varchar(100) not null,
  telefone varchar(20)
 );

/*criando tabela para cadastro de centro de custo*/

create table centrocusto(
    codigo int primary key,
    descricao varchar(200) not null,
    observacao varchar(300)
);


/*modulo de vendas*/

> tabela para informações mais importantes

create table vendas(
	idvenda int primary key,
	datavenda varchar(11),
	id_cliente int,
	nome_cli varchar(200),
	rua varchar(100),
	bairro varchar(100),
	numero varchar(8),
	cidade varchar(100),
	id_vendedor int,
	nomevend varchar(100),
	valor_wth_desc DECIMAL(10,2),
	desconto DECIMAL(10,2),
	vlr_total DECIMAL(10,2),
    cancelada varchar(5),
    faturada varchar(100),

	FOREIGN KEY(id_cliente)
	REFERENCES PESSOAFISICA(idpf),

	FOREIGN KEY(id_vendedor)
	REFERENCES VENDEDORES(idvendedor)

);

desc vendas;
+----------------+--------------+------+-----+---------+----------------+
| Field          | Type         | Null | Key | Default | Extra          |
+----------------+--------------+------+-----+---------+----------------+
| idvenda        | int          | NO   | PRI | NULL    |                |
| datavenda      | date         | YES  |     | NULL    |                |
| id_cliente     | int          | YES  |     | NULL    |                |
| nome_cli       | varchar(200) | YES  |     | NULL    |                |
| rua            | varchar(100) | YES  |     | NULL    |                |
| bairro         | varchar(100) | YES  |     | NULL    |                |
| numero         | varchar(8)   | YES  |     | NULL    |                |
| cidade         | varchar(100) | YES  |     | NULL    |                |
| id_vendedor    | int          | YES  |     | NULL    |                |
| nomevend       | varchar(100) | YES  |     | NULL    |                |
| valor_wth_desc | float        | YES  |     | NULL    |                |
| desconto       | float        | YES  |     | NULL    |                |
| vlr_total      | float        | YES  |     | NULL    |                |
+----------------+--------------+------+-----+---------+----------------+


criando a tabela que irá salvar os produtos da minha venda respectiva da consulta

create table vendasprod(
    idvedprods int primary key auto_increment,
    id_venda int,
    codprod int,
    descprod varchar(200),
    qtdprod int,
    vlrunitprod DECIMAL(10,2),
    totalprod DECIMAL(10,2),

    FOREIGN KEY(id_venda)
	REFERENCES VENDAS(idvenda),

	FOREIGN KEY(codprod)
	REFERENCES PRODUTOS(codigo)
);

 desc vendasprod;
+-------------+--------------+------+-----+---------+----------------+
| Field       | Type         | Null | Key | Default | Extra          |
+-------------+--------------+------+-----+---------+----------------+
| idvedprods  | int          | NO   | PRI | NULL    | auto_increment |
| id_venda    | int          | YES  | MUL | NULL    |                |
| codprod     | int          | YES  | MUL | NULL    |                |
| descprod    | varchar(200) | YES  |     | NULL    |                |
| qtdprod     | int          | YES  |     | NULL    |                |
| vlrunitprod | float        | YES  |     | NULL    |                |
| totalprod   | float        | YES  |     | NULL    |                |
+-------------+--------------+------+-----+---------+----------------+

//criando tabela de entrada de qtd_estoque

create table ent_est(
    identradaest int primary key,
	datavenda varchar(11),
	id_fornecedor int,
	fornecedor varchar(200),
	id_vend int,
    name_vend varchar(100),
    justificativa varchar(500),
    cancelada varchar(100),
    datahora TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

	FOREIGN KEY(id_fornecedor)
	REFERENCES PESSOAJURIDICA(idpj),

	FOREIGN KEY(id_vend)
	REFERENCES VENDEDORES(idvendedor)
);


+---------------+--------------+------+-----+-------------------+-------------------+
| Field         | Type         | Null | Key | Default           | Extra             |
+---------------+--------------+------+-----+-------------------+-------------------+
| identradaest  | int          | NO   | PRI | NULL              |                   |
| datavenda     | varchar(11)  | YES  |     | NULL              |                   |
| id_fornecedor | int          | YES  | MUL | NULL              |                   |
| fornecedor    | varchar(200) | YES  |     | NULL              |                   |
| id_vend       | int          | YES  | MUL | NULL              |                   |
| name_vend     | varchar(100) | YES  |     | NULL              |                   |
| situacao      | varchar(100) | YES  |     | NULL              |                   |
| datahora      | timestamp    | YES  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
+---------------+--------------+------+-----+-------------------+-------------------+

//criando tabela do produtos que foram inseridos na entrada de estoque.
cod, desc, saldo atual do estoque, quantidade a ser acrescentada, justificativa


create table entraest_prods(
	identr_est_prod int primary key auto_increment,
	id_entrest int,
	codprod int,
	descprod varchar(200),
	saldoanterior int,
	qtdprod int,
    datahora TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

	FOREIGN KEY(id_entrest)
	REFERENCES ENT_EST(identradaest)
);

  

saida de estoque: tabela

create table saida_est(
    id int primary key,
	datasaida varchar(11),
	id_fornecedor int,
	fornecedor varchar(200),
	id_vend int,
    name_vend varchar(100),
    justificativa varchar(500),
    cancelada varchar(100),
    datahora TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

	FOREIGN KEY(id_fornecedor)
	REFERENCES PESSOAJURIDICA(idpj),

	FOREIGN KEY(id_vend)
	REFERENCES VENDEDORES(idvendedor)
);


saida de estoque com os respectivos produtos

create table saida_prods(
	idsaidaprods int primary key auto_increment,
	id_saida int,
	codprod int,
	descprod varchar(200),
	saldoanterior int,
	qtdprod int,
    datahora TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

	FOREIGN KEY(id_saida)
	REFERENCES saida_est(ID)
);

//criando tabela das informações do meu faturamento

create table faturamento (
    idfatura int primary key auto_increment,
    idpedido int,
    idcli int,
    nomecli varchar(200),
    datafaturamento varchar(100),
    vlrpagar decimal(10,2),
    idformapag int,
    descformapag varchar(100),
    qtdparcelas int,
    vencimentodias int,
    numeroparcelas int,
    vlrparcela Decimal(10,2),
    datavencimentoparcela varchar(100),
    situacao varchar(100),
    vlrpago decimal(10,2),
    vlrapagar decimal(10,2),

    FOREIGN KEY(idpedido)
    REFERENCES VENDAS(idvenda),

    FOREIGN KEY(idcli)
    REFERENCES PESSOAFISICA(idpf),
    
    FOREIGN KEY(idformapag)
    REFERENCES PAGAMENTOS(codigo)

);


create table entrapag(
    idcc int,
    idped int,
    desccc varchar(100),
    dataentrada varchar(100),
    valorentr decimal(10,2),

    FOREIGN KEY(idcc)
    REFERENCES centrocusto(codigo),

    FOREIGN KEY(idped)
    REFERENCES VENDAS(idvenda)
);