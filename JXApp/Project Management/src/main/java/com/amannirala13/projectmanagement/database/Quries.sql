USE production_13130;

CREATE TABLE users (
                       id VARCHAR(100) PRIMARY KEY,
                       name VARCHAR(100),
                       role VARCHAR(50),
                       department VARCHAR(50)
);

DESC users;

SELECT * FROM users;

CREATE TABLE projects (
                       id VARCHAR(100) PRIMARY KEY,
                       title VARCHAR(100),
                       startDate VARCHAR(50),
                       endDate VARCHAR(50),
                       bufferDays VARCHAR(100),
                       complete BOOLEAN
);

SELECT * FROM projects;

DROP TABLE projects;