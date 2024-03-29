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
-- Table structure for table `Nationalities`
--

DROP TABLE IF EXISTS `Nationalities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Nationalities` (
  `idNationalities` int(11) NOT NULL AUTO_INCREMENT,
  `NationalityName` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`idNationalities`),
  UNIQUE KEY `idNationalities_UNIQUE` (`idNationalities`)
) ENGINE=InnoDB AUTO_INCREMENT=226 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Nationalities`
--

LOCK TABLES `Nationalities` WRITE;
/*!40000 ALTER TABLE `Nationalities` DISABLE KEYS */;
INSERT INTO `Nationalities` VALUES (1,'Afghan'),(2,'Albanian'),(3,'Algerian'),(4,'American'),(5,'Andorran'),(6,'Angolan'),(7,'Anguillan'),(8,'Argentine'),(9,'Armenian'),(10,'Australian'),(11,'Austrian'),(12,'Azerbaijani'),(13,'Bahamian'),(14,'Bahraini'),(15,'Bangladeshi'),(16,'Barbadian'),(17,'Belarusian'),(18,'Belgian'),(19,'Belizean'),(20,'Beninese'),(21,'Bermudian'),(22,'Bhutanese'),(23,'Bolivian'),(24,'Botswanan'),(25,'Brazilian'),(26,'British'),(27,'British Virgin Islander'),(28,'Bruneian'),(29,'Bulgarian'),(30,'Burkinan'),(31,'Burmese'),(32,'Burundian'),(33,'Cambodian'),(34,'Cameroonian'),(35,'Canadian'),(36,'Cape Verdean'),(37,'Cayman Islander'),(38,'Central African'),(39,'Chadian'),(40,'Chilean'),(41,'Chinese'),(42,'Citizen of Antigua and Barbuda'),(43,'Citizen of Bosnia and Herzegovina'),(44,'Citizen of Guinea-Bissau'),(45,'Citizen of Kiribati'),(46,'Citizen of Seychelles'),(47,'Citizen of the Dominican Republic'),(48,'Citizen of Vanuatu'),(49,'Colombian'),(50,'Comoran'),(51,'Congolese (Congo)'),(52,'Congolese (DRC)'),(53,'Cook Islander'),(54,'Costa Rican'),(55,'Croatian'),(56,'Cuban'),(57,'Cymraes'),(58,'Cymro'),(59,'Cypriot'),(60,'Czech'),(61,'Danish'),(62,'Djiboutian'),(63,'Dominican'),(64,'Dutch'),(65,'East Timorese'),(66,'Ecuadorean'),(67,'Egyptian'),(68,'Emirati'),(69,'English'),(70,'Equatorial Guinean'),(71,'Eritrean'),(72,'Estonian'),(73,'Ethiopian'),(74,'Faroese'),(75,'Fijian'),(76,'Filipino'),(77,'Finnish'),(78,'French'),(79,'Gabonese'),(80,'Gambian'),(81,'Georgian'),(82,'German'),(83,'Ghanaian'),(84,'Gibraltarian'),(85,'Greek'),(86,'Greenlandic'),(87,'Grenadian'),(88,'Guamanian'),(89,'Guatemalan'),(90,'Guinean'),(91,'Guyanese'),(92,'Haitian'),(93,'Honduran'),(94,'Hong Konger'),(95,'Hungarian'),(96,'Icelandic'),(97,'Indian'),(98,'Indonesian'),(99,'Iranian'),(100,'Iraqi'),(101,'Irish'),(102,'Israeli'),(103,'Italian'),(104,'Ivorian'),(105,'Jamaican'),(106,'Japanese'),(107,'Jordanian'),(108,'Kazakh'),(109,'Kenyan'),(110,'Kittitian'),(111,'Kosovan'),(112,'Kuwaiti'),(113,'Kyrgyz'),(114,'Lao'),(115,'Latvian'),(116,'Lebanese'),(117,'Liberian'),(118,'Libyan'),(119,'Liechtenstein citizen'),(120,'Lithuanian'),(121,'Luxembourger'),(122,'Macanese'),(123,'Macedonian'),(124,'Malagasy'),(125,'Malawian'),(126,'Malaysian'),(127,'Maldivian'),(128,'Malian'),(129,'Maltese'),(130,'Marshallese'),(131,'Martiniquais'),(132,'Mauritanian'),(133,'Mauritian'),(134,'Mexican'),(135,'Micronesian'),(136,'Moldovan'),(137,'Monegasque'),(138,'Mongolian'),(139,'Montenegrin'),(140,'Montserratian'),(141,'Moroccan'),(142,'Mosotho'),(143,'Mozambican'),(144,'Namibian'),(145,'Nauruan'),(146,'Nepalese'),(147,'New Zealander'),(148,'Nicaraguan'),(149,'Nigerian'),(150,'Nigerien'),(151,'Niuean'),(152,'North Korean'),(153,'Northern Irish'),(154,'Norwegian'),(155,'Omani'),(156,'Pakistani'),(157,'Palauan'),(158,'Palestinian'),(159,'Panamanian'),(160,'Papua New Guinean'),(161,'Paraguayan'),(162,'Peruvian'),(163,'Pitcairn Islander'),(164,'Polish'),(165,'Portuguese'),(166,'Prydeinig'),(167,'Puerto Rican'),(168,'Qatari'),(169,'Romanian'),(170,'Russian'),(171,'Rwandan'),(172,'Salvadorean'),(173,'Sammarinese'),(174,'Samoan'),(175,'Sao Tomean'),(176,'Saudi Arabian'),(177,'Scottish'),(178,'Senegalese'),(179,'Serbian'),(180,'Sierra Leonean'),(181,'Singaporean'),(182,'Slovak'),(183,'Slovenian'),(184,'Solomon Islander'),(185,'Somali'),(186,'South African'),(187,'South Korean'),(188,'South Sudanese'),(189,'Spanish'),(190,'Sri Lankan'),(191,'St Helenian'),(192,'St Lucian'),(193,'Stateless'),(194,'Sudanese'),(195,'Surinamese'),(196,'Swazi'),(197,'Swedish'),(198,'Swiss'),(199,'Syrian'),(200,'Taiwanese'),(201,'Tajik'),(202,'Tanzanian'),(203,'Thai'),(204,'Togolese'),(205,'Tongan'),(206,'Trinidadian'),(207,'Tristanian'),(208,'Tunisian'),(209,'Turkish'),(210,'Turkmen'),(211,'Turks and Caicos Islander'),(212,'Tuvaluan'),(213,'Ugandan'),(214,'Ukrainian'),(215,'Uruguayan'),(216,'Uzbek'),(217,'Vatican citizen'),(218,'Venezuelan'),(219,'Vietnamese'),(220,'Vincentian'),(221,'Wallisian'),(222,'Welsh'),(223,'Yemeni'),(224,'Zambian'),(225,'Zimbabwean');
/*!40000 ALTER TABLE `Nationalities` ENABLE KEYS */;
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
