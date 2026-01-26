-- Active: 1768889883930@@127.0.0.1@5432@educure_db

-- 5-3 setup
-- 一度本文で使ったbooksテーブルのデータを削除します。
DELETE FROM books;

-- booksテーブルに演習問題用のデータを挿入します。
INSERT INTO books (title, author, publication_year, genre, loan_date) VALUES
('未来のSQL', '田中 太郎', 2023, '技術書', '2023-10-01'),
('過去のSQL', '田中 一郎', 1999, '技術書', '1999-05-15'),
('現在のSQL', '田中 一郎', 2005, '小説', '2005-07-20'),
('SQLの冒険', '山田 花子', 2010, '小説', '2010-09-10'),
('SQLの基礎', '佐藤 次郎', 2001, '技術書', '2001-11-25'),
('恋するデータベース', '高橋 美香', 2015, '小説', '2015-03-14'),
('プログラマーの恋', '森田 健一', 2020, '小説', '2020-12-05');

-- 5-5
-- employeesテーブルの作成
CREATE TABLE employees (
    employee_id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50),
    salary INT,
    hire_date DATE,
    manager_id INT
);

-- 一度ここまで貼り付けて、テーブルを作成します。

-- 次に、必要な情報をテーブルに追加しましょう。
INSERT INTO employees (name, department, salary, hire_date)
VALUES 
('山田 太郎', '営業', 55000, '2022-01-15'),
('小林 美智子', '人事', 48000, '2023-04-01'),
('佐藤 健', 'IT', 60000, '2021-06-10'),
('鈴木 花子', 'マーケティング', 52000, '2020-11-20'),
('田中 一郎', '開発', 58000, '2019-03-15');

-- 5-7
-- 前回の問題で使ったemployeesテーブルのデータを削除します。
DELETE FROM employees;

-- ここまで貼り付けたら一度Enterキーを押して実行しましょう。
-- その後、今回の演習問題で使うデータを挿入します。
-- 以下のクエリを貼り付けて実行してください。

INSERT INTO employees (employee_id, name, department, salary, hire_date, manager_id) VALUES
(5673, '高田 太郎', '営業', 55000, '2019-06-15', NULL),
(5674, '田村 花子', 'マーケティング', 62000, '2021-03-22', 101),
(5675, '鈴木 次郎', 'IT', 48000, '2020-11-01', 102),
(5676, '田中 一郎', '営業', 70000, '2018-09-10', NULL),
(5677, '高橋 美咲', 'マーケティング', 53000, '2020-01-05', 103),
(5678, '佐藤 高志', '人事', 45000, '2022-07-19', NULL);

-- 5-9
-- テーブル内のデータの削除
DELETE FROM employees;

-- employeesテーブルにname_kana列を追加
ALTER TABLE employees ADD COLUMN name_kana VARCHAR(50);

--employeesテーブルのデータを追加
INSERT INTO employees (employee_id, name, name_kana, department, salary, hire_date, manager_id) VALUES
(5673, '高田 太郎', 'たかだ たろう', '営業', 55000, '2019-06-15', NULL),
(5674, '田村 花子', 'たむら はなこ', 'マーケティング', 62000, '2021-03-22', 101),
(5675, '鈴木 次郎', 'すずき じろう', 'IT', 48000, '2020-11-01', 102),
(5676, '田中 一郎', 'たなか いちろう', '開発', 70000, '2018-09-10', NULL),
(5677, '高橋 美咲', 'たかはし みさき', 'マーケティング', 53000, '2020-01-05', 103),
(5678, '佐藤 高志', 'さとう たかし', '人事', 45000, '2022-07-19', NULL),
(5679, '小林 美智子', 'こばやし みちこ', '人事', 48000, '2023-04-01', NULL),
(5680, '田中 次郎', 'たなか じろう', 'IT', 52000, '2023-05-01', 104),
(5681, '山田 花子', 'やまだ はなこ', '営業', 50000, '2016-10-01', 105),
(5682, '佐々木 次郎', 'ささき じろう', 'マーケティング', 48000, '2017-04-01', 106);

-- 5-14
-- 今回の問題はproductsテーブルを使うので、productsテーブルを作成します。
DELETE FROM products;
CREATE TABLE products (
    product_id SERIAL PRIMARY KEY,
    product_name VARCHAR(255) NOT NULL,
    price INT NOT NULL,
    stock INT NOT NULL
);

-- その後、今回の演習問題で使うデータを挿入します。
-- 以下のクエリを貼り付けて実行してください。

INSERT INTO products (product_name, price, stock) VALUES
('ノートパソコン', 150000, 10),
('タブレット', 50000, 0),
('ヘッドフォン', 12000, 20),
('ゲーミングPC', 250000, 5),
('デジタルカメラ', 180000, 0);

-- ログを残すためのテーブルを作成します。
CREATE TABLE product_logs (
    log_id SERIAL PRIMARY KEY,
    product_id INT,
    action VARCHAR(50),
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);