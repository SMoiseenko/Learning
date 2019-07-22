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
-- Table structure for table `AUTHORS`
--

DROP TABLE IF EXISTS `AUTHORS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `AUTHORS` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `author_name` varchar(50) NOT NULL,
  `country_id` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `AUTHORS_NAME_UNIQ` (`author_name`),
  KEY `AUTHORS_FK` (`country_id`),
  CONSTRAINT `AUTHORS_FK` FOREIGN KEY (`country_id`) REFERENCES `COUNTRY_OF_BORN` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=256 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AUTHORS`
--

LOCK TABLES `AUTHORS` WRITE;
/*!40000 ALTER TABLE `AUTHORS` DISABLE KEYS */;
INSERT INTO `AUTHORS` VALUES (1,'Lacy Cluely',20),(2,'Lindsay Bonifas',22),(3,'Abbe Begbie',34),(4,'Emmet Dungay',32),(5,'Jarred Humberston',1),(6,'Bobbee Waring',30),(7,'Tamma Stanlock',2),(8,'Kaitlin Colten',23),(9,'Gerta Espinho',33),(10,'Felice Hindes',30),(11,'Rodrick Gladdifh',21),(12,'Farica Cookney',18),(13,'Hildegarde Largen',19),(14,'Winifred Stinton',18),(15,'Celka McCrie',12),(16,'Warner Bertl',13),(17,'Dylan Pieroni',17),(18,'Meredithe Ashborn',35),(19,'Even Gyurko',13),(20,'Heinrick Musicka',23),(21,'Betti Blaise',20),(22,'Melisent Treadger',19),(23,'Lorilee Monkman',21),(24,'Nev Bloy',27),(25,'Sergent Darcey',18),(26,'Linda Pountney',12),(27,'Teddy Hockey',13),(28,'Esme Muldrew',20),(29,'Nedi Weldon',32),(30,'Iggie Lantoph',35),(31,'Merline Burnhams',15),(32,'Carney Flockhart',32),(33,'Adolpho Riddiford',32),(34,'Katine Harmant',13),(35,'Tallie Trousdale',24),(36,'Rheta Brindley',13),(37,'Lanae De Metz',3),(38,'Grady Shurmer',21),(39,'Weidar Alessandretti',20),(40,'Chane Ballintime',27),(41,'Valentijn Domini',13),(42,'Brigida Heynel',9),(43,'Alden Wiggam',2),(44,'Padget Dyball',32),(45,'Drucy Ingleston',15),(46,'Skipton Hitter',35),(47,'Erika Chinnick',17),(48,'Teddie Dailly',30),(49,'Nora Halcro',14),(50,'Conway Simonou',25),(51,'Marthe Lain',15),(52,'Rubina Dewan',6),(53,'Dorothee Gergely',8),(54,'Erena Dresse',11),(55,'Gabi Kydd',9),(56,'Caleb Cordeau]',18),(57,'Wade Royston',37),(58,'Vonnie Florentine',14),(59,'Cyrillus Northall',25),(60,'Deck McPike',10),(61,'Emmalynne Rumble',10),(62,'Silvie Camoys',4),(63,'Korella Vasyaev',21),(64,'Francois Flewan',5),(65,'Coleman Trudgion',37),(66,'Korney Stubbin',14),(67,'Leta Cousens',5),(68,'Earle Aston',22),(69,'Pavla Bengtsson',25),(70,'Cully Fright',38),(71,'Phedra Sygroves',16),(72,'Norbie Flexman',16),(73,'Mahalia Lambertini',22),(74,'Gorden Giraudou',14),(75,'Dori Tollet',28),(76,'Skyler Josefsson',26),(77,'Abbe Banaszewski',16),(78,'Yevette Sigward',24),(79,'Tedd Parsell',31),(80,'Laurella Egginton',16),(81,'Krishna Service',35),(82,'Kevyn Jankin',29),(83,'Giorgi Sexton',18),(84,'Keelby Lushey',25),(85,'Moss Crop',22),(86,'Munmro Crawshaw',35),(87,'Bary Caley',1),(88,'Mair Fines',27),(89,'Emlyn Forrestall',32),(90,'Holt Custy',1),(91,'Barnabe Codlin',17),(92,'Flo Hackworthy',6),(93,'Antonino Bartomeu',36),(94,'Morgen Siseland',31),(95,'Shem Waplinton',10),(96,'Julianna Tarbet',20),(97,'Eberto Rojel',28),(98,'Quincy Kirkbright',13),(99,'Nina Joselin',19),(100,'Dorris Reddoch',25),(101,'Dwight Gaitskell',28),(102,'Ashby Mair',36),(103,'Erinn Hawthorn',7),(104,'Kassie Blyde',5),(105,'Toni Hairsine',7),(106,'Olenolin Maudlen',32),(107,'Shae Prattington',10),(108,'Brett Higgonet',13),(109,'Terri-jo Meus',14),(110,'Jenine Bowell',11),(111,'Almira Elflain',24),(112,'Robinetta D\'Oyley',35),(113,'Lane Keitch',1),(114,'Gerhardine Routley',37),(115,'Almeda Petrichat',27),(116,'Dorree Malsher',8),(117,'Obie Fynes',28),(118,'Marris Szymanowski',26),(119,'Westley Desforges',11),(120,'Estelle Bernade',9),(121,'Bethena Smardon',30),(122,'Meta Royston',9),(123,'Golda Crane',31),(124,'Oneida Bourley',30),(125,'Pegeen Coventon',11),(126,'Rosalie Cleugher',4),(127,'Sullivan McSperrin',2),(128,'Valery Zukierman',32),(129,'Wren Fost',28),(130,'Grace Godman',2),(131,'Lolita D\'Alessandro',7),(132,'Gustavo Grigolon',5),(133,'Mason Lowson',5),(134,'Northrup Ewens',18),(135,'Sunshine Doughartie',38),(136,'Thea Botler',12),(137,'Nollie Vanini',13),(138,'Domini Woof',39),(139,'Gaylene Mitro',24),(140,'Robin Zannuto',4),(141,'Leisha Gourdon',18),(142,'Nettle Beauchamp',21),(143,'Benjy Castan',20),(144,'Fidelia Wimes',6),(145,'Cass Ossenna',27),(146,'Elwira Vanshin',18),(147,'Rickard Launchbury',12),(148,'Jarrad Lambeth',19),(149,'Alameda Donner',15),(150,'Kerianne Huriche',18),(151,'Yuri Gandey',33),(152,'Annabelle Ibell',8),(153,'Katinka Lowfill',36),(154,'Easter Bruyet',3),(155,'Anastasie Dee',3),(156,'Tani Buckler',35),(157,'Kelwin Smithend',14),(158,'Olly Staddom',3),(159,'Justina Scragg',29),(160,'Filippa Alennikov',13),(161,'Melisent Faulkener',2),(162,'Lorette Astall',26),(163,'Arnie Josham',17),(164,'Rinaldo Fearneley',5),(165,'Anna Garrould',24),(166,'Melly Morefield',28),(167,'Chiarra Corradi',15),(168,'Gene Adamek',15),(169,'Marisa Solomonides',21),(170,'Laverna Stallworthy',15),(171,'Koral Hastewell',11),(172,'Cecile Burnet',23),(173,'Sharia Matyugin',31),(174,'Cherilynn Kun',28),(175,'Valentia Dalli',6),(176,'Demetris Shelp',37),(177,'Cyrill Marling',18),(178,'Ninette Gouth',14),(179,'Eryn Wagenen',16),(180,'Collie MacArd',25),(181,'Sherwood Grinham',2),(182,'Kerk Harcarse',10),(183,'Mord Jinks',29),(184,'Bess Slarke',10),(185,'Jaime Jeppe',33),(186,'Dorette Bellelli',6),(187,'Pearle Sealand',33),(188,'Rob Swallow',4),(189,'Wilmer Parkins',20),(190,'Hope Carlett',12),(191,'Randal Anderbrugge',32),(192,'Elane Leander',12),(193,'Hillary Wynne',11),(194,'Grenville Keeler',11),(195,'Analiese Aspel',10),(196,'Krissy Portt',4),(197,'Adel Andric',4),(198,'Avis Grisbrook',13),(199,'Duff Moreton',15),(200,'Consolata Tatlowe',26),(201,'Dodie Eslemont',30),(202,'Reiko Screach',8),(203,'Vassili Fearnyhough',4),(204,'Hailey Pottes',16),(205,'Brooks Laffan',16),(206,'Thornie McIlwraith',15),(207,'Charissa Gouley',35),(208,'Salome Tithecote',18),(209,'Ingelbert Govenlock',15),(210,'Christopher Battleson',5),(211,'Tiffie Challin',13),(212,'Ned Wiz',22),(213,'Robinet Gennrich',2),(214,'Ysabel Crickmoor',2),(215,'Andrei Polgreen',37),(216,'Jerald Sheron',29),(217,'Roana Barkas',36),(218,'Isabelle Mowatt',39),(219,'Deanne Frodsam',20),(220,'Mattias Zum Felde',13),(221,'Rudolfo Points',8),(222,'Guntar Pauls',6),(223,'Lorri Preon',16),(224,'Abbe Vashchenko',22),(225,'Quinton Donat',39),(226,'Rowland Donavan',2),(227,'Alisander Thexton',14),(228,'Tonnie Matevosian',34),(229,'Pietro Joel',34),(230,'Britni Burnip',12),(231,'Patience Washbrook',36),(232,'Pansie MacCart',13),(233,'Dana Dafydd',19),(234,'Jeanie Hacking',24),(235,'Haven Kingscott',9),(236,'Fidela Gocher',18),(237,'Cart Cramond',6),(238,'Bendix Ionn',30),(239,'Edy Rabat',28),(240,'Olin Le Galle',36),(241,'Emlyn Boanas',30),(242,'Forrester Greenman',16),(243,'Chiarra MacVay',23),(244,'Marianna Giacopelo',29),(245,'Boycey Doorly',22),(246,'Huberto Dunhill',37),(247,'Chariot Watkins',34),(248,'Ambur Skilbeck',22),(249,'Artie Parmiter',26),(250,'Cherida Conville',3);
/*!40000 ALTER TABLE `AUTHORS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `BOOKS`
--

DROP TABLE IF EXISTS `BOOKS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `BOOKS` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `book_name` varchar(255) DEFAULT NULL,
  `year_id` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `BOOKS_NAME_UNIQ` (`book_name`),
  KEY `BOOKS_FK` (`year_id`),
  CONSTRAINT `BOOKS_FK` FOREIGN KEY (`year_id`) REFERENCES `YEAR_OF_PUBLISHING` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=129 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BOOKS`
--

LOCK TABLES `BOOKS` WRITE;
/*!40000 ALTER TABLE `BOOKS` DISABLE KEYS */;
INSERT INTO `BOOKS` VALUES (1,'Tampflex',22),(2,'Cardguard',15),(3,'Stim',34),(4,'Matsoft',11),(5,'Stronghold',24),(6,'Flowdesk',10),(7,'Fintone',3),(8,'Regrant',9),(9,'Namfix',26),(10,'Viva',32),(11,'Prodder',23),(12,'Wrapsafe',4),(13,'Zathin',11),(14,'Konklux',34),(15,'Voyatouch',16),(16,'Veribet',40),(17,'Bigtax',4),(18,'Solarbreeze',18),(19,'Home Ing',18),(20,'Bytecard',6),(21,'Quo Lux',22),(22,'Span',1),(23,'Ronstring',20),(24,'Tin',28),(25,'Duobam',27),(26,'Trippledex',23),(27,'Latlux',2),(28,'Bitwolf',27),(29,'Holdlamis',8),(30,'Gembucket',11),(31,'Fixflex',8),(32,'Transcof',16),(33,'Kanlam',16),(34,'Aerified',6),(35,'Pannier',22),(36,'Flexidy',6),(37,'Toughjoyfax',14),(38,'Overhold',33),(39,'Sub-Ex',40),(40,'Ventosanzap',1),(41,'Bitchip',28),(42,'Bamity',28),(43,'Alphazap',26),(44,'Cookley',9),(45,'Biodex',15),(46,'Tresom',14),(47,'Keylex',34),(48,'Temp',3),(49,'Zoolab',24),(50,'Tres-Zap',22),(51,'Andalax',36),(52,'Opela',29),(53,'Treeflex',37),(54,'Voltsillam',34),(55,'Daltfresh',36),(56,'Cardify',9),(57,'Asoka',8),(58,'Rank',31),(59,'Subin',6),(60,'Greenlam',2),(61,'Zontrax',11),(62,'Konklab',24),(63,'Zaam-Dox',12),(64,'Mat Lam Tam',36),(65,'Stringtough',24),(66,'Y-Solowarm',10),(67,'Otcom',13),(68,'Hatity',6),(69,'Zamit',26),(70,'Fix San',39),(71,'Domainer',24),(72,'Sonair',28),(73,'Job',11),(74,'Redhold',23),(75,'Lotlux',28),(76,'Vagram',8),(77,'Y-find',3),(78,'It',27),(79,'Alpha',5),(80,'Lotstring',37),(81,'Tempsoft',28),(128,'The Story Of Univerce',41);
/*!40000 ALTER TABLE `BOOKS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `BOOKS_AUTHORS`
--

DROP TABLE IF EXISTS `BOOKS_AUTHORS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `BOOKS_AUTHORS` (
  `author_id` bigint(20) unsigned NOT NULL,
  `book_id` bigint(20) unsigned NOT NULL,
  KEY `BOOKS_ID_FK` (`book_id`),
  KEY `AUTHOR_ID_FK` (`author_id`),
  CONSTRAINT `AUTHOR_ID_FK` FOREIGN KEY (`author_id`) REFERENCES `AUTHORS` (`id`),
  CONSTRAINT `BOOKS_ID_FK` FOREIGN KEY (`book_id`) REFERENCES `BOOKS` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BOOKS_AUTHORS`
--

LOCK TABLES `BOOKS_AUTHORS` WRITE;
/*!40000 ALTER TABLE `BOOKS_AUTHORS` DISABLE KEYS */;
INSERT INTO `BOOKS_AUTHORS` VALUES (1,71),(1,74),(1,81),(2,26),(2,33),(2,76),(3,30),(3,38),(3,80),(4,5),(4,55),(4,70),(4,72),(4,74),(5,3),(5,41),(5,52),(5,59),(6,76),(7,25),(7,44),(7,45),(8,29),(8,36),(8,42),(8,57),(9,33),(9,40),(10,29),(10,45),(10,47),(10,52),(11,73),(12,17),(13,11),(13,40),(14,62),(15,32),(15,46),(15,60),(15,65),(16,26),(16,41),(16,64),(16,78),(17,13),(18,31),(18,55),(19,23),(19,30),(20,5),(20,22),(20,44),(20,73),(21,4),(21,19),(21,55),(22,29),(22,37),(22,65),(22,79),(23,18),(23,35),(24,2),(24,37),(24,72),(25,19),(25,33),(25,37),(25,58),(25,67),(25,71),(26,9),(27,7),(27,62),(27,63),(27,77),(27,81),(29,9),(29,22),(30,9),(30,10),(30,44),(31,18),(31,23),(31,46),(31,53),(31,60),(31,72),(32,20),(32,39),(33,6),(33,66),(34,5),(34,6),(34,39),(34,52),(34,56),(34,73),(34,76),(34,80),(35,4),(35,8),(35,26),(35,36),(35,63),(35,78),(36,64),(36,68),(36,73),(36,75),(37,25),(37,36),(37,44),(37,45),(37,48),(38,14),(38,15),(38,26),(38,37),(38,42),(38,44),(38,50),(38,69),(39,17),(39,22),(39,34),(39,37),(39,46),(39,53),(39,78),(41,1),(41,2),(41,38),(41,61),(41,73),(42,12),(42,71),(43,72),(44,10),(44,24),(44,66),(45,20),(45,44),(46,2),(46,7),(46,36),(46,45),(46,69),(48,7),(50,15),(50,32),(50,44),(50,64),(50,69),(51,17),(51,27),(51,30),(51,42),(52,9),(52,31),(52,45),(52,78),(53,51),(54,5),(54,9),(54,76),(55,23),(55,40),(55,49),(56,12),(56,20),(56,72),(57,30),(57,47),(57,53),(57,59),(57,60),(57,67),(57,71),(58,35),(58,36),(58,58),(58,78),(59,14),(59,33),(59,34),(59,43),(59,45),(59,68),(60,55),(60,68),(60,72),(61,29),(62,20),(62,23),(62,66),(62,75),(63,3),(63,8),(63,39),(63,53),(63,62),(63,70),(64,1),(64,4),(64,40),(64,49),(64,52),(65,22),(65,40),(65,62),(66,1),(66,24),(66,28),(66,35),(66,60),(67,10),(67,63),(67,67),(67,70),(68,28),(68,32),(68,42),(68,66),(69,37),(70,59),(71,8),(71,39),(71,54),(72,22),(72,39),(72,79),(73,1),(74,18),(75,36),(75,79),(76,27),(77,27),(77,65),(78,8),(78,27),(78,41),(78,68),(79,8),(79,13),(79,19),(79,25),(79,51),(79,81),(80,20),(80,35),(80,61),(80,76),(82,65),(82,76),(83,17),(83,22),(83,27),(83,80),(85,1),(85,41),(85,58),(85,81),(86,27),(87,2),(87,37),(87,63),(88,46),(89,45),(89,68),(90,7),(90,12),(90,70),(90,75),(91,35),(91,53),(93,10),(93,16),(93,18),(93,21),(93,32),(93,72),(93,75),(94,32),(94,38),(94,66),(94,79),(95,28),(96,70),(97,45),(98,37),(98,48),(98,57),(98,78),(99,3),(99,9),(99,33),(99,39),(99,42),(99,47),(99,66),(100,17),(100,26),(100,51),(100,56),(100,57),(100,63),(100,74),(100,79),(101,16),(101,35),(101,46),(102,33),(102,71),(103,6),(103,23),(103,41),(103,52),(103,77),(104,48),(105,29),(105,32),(105,67),(106,39),(106,46),(107,63),(108,25),(109,2),(109,5),(109,15),(109,67),(109,71),(109,72),(110,1),(110,5),(110,16),(110,52),(110,80),(111,15),(111,24),(111,38),(111,55),(112,13),(112,61),(112,68),(113,10),(113,25),(113,73),(114,6),(114,42),(114,53),(114,64),(115,54),(116,68),(116,72),(117,1),(117,50),(118,45),(118,55),(118,79),(119,1),(119,10),(119,18),(119,31),(119,39),(119,50),(119,52),(119,57),(119,60),(120,64),(120,77),(121,35),(122,33),(123,12),(123,17),(123,44),(123,45),(124,3),(124,9),(124,52),(124,55),(125,23),(125,39),(125,42),(125,43),(125,48),(125,69),(126,27),(126,49),(126,56),(127,4),(127,15),(128,70),(129,60),(129,73),(130,3),(130,17),(130,42),(130,46),(130,65),(131,35),(131,62),(131,81),(132,26),(132,66),(133,25),(133,61),(134,1),(134,33),(134,38),(134,60),(134,66),(135,12),(135,44),(136,7),(137,43),(137,63),(138,23),(139,57),(140,72),(141,11),(141,42),(142,1),(142,37),(143,3),(143,33),(143,49),(145,12),(146,20),(146,29),(146,41),(148,4),(148,75),(149,9),(149,44),(149,46),(149,49),(149,58),(151,13),(151,55),(151,73),(152,16),(153,34),(154,71),(155,30),(155,35),(156,3),(156,6),(156,41),(156,56),(156,69),(156,77),(156,81),(157,1),(157,8),(157,39),(157,41),(157,47),(158,50),(158,66),(159,31),(159,43),(160,17),(160,61),(161,35),(161,44),(162,2),(162,44),(162,78),(163,37),(163,70),(163,78),(164,7),(164,71),(165,18),(165,67),(166,21),(166,65),(166,66),(167,8),(167,46),(167,57),(167,59),(167,80),(168,8),(168,23),(168,32),(168,59),(168,73),(169,72),(169,77),(170,8),(170,45),(170,79),(171,2),(171,30),(171,48),(172,11),(172,54),(172,58),(174,9),(174,46),(174,65),(175,11),(175,22),(175,41),(175,65),(175,67),(176,36),(176,45),(176,58),(177,34),(177,69),(178,13),(178,16),(178,39),(178,81),(179,30),(179,46),(179,76),(179,78),(180,15),(180,16),(180,44),(181,3),(181,5),(181,57),(181,63),(181,75),(182,14),(182,26),(182,30),(182,47),(183,50),(183,64),(183,69),(184,1),(184,47),(185,16),(185,41),(185,51),(185,75),(185,77),(185,79),(186,10),(186,44),(187,4),(187,33),(187,44),(189,14),(189,24),(189,43),(189,59),(190,77),(191,27),(192,6),(192,12),(192,34),(193,10),(193,14),(193,54),(193,65),(193,75),(193,79),(194,74),(194,77),(195,10),(195,27),(195,31),(195,65),(196,6),(196,46),(197,27),(197,28),(197,42),(197,53),(197,71),(198,18),(198,66),(200,18),(200,28),(200,41),(200,65),(201,12),(201,31),(201,38),(201,55),(201,70),(202,6),(202,17),(202,38),(202,48),(202,49),(202,56),(202,60),(202,80),(203,35),(204,57),(205,25),(205,54),(206,3),(206,19),(206,46),(206,50),(206,60),(207,35),(207,40),(207,52),(207,59),(208,33),(208,52),(208,79),(209,14),(209,41),(210,34),(210,39),(210,72),(211,19),(211,75),(212,19),(212,23),(212,34),(212,68),(213,37),(213,73),(214,29),(215,11),(215,12),(215,17),(215,20),(215,27),(215,46),(215,71),(217,10),(217,24),(217,33),(218,9),(218,17),(218,34),(219,4),(219,28),(219,39),(220,28),(220,66),(221,3),(221,14),(221,23),(221,58),(222,4),(222,49),(223,38),(223,50),(224,33),(226,29),(226,36),(227,17),(227,29),(227,50),(228,3),(228,26),(228,70),(228,73),(229,55),(229,61),(229,67),(230,10),(230,18),(230,26),(230,49),(230,58),(230,70),(231,16),(231,30),(231,42),(231,46),(232,9),(232,24),(232,51),(232,79),(233,74),(233,75),(234,55),(234,70),(235,36),(235,49),(235,50),(236,14),(236,73),(237,72),(237,80),(238,2),(238,23),(238,81),(239,16),(239,34),(239,38),(239,42),(239,67),(240,15),(240,23),(240,41),(241,52),(241,70),(242,20),(242,58),(243,19),(243,37),(243,41),(243,43),(243,62),(244,47),(244,52),(244,54),(245,48),(245,56),(246,1),(246,29),(246,68),(247,63),(248,6),(248,20),(248,52),(249,11),(249,29),(249,42),(249,60),(249,65),(249,67),(250,5),(250,19),(250,48),(250,56),(199,53),(199,128),(216,29),(216,56),(216,68),(216,128),(225,56),(225,128);
/*!40000 ALTER TABLE `BOOKS_AUTHORS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `COUNTRY_OF_BORN`
--

DROP TABLE IF EXISTS `COUNTRY_OF_BORN`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `COUNTRY_OF_BORN` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `country` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `COUNTRY_OF_BORN_UNIQ_NAME` (`country`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `COUNTRY_OF_BORN`
--

LOCK TABLES `COUNTRY_OF_BORN` WRITE;
/*!40000 ALTER TABLE `COUNTRY_OF_BORN` DISABLE KEYS */;
INSERT INTO `COUNTRY_OF_BORN` VALUES (20,'Angola'),(33,'Argentina'),(38,'Benin'),(21,'Bosnia and Herzegovina'),(7,'Brazil'),(1,'China'),(39,'Colombia'),(29,'Cuba'),(11,'Czech Republic'),(32,'Denmark'),(22,'Egypt'),(16,'Ethiopia'),(14,'France'),(9,'Indonesia'),(5,'Iran'),(35,'Ivory Coast'),(36,'Jamaica'),(10,'Japan'),(6,'Kazakhstan'),(25,'Malaysia'),(34,'Mauritania'),(27,'Mongolia'),(28,'Morocco'),(31,'Nicaragua'),(13,'Philippines'),(8,'Poland'),(17,'Portugal'),(15,'Russia'),(24,'Saudi Arabia'),(37,'Slovenia'),(30,'South Korea'),(12,'Sweden'),(23,'Syria'),(18,'Tajikistan'),(26,'Thailand'),(3,'Uganda'),(2,'Ukraine'),(19,'United States'),(4,'Venezuela');
/*!40000 ALTER TABLE `COUNTRY_OF_BORN` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `YEAR_OF_PUBLISHING`
--

DROP TABLE IF EXISTS `YEAR_OF_PUBLISHING`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `YEAR_OF_PUBLISHING` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `year` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `YEAR_OF_PUBLISHING_UNIQ_YEAR` (`year`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `YEAR_OF_PUBLISHING`
--

LOCK TABLES `YEAR_OF_PUBLISHING` WRITE;
/*!40000 ALTER TABLE `YEAR_OF_PUBLISHING` DISABLE KEYS */;
INSERT INTO `YEAR_OF_PUBLISHING` VALUES (35,'1917-08-07'),(24,'1917-12-03'),(27,'1919-03-18'),(23,'1921-04-12'),(12,'1922-11-19'),(7,'1924-09-01'),(13,'1930-01-07'),(16,'1931-11-27'),(9,'1932-10-07'),(39,'1935-02-02'),(38,'1944-10-17'),(18,'1947-02-05'),(1,'1947-02-22'),(31,'1949-07-30'),(10,'1950-03-16'),(30,'1950-06-22'),(36,'1950-09-06'),(32,'1960-10-29'),(3,'1964-11-13'),(37,'1966-07-27'),(11,'1967-09-08'),(19,'1971-10-03'),(26,'1974-08-31'),(4,'1975-04-25'),(34,'1979-01-01'),(6,'1984-11-05'),(40,'1986-02-07'),(21,'1986-03-15'),(29,'1989-07-03'),(28,'1994-11-26'),(17,'1995-08-07'),(20,'1995-08-16'),(5,'1997-06-11'),(41,'1998-07-26'),(22,'1999-01-06'),(8,'2007-09-05'),(15,'2009-06-28'),(14,'2013-08-17'),(33,'2014-08-05'),(2,'2017-12-08'),(25,'2017-12-14');
/*!40000 ALTER TABLE `YEAR_OF_PUBLISHING` ENABLE KEYS */;
UNLOCK TABLES;

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
INSERT INTO `persons` VALUES (4,'megabrain','$2a$05$hXr8rQb6TUhm49Cwncf/6OeCtR7W6wW/FQEmnTnUpTrsXIby8VNnO','Albert','Einstain','1879-03-14',3500.00),(5,'стасямба','$2a$05$UNL9A1RftCTFV6LTD3xn7O8i1n3hJBliZS3ZcY/JRnqkFzqP7A8iu','Станистав','Кину Где Попало','1986-09-14',500.00),(10,'Siarhei','$2a$05$jyGrPd26X0oSUwAkS0Oc4upM/FG39jGpukcbqZYW4HjNH9L/ciMsy','Siarhei','Melez','1965-07-02',320.00),(11,'sequoya','$2a$05$KWnIcxKVHOrCTscNRCwSaukfgJW0w5ghbKV08ixXs3W5vfjTRQuOC','Sequoya','The Three','0001-01-01',50000.00),(12,'astronaut','$2a$05$PSQldTmCUzgTjmggL5l0t.iadQMLoT1DLW2Ut1GCvSXMFj/zN9Gdu','Astronaut','A5 Naebali','2019-05-15',1.00),(13,'juno','$2a$05$Y1JgFJ0GtpYVywIiVJe4TuVMXX8EbbnMPw20Fv6O8BpAl.LGlald.','Lely','Juno','2010-03-15',357.00),(18,'Hash','$2a$05$KrCR5qqxntc.JO/kqAAbt.ejGbQ2pdLUpstDubqjz3SM/WMT5W9de','Hash','User','1965-02-21',0.00),(19,'test','$2a$05$FwOH5H2OLR.qENy9YvW6p.MnIUSvvY1ZT8XL.l4wCIj6JrBHZlWG.','TeSt','tEsT','1985-06-19',0.00);
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
/*!50003 DROP PROCEDURE IF EXISTS `delete_dublicates` */;
ALTER DATABASE `learning_jdbc` CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
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
ALTER DATABASE `learning_jdbc` CHARACTER SET utf8 COLLATE utf8_general_ci ;
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

-- Dump completed on 2019-07-22 23:14:52
