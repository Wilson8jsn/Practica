CREATE TABLE IF NOT EXISTS grade (
    id SERIAL PRIMARY KEY,
    grade_name VARCHAR(100) NOT NULL,
    grade_value DOUBLE PRECISION NOT NULL,
    student_id INT
    );
