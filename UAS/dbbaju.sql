-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 11, 2023 at 05:59 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbbaju`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbbaju`
--

CREATE TABLE `tbbaju` (
  `id` int(11) NOT NULL,
  `merk` varchar(50) NOT NULL,
  `type` varchar(20) NOT NULL,
  `color` varchar(20) NOT NULL,
  `size` varchar(10) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbbaju`
--

INSERT INTO `tbbaju` (`id`, `merk`, `type`, `color`, `size`, `amount`) VALUES
(1, 'ArnonZ', 'Polo', 'White', 'S', 31),
(3, 'Volcom', 'T-Shirt', 'White', 'XL', 33),
(4, 'Volcom', 'Shirt', 'Black', 'M', 12),
(5, 'Erigo', 'Polo', 'Blue', 'L', 12),
(6, 'Louis Vuitton', 'Suit', 'White', 'XXL', 10),
(7, 'Juice Ematic', 'T-Shirt', 'Magenta', 'XL', 33),
(8, 'Supreme', 'Jacket', 'Green', 'XL', 24);

-- --------------------------------------------------------

--
-- Table structure for table `tbuser`
--

CREATE TABLE `tbuser` (
  `id` int(11) NOT NULL,
  `usr` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbuser`
--

INSERT INTO `tbuser` (`id`, `usr`, `pass`) VALUES
(1, '1', '1'),
(2, 'w', '1'),
(3, '21', '1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbbaju`
--
ALTER TABLE `tbbaju`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbuser`
--
ALTER TABLE `tbuser`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbbaju`
--
ALTER TABLE `tbbaju`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `tbuser`
--
ALTER TABLE `tbuser`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
