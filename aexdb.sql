create database aexdb;
use aexdb;
drop database aexdb;
drop table monitoria;
drop table atividade;
show tables;

create table usuario(
	id int not null primary key auto_increment,
    nome varchar(100),
    email varchar(100),
    senha varchar(40)
);

create table login(
	id int not null primary key auto_increment,
    email varchar(100),
    senha varchar(40),
    foreign key login(id) references usuario(id)
);

create table atividade(
	id int not null primary key auto_increment,
    nome varchar(150),
    locall varchar(200),
    dataa date,
    hora time
);

create table monitoria(
	id int not null primary key auto_increment,
	materia varchar(100),
    monitor varchar(100),
    locall varchar(150),
    dia varchar(100),
    hora time
);
create table solicitar_celula_pacce(
	id int not null primary key auto_increment,
    nome varchar(200),
    nome_articulador varchar(100),
    descricao varchar(1000),
    email varchar(100)
);

create table celula_pacce(
	id int not null primary key auto_increment,
	nome varchar(200),
	articulador varchar(100),
    locall varchar(200),
	dia varchar(100),
    hora time
);

create table esportes(
	id int not null primary key auto_increment,
    nome varchar(200),
    organizador varchar(200),
    locall varchar(200),
    dia varchar(100),
    hora time
);
select * from solicitar_celula_pacce;
select * from atividade;
delete from atividade where id=1;
/*esportes*/
insert into esportes(nome,organizador,locall,dia,hora) values
("Xadrez","Prof. Alexandre Arruda","Laboratio 02 - UFC Campus Russas", "Segunda e Quarta", "17:30:00");

insert into esportes(nome,organizador,locall,dia,hora) values
("Karatê","Prof. Daniel Siqueira", "Patio - UFC Campus Russas", "Segunda e Quarta", "18:00:00");

insert into esportes(nome,organizador,locall,dia,hora) values
("Jiu-Jitsu","Prof. Alexandre Arruda", "Patio - UFC Campus Russas", "Terça e Quinta", "18:30:00");


/*monitoria*/
insert into monitoria(materia,monitor,locall,dia,hora) values
("Estrutura de Dados Avançada","Pedro Leonardo","Sala de Monitoria", "Quarta", "08:00:00");	

insert into monitoria(materia,monitor,locall,dia,hora) values
("Projeto e Análise de Algoritmos","Leon","Sala de Estudo", "Terça e Quinta", "08:00:00");	

/*celula pacce*/
insert into celula_pacce(nome,articulador,locall,dia,hora) 
values ("Tecnicas de estudo de inglês","Ignacio","Sala 13 - UFC Campus Russas","Segunda", "08:00:00");

insert into celula_pacce(nome,articulador,locall,dia,hora) 
values ("Tecnicas de estudo de I.A","Roberspier","Sala 03 - UFC Campus Russas","Quarta e Sexta", "08:00:00");

insert into celula_pacce(nome,articulador,locall,dia,hora)
values ("Tecnicas de segurança da informacao", "Ronaldinho", "Sala 07 - UFC Campus Russas", "Quarta e Quinta", "15:00:00");

delete from atividade where id=3;
select * from solicitar_celula_pacce;
select * from usuario;
select * from atividade;