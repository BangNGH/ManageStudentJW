
go
Alter PROCEDURE usp_login @pr_username nvarchar(50), @pr_password nvarchar(50)
as
BEGIN	
	SELECT * FROM User_Account WHERE taiKhoan=@pr_username AND matKhau=@pr_password
END;
go
EXEC usp_login @pr_username = 'admin', @pr_password = '123';

