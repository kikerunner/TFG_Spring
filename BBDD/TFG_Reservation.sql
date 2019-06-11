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
-- Table structure for table `Reservation`
--

DROP TABLE IF EXISTS `Reservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Reservation` (
  `idReservation` int(11) NOT NULL AUTO_INCREMENT,
  `Id_Passenger1` int(11) NOT NULL,
  `Id_Passenger2` int(11) NOT NULL,
  `Id_Passenger3` int(11) NOT NULL,
  `Id_Passenger4` int(11) NOT NULL,
  `Id_Passenger5` int(11) NOT NULL,
  `Id_Passenger6` int(11) NOT NULL,
  `SeatsNumber` int(11) NOT NULL,
  `IdFlight` int(11) NOT NULL,
  `LuggaggeNumber` int(11) NOT NULL,
  `Price` double NOT NULL,
  `ReservationTime` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`idReservation`),
  UNIQUE KEY `idReservation_UNIQUE` (`idReservation`),
  KEY `fk_Reservation_1_idx` (`Id_Passenger1`),
  KEY `fk_Reservation_2_idx` (`Id_Passenger2`),
  KEY `fk_Reservation_3_idx` (`Id_Passenger3`),
  KEY `fk_Reservation_4_idx` (`Id_Passenger4`),
  KEY `fk_Reservation_5_idx` (`Id_Passenger5`),
  KEY `fk_Reservation_6_idx` (`Id_Passenger6`),
  KEY `fk_Reservation_7_idx` (`IdFlight`),
  CONSTRAINT `fk_Reservation_1` FOREIGN KEY (`Id_Passenger1`) REFERENCES `Passengers` (`idPassenger`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reservation_2` FOREIGN KEY (`Id_Passenger2`) REFERENCES `Passengers` (`idPassenger`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reservation_3` FOREIGN KEY (`Id_Passenger3`) REFERENCES `Passengers` (`idPassenger`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reservation_4` FOREIGN KEY (`Id_Passenger4`) REFERENCES `Passengers` (`idPassenger`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reservation_5` FOREIGN KEY (`Id_Passenger5`) REFERENCES `Passengers` (`idPassenger`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reservation_6` FOREIGN KEY (`Id_Passenger6`) REFERENCES `Passengers` (`idPassenger`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reservation_7` FOREIGN KEY (`IdFlight`) REFERENCES `Flights` (`idFlights`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Reservation`
--

LOCK TABLES `Reservation` WRITE;
/*!40000 ALTER TABLE `Reservation` DISABLE KEYS */;
/*!40000 ALTER TABLE `Reservation` ENABLE KEYS */;
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
