# Write your MySQL query statement below
-- SELECT user_id  FROM Signups
-- UNION ALL
-- SELECT user_id  FROM Confirmations

-- SELECT user_id , action , COUNT(*) AS total_Action
-- FROM (
--     SELECT 
-- ) 
-- GROUP BY user_id
SELECT user_id , ROUND((confirm_count / total_action) , 2)as confirmation_rate
FROM (
        SELECT s.user_id, c.time_stamp, c.action , SUM(CASE WHEN action = 'confirmed' THEN 1 ELSE 0 END ) AS confirm_count ,
        COUNT(*) AS total_action
        FROM Signups s
        LEFT JOIN Confirmations c
            ON s.user_id = c.user_id
        GROUP BY s.user_id
) as total_counted