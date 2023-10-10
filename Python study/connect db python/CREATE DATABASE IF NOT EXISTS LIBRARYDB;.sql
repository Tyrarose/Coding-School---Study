CREATE DATABASE IF NOT EXISTS LIBRARYDB;
USE LIBRARYDB;

CREATE TABLE IF NOT EXISTS USER (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    email VARCHAR(255),
    city VARCHAR(255)
);

INSERT INTO USER (name, age, email, city) VALUES
    ('John Doe', 30, 'john@example.com', 'New York'),
    ('Jane Smith', 28, 'jane@example.com', 'Los Angeles'),
    ('Michael Johnson', 35, 'michael@example.com', 'Chicago'),
    ('Emily Brown', 25, 'emily@example.com', 'Houston'),
    ('William Wilson', 32, 'william@example.com', 'Dallas');

SELECT * FROM user;