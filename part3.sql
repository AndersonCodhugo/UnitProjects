CREATE TABLE adquirentes (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  email VARCHAR(100),
  user_id INT,
  FOREIGN KEY (user_id) REFERENCES users(id)
);
