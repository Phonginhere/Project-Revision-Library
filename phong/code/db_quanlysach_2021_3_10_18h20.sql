-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th3 10, 2021 lúc 12:20 PM
-- Phiên bản máy phục vụ: 10.4.11-MariaDB
-- Phiên bản PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `db_quanlysach`
--
CREATE DATABASE IF NOT EXISTS `db_quanlysach` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `db_quanlysach`;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bansach`
--

DROP TABLE IF EXISTS `bansach`;
CREATE TABLE IF NOT EXISTS `bansach` (
  `MaBanSach` int(20) NOT NULL AUTO_INCREMENT,
  `MaNhanVien` int(20) NOT NULL,
  `MaNguoiMua` int(20) NOT NULL,
  `MaSach` int(20) NOT NULL,
  `GiaBan` int(200) NOT NULL,
  `NgayMua` varchar(50) NOT NULL,
  `TgianMua` varchar(50) NOT NULL,
  `TrangThai` varchar(20) NOT NULL,
  PRIMARY KEY (`MaBanSach`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `bansach`
--

INSERT INTO `bansach` (`MaBanSach`, `MaNhanVien`, `MaNguoiMua`, `MaSach`, `GiaBan`, `NgayMua`, `TgianMua`, `TrangThai`) VALUES
(1, 19, 1234, 5, 135000, '01-03-2021', '04:50:46 PM', '?? Tr? Sách'),
(2, 19, 1237, 4326, 100000, '01-03-2021', '04:57:19 PM', '?? Tr? Sách'),
(3, 19, 1237, 4, 134431, '01-03-2021', '05:08:14 PM', '?? Tr? Ti?n');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nguoidoc`
--

DROP TABLE IF EXISTS `nguoidoc`;
CREATE TABLE IF NOT EXISTS `nguoidoc` (
  `MaNguoiDoc` int(20) NOT NULL AUTO_INCREMENT,
  `TenNguoiDoc` varchar(20) NOT NULL,
  `DiaChi` varchar(20) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `NgaySinh` varchar(20) NOT NULL,
  `SDT` varchar(20) NOT NULL,
  `GioiTinh` varchar(20) NOT NULL,
  PRIMARY KEY (`MaNguoiDoc`)
) ENGINE=InnoDB AUTO_INCREMENT=1246 DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `nguoidoc`
--

