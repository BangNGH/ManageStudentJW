update: 1/10
	+excute các câu lệnh trong file SQLQuery.sql
	+tất cả cấu hình TCP/IP cho SQL server mở port 1433
	+tải jdbc4 tại link "https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjdxd7ik7_6AhXKxGEKHWjsAbYQFnoECAwQAQ&url=https%3A%2F%2Fosdn.net%2Fprojects%2Fsfnet_id2d%2Fdownloads%2Fjdbc%2520drivers%2Fsqljdbc4.jar%2F&usg=AOvVaw0L0mOZdJmnlP3c25CyiFKZ"
	+Sau khi tải jdbc4.jar thực hiện add file jdbc4.jar vào thư viện cho project Client và Server để kết nối đến SQL server
	+thực hiện add model Students cho Client và Server bằng cách clean and build project Entities sau đó add file Entities.jar vào libraries cho project client và server
	+Run lần lượt file ServerRun và ClientRun để test bài

<<<<<<< HEAD
*LƯU Ý:
	+không đổi tên biến/Folder/Class đã có sẳn trong SQL server và các project từ github 
	+Không push các phần còn bug lên brach master	
	+Cấu hình tài khoản sa trong SQL server và dùng tài khoản và mk sa để đăng nhập
	+Các class chứa dòng code sau: "Connection connect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV;user=sa;password=123");" 
=> Thực hiển sửa password của user sa trong SQL server thành password của của mình đặt

	
 *Việc cần làm: 
	+Học cách cách sử dụng github và các câu lệch cơ bản dùng
	+Chỉnh sửa readme file và push lên github để thử cách dùng git
	+Push bài lên github phải commit message và note vào readme file
=======
 *Việc cần làm:
	-Tạo và code form hoàn chỉnh form đăng ký
	- Nhận dữ liệu từ client thực hiện mã hóa password bằng thuật toán DES sai đó lưu vào sql và nhận thông số từ giao diện để đọc giải mã dữ liệu, sau đó tính điểm trung bình của từng bạn và gửi về cho client.
	-Tạo và code form môn học 
	- Thay thế các câu lệch select form where = PROCERDUCE
	
>>>>>>> 2c9e244d0749ab7b93603ce11cf420a4e4f9ac49
