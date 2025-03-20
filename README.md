**Job Portal API - Project Guide**

**Project Overview**

The Job Portal API is a Java-based application designed to manage job listings, user profiles, and role-based access control efficiently. The system is built using Spring Boot with MySQL as the database and includes various endpoints for CRUD operations.

**Key Features**
✅ Add, Update, and Delete Job Listings
✅ Manage User Profiles and Authentication
✅ Role-based Access Control (Admin, Employer, Job Seeker)
✅ RESTful API Design with Clean Architecture
✅ Real-time Data Storage Using MySQL
✅ Secure Endpoints with Spring Security

**Project Folder Structure**

project-root/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/jobportal/
│   │   │   │   ├── Main.java
│   │   │   │   ├── config/
│   │   │   │   │   └── SecurityConfig.java
│   │   │   │   ├── model/
│   │   │   │   │   ├── Job.java
│   │   │   │   │   ├── User.java
│   │   │   │   │   └── Role.java
│   │   │   │   ├── repository/
│   │   │   │   │   ├── JobRepository.java
│   │   │   │   │   ├── UserRepository.java
│   │   │   │   │   └── RoleRepository.java
│   │   │   │   ├── service/
│   │   │   │   │   ├── JobService.java
│   │   │   │   │   ├── UserService.java
│   │   │   │   │   └── AuthService.java
│   │   │   │   ├── controller/
│   │   │   │   │   ├── JobController.java
│   │   │   │   │   ├── UserController.java
│   │   │   │   │   └── AuthController.java
│   └── resources/
│       └── application.properties
├── lib/
│   └── mysql-connector-j-9.2.0.jar
├── .gitignore
├── README.md
└── jobportal_db.sql

**Setup Instructions**

**Step 1: Setup MySQL Database**
1. Start the MySQL server.
2. Log in to MySQL:
3. Create the `jobportal_db` database:

**Step 2: Add MySQL Connector (if not added)**
Create the `lib/` folder and move the `.jar` file:

  command: mkdir lib
           mv ~/Downloads/mysql-connector-j-9.2.0.jar lib/

**Step 3: Compile the Java Files**
Run the following commands in sequence:
1. Compile Config Class
   command: javac -d out -cp "out:lib/mysql-connector-j-9.2.0.jar" src/main/java/com/jobportal/config/SecurityConfig.java

3. Compile Model Classes
   command: javac -d out -cp "lib/mysql-connector-j-9.2.0.jar" src/main/java/com/jobportal/model/*.java

3. Compile Repository Classes
   command: javac -d out -cp "out:lib/mysql-connector-j-9.2.0.jar" src/main/java/com/jobportal/repository/*.java

4. Compile Service Classes
   command: javac -d out -cp "out:lib/mysql-connector-j-9.2.0.jar" src/main/java/com/jobportal/service/*.java

5. Compile Controller Classes
   command: javac -d out -cp "out:lib/mysql-connector-j-9.2.0.jar" src/main/java/com/jobportal/controller/*.java
6. Compile Main Class
   command: javac -d out -cp "out:lib/mysql-connector-j-9.2.0.jar" src/main/java/com/jobportal/Main.java

**Step 4: Run the Project**
Run the application with the `.jar` file included:
   command: java -cp "out:lib/mysql-connector-j-9.2.0.jar" com.jobportal.Main

**Important Notes**
- Ensure MySQL Server is running before starting the project.
- If any permission errors occur, use `sudo` where required.
- Ensure all dependencies (like the MySQL Connector JAR file) are correctly added to the `lib/` folder.

