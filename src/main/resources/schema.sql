

DROP TABLE IF EXISTS EMPLOYEES;
CREATE TABLE EMPLOYEES
(
    ID SERIAL PRIMARY KEY,
    NAME VARCHAR(30) NOT NULL,
    IDENTIFICATION INTEGER NOT NULL,
    SALARY INTEGER NOT NULL,
    CONTRACTTYPE VARCHAR(60) NOT NULL,
    CONTRACTSTARDATE DATE NOT NULL,
    POSITION VARCHAR(100) NOT NULL
	);