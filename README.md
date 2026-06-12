![CI](https://github.com/putra05062005/api-automation-test/actions/workflows/ci.yml/badge.svg)
# 🚀 API Automation Testing Project

## 📌 Description
Project ini merupakan implementasi **API Automation Testing** menggunakan **Java, JUnit 5, dan Rest Assured** untuk menguji endpoint dari:

🔗 https://api.rizqifauzan.com

Testing dilakukan untuk memastikan API berjalan dengan benar, termasuk validasi authentication, response, dan performa.

---

## 🛠️ Tech Stack
- Java
- JUnit 5
- Rest Assured
- Gradle

---

## 🧠 Features
- ✅ Authentication testing (Login & Token)
- ✅ CRUD API testing (Siswa Management)
- ✅ Positive & Negative test cases
- ✅ Response validation (status code & body)
- ✅ Performance testing (response time)

---

## 🧪 Test Cases

### ✅ Positive Test
- Get all students
- Get student data
- Create new student
- Validate student data exists
- Response time check

### ❌ Negative Test
- Access API tanpa token → expected `401 Unauthorized`

---

## 🔐 Authentication Flow
1. Login ke endpoint `/api/auth/login`
2. Mendapatkan JWT token
3. Menyisipkan token ke header: Authorization: Bearer <token>
4. Mengakses endpoint siswa
---

## 📁 Project Structure
app/src/test/java/
├── tests/ → Test cases
├── requests/ → API request handling
└── utils/ → Helper (auth & config)


---

## ▶️ How to Run

Clone repository:
```bash
git clone https://github.com/putra05062005/api-automation-test.git
cd api-automation-test

Jalankan test:
./gradlew test

📊 Test Result

Semua test berhasil dijalankan dengan status:
✔ 6 Tests Passed
✔ 100% Success

Report dapat dilihat di:
app/build/reports/tests/test/index.html

🎯 Conclusion

API berhasil diuji menggunakan automation testing.
Semua endpoint berjalan sesuai ekspektasi, termasuk authentication dan validasi response.

Automation testing membantu meningkatkan kualitas API dan mempercepat proses pengujian.

👨‍💻 Author

Pahala Putra Tambunan

---

