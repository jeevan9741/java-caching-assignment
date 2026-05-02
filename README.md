# 🧠 Java Caching + Relationships

## 📌 Overview
This project demonstrates a simple **User & Order system** using Java.  
It focuses on two important concepts:
- **One-to-Many Relationship (1:N)**
- **Caching using HashMap**

The system simulates how applications like Amazon or Flipkart manage users and their orders efficiently.

---

## 🎯 Objective
- Implement a **User → Multiple Orders** relationship  
- Improve performance using a **caching mechanism**  
- Avoid repeated database calls  

---

## 🏗️ Project Structure


java-caching-assignment/
│
├── Main.java
└── README.md


---

## 🧩 Classes Used

### 1. User Class
- `id` → User ID  
- `name` → User Name  
- `orders` → List of Orders  

### 2. Order Class
- `orderId` → Order ID  
- `productName` → Product Name  

### 3. UserService Class
- `HashMap<Integer, User> cache` → Stores user data  
- `getUser(int id)` → Handles caching logic  

---

## ⚙️ How It Works

1. When `getUser(id)` is called:
   - First checks if user exists in cache  
2. If user exists:
   - Fetch from cache (fast)  
3. If user does not exist:
   - Fetch from database (simulated)  
   - Create dummy user and orders  
   - Store user in cache  

---

## 🖥️ Sample Output

Fetching from Database
User: Yash
Orders: Mobile, Laptop

Fetching from Cache
User: Yash
Orders: Mobile, Laptop



---

## 🚀 Technologies Used
- Java
- OOP Concepts
- Collections Framework (HashMap, ArrayList)

---

## 💡 Key Learnings
- Understanding of **1:N relationships in Java**
- Use of **in-memory caching**
- Improving performance by reducing repeated data fetch

---

## 🔗 GitHub Repository
https://github.com/jeevan9741/java-caching-assignment.git

---

## 👨‍💻 Author
**Jeevan Chavan**
