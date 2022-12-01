-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 28, 2021 at 04:26 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_quanlysach`
--
CREATE DATABASE IF NOT EXISTS `db_quanlysach` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `db_quanlysach`;

-- --------------------------------------------------------

--
-- Table structure for table `muonsach`
--

DROP TABLE IF EXISTS `muonsach`;
CREATE TABLE IF NOT EXISTS `muonsach` (
  `MaMuonSach` int(20) NOT NULL AUTO_INCREMENT,
  `MaNhanVien` int(20) NOT NULL,
  `MaNguoiDoc` int(20) NOT NULL,
  `MaSach` int(20) NOT NULL,
  `GiaThue` float NOT NULL,
  `NgayMuon` varchar(20) NOT NULL,
  `NgayTra` varchar(20) NOT NULL,
  `TrangThai` varchar(20) NOT NULL,
  PRIMARY KEY (`MaMuonSach`),
  KEY `FK_MaNguoiDoc` (`MaNguoiDoc`),
  KEY `FK_MaNhanVien` (`MaNhanVien`),
  KEY `FK_MaSach` (`MaSach`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `muonsach`
--

INSERT INTO `muonsach` (`MaMuonSach`, `MaNhanVien`, `MaNguoiDoc`, `MaSach`, `GiaThue`, `NgayMuon`, `NgayTra`, `TrangThai`) VALUES
(10, 15, 1237, 4, 125000, '22/03/2013', '13/11/2013', '?? Tr? Sách');

-- --------------------------------------------------------

--
-- Table structure for table `nguoidoc`
--

DROP TABLE IF EXISTS `nguoidoc`;
CREATE TABLE IF NOT EXISTS `nguoidoc` (
  `MaNguoiDoc` int(20) NOT NULL AUTO_INCREMENT,
  `TenNguoiDoc` varchar(20) NOT NULL,
  `DiaChi` varchar(20) NOT NULL,
  `NgaySinh` varchar(20) NOT NULL,
  `SDT` varchar(20) NOT NULL,
  `LoaiNguoiDoc` varchar(20) NOT NULL,
  PRIMARY KEY (`MaNguoiDoc`)
) ENGINE=InnoDB AUTO_INCREMENT=1246 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nguoidoc`
--

