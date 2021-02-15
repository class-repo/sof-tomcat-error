# Reproduce Tomcat Error

This is a demo & reproduce the problem on this question: https://stackoverflow.com/questions/66198579/intellij-idea-2020-tomcat-10-servlet-http-status-404-not-found

**UPDATE:**
- This question already has answers here: https://stackoverflow.com/questions/66198579/intellij-idea-2020-tomcat-10-servlet-http-status-404-not-found
- You need `jakarta.servlet.*` instead. - BalusC

# Setup

- IDE: IntelliJ IDEA 2020.3.2 Ultimate Edition
- Server: Tomcat 10.0.2
- Server: JBoss 22.0.1

# Hello World project

- Create new project:
  ![1](screenshots/1.png)
  ![2](screenshots/2.png)

- Tomcat configuration:
  ![3](screenshots/3.png)

# Run on Tomcat

![4](screenshots/4.png)
![5](screenshots/5.png)

Notes: it works fine when running on JBoss:
![6](screenshots/6.png)

# Mapping Servlets to URL Patterns

Following this tutorial: https://youtu.be/DZdtFlLi_I4

- Still getting error with Tomcat:
  ![7](screenshots/7.png)
- Although it works fine when running on JBoss:
  ![8](screenshots/8.png)
