-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 19, 2021 at 07:39 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `party`
--

CREATE TABLE `party` (
  `partyId` int(10) NOT NULL,
  `firstName` varchar(100) NOT NULL,
  `lastName` varchar(100) NOT NULL,
  `address` varchar(1000) NOT NULL,
  `city` varchar(100) NOT NULL,
  `zip` varchar(50) NOT NULL,
  `state` varchar(100) NOT NULL,
  `country` varchar(100) NOT NULL,
  `phone` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `party`
--

INSERT INTO `party` (`partyId`, `firstName`, `lastName`, `address`, `city`, `zip`, `state`, `country`, `phone`) VALUES
(1, 'Abhishek', 'verma', 'Rajendra Nagar ', 'Indore', '452012', 'Madhya Pradesh', 'India', '09926027784'),
(6, 'palash', 'bajaj', 'dewas', 'dewas', '258963', 'mp', 'India', '04567894564'),
(7, 'Amitesh', 'Thakur', 'mata mandir', 'dewas', '258963', 'mp', 'India', '04567894564'),
(8, 'ramu', 'thakur', 'juni indore', 'indore', '452012', 'MP', 'India', '7894561235'),
(9, 'palash', 'khar', 'dewas', 'dewas', '258963', 'telengana', 'India', '04567894564'),
(10, 'kalash', 'kher', 'bandra', 'mumbai', '456456', 'maharashtra', 'India', '07897897895');

-- --------------------------------------------------------

--
-- Table structure for table `userlogin`
--

CREATE TABLE `userlogin` (
  `userLoginId` varchar(100) NOT NULL,
  `password` int(100) NOT NULL,
  `partyId` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userlogin`
--

INSERT INTO `userlogin` (`userLoginId`, `password`, `partyId`) VALUES
('Abhi45@gmail.com', 123456, 1),
('amit@gmail.com', 123456, 7),
('khar23@gmail.com', 456123, 10),
('khar25@gmail.com', 123456, 9),
('palash@gmail.com', 123456, 6),
('ramu@gmail.com', 123456, 8);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `party`
--
ALTER TABLE `party`
  ADD PRIMARY KEY (`partyId`);

--
-- Indexes for table `userlogin`
--
ALTER TABLE `userlogin`
  ADD PRIMARY KEY (`userLoginId`),
  ADD KEY `FOREIGN KEY` (`partyId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `party`
--
ALTER TABLE `party`
  MODIFY `partyId` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `userlogin`
--
ALTER TABLE `userlogin`
  ADD CONSTRAINT `FOREIGN KEY` FOREIGN KEY (`partyId`) REFERENCES `party` (`partyId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
