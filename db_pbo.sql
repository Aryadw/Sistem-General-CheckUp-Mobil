-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 07, 2021 at 10:11 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_pbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `tabel_gui`
--

CREATE TABLE `tabel_gui` (
  `kode` int(3) NOT NULL,
  `pemilik` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `mobil` varchar(30) NOT NULL,
  `roda` int(4) NOT NULL,
  `bhn_bakar` varchar(30) NOT NULL,
  `bgn_check` varchar(30) NOT NULL,
  `kerusakan` int(5) NOT NULL,
  `kategori` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabel_gui`
--

INSERT INTO `tabel_gui` (`kode`, `pemilik`, `alamat`, `mobil`, `roda`, `bhn_bakar`, `bgn_check`, `kerusakan`, `kategori`) VALUES
(1, 'Yusuf', 'Jepara', 'Toyota Kijang LGX', 4, 'Premium', 'Mesin', 30, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tabel_gui`
--
ALTER TABLE `tabel_gui`
  ADD PRIMARY KEY (`kode`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tabel_gui`
--
ALTER TABLE `tabel_gui`
  MODIFY `kode` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