INSERT INTO `nguoidoc` (`MaNguoiDoc`, `TenNguoiDoc`, `DiaChi`, `NgaySinh`, `SDT`, `LoaiNguoiDoc`) VALUES
(1234, 'congminh', '?da123', '21/08/2004', '12332142', 'null'),
(1236, 'tue', '123thongphong7', '21/09/2004', '0123456789', 'Sinh Vi?n'),
(1237, 'bach', '123thuongdinh', '09/10/2004', '0345678912', 'H?c Sinh'),
(1238, 'quangminh', 'nhama2321', '20/01/2004', '0123456789', 'Sinh Vi?n');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
CREATE TABLE IF NOT EXISTS `nhanvien` (
  `MaNhanVien` int(20) NOT NULL AUTO_INCREMENT,
  `TenNhanVien` varchar(20) NOT NULL,
  `DiaChi` varchar(20) NOT NULL,
  `NgaySinh` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `SoDienThoai` varchar(20) NOT NULL,
  `TenTaiKhoan` varchar(20) NOT NULL,
  `MatKhau` varchar(100) NOT NULL,
  `Loai` varchar(10) NOT NULL,
  PRIMARY KEY (`MaNhanVien`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`MaNhanVien`, `TenNhanVien`, `DiaChi`, `NgaySinh`, `Email`, `SoDienThoai`, `TenTaiKhoan`, `MatKhau`, `Loai`) VALUES
(9, 'Cong Anh', '53 An Trach', '21/08/2004', 'anh@gmail.com', '0369932990', 'conganh2', '38822097498d9db19bccfd00251be3b3', '2'),
(13, 'Cong Minh', '53 An Trach', '21/08/2004', 'minh@gmail.com', '0369932990', 'congminh', '1e4a1b03d1b6cd8a174a826f76e009f4', '2'),
(15, 'Bach', 'thongPhong', '09/10/2004', 'bach@gmail.com', '0123456789', 'bach123', 'c5d6aaf42c7822717a8f4aa3650902f7', '2'),
(16, 'Tue', 'haibatrung', '10/09/2004', 'tue@gmail.com', '0123456788', 'tuevip', '0fff460dde6c581f25b95e01aa762be1', '2'),
(19, 'Quang Minh', 'haibatrieu', '10/09/2004', 'qminh@gmail.com', '0123456788', 'qminh', 'fa1d3eb08a879de9a4cd9995a1aa91e1', '2'),
(39, 'Phong', 'haibatrung', '17/04/2004', 'phong@gmail.com', '0123456788', 'phong', 'fa1d3eb08a879de9a4cd9995a1aa91e1', '1');

-- --------------------------------------------------------

--
-- Table structure for table `quyensach`
--

DROP TABLE IF EXISTS `quyensach`;
CREATE TABLE IF NOT EXISTS `quyensach` (
  `MaSach` int(20) NOT NULL AUTO_INCREMENT,
  `TenSach` varchar(50) NOT NULL,
  `TheLoai` varchar(50) NOT NULL,
  `NXB` varchar(20) NOT NULL,
  `GiaTien` int(100) NOT NULL,
  `Anh` varchar(255) NOT NULL,
  PRIMARY KEY (`MaSach`)
) ENGINE=InnoDB AUTO_INCREMENT=4339 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `quyensach`
--

INSERT INTO `quyensach` (`MaSach`, `TenSach`, `TheLoai`, `NXB`, `GiaTien`, `Anh`) VALUES
(1, 'Bien Nien Su De Che', 'trinh tham', '21/12/2012', 250000, ''),
(2, 'Hoc Vien Chien Binh', 'vien tuong', '22/10/2011', 300000, ''),
(3, 'HumBaBue', 'kinh di ', '22/10/2000', 300000, ''),
(4, 'Quyen Sach Cua Toi', 'vientuong', '14/08/2004', 134431, ''),
(5, 'cuoc song cua toi', 'bi an', '22/12/1930', 123321, ''),
(4318, 'eren hung hau', 'vientuong', '22/12/2013', 23000, ''),
(4319, 'mikasa dep zai', 'doi thuong', '24/01/2000', 32000, ''),
(4326, 'Vi Pham luat giao thong', 'Giao thong', '28/02/2020', 100000, 'C:\\Users\\Phong Cute\\Documents\\0d4f4e66f5300d6e5421.jpg'),
(4327, 'ko biet dau haha haha', 'ko ko', '28/2/2021', 10000, 'C:\\Users\\Phong Cute\\Pictures\\69450290_661222401040579_4977746343058472960_n.jpg'),
(4329, '8888', '9999', '17/02/2021', 15000, 'C:\\Users\\Phong Cute\\Pictures\\103098413_291798638864708_3560949773826872430_o.jpg'),
(4331, 'hihi', 'haha', '15/02/2020', 10000, 'C:\\Users\\Phong Cute\\Pictures\\106546013_1172954323061128_7808474410888351740_n.jpg'),
(4336, 'Vi Pham luat giao thong', 'Giao thong', '28/02/2020', 100000, 'C:\\Users\\Phong Cute\\Documents\\0d4f4e66f5300d6e5421.jpg'),
(4338, 'dimbabue', 'buebadim', '28/02/2021', 200000, 'C:\\Users\\Phong Cute\\Pictures\\97043966_285127372646776_6372567608436195328_n.jpg');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `muonsach`
--
ALTER TABLE `muonsach`
  ADD CONSTRAINT `FK_MaNguoiDoc` FOREIGN KEY (`MaNguoiDoc`) REFERENCES `nguoidoc` (`MaNguoiDoc`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_MaNhanVien` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`MaNhanVien`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_MaSach` FOREIGN KEY (`MaSach`) REFERENCES `quyensach` (`MaSach`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
