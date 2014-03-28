insert into Tm_Clasificacion values
('Productos Farmaceuticos',0,0,0,'U01','U01'),
('Dispositivos Médicos',0,0,0,'U01','U01'),
('Productos Sanitarios',0,0,0,'U01','U01'),
('Establecimientos Farmaceuticos',0,0,0,'U01','U01'),
('Aduana',0,0,0,'U01','U01'),
('Cenadim',0,0,0,'U01','U01'),
('Productos Controlados',0,0,0,'U01','U01')
select * from Tm_Clasificacion

insert into Tm_Tipo values
(0,0,0,'U01','U01',1,'Productos Farmaceuticos')
select * from Tm_Tipo

insert into Tm_MotivoConsulta values
('Toma de desiciones',0,0,0,'U01','U01'),
('Prescripción / Dispensación / Aplicación de medicamento',0,0,0,'U01','U01'),
('Uso adecuado de medicamento',0,0,0,'U01','U01'),
('Apoyo a la investigación',0,0,0,'U01','U01'),
('Obtención de Registro Sanitario',0,0,0,'U01','U01'),
('Información sobre reglamentación',0,0,0,'U01','U01'),
('Obtención de Certificado de Registro Sanitario',0,0,0,'U01','U01'),
('¿Está sujeto a Registro Sanitario otorgado por DIGEMID?',0,0,0,'U01','U01'),
('Sobre normativa relacionada',0,0,0,'U01','U01'),
('Desaduanaje',0,0,0,'U01','U01'),
('Otros',0,0,0,'U01','U01')
select * from Tm_MotivoConsulta

insert into Tm_TipoInstitucion values
('DIGEMID',0,0,0,'U01','U01'),
('ESSALUD',0,0,0,'U01','U01'),
('FUERZAS ARMADAS Y POLICIALES',0,0,0,'U01','U01'),
('DISA/DIRESA/GERESA',0,0,0,'U01','U01'),
('LABORATORIO',0,0,0,'U01','U01'),
('FARMACIA, BOTICA, SERVICIO DE FARMACIA',0,0,0,'U01','U01'),
('DROGUERÍA',0,0,0,'U01','U01'),
('CLINICA',0,0,0,'U01','U01'),
('OTRAS ENTIDADES PÚBLICAS',0,0,0,'U01','U01'),
('MINISTERIO DE SALUD',0,0,0,'U01','U01'),
('UNIVERSIDAD / INSTITUTO',0,0,0,'U01','U01'),
('OTROS',0,0,0,'U01','U01'),
('ADUANA-MARITIMA/AEREA/POSTAL/INTA',0,0,0,'U01','U01')
select * from Tm_TipoInstitucion

insert into Tm_TipoSolicitante values
('QUIMICO FARMACEUTICO',0,0,0,'U01','U01'),
('MÉDICO',0,0,0,'U01','U01'),
('OTROS',0,0,0,'U01','U01'),
('ESTUDIANTE',0,0,0,'U01','U01'),
('PACIENTE',0,0,0,'U01','U01'),
('OTROS PROFESIONALES DE LA SALUD',0,0,0,'U01','U01'),
('REPRESENTANTE LEGAL',0,0,0,'U01','U01')
select * from Tm_TipoSolicitante

insert into Tm_Entidad values
('Entidad 1',0,0,0,'U01','U01')
select * from Tm_Entidad

insert into Tm_MotivoNoAtencion values
('Motivo No Atencion 1',0,0,0,'U01','U01')

insert into Tm_EstadoCT values
('Generado',0,0,0,'U01','U01'),
('Asignado',0,0,0,'U01','U01'),
('En Proceso',0,0,0,'U01','U01'),
('Atendido',0,0,0,'U01','U01'),
('Observado',0,0,0,'U01','U01')

insert into Tm_MedioConsulta values
('WEB',0,0,'U01',0,'U01')

insert into Tm_Prioridad values
('Alta',0,0,'U01',0,'U01'),
('Media',0,0,'U01',0,'U01'),
('Baja',0,0,'U01',0,'U01')
select * from Tm_Prioridad

insert into Tm_MotivoObservacion values
('Observacion 1',0,0,0,'U01','U01',1)
select * from Tm_MotivoObservacion

insert into Tm_Usuario values
('U01','Taboada Ortecho','Carlos Abraham',0,0,0,0,'phpauldj','pauldj_9@hotmail.com','U01','U01'),
('U02','Casas Valerio','Susana',0,0,0,0,'suscava','susy_casas@gmail.com','U01','U01')
select * from Tm_Usuario

insert into Tt_ConsultaTecnica values
('Example Institution','NO/VUCE','AREA DE SISTEMAS','Taboada Casas','Paul Carlos','2603605','345-3948734',1,0,
'C0001DIG','pacharly89@gmail.com',4,6,0,0,'U01',0,'U01',0,1,'1234',1,1,0,1,1,1,2,2,'U02',
'Es la primera consulta técnica registrada para prueba',0,0,0,0,'45816432','10458164326',null)
select * from Tt_ConsultaTecnica

insert into Tt_ConsultaTecnica(
Institucion, Area, Apellidos, Nombres, Telefono, Fax, Id_Tipo, Email, Id_TipoSolicitante,
Id_MotivoConsulta, Id_TipoInstitucion, Id_MedioConsulta, Id_Clasificacion, Descripcion, DNI, RUC, 
FechaHoraRegistro,Flg_Origen, Id_EstadoCT, Id_Prioridad) values
(
'Example 2','Area de Gestion','Casas Valerio','Susana','2603695','213-4556432',1,'pauldj_9@hotmail.com',4,
6,1,1,1,'Un ejemplo para de prueba','23456789','10342873849',0,0,1,2
)
select Institucion, Area, Apellidos, Nombres, Telefono, Fax, Id_Tipo, Email, Id_TipoSolicitante,
Id_MotivoConsulta, Id_TipoInstitucion, Id_MedioConsulta, Id_Clasificacion, Descripcion, DNI, 
RUC, FechaHoraRegistro, Flg_Origen, Id_EstadoCT,Id_Prioridad from Tt_ConsultaTecnica