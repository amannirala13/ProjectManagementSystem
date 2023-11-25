USE production_13130;

CREATE TABLE users (
                       id VARCHAR(100) PRIMARY KEY,
                       name VARCHAR(100),
                       role VARCHAR(50),
                       department VARCHAR(50)
);

DESC users;

SELECT * FROM users;