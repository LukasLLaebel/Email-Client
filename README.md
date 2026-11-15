# Email Client project

## Project needs

- Java Spring boot
- Mail API
- Database
- Thymeleaf template engine
- Spring Security

## Setup

- Spring boot
  - Use Spring boot initializr to create a new project with the following dependencies:
    - Language: Java
    - project: Gradle - Groovy
    - Spring Boot version: 4.1.1
    - Project group: com.lukas
    - Project artifact: email
    - Package name: com.lukas.email
    - Dependencies: - Spring Security - Thymeleaf - Java Mail Sender - PostgreSQL Driver
      Then run:

  ```bash
  gradle build
  ```

  it will setup the project and download all dependencies.

### Database setup

we need an database system i chose postgresql.
made an docker compose file so you need to install docker compose before use.

I chose adminer as admin panel because i use that in our course on this semester: Database and Software Architecture (DSA)

To to turn on the database run:

```bash
docker-compose up -d
```

#### Future improvements

In the future I will convert it to SQLite, but in the starting fase its easiere to work with something known.

## Project Overview

Create a secure email system for sending and receiving emails. Learn email protocols and secure web development.

### Key Features

- User authentication and email composition.
- Send and receive emails using SMTP/POP3.
- Store email history securely.
- Admin module to manage accounts.

### Learning Outcomes

- Integrate JavaMail API for email functionality.
- Build secure web applications with Spring Boot.
- Manage data with Hibernate.

## Sources

[Where i get the idea](https://www.geeksforgeeks.org/blogs/java-projects/)\
[How to setup gradle](https://docs.gradle.org/current/userguide/part1_gradle_init.html)\
[Setup Project](https://start.spring.io/)

## Big ToDo List

### 1. Project setup

- [ ] Configure Spring Boot application
- [ ] Configure PostgreSQL database connection
- [ ] Configure Hibernate / Spring Data JPA
- [ ] Configure Thymeleaf templates and layouts
- [ ] Configure Spring Security
- [ ] Configure environment variables for secrets
- [ ] Create database entities and repositories

### 2. User management

- [ ] Create user registration
- [ ] Implement login and logout
- [ ] Implement password hashing with BCrypt
- [ ] Implement authentication with Spring Security
- [ ] Implement authorization and user permissions
- [ ] Implement user profile management
- [ ] Implement password change
- [ ] Implement account deletion
- [ ] Prevent users from accessing other users' emails

### 3. Email functionality

- [ ] Configure SMTP for sending emails
- [ ] Support SMTP ports 25, 465 and 587 where applicable
- [ ] Implement email composition
- [ ] Implement recipient fields (To, CC, BCC)
- [ ] Implement subject and message body
- [ ] Implement HTML and plain-text emails
- [ ] Implement email attachments
- [ ] Implement email validation
- [ ] Implement email sending status and error handling

### 4. Receiving and synchronizing emails

- [ ] Configure IMAP connection
- [ ] Implement IMAP authentication
- [ ] Retrieve emails from mailbox
- [ ] Synchronize emails with database
- [ ] Implement inbox
- [ ] Implement sent folder
- [ ] Implement drafts folder
- [ ] Implement trash folder
- [ ] Implement archive folder
- [ ] Implement marking emails as read/unread
- [ ] Implement email deletion
- [ ] Implement email flagging / starring
- [ ] Implement email folder synchronization

### 5. Email storage and database

- [ ] Create email entity
- [ ] Create attachment entity
- [ ] Create mailbox/folder entity
- [ ] Create email recipient entity
- [ ] Store email metadata
- [ ] Store email body
- [ ] Store email attachments
- [ ] Store email sending history
- [ ] Implement email pagination
- [ ] Implement database migrations

### 6. Frontend / User Interface

- [ ] Create login page
- [ ] Create registration page
- [ ] Create main email dashboard
- [ ] Create inbox view
- [ ] Create email details view
- [ ] Create email composition view
- [ ] Create email reply functionality
- [ ] Create email forwarding functionality
- [ ] Implement search functionality
- [ ] Implement email filtering
- [ ] Implement responsive layout

### 7. Security

- [ ] Secure SMTP and IMAP connections using TLS
- [ ] Protect against CSRF attacks
- [ ] Validate and sanitize user input
- [ ] Prevent XSS attacks
- [ ] Secure email attachments
- [ ] Protect against unauthorized mailbox access
- [ ] Implement rate limiting for login
- [ ] Secure application secrets
- [ ] Implement secure session management
- [ ] Avoid storing external email passwords in plaintext

### 8. Testing

- [ ] Write unit tests
- [ ] Write integration tests
- [ ] Test authentication and authorization
- [ ] Test email sending
- [ ] Test email receiving
- [ ] Test database operations
- [ ] Test security vulnerabilities
- [ ] Test error handling

### 9. Deployment

- [ ] Configure production environment
- [ ] Configure Docker deployment
- [ ] Configure HTTPS
- [ ] Configure production database
- [ ] Configure logging
- [ ] Configure application monitoring
- [ ] Configure database backups
- [ ] Write deployment documentation

### 10. Future improvements

- [ ] Implement OAuth2 authentication for external email providers
- [ ] Implement multiple email accounts per user
- [ ] Implement email signatures
- [ ] Implement contacts/address book
- [ ] Implement email labels
- [ ] Implement email scheduling
- [ ] Implement automatic email synchronization
- [ ] Implement push notifications using IMAP IDLE
- [ ] Implement spam filtering
- [ ] Implement calendar integration
