-- MySQL dump 10.13  Distrib 8.0.17, for Linux (x86_64)
--
-- Host: localhost    Database: learning_jdbc
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
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
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `AUTHORS` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `author_name` varchar(50) NOT NULL,
  `country_id` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `AUTHORS_NAME_UNIQ` (`author_name`),
  KEY `FKfte2t0d5op66difynuhvbp75j` (`country_id`)
) ENGINE=InnoDB AUTO_INCREMENT=529 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AUTHORS`
--

LOCK TABLES `AUTHORS` WRITE;
/*!40000 ALTER TABLE `AUTHORS` DISABLE KEYS */;
INSERT INTO `AUTHORS` VALUES (18,'Mommy Sandcroft',54),(19,'Marian Henstone',45),(20,'Catina D\'Alessandro',51),(21,'Patty Forde',40),(22,'Kameko Sheather',55),(23,'Malinda Scrannage',51),(24,'Clementine Copley',45),(25,'Reinaldo Sinclair',49),(26,'Bruce Lowder',44),(27,'Toddie Harwell',41),(28,'Tore Dyson',56),(29,'Margaretta Buntin',49),(30,'Austina Milksop',42),(31,'Dorthy Atterley',42),(32,'Ayn Gillingham',59),(33,'Maren Maddie',47),(34,'Merrily Claw',42),(35,'Thomasa Crevagh',44),(36,'Dallas Fuggle',38),(37,'Reynolds Rickardes',38),(38,'Andrew Hewlings',39),(39,'Chlo Ffoulkes',37),(40,'Eulalie Anten',51),(41,'Carla Hawick',50),(42,'Hill Londors',40),(43,'Stormie Sangra',46),(44,'Etta Tanman',55),(45,'Doro Kettell',37),(46,'Monro Naulty',57),(47,'Janessa Castan',42),(48,'Saidee Brown',43),(49,'Prudy Olding',48),(50,'Tuesday Glazyer',47),(51,'Darsie Kerslake',59),(52,'Cathlene Howieson',59),(53,'Joseito Willox',56),(54,'Emlen Albasini',40),(55,'Emmalyn Gemlbett',56),(56,'Paulie Fritschmann',55),(57,'Norrie Swallow',39),(58,'Fey Baroux',57),(59,'Dania Lampens',44),(60,'Valma Leishman',58),(61,'Imojean Saura',45),(62,'Jamaal Fennick',37),(63,'Stefa Perle',49),(64,'Viva Hedlestone',50),(65,'Nilson Stollmeyer',41),(66,'Augustin Lampitt',49),(67,'Chanda Reardon',53),(68,'Kitty Pendry',37),(69,'Alanah Lineen',43),(70,'Reynold Lamplugh',59),(71,'Consuela Royston',40),(72,'Heloise Pinner',47),(73,'Egan Weekley',52),(74,'Clareta Pearse',57),(75,'Raychel Boylin',59),(76,'Sada Cuzen',46),(77,'Leopold Spring',45),(78,'Brigitte Biever',46),(79,'Anjela Feldmark',47),(80,'Morey Winwood',43),(81,'Vanny Klaaassen',46),(82,'Hasheem Malins',59),(83,'Lowell Lourenco',44),(84,'Johanna Hurworth',46),(85,'Johnette Drinkel',52),(86,'Melisent Whitechurch',43),(87,'Oberon Wellbelove',55),(88,'Noami Bollam',44),(89,'Thornton Pauletti',47),(90,'Jocko Island',55),(91,'Guenevere Ziem',44),(92,'Hilly Hardes',49),(93,'Merilyn Drinnan',49),(94,'Sapphire Millan',52),(95,'Cynde Puddephatt',52),(96,'Kingston Clout',43),(97,'Winston Angrock',53),(98,'Coretta Breheny',46),(99,'Gregg Deveril',59),(100,'Stacee MacDunleavy',53),(101,'Jo Ech',59),(102,'Konstanze Mille',48),(103,'Krystyna Thorlby',46),(104,'Aurilia Bengtsson',54),(105,'Verla Easlea',41),(106,'Shea Spini',45),(107,'Dirk MacTimpany',49),(108,'Cesar Filkin',58),(109,'Adrianne Brick',41),(110,'Issy Seedhouse',44),(111,'Madelena Sebrens',54),(112,'Nelli Yanez',47),(113,'Raymond Hryniewicz',42),(114,'Cilka Broodes',54),(115,'Garwin Cockarill',58),(116,'Denny Roff',52),(117,'Ezequiel Manuel',55),(118,'Curran Hubbard',47),(119,'Gratia Vere',42),(120,'Kelila Harring',43),(121,'Alyss Rembrandt',39),(122,'Reamonn Seres',43),(123,'Freeland Desborough',52),(124,'Andres Tune',48),(125,'Linet De Giorgi',37),(126,'Carine Rendbaek',55),(127,'Sergei Nicholson',53),(128,'Nicol Jambrozek',39),(129,'Stefan Walsh',58),(130,'Belle McCaughren',56),(131,'Tammie Pestor',40),(132,'Edy Zemler',56),(133,'Giorgi Malan',47),(134,'Nariko Dick',40),(135,'Kirsti McGeoch',47),(136,'Clementius McIndrew',55),(137,'Chicky Murney',47),(138,'Bastien Kennagh',52),(139,'Nina Wescott',39),(140,'Emmy Costelloe',52),(141,'Shawna Farish',49),(142,'Lola Clurow',58),(143,'Xylina Grigolashvill',45),(144,'Heath Oulett',38),(145,'Frazier Dreinan',47),(146,'Gabe Jorez',59),(147,'Arty Corroyer',57),(148,'Ramonda Dafter',49),(149,'Beatrisa Cobley',47),(150,'Dacy Perring',48),(151,'Reggy Testo',39),(152,'Luciana Wettern',50),(153,'Ellene Deem',46),(154,'Anna Emms',45),(155,'Barty Heys',51),(156,'Kassey Korb',46),(157,'Happy Oaks',57),(158,'Bobbie London',50),(159,'Kit Fancy',41),(160,'Verne Pizzie',55),(161,'Lenard Brosch',38),(162,'Oriana Northfield',43),(163,'Claribel Anderbrugge',37),(164,'Earle Easton',50),(165,'Donna Chanson',57),(166,'Maud Kobes',52),(167,'Webster Stolberg',50),(168,'Eleni Huddy',38),(169,'Tobias Conlaund',57),(170,'Cyrille Faux',45),(171,'Anselm Powder',47),(172,'Jedd Sitlington',45),(173,'Cullin Beek',44),(174,'Deina Figge',44),(175,'Clarance MacAndrew',51),(176,'Auberta Ramsey',43),(177,'Norrie Baynham',49),(178,'Drucie Glasscoo',52),(179,'Carlene Edworthye',56),(180,'Aylmar Velasquez',48),(181,'Harri Humbles',40),(182,'Sascha Shilstone',37),(183,'Eran Stanlack',48),(184,'Retha Schwandner',54),(185,'Mallory Dhennin',46),(186,'Imelda Snape',56),(187,'Perice Lewendon',52),(188,'Ethe Wisham',56),(189,'Martie Grigsby',43),(190,'Cyndi Moncreiff',54),(191,'Freeman Jacobovitz',41),(192,'Kenon Drover',53),(193,'Christel Kayzer',58),(194,'Pierre Hullett',43),(195,'Jerad Greeding',43),(196,'Kelby Beausang',47),(197,'Benedicta Biddwell',48),(198,'Mechelle Mellody',47),(199,'Sean Redington',50),(200,'Barney Bidgod',57),(201,'Saundra Denkel',59),(202,'Silva Twelvetree',41),(203,'Hussein Firby',41),(204,'Jennine Edess',44),(205,'Imojean Beevens',55),(206,'Kamillah Rothermel',47),(207,'Eloisa Standering',58),(208,'Aloisia Surgey',49),(209,'Cullin Enbury',48),(210,'Ettore Seiler',49),(211,'Stevy Ellice',59),(212,'Corrie Bembrigg',41),(213,'Kerrin Frisel',41),(214,'Karole Shaddick',55),(215,'Ronni Fairhead',38),(216,'Clemmie Ripley',49),(217,'Selia Sayer',49),(218,'Sibyl Elmes',46),(219,'Barby Binyon',50),(220,'Othelia Addyman',54),(221,'Arleen Beagen',49),(222,'Dani Mewis',58),(223,'Camila Fawdery',48),(224,'Atalanta Boar',40),(225,'Ephraim But',37),(226,'Moore Claire',53),(227,'Angelika Rathjen',56),(228,'Carma Dollman',52),(229,'Bronny Atteridge',45),(230,'Tymothy Rowler',51),(231,'Gaye Conman',53),(232,'Hilliary Matzke',37),(233,'Jennie Setterfield',53),(234,'Gallard Pauncefoot',38),(235,'Oliy Ollerhead',48),(236,'Hendrik Raise',41),(237,'Yovonnda Hinsch',42),(238,'Elna O\'Geneay',45),(239,'Kamila Ould',54),(240,'Elvis Tolman',49),(241,'Gwenette Pottes',43),(242,'Gallagher Kydd',51),(243,'Hayden Ashtonhurst',58),(244,'Jandy Crome',50),(245,'Nanci Rollinshaw',42),(246,'Bobbe Ramsted',54),(247,'Cherianne Yarnall',49),(248,'Reuven Edelheid',56),(249,'Thomasa Sanderson',45),(250,'Alexandra Wyburn',52),(251,'Marinna Pulsford',57),(252,'Bee Merveille',37),(253,'Clemmie Cowdroy',43),(254,'Evan Cankett',58),(255,'Susanna Ellerton',41),(256,'Stephen Pullar',39),(257,'Shanon Apdell',53),(258,'Torrin Shatliff',39),(259,'Delainey Noore',45),(260,'Slade Stenbridge',59),(261,'Karolina Skilling',54),(262,'Kaitlynn Westbury',40),(263,'Betta Rangeley',42),(264,'Cherye MacMenamin',37),(265,'Boot Andri',42),(266,'Adrea Fairweather',44),(267,'Andrei Orpen',50),(268,'Arther McFadden',57),(269,'Sherri Denerley',48),(270,'Yuma Pretorius',40),(271,'Glen Orrocks',41),(272,'Fedora Athow',55),(273,'Galvan Vinden',41),(274,'Georgiana Claasen',46),(275,'Randie Haslum',55),(276,'Jaynell Hibling',42),(277,'Palm Haylor',45),(278,'Barbabas Stanmore',39),(279,'Sigfrid Topaz',43),(280,'Brendis Heephy',55),(281,'Poppy Serrier',43),(282,'Laurena Filippazzo',51),(283,'Walton Probat',58),(284,'Korrie Ruppeli',40),(285,'Hilarius Willatt',45),(286,'Ricky Parfett',49),(287,'Susette Hause',56),(288,'Leann Basset',43),(289,'Alford Woolacott',50),(290,'Patty Bowser',48),(291,'Vera Hanney',59),(292,'Herve Colaco',38),(293,'Isabelle Merrydew',47),(294,'Cheryl Callington',42),(295,'Bear Kunzel',40),(296,'Maurita Chitty',37),(297,'Bunnie Reed',58),(298,'Mart Otteridge',56),(299,'Pepillo Fawssett',47),(300,'Dulcinea Ferrone',46),(301,'Bree Surgood',57),(302,'Shea Koppel',54),(303,'Butch Leask',44),(304,'Franchot Mashro',48),(305,'Myles Hourihane',37),(306,'Nissy Orsi',51),(307,'Frederique Careswell',55),(308,'Hinze Haliday',41),(309,'Nollie Cambridge',53),(310,'Marcellina Semens',52),(311,'Orella Hartly',47),(312,'Casey Hunting',39),(313,'Cassie Kiltie',52),(314,'Cherilynn Jarret',40),(315,'Joey Baalham',58),(316,'Shadow Gocke',52),(317,'Phebe Marrow',56),(318,'Gaynor Hubber',50),(319,'Jenni Syde',49),(320,'Suzette Foulcher',58),(321,'Glenn Kosiada',51),(322,'Georgetta Trudgian',38),(323,'Vail Harrad',48),(324,'Rebeka Poulglais',37),(325,'Mord Eates',38),(326,'Faun Beers',51),(327,'Karole Gillise',49),(328,'Shaylynn Jopling',45),(329,'Virgilio Laite',39),(330,'Marnia Olley',39),(331,'Asher O\'Currane',47),(332,'Leroy Bernardot',46),(333,'Bert Scoterbosh',54),(334,'Babs Stango',45),(335,'Sax O\'Shee',41),(336,'Inger Jessup',44),(337,'Jaime Moro',46),(338,'Blaire Oliveras',50),(339,'Gal Di Domenico',37),(340,'Bernita Martine',50),(341,'Elaina Crosham',57),(342,'Hermy Legerwood',39),(343,'Shurwood Risborough',43),(344,'Lynn Bartczak',46),(345,'Morganica Akam',38),(346,'Susie Tee',51),(347,'Adriane Lawlance',42),(348,'Vladimir Drayson',40),(349,'Arri Heaysman',47),(350,'Christie Covolini',56),(351,'Romona Bein',39),(352,'Rivalee Agneau',59),(353,'Sandy Prayer',59),(354,'Roberto Woodall',53),(355,'Karlyn McGarrie',52),(356,'Izabel Scown',49),(357,'Monty Minchi',41),(358,'Katharina Bassett',40),(359,'Richie Burchess',46),(360,'Sheila-kathryn Knott',58),(361,'Rayna Perrelli',45),(362,'Svend Fergyson',55),(363,'Byrle Kilmurry',53),(364,'Beatrix Cominoli',39),(365,'Eyde Terron',37),(366,'Karrah Gingell',44),(367,'Aile Warrior',53),(368,'Broddy McGeffen',56),(369,'Sandy Wedmore.',44),(370,'Umberto Rowan',42),(371,'Davida Braidford',51),(372,'Griffie Smail',53),(373,'Morty Alton',40),(374,'Zared Buttrum',43),(375,'Jude Cotesford',52),(376,'Salomon Baggiani',56),(377,'Leyla Dreinan',40),(378,'Tome Huyton',56),(379,'Shane Elbourn',40),(380,'Modestine Meese',49),(381,'Creigh Carlyon',55),(382,'Rubina Kilshall',47),(383,'Darrin Fassbindler',37),(384,'Reynard Oman',46),(385,'Heather Trenbey',47),(386,'Carroll Jirka',59),(387,'Erna Coxall',58),(388,'Deni Talkington',45),(389,'Delmer Loadwick',57),(390,'Alaric Moxom',50),(391,'Rudolfo Wyatt',57),(392,'Ammamaria Hungerford',48),(393,'Grover Oakton',55),(394,'Lulita Posse',46),(395,'Emmey Faughny',49),(396,'Vladimir Mucillo',39),(397,'Quentin Royce',59),(398,'Dianna Spratt',52),(399,'Mead Hurlin',46),(400,'Hollyanne Letessier',47),(401,'Maurine Bruhnicke',37),(402,'Shandie De Coursey',41),(403,'Skelly Stiven',49),(404,'Alejandra Gasnell',54),(405,'Lockwood Inott',56),(406,'Ortensia Beaty',47),(407,'Artus Veysey',47),(408,'Lennard Kagan',47),(409,'Petronilla Hache',55),(410,'Valaree Aronowicz',51),(411,'Ambrosi Gillaspy',46),(412,'Jameson Gristock',53),(413,'Estell Sheara',49),(414,'Frayda Howson',43),(415,'Gamaliel Pittoli',57),(416,'Meredeth Petch',44),(417,'Dallas Rowlin',38),(418,'Skylar Dumphry',59),(419,'Pat Trattles',50),(420,'Onida Reeves',48),(421,'Norman Kleine',42),(422,'Letti McCawley',44),(423,'Bamby Youtead',38),(424,'Reggie Blatcher',45),(425,'Opaline Foort',57),(426,'Cherilyn Teresi',49),(427,'Bo Southers',47),(428,'Justin Thake',54),(429,'Sena Sellwood',57),(430,'Tremayne Farman',44),(431,'Mindy Oakenfield',50),(432,'Darice Reford',59),(433,'Katti Braganca',47),(434,'Benedicta Braywood',50),(435,'Judye Kaasman',54),(436,'Rowan Cundict',53),(437,'Cart Erangey',49),(438,'Sada Hazeldene',38),(439,'Nev Matthews',50),(440,'Khalil Stile',51),(441,'Cristen Leete',59),(442,'Clemente Sigart',41),(443,'Ruthi Quin',42),(444,'Benetta Tarte',42),(445,'Neddie Clutterbuck',50),(446,'Lisbeth Haruard',37),(447,'Charlena Seville',45),(448,'Tanner Napthine',58),(449,'Mada Sillett',54),(450,'Troy Alejandri',58),(451,'Wilek Ayrs',58),(452,'Willey Coultous',44),(453,'Bettye Baldocci',52),(454,'Odey Tidy',56),(455,'Davidde Sextone',42),(456,'Brigida Corona',55),(457,'Alvera Allsop',50),(458,'Letizia Duligal',51),(459,'Gilles Bradshaw',45),(460,'Kelly Dufton',40),(461,'Shaw Moisey',44),(462,'Vonnie Lymer',57),(463,'Benton Mockler',52),(464,'Min Kubasek',47),(465,'Maddalena De Witt',59),(466,'Janifer Cunde',54),(467,'Dulce Calloway',40),(468,'Mahala Olivetti',54),(469,'Karee Moncur',49),(470,'Gerardo Bauldry',46),(471,'Cami Muriel',39),(472,'Vivianna Ashley',40),(473,'Frazier Grinnikov',40),(474,'Chiquita Stegel',42),(475,'Rubie Redemile',38),(476,'Anatollo Sandifer',53),(477,'Dene Castagna',53),(478,'Adaline Jessopp',44),(479,'Robinson Trees',38),(480,'Neel Bedford',42),(481,'Annalee Miklem',41),(482,'Sayers Dufoure',51),(483,'Elle Heasman',48),(484,'Patrice MacTrustey',54),(485,'Cly Furzer',45),(486,'Jacqui Decroix',42),(487,'Rick Gaize',48),(488,'Irita Chismon',54),(489,'Denna Papen',52),(490,'Coraline Durtnall',44),(491,'Skip Hepher',37),(492,'Charisse Leel',42),(493,'Colman Braden',44),(494,'Dannel Manueau',47),(495,'Shelby Oloman',58),(496,'Abelard Borleace',50),(497,'Merell Scutchings',49),(498,'Amber Bellew',58),(499,'Hillery O\'Ferris',42),(500,'Doralia Rymmer',59),(501,'Abey Hobble',51),(502,'Page Schoular',52),(503,'Sib Dolan',49),(504,'Brietta Gussie',56),(505,'Barr Origan',53),(506,'Robbyn Goch',50),(507,'Nydia Alton',52),(508,'Beverley Telega',54),(509,'Hazlett Usmar',51),(510,'Lisette Mighele',48),(511,'Elane Caghan',40),(512,'Nanine O\'Roan',59),(513,'Chico Brittain',57),(514,'Barbie Stoter',59),(515,'Rossie Jozsika',44),(516,'Deni Sabatier',57),(517,'Ardath Tayler',47);
/*!40000 ALTER TABLE `AUTHORS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AUTHORS_TEMP`
--

DROP TABLE IF EXISTS `AUTHORS_TEMP`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `AUTHORS_TEMP` (
  `author_name` varchar(50) DEFAULT NULL,
  `country_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AUTHORS_TEMP`
--

LOCK TABLES `AUTHORS_TEMP` WRITE;
/*!40000 ALTER TABLE `AUTHORS_TEMP` DISABLE KEYS */;
INSERT INTO `AUTHORS_TEMP` VALUES ('Lacy Cluely',20),('Lindsay Bonifas',22),('Abbe Begbie',34),('Emmet Dungay',32),('Jarred Humberston',1),('Bobbee Waring',30),('Tamma Stanlock',2),('Kaitlin Colten',23),('Gerta Espinho',33),('Felice Hindes',30),('Rodrick Gladdifh',21),('Farica Cookney',18),('Hildegarde Largen',19),('Winifred Stinton',18),('Celka McCrie',12),('Warner Bertl',13),('Dylan Pieroni',17),('Meredithe Ashborn',35),('Even Gyurko',13),('Heinrick Musicka',23),('Betti Blaise',20),('Melisent Treadger',19),('Lorilee Monkman',21),('Nev Bloy',27),('Sergent Darcey',18),('Linda Pountney',12),('Teddy Hockey',13),('Esme Muldrew',20),('Nedi Weldon',32),('Iggie Lantoph',35),('Merline Burnhams',15),('Carney Flockhart',32),('Adolpho Riddiford',32),('Katine Harmant',13),('Tallie Trousdale',24),('Rheta Brindley',13),('Lanae De Metz',3),('Grady Shurmer',21),('Weidar Alessandretti',20),('Chane Ballintime',27),('Valentijn Domini',13),('Brigida Heynel',9),('Alden Wiggam',2),('Padget Dyball',32),('Drucy Ingleston',15),('Skipton Hitter',35),('Erika Chinnick',17),('Teddie Dailly',30),('Nora Halcro',14),('Conway Simonou',25),('Marthe Lain',15),('Rubina Dewan',6),('Dorothee Gergely',8),('Erena Dresse',11),('Gabi Kydd',9),('Caleb Cordeau]',18),('Wade Royston',37),('Vonnie Florentine',14),('Cyrillus Northall',25),('Deck McPike',10),('Emmalynne Rumble',10),('Silvie Camoys',4),('Korella Vasyaev',21),('Francois Flewan',5),('Coleman Trudgion',37),('Korney Stubbin',14),('Leta Cousens',5),('Earle Aston',22),('Pavla Bengtsson',25),('Cully Fright',38),('Phedra Sygroves',16),('Norbie Flexman',16),('Mahalia Lambertini',22),('Gorden Giraudou',14),('Dori Tollet',28),('Skyler Josefsson',26),('Abbe Banaszewski',16),('Yevette Sigward',24),('Tedd Parsell',31),('Laurella Egginton',16),('Krishna Service',35),('Kevyn Jankin',29),('Giorgi Sexton',18),('Keelby Lushey',25),('Moss Crop',22),('Munmro Crawshaw',35),('Bary Caley',1),('Mair Fines',27),('Emlyn Forrestall',32),('Holt Custy',1),('Barnabe Codlin',17),('Flo Hackworthy',6),('Antonino Bartomeu',36),('Morgen Siseland',31),('Shem Waplinton',10),('Julianna Tarbet',20),('Eberto Rojel',28),('Quincy Kirkbright',13),('Nina Joselin',19),('Dorris Reddoch',25),('Dwight Gaitskell',28),('Ashby Mair',36),('Erinn Hawthorn',7),('Kassie Blyde',5),('Toni Hairsine',7),('Olenolin Maudlen',32),('Shae Prattington',10),('Brett Higgonet',13),('Terri-jo Meus',14),('Jenine Bowell',11),('Almira Elflain',24),('Robinetta D\'Oyley',35),('Lane Keitch',1),('Gerhardine Routley',37),('Almeda Petrichat',27),('Dorree Malsher',8),('Obie Fynes',28),('Marris Szymanowski',26),('Westley Desforges',11),('Estelle Bernade',9),('Bethena Smardon',30),('Meta Royston',9),('Golda Crane',31),('Oneida Bourley',30),('Pegeen Coventon',11),('Rosalie Cleugher',4),('Sullivan McSperrin',2),('Valery Zukierman',32),('Wren Fost',28),('Grace Godman',2),('Lolita D\'Alessandro',7),('Gustavo Grigolon',5),('Mason Lowson',5),('Northrup Ewens',18),('Sunshine Doughartie',38),('Thea Botler',12),('Nollie Vanini',13),('Domini Woof',39),('Gaylene Mitro',24),('Robin Zannuto',4),('Leisha Gourdon',18),('Nettle Beauchamp',21),('Benjy Castan',20),('Fidelia Wimes',6),('Cass Ossenna',27),('Elwira Vanshin',18),('Rickard Launchbury',12),('Jarrad Lambeth',19),('Alameda Donner',15),('Kerianne Huriche',18),('Yuri Gandey',33),('Annabelle Ibell',8),('Katinka Lowfill',36),('Easter Bruyet',3),('Anastasie Dee',3),('Tani Buckler',35),('Kelwin Smithend',14),('Olly Staddom',3),('Justina Scragg',29),('Filippa Alennikov',13),('Melisent Faulkener',2),('Lorette Astall',26),('Arnie Josham',17),('Rinaldo Fearneley',5),('Anna Garrould',24),('Melly Morefield',28),('Chiarra Corradi',15),('Gene Adamek',15),('Marisa Solomonides',21),('Laverna Stallworthy',15),('Koral Hastewell',11),('Cecile Burnet',23),('Sharia Matyugin',31),('Cherilynn Kun',28),('Valentia Dalli',6),('Demetris Shelp',37),('Cyrill Marling',18),('Ninette Gouth',14),('Eryn Wagenen',16),('Collie MacArd',25),('Sherwood Grinham',2),('Kerk Harcarse',10),('Mord Jinks',29),('Bess Slarke',10),('Jaime Jeppe',33),('Dorette Bellelli',6),('Pearle Sealand',33),('Rob Swallow',4),('Wilmer Parkins',20),('Hope Carlett',12),('Randal Anderbrugge',32),('Elane Leander',12),('Hillary Wynne',11),('Grenville Keeler',11),('Analiese Aspel',10),('Krissy Portt',4),('Adel Andric',4),('Avis Grisbrook',13),('Duff Moreton',15),('Consolata Tatlowe',26),('Dodie Eslemont',30),('Reiko Screach',8),('Vassili Fearnyhough',4),('Hailey Pottes',16),('Brooks Laffan',16),('Thornie McIlwraith',15),('Charissa Gouley',35),('Salome Tithecote',18),('Ingelbert Govenlock',15),('Christopher Battleson',5),('Tiffie Challin',13),('Ned Wiz',22),('Robinet Gennrich',2),('Ysabel Crickmoor',2),('Andrei Polgreen',37),('Jerald Sheron',29),('Roana Barkas',36),('Isabelle Mowatt',39),('Deanne Frodsam',20),('Mattias Zum Felde',13),('Rudolfo Points',8),('Guntar Pauls',6),('Lorri Preon',16),('Abbe Vashchenko',22),('Quinton Donat',39),('Rowland Donavan',2),('Alisander Thexton',14),('Tonnie Matevosian',34),('Pietro Joel',34),('Britni Burnip',12),('Patience Washbrook',36),('Pansie MacCart',13),('Dana Dafydd',19),('Jeanie Hacking',24),('Haven Kingscott',9),('Fidela Gocher',18),('Cart Cramond',6),('Bendix Ionn',30),('Edy Rabat',28),('Olin Le Galle',36),('Emlyn Boanas',30),('Forrester Greenman',16),('Chiarra MacVay',23),('Marianna Giacopelo',29),('Boycey Doorly',22),('Huberto Dunhill',37),('Chariot Watkins',34),('Ambur Skilbeck',22),('Artie Parmiter',26),('Cherida Conville',3);
/*!40000 ALTER TABLE `AUTHORS_TEMP` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `BOOKS`
--

DROP TABLE IF EXISTS `BOOKS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `BOOKS` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `book_name` varchar(255) DEFAULT NULL,
  `year_id` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `BOOKS_NAME_UNIQ` (`book_name`),
  KEY `BOOKS_FK` (`year_id`),
  CONSTRAINT `BOOKS_FK` FOREIGN KEY (`year_id`) REFERENCES `YEAR_OF_PUBLISHING` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=128 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BOOKS`
--

LOCK TABLES `BOOKS` WRITE;
/*!40000 ALTER TABLE `BOOKS` DISABLE KEYS */;
INSERT INTO `BOOKS` VALUES (1,'Tampflex',22),(2,'Cardguard',15),(3,'Stim',34),(4,'Matsoft',11),(5,'Stronghold',24),(6,'Flowdesk',10),(7,'Fintone',3),(8,'Regrant',9),(9,'Namfix',26),(10,'Viva',32),(11,'Prodder',23),(12,'Wrapsafe',4),(13,'Zathin',11),(14,'Konklux',34),(15,'Voyatouch',16),(16,'Veribet',40),(17,'Bigtax',4),(18,'Solarbreeze',18),(19,'Home Ing',18),(20,'Bytecard',6),(21,'Quo Lux',22),(22,'Span',1),(23,'Ronstring',20),(24,'Tin',28),(25,'Duobam',27),(26,'Trippledex',23),(27,'Latlux',2),(28,'Bitwolf',27),(29,'Holdlamis',8),(30,'Gembucket',11),(31,'Fixflex',8),(32,'Transcof',16),(33,'Kanlam',16),(34,'Aerified',6),(35,'Pannier',22),(36,'Flexidy',6),(37,'Toughjoyfax',14),(38,'Overhold',33),(39,'Sub-Ex',40),(40,'Ventosanzap',1),(41,'Bitchip',28),(42,'Bamity',28),(43,'Alphazap',26),(44,'Cookley',9),(45,'Biodex',15),(46,'Tresom',14),(47,'Keylex',34),(48,'Temp',3),(49,'Zoolab',24),(50,'Tres-Zap',22),(51,'Andalax',36),(52,'Opela',29),(53,'Treeflex',37),(54,'Voltsillam',34),(55,'Daltfresh',36),(56,'Cardify',9),(57,'Asoka',8),(58,'Rank',31),(59,'Subin',6),(60,'Greenlam',2),(61,'Zontrax',11),(62,'Konklab',24),(63,'Zaam-Dox',12),(64,'Mat Lam Tam',36),(65,'Stringtough',24),(66,'Y-Solowarm',10),(67,'Otcom',13),(68,'Hatity',6),(69,'Zamit',26),(70,'Fix San',39),(71,'Domainer',24),(72,'Sonair',28),(73,'Job',11),(74,'Redhold',23),(75,'Lotlux',28),(76,'Vagram',8),(77,'Y-find',3),(78,'It',27),(79,'Alpha',5),(80,'Lotstring',37),(81,'Tempsoft',28);
/*!40000 ALTER TABLE `BOOKS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `BOOKS_AUTHORS`
--

