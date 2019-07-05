-- MySQL dump 10.13  Distrib 8.0.16, for Linux (x86_64)
--
-- Host: localhost    Database: learning_jdbc
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `persons`
--

DROP TABLE IF EXISTS `persons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `persons` (
  `person_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `person_login` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `person_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `person_first_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `person_last_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `person_date_of_birth` date NOT NULL,
  `person_salary` decimal(8,2) NOT NULL,
  PRIMARY KEY (`person_id`),
  UNIQUE KEY `person_login` (`person_login`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persons`
--

LOCK TABLES `persons` WRITE;
/*!40000 ALTER TABLE `persons` DISABLE KEYS */;
INSERT INTO `persons` VALUES (1,'vasya','$2a$05$22Cne8s79a34Yv9hQiLkU.oy4huPZ7aWgdtcD2OkZHkSrKnigCUvq','Vasiliy','Sidorov','1985-03-10',880.00),(4,'megabrain','$2a$05$hXr8rQb6TUhm49Cwncf/6OeCtR7W6wW/FQEmnTnUpTrsXIby8VNnO','Albert','Einstain','1879-03-14',3500.00),(5,'стасямба','$2a$05$UNL9A1RftCTFV6LTD3xn7O8i1n3hJBliZS3ZcY/JRnqkFzqP7A8iu','Станистав','Кину Где Попало','1986-09-14',500.00),(10,'Siarhei','$2a$05$jyGrPd26X0oSUwAkS0Oc4upM/FG39jGpukcbqZYW4HjNH9L/ciMsy','Siarhei','Melez','1965-07-02',320.00),(11,'sequoya','$2a$05$KWnIcxKVHOrCTscNRCwSaukfgJW0w5ghbKV08ixXs3W5vfjTRQuOC','Sequoya','The Three','0001-01-01',50000.00),(12,'astronaut','$2a$05$PSQldTmCUzgTjmggL5l0t.iadQMLoT1DLW2Ut1GCvSXMFj/zN9Gdu','Astronaut','A5 Naebali','2019-05-15',1.00),(13,'juno','$2a$05$Y1JgFJ0GtpYVywIiVJe4TuVMXX8EbbnMPw20Fv6O8BpAl.LGlald.','Lely','Juno','2010-03-15',357.00),(18,'Hash','$2a$05$KrCR5qqxntc.JO/kqAAbt.ejGbQ2pdLUpstDubqjz3SM/WMT5W9de','Hash','User','1965-02-21',0.00),(19,'test','$2a$05$FwOH5H2OLR.qENy9YvW6p.MnIUSvvY1ZT8XL.l4wCIj6JrBHZlWG.','TeSt','tEsT','1985-06-19',0.00);
/*!40000 ALTER TABLE `persons` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `products` (
  `product_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `product_price` decimal(8,2) DEFAULT NULL,
  `person_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `products_FK` (`person_id`),
  CONSTRAINT `products_FK` FOREIGN KEY (`person_id`) REFERENCES `persons` (`person_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (25,'молоко',1.25,4),(27,'молоко',1.25,4),(28,'Milk',1.15,4),(29,'Milk',1.15,4),(30,'КАРТОШКА',1.15,5),(31,'PC',1530.00,13),(32,'Iphone',43.00,13),(33,'Soup',7.50,13),(34,'LapTop',789.00,13),(35,'Bread',5.00,13),(36,'Lamp',3.20,13),(37,'TV',769.00,13),(38,'VHC Tape',1.00,13),(39,'Cd',32.00,13),(40,'mleco',5.00,13),(41,'Тетрадь',1.20,13);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'learning_jdbc'
--
/*!50003 DROP PROCEDURE IF EXISTS `delete_dublicates_from_persons` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `delete_dublicates_from_persons`()
BEGIN
DROP TABLE IF EXISTS `persons_tmp`;
CREATE TABLE `persons_tmp` (
  `person_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `person_login` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `person_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `person_first_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `person_last_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `person_date_of_birth` date NOT NULL,
  `person_salary` decimal(8,2) NOT NULL,
  PRIMARY KEY (`person_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
INSERT IGNORE INTO `persons_tmp` (`person_login`, `person_password`, `person_first_name`, `person_last_name`, `person_date_of_birth`, `person_salary`) SELECT DISTINCT `person_login`, `person_password`, `person_first_name`, `person_last_name`, `person_date_of_birth`, `person_salary` FROM `persons`;
DROP TABLE `persons`;
ALTER TABLE `persons_tmp` RENAME TO `persons`;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `get_most_expensive_product_from_products` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`user`@`localhost` PROCEDURE `get_most_expensive_product_from_products`(OUT o_producr_name varchar(20), OUT o_product_price decimal(8,2))
BEGIN
	SELECT product_name, product_price INTO o_producr_name, o_product_price FROM products where product_price = (SELECT MAX(product_price) FROM products) LIMIT 1;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-05 16:23:37
