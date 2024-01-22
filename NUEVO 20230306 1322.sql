-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.89-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema basecontactos
--

CREATE DATABASE IF NOT EXISTS basecontactos;
USE basecontactos;

--
-- Definition of table `tabla_contactos`
--

DROP TABLE IF EXISTS `tabla_contactos`;
CREATE TABLE `tabla_contactos` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `nombre_cont` varchar(45) NOT NULL,
  `dire` varchar(45) NOT NULL,
  `fecha_registro` varchar(45) NOT NULL,
  `fecha_cum` varchar(45) NOT NULL,
  `categoria` varchar(45) NOT NULL,
  `telefono_fijo` varchar(45) NOT NULL,
  `movil` varchar(45) NOT NULL,
  `correo` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1234 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabla_contactos`
--

/*!40000 ALTER TABLE `tabla_contactos` DISABLE KEYS */;
INSERT INTO `tabla_contactos` (`id`,`nombre_cont`,`dire`,`fecha_registro`,`fecha_cum`,`categoria`,`telefono_fijo`,`movil`,`correo`) VALUES 
 (156,'lara','San José','13/3/2023','515/02/1221','Personal','555555555','55555555555555','llllllll'),
 (321,'jerome','San José','2/3/2023','25/01/2005','Personal','11111111','77777777','jero@gmail.com');
/*!40000 ALTER TABLE `tabla_contactos` ENABLE KEYS */;


--
-- Definition of table `tabla_usuarios`
--

DROP TABLE IF EXISTS `tabla_usuarios`;
CREATE TABLE `tabla_usuarios` (
  `id` int(10) unsigned NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `nivel` varchar(45) NOT NULL,
  `fecha` varchar(45) NOT NULL,
  `correo` varchar(45) NOT NULL,
  `contra` varchar(45) NOT NULL,
  PRIMARY KEY  USING BTREE (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabla_usuarios`
--

/*!40000 ALTER TABLE `tabla_usuarios` DISABLE KEYS */;
INSERT INTO `tabla_usuarios` (`id`,`nombre`,`login`,`nivel`,`fecha`,`correo`,`contra`) VALUES 
 (123,'Jerome','Jero','Administrador','123132','jero','1234'),
 (1234,'lara','lara','Administrador','6/3/2023','lara','1234'),
 (123,'Lara','Larita','Operacional','6/3/2023','lara@gmail.com','1234'),
 (123,'logan','logan','Administrador','6/3/2023','logan','456'),
 (852,'monica','monik','Operacional','13/3/2023','moooniicaa@gmai.cm','159159');
/*!40000 ALTER TABLE `tabla_usuarios` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
