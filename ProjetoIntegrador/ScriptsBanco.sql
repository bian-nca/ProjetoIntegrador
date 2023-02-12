create database siscons;
use siscons;
show tables;



/*cadastros conexões 

Empresa =
Usuarios = ok
Bancos = ok
Marcas = ok
Produtos = 
Operações =
Rubrica = 
Tipo de clientes = 
Centro de Custos = 
Clientes | Fornencedores = 
*/



CREATE TABLE usuarios(
        idusuario INT PRIMARY KEY AUTO_INCREMENT,
        usuario VARCHAR(30) NOT NULL,
        senha VARCHAR(30) NOT NULL,
        gerencia CHAR(1) NOT NULL,
        administrativo CHAR(1) NOT NULL,
        operacional CHAR(1) NOT NULL
    );
    

create table marca(
	idmarca int primary key,
    descricao varchar(100) not null
);


create table bancos (
    codbanco int primary key AUTO_INCREMENT,   /*CodBanco, Descbanco, Fonebanco, Enderbanco, Cepbanco, CidadeBanco, EstadoBanco */
    descricao varchar(100) not null,
    telefone varchar(20),
    cep varchar(10), 
    endereco varchar(200),
    cidade varchar(100),
    estado char(2)
);

create table rubrica(
    codrubrica int primary key,
    descricao varchar(100) not null,
    caracterisitca char(1) not null /*para saber se é credito (C) ou debito (D) */
); /* AINDA NÃO FIZ */

create tabel tipofiscais(
    idtf int primary key,
    desctf varchar(100) not null
);



-------------DEMONSTRAÇÃO---------------------------

--- 01) Tentem fazer um cadastro utilizando o próprio programa, não façam pelo workbench.

Enter password: ****
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 103
Server version: 8.0.31 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use siscons;
Database changed
mysql> show tables;
+-------------------+
| Tables_in_siscons |
+-------------------+
| bancos            |
| marca             |
| tipofiscais       |
| usuarios          |
+-------------------+
4 rows in set (0.01 sec)

mysql> select * from bancos;
+----------+-----------+----------+----------+----------------------+----------+--------+
| codbanco | descricao | telefone | cep      | endereco             | cidade   | estado |
+----------+-----------+----------+----------+----------------------+----------+--------+
|        1 | SICOOB    |          | 38440042 | Avenida Minas Gerais | Araguari | MG     |
+----------+-----------+----------+----------+----------------------+----------+--------+
1 row in set (0.01 sec)

mysql> select * from marca;
+---------+-----------+
| idmarca | descricao |
+---------+-----------+
|       1 | CHANNEL   |
+---------+-----------+
1 row in set (0.00 sec)

mysql> select * from tipofiscais;
+------+---------+
| idtf | desctf  |
+------+---------+
|    1 | CLIENTE |
+------+---------+
1 row in set (0.00 sec)

mysql> select * from usuarios;
+-----------+---------+-------+----------+----------------+-------------+
| idusuario | usuario | senha | gerencia | administrativo | operacional |
+-----------+---------+-------+----------+----------------+-------------+
|         1 | bianca  | senha | s        | s              | s           |
+-----------+---------+-------+----------+----------------+-------------+
1 row in set (0.00 sec)

mysql>












drop table CLIENTES;
select * from usuarios;
insert into usuarios values (null , 'bianca', 'senha', 'S', 'S', 'S'); /*SÓ PARA DEMONSTRAÇÃO ESSA TELA */

update usuarios
set gerencia = 's', administrativo = 's', operacional = 's'
where idusuario =1;

update marca
set descricao = "CHANNEL"
where idmarca = 1;

select * from marca;

INSERT INTO MARCA VALUES(null, 'drogaria popular');  /*APENAS UM EXEMPLO FEITO NO BANCO DE DADOS*/
