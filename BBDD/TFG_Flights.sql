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
-- Table structure for table `Flights`
--

DROP TABLE IF EXISTS `Flights`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Flights` (
  `idFlights` int(11) NOT NULL AUTO_INCREMENT,
  `FlightName` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `Id_Airplane` int(11) NOT NULL,
  `Distance` decimal(10,2) NOT NULL,
  `AvailableSeats` int(11) NOT NULL,
  `Origin` int(11) NOT NULL,
  `Destiny` int(11) NOT NULL,
  `BeginDate` date NOT NULL,
  `EndDate` date NOT NULL,
  `id_FoodDrink` int(11) NOT NULL,
  `id_CabinCrewFlight` int(11) NOT NULL,
  `Flightscol` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idFlights`),
  UNIQUE KEY `idFlights_UNIQUE` (`idFlights`),
  KEY `fk_Flights_3_idx` (`Destiny`),
  KEY `fk_Flights_4_idx` (`id_FoodDrink`),
  KEY `fk_Flights_1_idx` (`Id_Airplane`,`Origin`),
  KEY `fk_Flights_2_idx` (`Origin`,`id_CabinCrewFlight`),
  KEY `fk_Flights_2_idx1` (`id_CabinCrewFlight`),
  CONSTRAINT `fk_Flights_3` FOREIGN KEY (`Destiny`) REFERENCES `Airports` (`idAirport`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Flights_4` FOREIGN KEY (`id_FoodDrink`) REFERENCES `FoodAndDrinks` (`idFoodAndDrinks`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Flights_5` FOREIGN KEY (`id_CabinCrewFlight`) REFERENCES `CabinCrewFlight` (`idCabinCrewFlight`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Flights`
--

LOCK TABLES `Flights` WRITE;
/*!40000 ALTER TABLE `Flights` DISABLE KEYS */;
INSERT INTO `Flights` VALUES (2,'De punta a punta',5,1232.23,120,8,11,'2019-06-13','2019-06-25',1,2,NULL),(5,'Viru Viru brunei',7,8000.70,120,17,16,'2019-06-29','2019-06-30',1,3,NULL),(6,'Viru Viru brunei2',7,8000.70,120,11,7,'2019-06-28','2019-06-28',2,2,NULL);
/*!40000 ALTER TABLE `Flights` ENABLE KEYS */;
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
