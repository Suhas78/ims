# 📦 Inventory Management System (IMS)

A simple full-stack Inventory Management System built with **Java**, **Spring Boot**, **MySQL**, and **RESTful APIs**. It allows users to manage products, including adding, updating, deleting, and viewing product inventory.

---

## 🚀 Tech Stack

- **Backend:** Java, Spring Boot, Spring Data JPA
- **Database:** MySQL
- **Build Tool:** Maven
- **API Testing:** Postman
- **Version Control:** Git, GitHub

---

## 🛠️ Features

-  Add new products
-  View all products
-  Update product details
-  Delete products
- Persistent storage using MySQL

---

## 📁 Project Structure

<img width="317" height="348" alt="image" src="https://github.com/user-attachments/assets/36e63f34-5d1b-461f-807f-ba266e86d3d2" />


## ⚙️ Setup Instructions

 1. Clone the repository
```bash
git clone https://github.com/your-username/ims.git
cd ims

 2. Configure MySQL
Ensure MySQL is installed and running. Create a database:

sql
Copy
Edit
CREATE DATABASE inventory_db;

Update src/main/resources/application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

 3. Build & Run

mvn clean install
mvn spring-boot:run

📬 API Endpoints
Method    	Endpoint	     Description
GET  	/api/products	     Get all products
POST	/api/products	     Add a product
PUT 	/api/products/{id}	 Update a product
DELETE	/api/products/{id}	 Delete a product

Example JSON for POST /api/products:

json
{
  "name": "Pen",
  "category": "Stationery",
  "quantity": 100,
  "price": 12.5

🤝 Contribution
Pull requests are welcome. For major changes, please open an issue first.

🙋‍♂️ Author
Kolakani Suhas



