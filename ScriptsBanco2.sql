------------------------------------ BANCO DE DADOS ---------------------------------------------


create database siscons;
use siscons;

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
     codigo int primary key auto_increment,
    descricao varchar(100) not null,
    ncm int(8),
    cest int(8),
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