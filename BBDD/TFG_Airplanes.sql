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
-- Table structure for table `Airplanes`
--

DROP TABLE IF EXISTS `Airplanes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Airplanes` (
  `idAirplane` int(11) NOT NULL AUTO_INCREMENT,
  `AirplaneName` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `idAirplaneModel` int(11) DEFAULT NULL,
  `FlightHours` decimal(10,2) DEFAULT NULL,
  `SeatsNumber` int(11) DEFAULT NULL,
  `FuelQuantity` int(11) DEFAULT NULL,
  `WorkersNumber` int(11) DEFAULT NULL,
  PRIMARY KEY (`idAirplane`),
  KEY `index_Modelo_ID` (`idAirplaneModel`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Airplanes`
--

LOCK TABLES `Airplanes` WRITE;
/*!40000 ALTER TABLE `Airplanes` DISABLE KEYS */;
INSERT INTO `Airplanes` VALUES (2,'AirForceOne',1,1000.00,1000,10000,100),(4,'Prueba',2,2000.00,200,120,12),(5,'David Bustamante',1,200.00,2000,2000,6),(6,'Marshmallow',1,200.00,13,200,12),(7,'Faraon',1,200.00,120,2000,4),(8,'CardiB',1,200.00,60,2000,12),(9,'Maluma',2,200.00,12,400,3),(10,'Paco',1,200.40,300,200,2),(11,'Paco',1,200.40,300,200,2),(12,'Anabel',1,2000.00,120,2000,6),(13,'Aeroplano',2,200.40,240,2000,6);
/*!40000 ALTER TABLE `Airplanes` ENABLE KEYS */;
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
