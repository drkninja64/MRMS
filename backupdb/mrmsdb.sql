-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 22, 2014 at 04:34 PM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mrmsdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE IF NOT EXISTS `appointment` (
  `AID` int(5) NOT NULL,
  `PCode` int(5) NOT NULL,
  `DCode` int(5) NOT NULL,
  `ADate` date NOT NULL,
  `Atime` time NOT NULL,
  `Day` varchar(10) NOT NULL,
  `Complete` tinyint(1) NOT NULL,
  PRIMARY KEY (`AID`,`DCode`,`PCode`),
  KEY `DCode` (`DCode`),
  KEY `PCode` (`PCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `biochemistry`
--

CREATE TABLE IF NOT EXISTS `biochemistry` (
  `Rno` int(5) NOT NULL,
  `PCode` int(5) NOT NULL,
  `TCDC` float DEFAULT NULL,
  `LDL` float DEFAULT NULL,
  PRIMARY KEY (`Rno`,`PCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `CNo` int(3) NOT NULL,
  `Name` varchar(50) NOT NULL,
  PRIMARY KEY (`CNo`),
  UNIQUE KEY `Name` (`Name`),
  UNIQUE KEY `Name_2` (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`CNo`, `Name`) VALUES
(1, 'Biochemistry'),
(2, 'Haematology');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE IF NOT EXISTS `doctor` (
  `DCode` int(5) NOT NULL,
  `DName` text NOT NULL,
  `DQual` text NOT NULL,
  `DWork` text NOT NULL,
  `DContact` text,
  `DEmail` text,
  `Shift` int(1) NOT NULL,
  PRIMARY KEY (`DCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`DCode`, `DName`, `DQual`, `DWork`, `DContact`, `DEmail`, `Shift`) VALUES
(0, 'Self', 'Routine Checkup', '-', '', '', 0),
(1, 'Arun K. Gupta', 'MBBS, MD', 'TUTH', '', 'sa', 0),
(2, 'Man B. Karki', 'MD', 'Baburam Hospital', '', '', 0),
(3, 'Deepak Mahara', 'MBBS, MD, FICS', 'TUTH', '', '', 1),
(4, 'Sagar Thakurel', 'MD', 'TUTH', '', '', 0);

-- --------------------------------------------------------

--
-- Table structure for table `haematology`
--

CREATE TABLE IF NOT EXISTS `haematology` (
  `Rno` int(5) NOT NULL,
  `PCode` int(5) NOT NULL,
  `Blood_Group` text,
  PRIMARY KEY (`Rno`,`PCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `investigations`
--

CREATE TABLE IF NOT EXISTS `investigations` (
  `TNo` int(3) NOT NULL,
  `CNo` int(3) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `price` float NOT NULL,
  `general` text,
  `male` text,
  `female` text,
  `child` text,
  `special` text,
  `unit` text,
  `sample` text NOT NULL,
  `subjective` int(1) NOT NULL,
  PRIMARY KEY (`TNo`,`CNo`),
  UNIQUE KEY `Name` (`Name`),
  KEY `CNo` (`CNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `investigations`
--

INSERT INTO `investigations` (`TNo`, `CNo`, `Name`, `price`, `general`, `male`, `female`, `child`, `special`, `unit`, `sample`, `subjective`) VALUES
(1, 1, 'TCDC', 250.5, '100 - 200', '', '', '', ' potato < 67', 'mg/dl', 'Blood', 0),
(1, 2, 'Blood Group', 100, '', '', '', '', '', '', 'Blood', 1),
(2, 1, 'LDL', 200, '1 - 3', '', '', '', '', '45m', 'Stool', 0);

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE IF NOT EXISTS `patient` (
  `PCode` int(5) NOT NULL,
  `FName` text NOT NULL,
  `MName` text,
  `LName` text NOT NULL,
  `Age` int(3) NOT NULL,
  `Sex` int(1) NOT NULL,
  `PContact` text,
  `PEmail` text,
  `DCode` int(5) NOT NULL,
  PRIMARY KEY (`PCode`),
  KEY `DCode` (`DCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`PCode`, `FName`, `MName`, `LName`, `Age`, `Sex`, `PContact`, `PEmail`, `DCode`) VALUES
(1, 'Sajag', '', 'Acharya', 20, 1, '', '', 0),
(2, 'Parth', '', 'Acharya', 9, 1, '', '', 0);

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

CREATE TABLE IF NOT EXISTS `report` (
  `Rno` int(5) NOT NULL,
  `PCode` int(5) NOT NULL,
  `Rdate` date NOT NULL,
  `Sel_test` text NOT NULL,
  `Status` int(1) NOT NULL,
  PRIMARY KEY (`Rno`,`PCode`),
  KEY `PCode` (`PCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `samplename`
--

CREATE TABLE IF NOT EXISTS `samplename` (
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `samplename`
--

INSERT INTO `samplename` (`name`) VALUES
('Blood'),
('Stool'),
('Urine');

-- --------------------------------------------------------

--
-- Table structure for table `shifttable`
--

CREATE TABLE IF NOT EXISTS `shifttable` (
  `DCode` int(5) NOT NULL,
  `Day` varchar(10) NOT NULL,
  `Shift_start` time NOT NULL,
  `Shift_end` time NOT NULL,
  PRIMARY KEY (`DCode`,`Day`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shifttable`
--

INSERT INTO `shifttable` (`DCode`, `Day`, `Shift_start`, `Shift_end`) VALUES
(3, 'Sunday', '09:35:00', '18:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `Username` varchar(10) NOT NULL,
  `Password` text NOT NULL,
  `Category` text NOT NULL,
  `Permissions` text NOT NULL,
  `Status` int(1) NOT NULL,
  PRIMARY KEY (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`Username`, `Password`, `Category`, `Permissions`, `Status`) VALUES
('a', 'Q3va8d1GYEY=', 'Specialist', 'a', 1);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `appointment`
--
ALTER TABLE `appointment`
  ADD CONSTRAINT `appointment_ibfk_1` FOREIGN KEY (`DCode`) REFERENCES `doctor` (`DCode`),
  ADD CONSTRAINT `appointment_ibfk_2` FOREIGN KEY (`PCode`) REFERENCES `patient` (`PCode`);

--
-- Constraints for table `biochemistry`
--
ALTER TABLE `biochemistry`
  ADD CONSTRAINT `biochemistry_ibfk_1` FOREIGN KEY (`Rno`, `PCode`) REFERENCES `report` (`Rno`, `PCode`) ON DELETE CASCADE;

--
-- Constraints for table `haematology`
--
ALTER TABLE `haematology`
  ADD CONSTRAINT `haematology_ibfk_1` FOREIGN KEY (`Rno`, `PCode`) REFERENCES `report` (`Rno`, `PCode`) ON DELETE CASCADE;

--
-- Constraints for table `investigations`
--
ALTER TABLE `investigations`
  ADD CONSTRAINT `investigations_ibfk_1` FOREIGN KEY (`CNo`) REFERENCES `category` (`CNo`) ON DELETE CASCADE;

--
-- Constraints for table `patient`
--
ALTER TABLE `patient`
  ADD CONSTRAINT `patient_ibfk_1` FOREIGN KEY (`DCode`) REFERENCES `doctor` (`DCode`);

--
-- Constraints for table `report`
--
ALTER TABLE `report`
  ADD CONSTRAINT `report_ibfk_1` FOREIGN KEY (`PCode`) REFERENCES `patient` (`PCode`) ON DELETE CASCADE;

--
-- Constraints for table `shifttable`
--
ALTER TABLE `shifttable`
  ADD CONSTRAINT `shifttable_ibfk_1` FOREIGN KEY (`DCode`) REFERENCES `doctor` (`DCode`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
