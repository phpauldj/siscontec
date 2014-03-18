use siscontecExa;

create table rol
(
	idRol integer identity primary key,
	nombre varchar(30),
	descrip varchar(300)
)
GO

insert into rol values 
('Jefe de Equipo','Dar visto bueno a la respuesta dada por el responsable a la consulta técnica. Reasignar la consulta de acuerdo a la observación del responsable'),
('Responsable','Persona que da respuesta a la consulta técnica realizada por el solicitante')
GO
---------------
create table administrador
(
	idAdmin integer identity,
	nombres varchar(30),
	apellidos varchar(30),
	usuario varchar(10),
	contrasena varchar(8),
	idRol integer,
	primary key (idAdmin),
	constraint fk_rol foreign key (idRol) 
	references rol(idRol)
)
GO

insert into administrador values
('Melissa','Ponce','JEMP087','123456',1),
('Paul','Taboada','RPT0439','654321',2),
('Victor','Ramos','JEVR904','123456',1)

select * from rol
select * from administrador