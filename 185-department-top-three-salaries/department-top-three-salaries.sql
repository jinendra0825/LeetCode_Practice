# Write your MySQL query statement below
-- +--------------+---------+
-- | Column Name  | Type    |
-- +--------------+---------+
-- | id           | int     |
-- | name         | varchar |
-- | salary       | int     |
-- | departmentId | int     |
-- +--------------+---------+

-- SELECT * 
-- FROM Employee e
-- JOIN Department  d ON e.departmentId = d.id


SELECT
    d.name AS Department,
    ranked.Employee,
    ranked.Salary
FROM (
    SELECT
        departmentId,
        name AS Employee,
        salary AS Salary,
        DENSE_RANK() OVER (
            PARTITION BY departmentId
            ORDER BY salary DESC
        ) AS ranking
    FROM Employee
) AS ranked
JOIN Department d
    ON ranked.departmentId = d.id
WHERE ranked.ranking <= 3;




