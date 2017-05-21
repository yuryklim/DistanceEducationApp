

CREATE  TABLE register_users (
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  user VARCHAR(255) ,
  password VARCHAR(255) ,
  email VARCHAR(255) ,
  address VARCHAR(255) ,
  phone VARCHAR(255),
  role INT
);
INSERT INTO register_users (password) VALUES ('password');