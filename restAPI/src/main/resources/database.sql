CREATE DATABASE restapi;
USE restapi;

CREATE TABLE user(
  userid INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  firstname VARCHAR(500) NOT NULL,
  lastname VARCHAR(500) NOT NULL,
  username VARCHAR(500) NOT NULL,
  password VARCHAR(500) NOT NULL,
  role VARCHAR(5000) NOT NULL,
  groupname VARCHAR(5000) NOT NULL
);

CREATE TABLE usergroup(
  groupname VARCHAR(50) PRIMARY KEY,
  groupdesc VARCHAR(500) NOT NULL
);