INSERT INTO `nguoidoc` (`MaNguoiDoc`, `TenNguoiDoc`, `DiaChi`, `Email`, `NgaySinh`, `SDT`, `GioiTinh`) VALUES
(1234, 'congminh', '?da123', 'minh@gmail.com', '21/08/2004', '12332142', 'Nam'),
(1236, 'tue', '123thongphong7', 'tue@gmail.com', '21/09/2004', '0123456789', 'Nam'),
(1237, 'bach', '123thuongdinh', 'bach@gmail.com', '09/10/2004', '0345678912', 'Nam'),
(1238, 'quangminh', 'nhama2321', 'qminh@gmail.com', '20/01/2004', '0123456789', 'Nam');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
CREATE TABLE IF NOT EXISTS `nhanvien` (
  `MaNhanVien` int(20) NOT NULL AUTO_INCREMENT,
  `TenNhanVien` varchar(20) NOT NULL,
  `GioiTinh` varchar(20) NOT NULL,
  `DiaChi` varchar(20) NOT NULL,
  `NgaySinh` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `SoCMND` varchar(9) NOT NULL,
  `SoDienThoai` varchar(20) NOT NULL,
  `TenTaiKhoan` varchar(20) NOT NULL,
  `MatKhau` varchar(100) NOT NULL,
  `Loai` varchar(10) NOT NULL,
  `Anh` varchar(100) NOT NULL,
  PRIMARY KEY (`MaNhanVien`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MaNhanVien`, `TenNhanVien`, `GioiTinh`, `DiaChi`, `NgaySinh`, `Email`, `SoCMND`, `SoDienThoai`, `TenTaiKhoan`, `MatKhau`, `Loai`, `Anh`) VALUES
(9, 'Cong Anh', '', '53 An Trach', '21/08/2004', 'anh@gmail.com', '', '0369932990', 'conganh2', '0fff460dde6c581f25b95e01aa762be1', '2', ''),
(13, 'Cong Minh', '', '53 An Trach', '21/08/2004', 'minh@gmail.com', '', '0369932990', 'congminh', 'fa1d3eb08a879de9a4cd9995a1aa91e1', '2', ''),
(15, 'Bach', '', 'thongPhong', '09/10/2004', 'bach@gmail.com', '', '0123456789', 'bach123', 'c5d6aaf42c7822717a8f4aa3650902f7', '2', ''),
(16, 'Tue', '', 'haibatrung', '10/09/2004', 'tue@gmail.com', '', '0123456788', 'tuevip', '0fff460dde6c581f25b95e01aa762be1', '2', ''),
(19, 'Quang Minh', '', 'haibatrieu', '10/09/2004', 'qminh@gmail.com', '', '0123456788', 'qminh', 'fa1d3eb08a879de9a4cd9995a1aa91e1', '2', ''),
(39, 'Phong', '', 'haibatrung', '17/04/2004', 'phong@gmail.com', '', '0123456788', 'phong', 'fa1d3eb08a879de9a4cd9995a1aa91e1', '1', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhaphang`
--

DROP TABLE IF EXISTS `nhaphang`;
CREATE TABLE IF NOT EXISTS `nhaphang` (
  `MaHoaDon` int(20) NOT NULL AUTO_INCREMENT,
  `NgayLapHD` date NOT NULL,
  `NhanVienLapHD` varchar(100) NOT NULL,
  `NhaCungCap` varchar(100) NOT NULL,
  `EmailNhaCungCap` varchar(100) NOT NULL,
  `DienThoaiNhaCungCap` varchar(100) NOT NULL,
  `DiaChiNhaCungCap` varchar(100) NOT NULL,
  `TenSach` varchar(100) NOT NULL,
  `BaoHanh` varchar(100) NOT NULL,
  `NgaySanXuat` date NOT NULL,
  `TinhTrang` varchar(100) NOT NULL,
  `LoaiSach` varchar(100) NOT NULL,
  `DonViTinh` varchar(100) NOT NULL,
  `DonGia` int(20) NOT NULL,
  `SoLuong` int(20) NOT NULL,
  `NhaSanXuat` varchar(100) NOT NULL,
  `TongTien` int(20) NOT NULL,
  PRIMARY KEY (`MaHoaDon`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `nhaphang`
--

INSERT INTO `nhaphang` (`MaHoaDon`, `NgayLapHD`, `NhanVienLapHD`, `NhaCungCap`, `EmailNhaCungCap`, `DienThoaiNhaCungCap`, `DiaChiNhaCungCap`, `TenSach`, `BaoHanh`, `NgaySanXuat`, `TinhTrang`, `LoaiSach`, `DonViTinh`, `DonGia`, `SoLuong`, `NhaSanXuat`, `TongTien`) VALUES
(1, '2021-03-11', 'minh', 'gue', 'gue@gmail.com', '012345678', 'minhmac', 'Chi?n th?ng c?a vua l? l?i', 'Item 2', '2021-03-18', 't?t', 'Item 1', '??ng', 20000, 20, 'Kim ??ng', 100000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `quyensach`
--

DROP TABLE IF EXISTS `quyensach`;
CREATE TABLE IF NOT EXISTS `quyensach` (
  `MaSach` int(20) NOT NULL AUTO_INCREMENT,
  `TenSach` varchar(50) NOT NULL,
  `TinhTrang` varchar(100) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `SoLuong` int(100) NOT NULL,
  `TheLoai` varchar(50) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `NXB` date NOT NULL,
  `GiaTien` int(100) NOT NULL,
  `NhaSanXuat` varchar(100) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `Anh` varchar(255) NOT NULL,
  PRIMARY KEY (`MaSach`)
) ENGINE=InnoDB AUTO_INCREMENT=4340 DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `quyensach`
--

INSERT INTO `quyensach` (`MaSach`, `TenSach`, `TinhTrang`, `SoLuong`, `TheLoai`, `NXB`, `GiaTien`, `NhaSanXuat`, `Anh`) VALUES
(1, 'Bien Nien Su De Che', 'Mới', 14, 'trinh tham', '2021-03-10', 250000, 'Xuất Bản Kim Đồng', ''),
(2, 'Hoc Vien Chien Binh', 'Mới', 17, 'vien tuong', '2021-03-10', 300000, 'Xuất Bản Kim Đồng', ''),
(3, 'HumBaBue', 'Mới', 9, 'kinh di ', '2021-03-17', 300000, 'Xuất Bản Kim Đồng', ''),
(5, 'cuoc song cua toi', '', 0, 'bi an', '2021-03-17', 123321, '', ''),
(4318, 'eren hung hau', '', 0, 'vientuong', '2021-03-24', 23000, '', ''),
(4319, 'mikasa dep zai', '', 0, 'doi thuong', '2021-03-31', 32000, '', ''),
(4327, 'ko biet dau haha haha', '', 0, 'ko ko', '2021-02-02', 10000, '', 'C:\\Users\\Phong Cute\\Pictures\\69450290_661222401040579_4977746343058472960_n.jpg'),
(4336, 'Vi Pham luat giao thong', '', 0, 'Giao thong', '2021-02-07', 100000, '', 'C:\\Users\\Phong Cute\\Documents\\0d4f4e66f5300d6e5421.jpg'),
(4338, 'dimbabue', '', 0, 'buebadim', '2021-03-25', 200000, '', 'C:\\Users\\Phong Cute\\Pictures\\97043966_285127372646776_6372567608436195328_n.jpg'),
(4339, 'cuoc song cua toi', '', 0, 'bi an', '2021-03-31', 123321, '', '');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
