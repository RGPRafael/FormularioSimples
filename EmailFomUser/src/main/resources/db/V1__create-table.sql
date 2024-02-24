/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  rafael
 * Created: 21 de fev. de 2024
 */
create table Usuarios(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null,
    primary key(id)

);
