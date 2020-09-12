-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.41-community-nt

--
-- Create schema dicegame
--

CREATE DATABASE IF NOT EXISTS dicegame;
USE dicegame;

--
-- Definition of table `highscores`
--

DROP TABLE IF EXISTS `highscores`;
CREATE TABLE `highscores` (
  `Id` int(10) unsigned NOT NULL auto_increment,
  `Nom` varchar(45) NOT NULL,
  `Score` varchar(45) NOT NULL default '0',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;