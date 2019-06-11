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
-- Table structure for table `Airports`
--

DROP TABLE IF EXISTS `Airports`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Airports` (
  `idAirport` int(11) NOT NULL AUTO_INCREMENT,
  `AirportName` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `Id_City` int(11) NOT NULL,
  `IATA` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `ICAO` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`idAirport`),
  UNIQUE KEY `idAirports_UNIQUE` (`idAirport`),
  KEY `fk_Airports_1_idx` (`Id_City`),
  CONSTRAINT `fk_Airports_1` FOREIGN KEY (`Id_City`) REFERENCES `Cities` (`idCity`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Airports`
--

LOCK TABLES `Airports` WRITE;
/*!40000 ALTER TABLE `Airports` DISABLE KEYS */;
INSERT INTO `Airports` VALUES (1,'Hamid Karzai International Airport',3934,'KBL','OAKB'),(2,'Mohammed V International Airport',589,'CMN','GMMN'),(3,'Al Massira Airport',590,'AGA','GMAD'),(4,'Menara Airport',597,'RAK','GMMX'),(5,'Ghazni Airport',3941,'GZI','OAGN'),(6,'Tirana International Airport Mother Teresa',4002,'TIA','LATI'),(7,'Innsbruck Airport',4220,'INN','LOWI'),(8,'Salzburg Airport',4222,'SZG','LOWS'),(9,'Graz Airport',4226,'GRZ','LOWG'),(10,'Vienna International Airport',4228,'VIE','LOWW'),(11,'Shah Amanat International Airport',4535,'CGP','VGEG'),(12,'Brussels Airport',4546,'BRU','EBBR'),(13,'Brussels South Charleroi Airport',4546,'CRL','EBCI'),(14,'Sofia Airport',4611,'SOF','LBSF'),(15,'Juana Azurduy De Padilla Airport',4648,'SRE','SLSU'),(16,'Brunei International Airport',4650,'BWN','WBSB'),(17,'Viru Viru International Airport',4683,'VVI','SLVR'),(18,'Congonhas Airport',5097,'CGH','SBSP'),(20,'Congonhas Airport',5097,'CGH','SBSP'),(21,'Franco Montoro International Airport',5097,'GRU','SBGR'),(22,'Lynden Pindling International Airport',5108,'NAS','MYNN'),(23,'Nassau Paradise Island Airport',5108,'PID','MYPI'),(24,'Grand Bahama International Airport',5109,'FPO','MYGF'),(25,'Sua Pan Airport',5147,'SXN','FBSN'),(26,'Sir Seretse Khama International Airport',5150,'GBE','FBSK'),(27,'Hector Silva Airstrip',5170,'BCV','MZBP'),(28,'Punta Gorda Airport',5175,'PND','KPGD'),(29,'Philip S. W. Goldson International Airport',5178,'BZE','MZBZ'),(30,'Belize City Municipal Airport',5178,'TZA','MZBE'),(31,'Ndjili International Airport',5447,'FIH','FZAA'),(32,'Zürich Airport',5558,'ZRH','LSZH'),(33,'Geneva Cointrin International Airport',5572,'GVA','LSGG'),(34,'Bern Belp Airport',5574,'BRN','LSZB'),(35,'Lugano Airport',5580,'LUG','LSZA'),(36,'Andrés Sabella Gálvez International Airport',5645,'ANF','SCFA'),(37,'Beijing Nanyuan Airport',5960,'NAY','ZBNY'),(38,'Jose Maria Córdova International Airport',6161,'MDE','SKRG'),(39,'El Dorado International Airport',6180,'BOG','SKBO'),(40,'Santa Ana Airport',6204,'CRC','SKGO'),(41,'José Martí International Airport',6212,'HAV','MUHA'),(42,'Kawama Airport',6228,'VRO','MUKW'),(43,'Praia International Airport',6249,'RAI','GVNP'),(44,'Hato International Airport',6259,'CUR','TNCC'),(45,'Václav Havel Airport Prague',6271,'PRG','LKPR'),(46,'Las Américas International Airport',6379,'PDQ','MDSD'),(47,'Casa De Campo International Airport',6381,'LRM','MDLR'),(48,'Houari Boumediene Airport',6390,'ALG','DAAG'),(49,'In Aménas Airport',6396,'IAM','DAUZ'),(50,'Béchar Boudghene Ben Ali Lotfi Airport',6414,'CBH','DAOR'),(51,'Soummam Airport',6428,'BJA','DAAE'),(52,'Bordj Badji Mokhtar Airport',6431,'BMW','DATM'),(53,'Biskra Airport',6433,'BSK','DAUB'),(54,'Batna Airport',6434,'BLJ','DABT'),(55,'Mariscal Sucre International Airport',6453,'UIO','SEQM'),(56,'Jumandy Airport',6477,'TNW','SEJD'),(57,'Cairo International Airport',6538,'CAI','HECA'),(58,'Cairo West Airport',6538,'CWE','HECW'),(59,'El Arish International Airport',6544,'AAC','HEAR'),(60,'Luxor International Airport',6546,'LXR','HELX'),(61,'Zaragoza Air Base',6567,'ZAZ','LEZG'),(62,'Bilbao Airport',6596,'BIO','LEBB'),(63,'Sevilla Airport',6598,'SVQ','LEZL'),(64,'Cuatro Vientos Airport',6602,'ECV','LECU'),(65,'Adolfo Suárez Madrid–Barajas Airport',6602,'MAD','LEMD'),(66,'Sunyani Airport',7011,'NYI','DGSN'),(67,'Kumasi Airport',7013,'KMS','DGSI'),(68,'Kotoka International Airport',7021,'ACC','DGAA'),(69,'Gibraltar Airport',7024,'GIB','LXGB'),(70,'Juan Santamaria International Airport',7128,'SJO','MROC'),(71,'Tobias Bolanos International Airport',7128,'SYQ','MRPV'),(72,'Ciampino–G. B. Pastine International Airport',7715,'CIA','LIRA'),(73,'Leonardo da Vinci–Fiumicino Airport',7715,'FCO','LIRF'),(74,'Bologna Guglielmo Marconi Airport',7725,'BLQ','LIPE'),(75,'Peretola Airport',7731,'FLR','LIRQ');
/*!40000 ALTER TABLE `Airports` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-11 18:45:05
