CREATE TABLE USER
(
  LOGIN VARCHAR(2147483647),
  PASSWORD VARCHAR(2147483647) NOT NULL,
  EMAIL VARCHAR(2147483647) NOT NULL,
  ID BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL
);


INSERT INTO PUBLIC.USER (LOGIN, PASSWORD, EMAIL) VALUES ('dmytrok', '123', 'test@devcom.com');
INSERT INTO PUBLIC.USER (LOGIN, PASSWORD, EMAIL) VALUES ('dmytrok_test1', '123', 'drytrok@test.test');
INSERT INTO PUBLIC.USER (LOGIN, PASSWORD, EMAIL) VALUES ('test2', '123', 'test2@test.test');