-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 27, 2020 at 05:29 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `oop`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `bookingid` varchar(10) NOT NULL,
  `cusid` varchar(5) NOT NULL,
  `checkindate` varchar(10) NOT NULL,
  `checkoutdate` varchar(10) NOT NULL,
  `roomid` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`bookingid`, `cusid`, `checkindate`, `checkoutdate`, `roomid`) VALUES
('B1', 'C1', '12/1/2019', '14/1/2019', 'R104');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `cusid` varchar(5) NOT NULL,
  `cusname` varchar(30) NOT NULL,
  `cusaddress` varchar(100) NOT NULL,
  `cusphoneno` int(12) NOT NULL,
  `cusemail` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`cusid`, `cusname`, `cusaddress`, `cusphoneno`, `cusemail`) VALUES
('C2', 'Nawal hanis', '30, Jalan Klebang Mewah 1, Medan Klebang Mewah, 31200 Ipoh, ', 184682516, 'nawal@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `manageroom`
--

CREATE TABLE `manageroom` (
  `roomid` varchar(5) NOT NULL,
  `roomtype` varchar(30) NOT NULL,
  `roomfloor` int(10) NOT NULL,
  `roomcapacity` int(10) NOT NULL,
  `roomprice` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `manageroom`
--

INSERT INTO `manageroom` (`roomid`, `roomtype`, `roomfloor`, `roomcapacity`, `roomprice`) VALUES
('R104', 'Studio', 4, 5, 400);

-- --------------------------------------------------------

--
-- Table structure for table `receptionist`
--

CREATE TABLE `receptionist` (
  `receptionist_id` varchar(10) NOT NULL,
  `receptionist_password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `receptionist`
--

INSERT INTO `receptionist` (`receptionist_id`, `receptionist_password`) VALUES
('a1030', 'azma'),
('a123', '123'),
('a2111', 'nawal');

-- --------------------------------------------------------

--
-- Table structure for table `regularcustomer`
--

CREATE TABLE `regularcustomer` (
  `cusid` varchar(5) NOT NULL,
  `cusname` varchar(30) NOT NULL,
  `cusaddress` varchar(100) NOT NULL,
  `cusphoneno` varchar(12) NOT NULL,
  `cusemail` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `regularcustomer`
--

INSERT INTO `regularcustomer` (`cusid`, `cusname`, `cusaddress`, `cusphoneno`, `cusemail`) VALUES
('C2', 'Nawal hanis', '20,Jalan Klebang Mewah 1, Medan klebang Mewah, 31200, Ipoh, Perak', '01846682615', 'nawal@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `vipcustomer`
--

CREATE TABLE `vipcustomer` (
  `custid` varchar(5) NOT NULL,
  `cusname` varchar(30) NOT NULL,
  `cusaddress` varchar(100) NOT NULL,
  `cusphoneno` varchar(12) NOT NULL,
  `cusemail` varchar(50) NOT NULL,
  `membershipid` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vipcustomer`
--

INSERT INTO `vipcustomer` (`custid`, `cusname`, `cusaddress`, `cusphoneno`, `cusemail`, `membershipid`) VALUES
('C1', 'Nik Aminah Ahmad', 'No.12, Taman Indah, 15200 Kota Bharu, Kelantan', '0125411345', 'nik@gmail.com', 'M11'),
('C6', 'Iman Abdullah', 'No.22, Taman Setia, 25000 Kuantan, Pahang', '0125112345', 'iman@gmail.com', 'M22');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`bookingid`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cusid`);

--
-- Indexes for table `manageroom`
--
ALTER TABLE `manageroom`
  ADD PRIMARY KEY (`roomid`);

--
-- Indexes for table `receptionist`
--
ALTER TABLE `receptionist`
  ADD PRIMARY KEY (`receptionist_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
