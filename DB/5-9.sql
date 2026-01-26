-- 1
SELECT DISTINCT department FROM employees;

-- 2 
SELECT name,salary FROM employees ORDER BY salary DESC, name_kana ASC;

-- 3
SELECT department FROM employees WHERE salary >= 55000
INTERSECT
SELECT department FROM employees WHERE hire_date >= '2020-01-01';

-- 4
SELECT name FROM employees WHERE department NOT IN('IT','開発');

-- 5
SELECT name,department FROM employees WHERE salary >= 50000
UNION
SELECT  name,department FROM employees WHERE hire_date >= '2020-01-01';