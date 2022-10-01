create database QLSV

use QLSV

create table KHOA(
maKhoa char(4) primary key,
tenKhoa nvarchar(35)
)

create table LOP(
	maLop char(3) primary key,
	tenLop char(7),
	maKhoa char(4),
	foreign key (maKhoa) references KHOA(maKhoa)
)

create table SINH_VIEN(
	mSSV char(10) primary key,
	hoTen nvarchar(35),
	diemToan float,
	diemLy float,
	diemHoa float,
	maLop char(3),
	foreign key (maLop) references LOP(maLop)
)

create table USER_ACCOUNT(
	taiKhoan varchar(18) primary key,
	matKhau varchar(6)
)

INSERT INTO USER_ACCOUNT VALUES ('admin', '123')
INSERT INTO KHOA VALUES ('KH01', N'Công Nghệ Thông Tin')
INSERT INTO LOP VALUES ('L01', '20DTHE1', 'KH01')
INSERT INTO SINH_VIEN VALUES ('2080600938', N'Nguyễn Hữu Bằng', 9, 8.5, 8.3, 'L01')

select * from KHOA
select * from USER_ACCOUNT
select * from LOP
select * from SINH_VIEN

go
CREATE PROCEDURE usp_login @pr_username nvarchar(50), @pr_password nvarchar(50)
as
BEGIN	
	SELECT * FROM USER_ACCOUNT WHERE taiKhoan=@pr_username AND matKhau=@pr_password
END;
go
EXEC usp_login @pr_username = 'admin', @pr_password = '123';