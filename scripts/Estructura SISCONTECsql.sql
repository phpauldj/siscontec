USE [trabajo]
GO
/****** Object:  Table [dbo].[Tm_Usuario]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tm_Usuario](
	[Id_Usuario] [char](4) NOT NULL,
	[Apellidos] [varchar](100) NULL,
	[Nombres] [varchar](100) NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[FechaHoraModificacion] [int] NULL,
	[Eliminado] [bit] NOT NULL,
	[Area] [smallint] NULL,
	[Login] [varchar](15) NULL,
	[Email] [varchar](40) NULL,
	[UsuarioRegistro] [char](4) NULL,
	[UsuarioModificacion] [char](4) NULL,
 CONSTRAINT [XPKTm_Usuario] PRIMARY KEY CLUSTERED 
(
	[Id_Usuario] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tm_Perfil]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tm_Perfil](
	[Id_Perfil] [smallint] IDENTITY(1,1) NOT NULL,
	[Descripcion] [varchar](100) NOT NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[FechaHoraModificacion] [int] NULL,
	[Eliminado] [bit] NOT NULL,
 CONSTRAINT [XPKTm_Perfil] PRIMARY KEY CLUSTERED 
(
	[Id_Perfil] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tm_UsuarioPerfil]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tm_UsuarioPerfil](
	[Id_Perfil] [smallint] NOT NULL,
	[Id_Usuario] [char](4) NOT NULL,
	[Eliminado] [bit] NULL,
	[FechaHoraRegistro] [int] NULL,
	[UsuarioRegistro] [char](4) NULL,
	[FechaHoraModificacion] [int] NULL,
	[UsuarioModificacion] [char](4) NULL,
 CONSTRAINT [XPKTm_UsuarioPerfil] PRIMARY KEY CLUSTERED 
(
	[Id_Perfil] ASC,
	[Id_Usuario] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tm_Clasificacion]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tm_Clasificacion](
	[Id_Clasificacion] [smallint] IDENTITY(1,1) NOT NULL,
	[Descripcion] [varchar](100) NOT NULL,
	[Eliminado] [bit] NOT NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[FechaHoraModificacion] [int] NULL,
	[UsuarioRegistro] [char](4) NOT NULL,
	[UsuarioModificacion] [char](4) NULL,
 CONSTRAINT [XPKTm_Clasificacion] PRIMARY KEY CLUSTERED 
(
	[Id_Clasificacion] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tm_Tipo]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tm_Tipo](
	[Id_Tipo] [smallint] IDENTITY(1,1) NOT NULL,
	[Eliminado] [bit] NOT NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[FechaHoraModificacion] [int] NULL,
	[UsuarioRegistro] [char](4) NOT NULL,
	[UsuarioModificacion] [char](4) NULL,
	[Id_Clasificacion] [smallint] NOT NULL,
	[Descripcion] [varchar](100) NOT NULL,
 CONSTRAINT [XPKTm_Tipo] PRIMARY KEY CLUSTERED 
(
	[Id_Tipo] ASC,
	[Id_Clasificacion] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tt_GrupoUsuario]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tt_GrupoUsuario](
	[Id_GrupoUsuario] [int] IDENTITY(1,1) NOT NULL,
	[Eliminado] [bit] NOT NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[FechaHoraModificacion] [int] NULL,
	[UsuarioRegistro] [char](4) NOT NULL,
	[UsuarioModificacion] [char](4) NULL,
	[Id_Tipo] [smallint] NULL,
	[Flg_AdmGrupo] [char](1) NULL,
	[Id_Clasificacion] [smallint] NULL,
	[Id_Perfil] [smallint] NULL,
	[Id_Usuario] [char](4) NULL,
	[ContadorAsignacion] [int] NOT NULL,
 CONSTRAINT [XPKTt_GrupoUsuario] PRIMARY KEY CLUSTERED 
(
	[Id_GrupoUsuario] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tm_TipoInstitucion]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tm_TipoInstitucion](
	[Id_TipoInstitucion] [smallint] IDENTITY(1,1) NOT NULL,
	[Descripcion] [varchar](100) NOT NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[FechaHoraModificacion] [int] NULL,
	[Eliminado] [bit] NOT NULL,
	[UsuarioRegistro] [char](4) NOT NULL,
	[UsuarioModificacion] [char](4) NULL,
 CONSTRAINT [XPKTm_TipoInstitucion] PRIMARY KEY CLUSTERED 
(
	[Id_TipoInstitucion] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tm_TipoSolicitante]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tm_TipoSolicitante](
	[Id_TipoSolicitante] [smallint] IDENTITY(1,1) NOT NULL,
	[Descripcion] [varchar](100) NOT NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[FechaHoraModificacion] [int] NULL,
	[Eliminado] [bit] NOT NULL,
	[UsuarioRegistro] [char](4) NOT NULL,
	[UsuarioModificacion] [char](4) NULL,
 CONSTRAINT [XPKTm_TipoSolicitante] PRIMARY KEY CLUSTERED 
(
	[Id_TipoSolicitante] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tm_Entidad]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tm_Entidad](
	[Id_Entidad] [smallint] IDENTITY(1,1) NOT NULL,
	[Descripcion] [varchar](100) NOT NULL,
	[Eliminado] [bit] NOT NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[FechaHoraModificacion] [int] NULL,
	[UsuarioRegistro] [char](4) NOT NULL,
	[UsuarioModificacion] [char](4) NULL,
 CONSTRAINT [XPKTm_Entidad] PRIMARY KEY CLUSTERED 
(
	[Id_Entidad] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tm_EstadoCT]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tm_EstadoCT](
	[Id_EstadoCT] [smallint] IDENTITY(1,1) NOT NULL,
	[Descripcion] [varchar](100) NOT NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[FechaHoraModificacion] [int] NULL,
	[Elimado] [bit] NOT NULL,
	[UsuarioRegistro] [char](4) NOT NULL,
	[UsuarioModificacion] [char](4) NULL,
 CONSTRAINT [XPKTm_EstadoCT] PRIMARY KEY CLUSTERED 
(
	[Id_EstadoCT] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tm_MedioConsulta]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tm_MedioConsulta](
	[Id_MedioConsulta] [smallint] IDENTITY(1,1) NOT NULL,
	[Descripcion] [varchar](100) NULL,
	[Eliminado] [bit] NOT NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[UsuarioRegistro] [char](4) NOT NULL,
	[FechaHoraModificacion] [int] NULL,
	[UsuarioModificacion] [char](4) NULL,
 CONSTRAINT [XPKTm_MedioConsulta] PRIMARY KEY CLUSTERED 
(
	[Id_MedioConsulta] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tm_MotivoConsulta]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tm_MotivoConsulta](
	[Id_MotivoConsulta] [smallint] IDENTITY(1,1) NOT NULL,
	[Descripcion] [varchar](100) NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[FechaHoraModificacion] [int] NULL,
	[Eliminado] [bit] NOT NULL,
	[UsuarioRegistro] [char](4) NOT NULL,
	[UsuarioModificacion] [char](4) NULL,
 CONSTRAINT [XPKTm_MotivoConsulta] PRIMARY KEY CLUSTERED 
(
	[Id_MotivoConsulta] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tm_MotivoNoAtencion]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tm_MotivoNoAtencion](
	[Id_MotivoNoAtencion] [smallint] IDENTITY(1,1) NOT NULL,
	[Descripcion] [varchar](100) NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[FechaHoraModificacion] [int] NULL,
	[Eliminado] [bit] NOT NULL,
	[UsuarioRegistro] [char](4) NULL,
	[UsuarioModificacion] [char](4) NULL,
 CONSTRAINT [XPKTm_MotivoNoAtencion] PRIMARY KEY CLUSTERED 
(
	[Id_MotivoNoAtencion] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tm_MotivoObservacion]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tm_MotivoObservacion](
	[Id_MotivoObservacion] [smallint] IDENTITY(1,1) NOT NULL,
	[Descripcion] [varchar](100) NOT NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[FechaHoraModificacion] [int] NULL,
	[Eliminado] [bit] NOT NULL,
	[UsuarioRegistro] [char](4) NOT NULL,
	[UsuarioModificacion] [char](4) NULL,
	[Flg_Tipo] [char](1) NOT NULL,
 CONSTRAINT [XPKTm_MotivoObservacion] PRIMARY KEY CLUSTERED 
(
	[Id_MotivoObservacion] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tm_Prioridad]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tm_Prioridad](
	[Id_Prioridad] [smallint] IDENTITY(1,1) NOT NULL,
	[Descripcion] [varchar](100) NOT NULL,
	[Eliminado] [bit] NOT NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[UsuarioRegistro] [char](4) NOT NULL,
	[FechaHoraModificacion] [int] NULL,
	[UsuarioModificacion] [char](4) NULL,
 CONSTRAINT [XPKTm_Prioridad] PRIMARY KEY CLUSTERED 
(
	[Id_Prioridad] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tm_Parametro]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tm_Parametro](
	[Id_Parametro] [smallint] IDENTITY(1,1) NOT NULL,
	[Codigo] [varchar](10) NOT NULL,
	[Descripcion] [varchar](100) NULL,
	[Valor] [int] NOT NULL,
	[Eliminado] [bit] NOT NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[UsuarioRegistro] [char](4) NOT NULL,
	[FechaHoraModificacion] [int] NULL,
	[UsuarioModificacion] [char](4) NULL,
 CONSTRAINT [PK_Tm_Parametro] PRIMARY KEY CLUSTERED 
(
	[Id_Parametro] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tt_ConsultaTecnica]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tt_ConsultaTecnica](
	[Id_ConsultaTecnica] [int] IDENTITY(1,1) NOT NULL,
	[Institucion] [varchar](100) NULL,
	[Codigo_Vuce] [varchar](10) NULL,
	[Area] [varchar](100) NULL,
	[Apellidos] [varchar](100) NOT NULL,
	[Nombres] [varchar](100) NOT NULL,
	[Telefono] [varchar](20) NULL,
	[Fax] [varchar](20) NULL,
	[Id_Tipo] [smallint] NOT NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[Codigo_Digemid] [varchar](10) NULL,
	[Email] [varchar](100) NOT NULL,
	[Id_TipoSolicitante] [smallint] NOT NULL,
	[Id_MotivoConsulta] [smallint] NOT NULL,
	[FechaHoraCierre] [int] NULL,
	[Flg_Origen] [char](1) NOT NULL,
	[UsuarioRegistro] [char](4) NULL,
	[Flg_Notificado] [char](1) NULL,
	[UsuarioModificacion] [char](4) NULL,
	[FechaHoraNotificacion] [int] NULL,
	[Id_TipoInstitucion] [smallint] NOT NULL,
	[Clave] [char](4) NULL,
	[Id_Entidad] [smallint] NULL,
	[Id_MotivoNoAtencion] [smallint] NULL,
	[FechaHoraModificacion] [int] NULL,
	[Id_EstadoCT] [smallint] NOT NULL,
	[Id_MedioConsulta] [smallint] NOT NULL,
	[Id_Clasificacion] [smallint] NOT NULL,
	[Id_Prioridad] [smallint] NOT NULL,
	[Id_MotivoObservacion] [smallint] NULL,
	[Id_Responsable] [char](4) NULL,
	[Descripcion] [varchar](8000) NOT NULL,
	[FechaHoraVencimiento] [int] NULL,
	[FechaHoraObservacion] [int] NULL,
	[FechaHoraPlazoNotificacion] [int] NULL,
	[Flg_Autoriza] [char](1) NULL,
	[DNI] [varchar](20) NULL,
	[RUC] [varchar](20) NULL,
	[id_Transmision] [int] NULL,
 CONSTRAINT [XPKTt_ConsultaTecnica] PRIMARY KEY CLUSTERED 
(
	[Id_ConsultaTecnica] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tt_RespuestaCT]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tt_RespuestaCT](
	[Id_RespuestaCT] [int] IDENTITY(1,1) NOT NULL,
	[Descripcion] [varchar](8000) NOT NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[FechaHoraModificacion] [int] NULL,
	[Eliminado] [bit] NOT NULL,
	[UsuarioModificacion] [char](4) NULL,
	[Flg_Rpta] [char](1) NOT NULL,
	[UsuarioRegistro] [char](4) NULL,
	[Id_ConsultaTecnica] [int] NOT NULL,
	[SustentoLegal] [varchar](100) NULL,
	[Privacidad] [bit] NULL,
	[TipoRespuesta] [char](1) NULL,
	[TiempoInvertido] [int] NULL,
	[UnidadTiempo] [char](1) NULL,
 CONSTRAINT [XPKTt_RespuestaCT] PRIMARY KEY CLUSTERED 
(
	[Id_RespuestaCT] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tt_RespuestaDevuelta]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tt_RespuestaDevuelta](
	[Id_RespuestaDevuelta] [int] IDENTITY(1,1) NOT NULL,
	[Id_RespuestaCT] [int] NOT NULL,
	[DescripcionJefe] [varchar](1000) NOT NULL,
	[DescripcionResponsable] [varchar](1000) NULL,
	[Eliminado] [bit] NOT NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[UsuarioRegistro] [char](4) NOT NULL,
	[FechaHoraModificacion] [int] NULL,
	[UsuarioModificacion] [char](4) NULL,
 CONSTRAINT [PK_Tt_RespuestaDevuelta] PRIMARY KEY CLUSTERED 
(
	[Id_RespuestaDevuelta] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tt_AdendaCT]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tt_AdendaCT](
	[Id_AdendaCT] [int] IDENTITY(1,1) NOT NULL,
	[Descripcion] [varchar](1000) NOT NULL,
	[Eliminado] [bit] NULL,
	[FechaHoraRegistro] [int] NULL,
	[UsuarioRegistro] [char](4) NULL,
	[FechaHoraModificacion] [int] NULL,
	[UsuarioModificacion] [char](4) NULL,
	[Id_ConsultaTecnica] [int] NULL,
 CONSTRAINT [XPKTt_AdendaCT] PRIMARY KEY CLUSTERED 
(
	[Id_AdendaCT] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[EMPLEADO]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[EMPLEADO](
	[Id_Usuario] [char](4) NULL,
	[nombre] [varchar](60) NULL,
	[apellido] [varchar](60) NULL,
	[email] [varchar](50) NULL,
	[login] [varchar](15) NULL,
	[Area] [smallint] NULL,
	[contrasenia] [varchar](50) NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tt_NotificacionCT]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tt_NotificacionCT](
	[Id_NotificacionCT] [int] IDENTITY(1,1) NOT NULL,
	[Id_ConsultaTecnica] [int] NOT NULL,
	[Id_MotivoObservacionP] [smallint] NOT NULL,
	[Pregunta] [varchar](1000) NOT NULL,
	[Id_MotivoObservacionR] [smallint] NULL,
	[Respuesta] [varchar](1000) NULL,
	[Eliminado] [bit] NOT NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[UsuarioRegistro] [char](4) NOT NULL,
	[FechaHoraModificacion] [int] NULL,
	[UsuarioModificacion] [char](4) NULL,
 CONSTRAINT [PK_Tt_NotificacionCT] PRIMARY KEY CLUSTERED 
(
	[Id_NotificacionCT] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tm_Bibliografia]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tm_Bibliografia](
	[Id_Bibliografia] [int] NULL,
	[Descripcion] [varchar](80) NULL,
	[Eliminado] [bit] NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tt_BibliografiaCT]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Tt_BibliografiaCT](
	[Id_BibliografiaCT] [int] IDENTITY(1,1) NOT NULL,
	[Id_Bibliografia] [int] NULL,
	[Id_RespuestaCT] [int] NULL,
 CONSTRAINT [PK_Tt_BibliografiaCT] PRIMARY KEY CLUSTERED 
(
	[Id_BibliografiaCT] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Tt_DetalleCT]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tt_DetalleCT](
	[Id_DetalleCT] [int] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](50) NOT NULL,
	[Eliminado] [bit] NOT NULL,
	[FechaHoraRegistro] [int] NOT NULL,
	[Descripcion] [varchar](200) NULL,
	[UsuarioRegistro] [char](4) NULL,
	[FechaHoraModificacion] [int] NULL,
	[UsuarioModificacion] [char](4) NULL,
	[Id_ConsultaTecnica] [int] NOT NULL,
	[Id_RespuestaCT] [int] NULL,
	[Flg_Operacion] [char](1) NOT NULL,
	[ArchivoAdjunto] [image] NOT NULL,
	[Id_NotificacionCT] [int] NULL,
	[Extension] [varchar](5) NOT NULL,
	[Tamano] [int] NOT NULL,
 CONSTRAINT [PK_Tt_DetalleCT] PRIMARY KEY CLUSTERED 
(
	[Id_DetalleCT] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tt_HistorialCT]    Script Date: 03/17/2014 16:31:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tt_HistorialCT](
	[FechaHoraRegistro] [int] NOT NULL,
	[Id_Responsable] [char](4) NULL,
	[Id_EstadoCT] [smallint] NULL,
	[Id_Tipo] [smallint] NULL,
	[FechaHoraModificacion] [int] NULL,
	[Id_MotivoObservacion] [smallint] NULL,
	[Id_Entidad] [smallint] NULL,
	[UsuarioModificacion] [char](4) NULL,
	[Id_AdmGrupo] [char](4) NULL,
	[UsuarioRegistro] [char](4) NULL,
	[Id_HistorialCT] [int] IDENTITY(1,1) NOT NULL,
	[Id_Clasificacion] [smallint] NULL,
	[Id_MotivoNoAtencion] [smallint] NULL,
	[Id_ConsultaTecnica] [int] NULL,
	[Descripcion] [varchar](1000) NULL,
	[Flg_Autoriza] [char](1) NULL,
 CONSTRAINT [XPKTt_HistorialCT] PRIMARY KEY CLUSTERED 
(
	[Id_HistorialCT] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  ForeignKey [R_1]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tm_Tipo]  WITH CHECK ADD  CONSTRAINT [R_1] FOREIGN KEY([Id_Clasificacion])
REFERENCES [dbo].[Tm_Clasificacion] ([Id_Clasificacion])
GO
ALTER TABLE [dbo].[Tm_Tipo] CHECK CONSTRAINT [R_1]
GO
/****** Object:  ForeignKey [R_32]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tm_UsuarioPerfil]  WITH CHECK ADD  CONSTRAINT [R_32] FOREIGN KEY([Id_Perfil])
REFERENCES [dbo].[Tm_Perfil] ([Id_Perfil])
GO
ALTER TABLE [dbo].[Tm_UsuarioPerfil] CHECK CONSTRAINT [R_32]
GO
/****** Object:  ForeignKey [R_33]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tm_UsuarioPerfil]  WITH CHECK ADD  CONSTRAINT [R_33] FOREIGN KEY([Id_Usuario])
REFERENCES [dbo].[Tm_Usuario] ([Id_Usuario])
GO
ALTER TABLE [dbo].[Tm_UsuarioPerfil] CHECK CONSTRAINT [R_33]
GO
/****** Object:  ForeignKey [R_36]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_AdendaCT]  WITH NOCHECK ADD  CONSTRAINT [R_36] FOREIGN KEY([Id_ConsultaTecnica])
REFERENCES [dbo].[Tt_ConsultaTecnica] ([Id_ConsultaTecnica])
GO
ALTER TABLE [dbo].[Tt_AdendaCT] CHECK CONSTRAINT [R_36]
GO
/****** Object:  ForeignKey [R_10]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_ConsultaTecnica]  WITH NOCHECK ADD  CONSTRAINT [R_10] FOREIGN KEY([Id_Tipo], [Id_Clasificacion])
REFERENCES [dbo].[Tm_Tipo] ([Id_Tipo], [Id_Clasificacion])
GO
ALTER TABLE [dbo].[Tt_ConsultaTecnica] CHECK CONSTRAINT [R_10]
GO
/****** Object:  ForeignKey [R_24]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_ConsultaTecnica]  WITH NOCHECK ADD  CONSTRAINT [R_24] FOREIGN KEY([Id_Entidad])
REFERENCES [dbo].[Tm_Entidad] ([Id_Entidad])
GO
ALTER TABLE [dbo].[Tt_ConsultaTecnica] CHECK CONSTRAINT [R_24]
GO
/****** Object:  ForeignKey [R_30]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_ConsultaTecnica]  WITH NOCHECK ADD  CONSTRAINT [R_30] FOREIGN KEY([Id_TipoSolicitante])
REFERENCES [dbo].[Tm_TipoSolicitante] ([Id_TipoSolicitante])
GO
ALTER TABLE [dbo].[Tt_ConsultaTecnica] CHECK CONSTRAINT [R_30]
GO
/****** Object:  ForeignKey [R_31]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_ConsultaTecnica]  WITH NOCHECK ADD  CONSTRAINT [R_31] FOREIGN KEY([Id_MotivoConsulta])
REFERENCES [dbo].[Tm_MotivoConsulta] ([Id_MotivoConsulta])
GO
ALTER TABLE [dbo].[Tt_ConsultaTecnica] CHECK CONSTRAINT [R_31]
GO
/****** Object:  ForeignKey [R_37]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_ConsultaTecnica]  WITH NOCHECK ADD  CONSTRAINT [R_37] FOREIGN KEY([Id_Prioridad])
REFERENCES [dbo].[Tm_Prioridad] ([Id_Prioridad])
GO
ALTER TABLE [dbo].[Tt_ConsultaTecnica] CHECK CONSTRAINT [R_37]
GO
/****** Object:  ForeignKey [R_38]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_ConsultaTecnica]  WITH NOCHECK ADD  CONSTRAINT [R_38] FOREIGN KEY([Id_MotivoObservacion])
REFERENCES [dbo].[Tm_MotivoObservacion] ([Id_MotivoObservacion])
GO
ALTER TABLE [dbo].[Tt_ConsultaTecnica] CHECK CONSTRAINT [R_38]
GO
/****** Object:  ForeignKey [R_40]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_ConsultaTecnica]  WITH NOCHECK ADD  CONSTRAINT [R_40] FOREIGN KEY([Id_Responsable])
REFERENCES [dbo].[Tm_Usuario] ([Id_Usuario])
GO
ALTER TABLE [dbo].[Tt_ConsultaTecnica] CHECK CONSTRAINT [R_40]
GO
/****** Object:  ForeignKey [R_5]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_ConsultaTecnica]  WITH NOCHECK ADD  CONSTRAINT [R_5] FOREIGN KEY([Id_MedioConsulta])
REFERENCES [dbo].[Tm_MedioConsulta] ([Id_MedioConsulta])
GO
ALTER TABLE [dbo].[Tt_ConsultaTecnica] CHECK CONSTRAINT [R_5]
GO
/****** Object:  ForeignKey [R_7]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_ConsultaTecnica]  WITH NOCHECK ADD  CONSTRAINT [R_7] FOREIGN KEY([Id_EstadoCT])
REFERENCES [dbo].[Tm_EstadoCT] ([Id_EstadoCT])
GO
ALTER TABLE [dbo].[Tt_ConsultaTecnica] CHECK CONSTRAINT [R_7]
GO
/****** Object:  ForeignKey [R_8]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_ConsultaTecnica]  WITH NOCHECK ADD  CONSTRAINT [R_8] FOREIGN KEY([Id_TipoInstitucion])
REFERENCES [dbo].[Tm_TipoInstitucion] ([Id_TipoInstitucion])
GO
ALTER TABLE [dbo].[Tt_ConsultaTecnica] CHECK CONSTRAINT [R_8]
GO
/****** Object:  ForeignKey [R_9]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_ConsultaTecnica]  WITH NOCHECK ADD  CONSTRAINT [R_9] FOREIGN KEY([Id_MotivoNoAtencion])
REFERENCES [dbo].[Tm_MotivoNoAtencion] ([Id_MotivoNoAtencion])
GO
ALTER TABLE [dbo].[Tt_ConsultaTecnica] CHECK CONSTRAINT [R_9]
GO
/****** Object:  ForeignKey [FK_Tt_DetalleCT_Tt_NotificacionCT]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_DetalleCT]  WITH NOCHECK ADD  CONSTRAINT [FK_Tt_DetalleCT_Tt_NotificacionCT] FOREIGN KEY([Id_NotificacionCT])
REFERENCES [dbo].[Tt_NotificacionCT] ([Id_NotificacionCT])
GO
ALTER TABLE [dbo].[Tt_DetalleCT] CHECK CONSTRAINT [FK_Tt_DetalleCT_Tt_NotificacionCT]
GO
/****** Object:  ForeignKey [R_2]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_DetalleCT]  WITH NOCHECK ADD  CONSTRAINT [R_2] FOREIGN KEY([Id_ConsultaTecnica])
REFERENCES [dbo].[Tt_ConsultaTecnica] ([Id_ConsultaTecnica])
GO
ALTER TABLE [dbo].[Tt_DetalleCT] CHECK CONSTRAINT [R_2]
GO
/****** Object:  ForeignKey [R_20]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_DetalleCT]  WITH NOCHECK ADD  CONSTRAINT [R_20] FOREIGN KEY([Id_RespuestaCT])
REFERENCES [dbo].[Tt_RespuestaCT] ([Id_RespuestaCT])
GO
ALTER TABLE [dbo].[Tt_DetalleCT] CHECK CONSTRAINT [R_20]
GO
/****** Object:  ForeignKey [R_21]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_DetalleCT]  WITH NOCHECK ADD  CONSTRAINT [R_21] FOREIGN KEY([UsuarioRegistro])
REFERENCES [dbo].[Tm_Usuario] ([Id_Usuario])
GO
ALTER TABLE [dbo].[Tt_DetalleCT] CHECK CONSTRAINT [R_21]
GO
/****** Object:  ForeignKey [R_25]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_GrupoUsuario]  WITH NOCHECK ADD  CONSTRAINT [R_25] FOREIGN KEY([Id_Tipo], [Id_Clasificacion])
REFERENCES [dbo].[Tm_Tipo] ([Id_Tipo], [Id_Clasificacion])
GO
ALTER TABLE [dbo].[Tt_GrupoUsuario] CHECK CONSTRAINT [R_25]
GO
/****** Object:  ForeignKey [R_45]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_GrupoUsuario]  WITH NOCHECK ADD  CONSTRAINT [R_45] FOREIGN KEY([Id_Perfil], [Id_Usuario])
REFERENCES [dbo].[Tm_UsuarioPerfil] ([Id_Perfil], [Id_Usuario])
GO
ALTER TABLE [dbo].[Tt_GrupoUsuario] CHECK CONSTRAINT [R_45]
GO
/****** Object:  ForeignKey [R_13]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_HistorialCT]  WITH NOCHECK ADD  CONSTRAINT [R_13] FOREIGN KEY([Id_Responsable])
REFERENCES [dbo].[Tm_Usuario] ([Id_Usuario])
GO
ALTER TABLE [dbo].[Tt_HistorialCT] CHECK CONSTRAINT [R_13]
GO
/****** Object:  ForeignKey [R_14]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_HistorialCT]  WITH NOCHECK ADD  CONSTRAINT [R_14] FOREIGN KEY([Id_EstadoCT])
REFERENCES [dbo].[Tm_EstadoCT] ([Id_EstadoCT])
GO
ALTER TABLE [dbo].[Tt_HistorialCT] CHECK CONSTRAINT [R_14]
GO
/****** Object:  ForeignKey [R_15]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_HistorialCT]  WITH NOCHECK ADD  CONSTRAINT [R_15] FOREIGN KEY([Id_Tipo], [Id_Clasificacion])
REFERENCES [dbo].[Tm_Tipo] ([Id_Tipo], [Id_Clasificacion])
GO
ALTER TABLE [dbo].[Tt_HistorialCT] CHECK CONSTRAINT [R_15]
GO
/****** Object:  ForeignKey [R_18]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_HistorialCT]  WITH NOCHECK ADD  CONSTRAINT [R_18] FOREIGN KEY([Id_MotivoObservacion])
REFERENCES [dbo].[Tm_MotivoObservacion] ([Id_MotivoObservacion])
GO
ALTER TABLE [dbo].[Tt_HistorialCT] CHECK CONSTRAINT [R_18]
GO
/****** Object:  ForeignKey [R_34]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_HistorialCT]  WITH NOCHECK ADD  CONSTRAINT [R_34] FOREIGN KEY([Id_Entidad])
REFERENCES [dbo].[Tm_Entidad] ([Id_Entidad])
GO
ALTER TABLE [dbo].[Tt_HistorialCT] CHECK CONSTRAINT [R_34]
GO
/****** Object:  ForeignKey [R_35]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_HistorialCT]  WITH NOCHECK ADD  CONSTRAINT [R_35] FOREIGN KEY([Id_AdmGrupo])
REFERENCES [dbo].[Tm_Usuario] ([Id_Usuario])
GO
ALTER TABLE [dbo].[Tt_HistorialCT] CHECK CONSTRAINT [R_35]
GO
/****** Object:  ForeignKey [R_41]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_HistorialCT]  WITH NOCHECK ADD  CONSTRAINT [R_41] FOREIGN KEY([Id_MotivoNoAtencion])
REFERENCES [dbo].[Tm_MotivoNoAtencion] ([Id_MotivoNoAtencion])
GO
ALTER TABLE [dbo].[Tt_HistorialCT] CHECK CONSTRAINT [R_41]
GO
/****** Object:  ForeignKey [R_42]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_HistorialCT]  WITH NOCHECK ADD  CONSTRAINT [R_42] FOREIGN KEY([Id_ConsultaTecnica])
REFERENCES [dbo].[Tt_ConsultaTecnica] ([Id_ConsultaTecnica])
GO
ALTER TABLE [dbo].[Tt_HistorialCT] CHECK CONSTRAINT [R_42]
GO
/****** Object:  ForeignKey [FK_Tt_NotificacionCT_Tm_MotivoObservacion]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_NotificacionCT]  WITH CHECK ADD  CONSTRAINT [FK_Tt_NotificacionCT_Tm_MotivoObservacion] FOREIGN KEY([Id_MotivoObservacionP])
REFERENCES [dbo].[Tm_MotivoObservacion] ([Id_MotivoObservacion])
GO
ALTER TABLE [dbo].[Tt_NotificacionCT] CHECK CONSTRAINT [FK_Tt_NotificacionCT_Tm_MotivoObservacion]
GO
/****** Object:  ForeignKey [FK_Tt_NotificacionCT_Tm_MotivoObservacion1]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_NotificacionCT]  WITH CHECK ADD  CONSTRAINT [FK_Tt_NotificacionCT_Tm_MotivoObservacion1] FOREIGN KEY([Id_MotivoObservacionR])
REFERENCES [dbo].[Tm_MotivoObservacion] ([Id_MotivoObservacion])
GO
ALTER TABLE [dbo].[Tt_NotificacionCT] CHECK CONSTRAINT [FK_Tt_NotificacionCT_Tm_MotivoObservacion1]
GO
/****** Object:  ForeignKey [FK_Tt_NotificacionCT_Tt_ConsultaTecnica]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_NotificacionCT]  WITH NOCHECK ADD  CONSTRAINT [FK_Tt_NotificacionCT_Tt_ConsultaTecnica] FOREIGN KEY([Id_ConsultaTecnica])
REFERENCES [dbo].[Tt_ConsultaTecnica] ([Id_ConsultaTecnica])
GO
ALTER TABLE [dbo].[Tt_NotificacionCT] CHECK CONSTRAINT [FK_Tt_NotificacionCT_Tt_ConsultaTecnica]
GO
/****** Object:  ForeignKey [R_43]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_RespuestaCT]  WITH NOCHECK ADD  CONSTRAINT [R_43] FOREIGN KEY([UsuarioRegistro])
REFERENCES [dbo].[Tm_Usuario] ([Id_Usuario])
GO
ALTER TABLE [dbo].[Tt_RespuestaCT] CHECK CONSTRAINT [R_43]
GO
/****** Object:  ForeignKey [R_44]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_RespuestaCT]  WITH NOCHECK ADD  CONSTRAINT [R_44] FOREIGN KEY([Id_ConsultaTecnica])
REFERENCES [dbo].[Tt_ConsultaTecnica] ([Id_ConsultaTecnica])
GO
ALTER TABLE [dbo].[Tt_RespuestaCT] CHECK CONSTRAINT [R_44]
GO
/****** Object:  ForeignKey [FK_Tt_RespuestaDevuelta_Tt_RespuestaCT]    Script Date: 03/17/2014 16:31:45 ******/
ALTER TABLE [dbo].[Tt_RespuestaDevuelta]  WITH NOCHECK ADD  CONSTRAINT [FK_Tt_RespuestaDevuelta_Tt_RespuestaCT] FOREIGN KEY([Id_RespuestaCT])
REFERENCES [dbo].[Tt_RespuestaCT] ([Id_RespuestaCT])
GO
ALTER TABLE [dbo].[Tt_RespuestaDevuelta] CHECK CONSTRAINT [FK_Tt_RespuestaDevuelta_Tt_RespuestaCT]
GO
