DROP TABLE IF EXISTS books;
DROP TABLE IF EXISTS authors;

-- Create authors table
CREATE TABLE authors (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Create books table with foreign key constraint
CREATE TABLE books (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    summary TEXT,
    publication_year INT,
    author_id BIGINT NOT NULL,
    FOREIGN KEY (author_id) REFERENCES authors(id)
);
