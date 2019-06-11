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
-- Table structure for table `CabinCrewFlight`
--

DROP TABLE IF EXISTS `CabinCrewFlight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CabinCrewFlight` (
  `idCabinCrewFlight` int(11) NOT NULL AUTO_INCREMENT,
  `id_Pilot` int(11) NOT NULL,
  `id_Copilot` int(11) NOT NULL,
  `NumberOfFlightAttendants` int(11) NOT NULL,
  `id_ChiefCrewMember` int(11) NOT NULL,
  `id_FlightAttendant1` int(11) NOT NULL,
  `id_FlightAttendant2` int(11) NOT NULL,
  `id_FlightAttendant3` int(11) NOT NULL,
  `id_FlightAttendant4` int(11) NOT NULL,
  `id_FlightAttendant5` int(11) DEFAULT NULL,
  `id_FlightAttendant6` int(11) DEFAULT NULL,
  PRIMARY KEY (`idCabinCrewFlight`),
  UNIQUE KEY `idReservations_UNIQUE` (`idCabinCrewFlight`),
  KEY `fk_CabinCrewFlight_2_idx` (`id_Pilot`),
  KEY `fk_CabinCrewFlight_3_idx` (`id_Copilot`),
  KEY `fk_CabinCrewFlight_4_idx` (`id_FlightAttendant1`),
  KEY `fk_CabinCrewFlight_5_idx` (`id_FlightAttendant2`),
  KEY `fk_CabinCrewFlight_6_idx` (`id_FlightAttendant3`),
  KEY `fk_CabinCrewFlight_7_idx` (`id_FlightAttendant4`),
  KEY `fk_CabinCrewFlight_8_idx` (`id_FlightAttendant5`),
  KEY `fk_CabinCrewFlight_9_idx` (`id_FlightAttendant6`),
  CONSTRAINT `fk_CabinCrewFlight_2` FOREIGN KEY (`id_Pilot`) REFERENCES `Workers` (`idWorker`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_CabinCrewFlight_3` FOREIGN KEY (`id_Copilot`) REFERENCES `Workers` (`idWorker`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_CabinCrewFlight_4` FOREIGN KEY (`id_FlightAttendant1`) REFERENCES `Workers` (`idWorker`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_CabinCrewFlight_5` FOREIGN KEY (`id_FlightAttendant2`) REFERENCES `Workers` (`idWorker`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_CabinCrewFlight_6` FOREIGN KEY (`id_FlightAttendant3`) REFERENCES `Workers` (`idWorker`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_CabinCrewFlight_7` FOREIGN KEY (`id_FlightAttendant4`) REFERENCES `Workers` (`idWorker`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_CabinCrewFlight_8` FOREIGN KEY (`id_FlightAttendant5`) REFERENCES `Workers` (`idWorker`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_CabinCrewFlight_9` FOREIGN KEY (`id_FlightAttendant6`) REFERENCES `Workers` (`idWorker`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CabinCrewFlight`
--

LOCK TABLES `CabinCrewFlight` WRITE;
/*!40000 ALTER TABLE `CabinCrewFlight` DISABLE KEYS */;
INSERT INTO `CabinCrewFlight` VALUES (2,4,1,6,2,10,11,12,13,16,17),(3,8,9,4,14,13,12,17,16,NULL,NULL),(4,4,9,4,2,11,12,10,13,NULL,NULL),(5,8,9,4,2,17,16,13,12,NULL,NULL),(6,5,1,6,14,16,17,10,11,12,13);
/*!40000 ALTER TABLE `CabinCrewFlight` ENABLE KEYS */;
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
