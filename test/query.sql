-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 20, 2019 at 03:08 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `hci_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `moduls`
--

CREATE TABLE IF NOT EXISTS `moduls` (
`rec_id` bigint(20) NOT NULL,
  `create_at` datetime DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `module_name` varchar(255) DEFAULT NULL,
  `module_order` int(11) DEFAULT NULL
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `moduls`
--

INSERT INTO `moduls` (`rec_id`, `create_at`, `update_at`, `module_name`, `module_order`) VALUES
(1, '2019-06-20 00:00:00', NULL, 'PromoCard', 1),
(2, '2019-06-20 00:00:00', NULL, 'CategoryCard', 2),
(3, '2019-06-20 00:00:00', NULL, 'FlashSaleCard', 3),
(4, '2019-06-20 00:00:00', NULL, 'HistoryCard', 4),
(5, '2019-06-20 00:00:00', NULL, 'NewsCard', 5);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
`rec_id` bigint(20) NOT NULL,
  `create_at` datetime DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) NOT NULL,
  `user_group_fk` bigint(20) DEFAULT NULL
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`rec_id`, `create_at`, `update_at`, `name`, `user_id`, `user_group_fk`) VALUES
(1, '2019-06-20 00:00:00', NULL, 'USER A', 'USERA', 1),
(2, '2019-06-20 00:00:00', NULL, 'USER B', 'USERB', 2);

-- --------------------------------------------------------

--
-- Table structure for table `user_group`
--

CREATE TABLE IF NOT EXISTS `user_group` (
`rec_id` bigint(20) NOT NULL,
  `create_at` datetime DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `group_name` varchar(255) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_group`
--

INSERT INTO `user_group` (`rec_id`, `create_at`, `update_at`, `group_name`) VALUES
(1, '2019-06-20 00:00:00', NULL, 'GROUPA'),
(2, '2019-06-20 00:00:00', NULL, 'GROUPB');

-- --------------------------------------------------------

--
-- Table structure for table `user_privilage`
--

CREATE TABLE IF NOT EXISTS `user_privilage` (
  `modul_fk` bigint(20) NOT NULL,
  `user_group_fk` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_privilage`
--

INSERT INTO `user_privilage` (`modul_fk`, `user_group_fk`) VALUES
(1, 1),
(1, 2),
(2, 1),
(2, 2),
(3, 1),
(3, 2),
(4, 1),
(5, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `moduls`
--
ALTER TABLE `moduls`
 ADD PRIMARY KEY (`rec_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
 ADD PRIMARY KEY (`rec_id`), ADD UNIQUE KEY `UK_6efs5vmce86ymf5q7lmvn2uuf` (`user_id`), ADD KEY `FKc2a17q2ddlulvfw0ng1wpric3` (`user_group_fk`);

--
-- Indexes for table `user_group`
--
ALTER TABLE `user_group`
 ADD PRIMARY KEY (`rec_id`);

--
-- Indexes for table `user_privilage`
--
ALTER TABLE `user_privilage`
 ADD PRIMARY KEY (`modul_fk`,`user_group_fk`), ADD KEY `FK23y9r03hcopt4lnbxxbj01c8c` (`user_group_fk`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `moduls`
--
ALTER TABLE `moduls`
MODIFY `rec_id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
MODIFY `rec_id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `user_group`
--
ALTER TABLE `user_group`
MODIFY `rec_id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