DROP TABLE IF EXISTS `BOOKS_AUTHORS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `BOOKS_AUTHORS` (
  `author_id` bigint(20) unsigned NOT NULL,
  `book_id` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`author_id`,`book_id`),
  KEY `FKlv0rb74ptedc413s6q5x8ot6q` (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BOOKS_AUTHORS`
--

LOCK TABLES `BOOKS_AUTHORS` WRITE;
/*!40000 ALTER TABLE `BOOKS_AUTHORS` DISABLE KEYS */;
INSERT INTO `BOOKS_AUTHORS` VALUES (8,3),(8,4),(8,7),(11,7),(9,8),(11,8),(12,8),(14,9),(17,9);
/*!40000 ALTER TABLE `BOOKS_AUTHORS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `COUNTRY_OF_BORN`
--

DROP TABLE IF EXISTS `COUNTRY_OF_BORN`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
-- Table structure for table `COUNTRY_OF_BORN_TEMP`
--

DROP TABLE IF EXISTS `COUNTRY_OF_BORN_TEMP`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `COUNTRY_OF_BORN_TEMP` (
  `ip_address` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `COUNTRY_OF_BORN_TEMP`
--

LOCK TABLES `COUNTRY_OF_BORN_TEMP` WRITE;
/*!40000 ALTER TABLE `COUNTRY_OF_BORN_TEMP` DISABLE KEYS */;
INSERT INTO `COUNTRY_OF_BORN_TEMP` VALUES ('China'),('Ukraine'),('Uganda'),('China'),('Venezuela'),('Iran'),('China'),('China'),('Kazakhstan'),('Brazil'),('Poland'),('Indonesia'),('Japan'),('Indonesia'),('China'),('Czech Republic'),('Sweden'),('China'),('Philippines'),('Philippines'),('France'),('Philippines'),('China'),('Russia'),('Ethiopia'),('Portugal'),('Tajikistan'),('Philippines'),('China'),('Poland'),('Ukraine'),('Russia'),('United States'),('Angola'),('Indonesia'),('China'),('Bosnia and Herzegovina'),('Indonesia'),('Ukraine'),('Russia'),('Egypt'),('Philippines'),('Syria'),('China'),('Saudi Arabia'),('Ethiopia'),('Philippines'),('Philippines'),('Malaysia'),('Indonesia'),('Thailand'),('Japan'),('Philippines'),('Mongolia'),('Ethiopia'),('China'),('Morocco'),('Cuba'),('South Korea'),('Nicaragua'),('China'),('Brazil'),('Poland'),('China'),('China'),('Russia'),('China'),('Sweden'),('Denmark'),('Philippines'),('Argentina'),('Russia'),('Mauritania'),('Philippines'),('China'),('China'),('Ukraine'),('Ivory Coast'),('Philippines'),('Sweden'),('China'),('Russia'),('Philippines'),('China'),('Indonesia'),('China'),('China'),('China'),('Poland'),('Jamaica'),('Uganda'),('Argentina'),('Thailand'),('Slovenia'),('Argentina'),('Benin'),('Philippines'),('Mongolia'),('Colombia'),('Indonesia');
/*!40000 ALTER TABLE `COUNTRY_OF_BORN_TEMP` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `YEAR_OF_PUBLISHING`
--

DROP TABLE IF EXISTS `YEAR_OF_PUBLISHING`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `YEAR_OF_PUBLISHING` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `year` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `YEAR_OF_PUBLISHING`
--

LOCK TABLES `YEAR_OF_PUBLISHING` WRITE;
/*!40000 ALTER TABLE `YEAR_OF_PUBLISHING` DISABLE KEYS */;
INSERT INTO `YEAR_OF_PUBLISHING` VALUES (1,'1947-02-22'),(2,'2017-12-08'),(3,'1964-11-13'),(4,'1975-04-25'),(5,'1997-06-11'),(6,'1984-11-05'),(7,'1924-09-01'),(8,'2007-09-05'),(9,'1932-10-07'),(10,'1950-03-16'),(11,'1967-09-08'),(12,'1922-11-19'),(13,'1930-01-07'),(14,'2013-08-17'),(15,'2009-06-28'),(16,'1931-11-27'),(17,'1995-08-07'),(18,'1947-02-05'),(19,'1971-10-03'),(20,'1995-08-16'),(21,'1986-03-15'),(22,'1999-01-06'),(23,'1921-04-12'),(24,'1917-12-03'),(25,'2017-12-14'),(26,'1974-08-31'),(27,'1919-03-18'),(28,'1994-11-26'),(29,'1989-07-03'),(30,'1950-06-22'),(31,'1949-07-30'),(32,'1960-10-29'),(33,'2014-08-05'),(34,'1979-01-01'),(35,'1917-08-07'),(36,'1950-09-06'),(37,'1966-07-27'),(38,'1944-10-17'),(39,'1935-02-02'),(40,'1986-02-07');
/*!40000 ALTER TABLE `YEAR_OF_PUBLISHING` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persons`
--

DROP TABLE IF EXISTS `persons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
/*!50503 SET character_set_client = utf8mb4 */;
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

-- Dump completed on 2019-07-22 16:53:36
