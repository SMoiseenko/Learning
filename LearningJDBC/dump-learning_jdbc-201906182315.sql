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
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `login` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `date_of_birth` date NOT NULL,
  `salary` decimal(10,0) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persons`
--

LOCK TABLES `persons` WRITE;
/*!40000 ALTER TABLE `persons` DISABLE KEYS */;
INSERT INTO `persons` VALUES (1,'vasya','vas123','Vasiliy','Sidorov','1985-03-10',880),(2,'vasya','vas123','Vasiliy','Sidorov','1985-03-10',550),(4,'megabrain','pass','Albert','Einstain','1879-03-14',3500),(5,'стасямба','1стасололо6','Станистав','Кину Где Попало','1986-09-14',500),(6,'terminator','t800','Arnold','Shvarcnigger','1948-03-24',1350);
/*!40000 ALTER TABLE `persons` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `products` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `price` decimal(8,2) DEFAULT NULL,
  `person_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `products_FK` (`person_id`),
  CONSTRAINT `products_FK` FOREIGN KEY (`person_id`) REFERENCES `products` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (2,'Кефир',2203.00,6),(3,'Vodka',2666.00,6),(4,'Пивас',2114.00,6),(5,'Молоко',2105.00,6),(6,'Кефир',2203.00,6),(7,'Vodka',2666.00,6),(8,'Пивас',2114.00,6),(9,'Молоко',2105.00,6),(10,'Кефир',2203.00,6),(11,'Vodka',2666.00,6),(12,'Пивас',2114.00,6),(13,'Молоко',1105.00,6),(14,'Кефир',1203.00,6),(15,'Vodka',1666.00,6),(16,'Пивас',1114.00,6),(17,'Молоко',1105.00,6),(18,'Кефир',1203.00,6),(19,'Vodka',1666.00,6),(20,'Пивас',1114.00,6),(21,'Молоко',1105.00,6),(22,'Кефир',1203.00,6),(23,'Vodka',1666.00,6),(24,'Пивас',1114.00,6);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'learning_jdbc'
--
/*!50003 DROP PROCEDURE IF EXISTS `delete_dublicates` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `delete_dublicates`()
BEGIN
DROP TABLE IF EXISTS `persons_tmp`;
CREATE TABLE `persons_tmp`(
`id` bigint NOT NULL AUTO_INCREMENT,
`login` varchar(255) NOT NULL,
`password` varchar(255) NOT NULL,
`first_name` varchar(255) NOT NULL,
`last_name` varchar(255) NOT NULL,
`date_of_birth` date NOT NULL,
`salary` decimal(10,0) NOT NULL,
PRIMARY KEY (`id`)
);
INSERT IGNORE INTO `persons_tmp` (`login`, `password`, `first_name`, `last_name`, `date_of_birth`, `salary`) SELECT DISTINCT `login`, `password`, `first_name`, `last_name`, `date_of_birth`, `salary` FROM `persons`;
DROP TABLE `persons`;
ALTER TABLE `persons_tmp` RENAME TO `persons`;
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

-- Dump completed on 2019-06-18 23:15:20
