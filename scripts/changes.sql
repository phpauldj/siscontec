use trabajo

select tc.UsuarioRegistro, tc.* from Tt_ConsultaTecnica tc

alter table Tm_Usuario 
	add Contrasenia varchar(12) null
update Tm_Usuario 
	set Contrasenia = '12345' where Id_Usuario = 'U01'
select * from Tm_Usuario

select * from EMPLEADO
select * from Tm_UsuarioPerfil