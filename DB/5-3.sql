-- 1
SELECT title, publication_year FROM books
   WHERE author='田中 一郎';

-- 2
INSERT INTO books (title, author, publication_year, genre) VALUES
('SQLの応用', '鈴木 三郎',2019, '技術書');
SELECT title, author, publication_year, genre, loan_date FROM books
   WHERE title = 'SQLの応用';
DELETE FROM books WHERE title = 'SQLの応用';

-- 3
DELETE FROM books WHERE author='山田 花子';
SELECT * FROM books;
INSERT INTO books (title, author, publication_year, genre, loan_date) 
VALUES ('SQLの冒険', '山田 花子', 2010, '小説', '2010-09-10');

-- 4
UPDATE books SET title='SQL入門' WHERE title='未来のSQL';
SELECT * FROM books;
UPDATE books SET title = '未来のSQL' WHERE title = 'SQL入門';

-- 5
SELECT * FROM books WHERE genre='小説' AND publication_year >= 2000 ORDER BY publication_year DESC ;
