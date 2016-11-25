CREATE TABLE ARTICLE
(
    ID BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    NAME VARCHAR(128),
    DESCRIPTION VARCHAR(2147483647),
    CREATED_DATE TIMESTAMP DEFAULT CURRENT_DATE(),
    CREATED_BY BIGINT,
    IMAGE_PATH VARCHAR(255)
);
CREATE TABLE ARTICLE_DETAILS
(
    ID BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    ARTICLE_ID BIGINT,
    DESCRIPTION VARCHAR(2048),
    LIKE_COUNT INTEGER DEFAULT 0,
    UNLIKE_COUNT INTEGER DEFAULT 0
);
CREATE TABLE ROLE
(
    ID BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    NAME VARCHAR(32)
);
CREATE TABLE USER
(
    LOGIN VARCHAR(2147483647),
    PASSWORD VARCHAR(2147483647) NOT NULL,
    EMAIL VARCHAR(2147483647) NOT NULL,
    ID BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    ROLE VARCHAR(16),
    ENABLED BOOLEAN DEFAULT TRUE,
    FIRST_NAME VARCHAR(64),
    LAST_NAME VARCHAR(64),
    GENDER VARCHAR(16),
    PHONE_NUMBER VARCHAR(64)
);