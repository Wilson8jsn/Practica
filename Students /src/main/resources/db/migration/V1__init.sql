CREATE TABLE IF NOT EXISTS student (
    id SERIAL PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    age INT NOT NULL UNIQUE
    );
