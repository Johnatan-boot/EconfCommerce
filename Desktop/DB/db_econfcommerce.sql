#criando o banco de Dados
create database econfcommerce;
#usando o banco de Dados
use econfcommerce;

#Criando a Tabela Usuarios
create table tbusuarios(
iduser int primary key,
usuario varchar(50) not null,
fone varchar(15),
login varchar(15) not null unique,
senha varchar(15)not null




);

#Criando a Tabela Clientes
create table tbclientes(
idcli int primary key auto_increment,
nomecli varchar(50) not null,
endcli varchar(100),
fonecli varchar(50) not null,
emailcli varchar(50),
cidade varchar(50),
estado varchar(50)


);

#Criando a Tabela Pedidos
create table tbpedidos(
pedidos int primary key auto_increment,
data_pedido timestamp default current_timestamp,

#campos que nao podem deixar de Preencher
produto varchar(150) not null,
preco_produto decimal(10,2) not null,
atendente varchar(150) not null,
idcli int not null,
#campos que nao podem deixar de Preencher

foreign key(idcli) references tbclientes(idcli)


);

#inserindo dados na tabela
insert into tbusuarios(iduser,usuario,fone,login,senha)
values(1, 'Fred','112222-2222','fred@123','adminfred');

insert into tbclientes(
nomecli,endcli,fonecli,
emailcli,cidade,estado)
values('joana','Rua da Joana','112324-5567','joana@mail.com','Embu','SP');

insert into tbpedidos(
produto,preco_produto,
atendente,idcli)values('Bolo de Chocolate',13.0,'Stuart Liron',1);
insert into tbpedidos(
produto,preco_produto,
atendente,idcli)values('Bolo de de Laranja',14.0,'Joardan',2);

#Selecionando Apresentando dados na tabela
select * from tbusuarios;
select * from tbclientes;
select * from tbpedidos;

#Descrevendo dados da tabela
describe tbusuarios;
describe tbclientes;
describe tbpedidos;

#trazendo informações de 2 tabelas Uniao
#Relatorio das 2 tabelas
select
P.pedidos,data_pedido,produto,preco_produto,atendente,
C.nomecli,fonecli,endcli,emailcli,cidade,estado
from tbpedidos as P
inner join tbclientes as C
on(P.idcli = C.idcli);

#Atualizando Modificando Campos na Tabela CRUD
#update tbusuarios set fone = '' where iduser = 2;

#Deletando tabelas
#drop table pedidos;