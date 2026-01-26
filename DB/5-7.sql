-- 1
SELECT name,salary FROM employees WHERE salary > 48000;

-- 2
SELECT name,department FROM employees WHERE department = '営業' OR department = '開発' OR department = 'IT';

-- 3
SELECT * FROM employees WHERE manager_id IS NULL AND name LIKE '%田%';

-- 4
SELECT name,department,salary FROM employees WHERE salary BETWEEN 50000 AND 60000;

-- 5
SELECT name,department FROM employees WHERE department != '営業' AND salary > 55000;