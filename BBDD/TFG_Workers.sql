-- MySQL dump 10.13  Distrib 5.7.25, for Linux (x86_64)
--
-- Host: localhost    Database: TFG
-- ------------------------------------------------------
-- Server version	5.7.25-0ubuntu0.18.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Workers`
--

DROP TABLE IF EXISTS `Workers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Workers` (
  `idWorker` int(11) NOT NULL AUTO_INCREMENT,
  `Passport` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `Name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `Surname` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `Photo` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `Address` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `Id_City` int(11) NOT NULL,
  `Id_Nationality` int(11) NOT NULL,
  `Password` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `Id_Role` int(11) NOT NULL,
  PRIMARY KEY (`idWorker`),
  UNIQUE KEY `idWorkers_UNIQUE` (`idWorker`),
  KEY `fk_Workers_2_idx` (`Id_Nationality`),
  KEY `fk_Workers_1_idx` (`Id_City`),
  KEY `fk_Workers_3_idx` (`Id_Role`),
  CONSTRAINT `fk_Workers_1` FOREIGN KEY (`Id_City`) REFERENCES `Cities` (`idCity`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Workers_2` FOREIGN KEY (`Id_Nationality`) REFERENCES `Nationalities` (`idNationalities`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Workers_3` FOREIGN KEY (`Id_Role`) REFERENCES `Roles` (`idRole`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Workers`
--

LOCK TABLES `Workers` WRITE;
/*!40000 ALTER TABLE `Workers` DISABLE KEYS */;
INSERT INTO `Workers` VALUES (1,'234567R','Enrique Garcia','Garcia','EGC','C/Pitos Y Flautas',3922,13,'234567R',2),(2,'456789Z','Jorge','Hidalgucci Perez','JHP','C/ Oreilly',4668,15,'456789Z',3),(4,'326587T','Paco Juan','Garcia','PJG','C/ Luis Sabinas',4223,85,'326587T',1),(5,'326587T','Miguel Hindurain','Jimenez','MHJ','C/ Trabas',4227,117,'326587T',1),(8,'925763R','Sam','Carmona Jack','SCJ','C/ Mikki',4284,110,'925763R',1),(9,'923356R','Enrique','Pruebas Escribano','EPE','C/ Test',4600,200,'923356R',2),(10,'123472R','Alvaro','Santos Sandin','ASS','C/ Comedia',7000,120,'123472R',4),(11,'236765V','Lucio','Garcia Alvarez','LGA','Bandas',4567,87,'236765V',4),(12,'147901E','Marcos','Gracian Baltasar','MGB','Paco ST',1234,30,'147901E',4),(13,'457823T','Jesus','Ponce Carlos','JPC','Baker Street',3456,111,'457823T',4),(14,'714905E','Paco','Axel Santos','PAS','C/ Yandel',4670,30,'714905E',3),(16,'237821Z','Miguel','Alejandro Juan','MAJ','C/ Faube',5618,90,'237821Z',4),(17,'318535D','Jaume','Santa Engracia','JSE','C/ Crossland',3486,20,'pass',4),(18,'318535D','Gustavo','Quevedo Acevedo','GQA','Calle administracion',3486,20,'pass',5);
/*!40000 ALTER TABLE `Workers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-11 18:45:06
