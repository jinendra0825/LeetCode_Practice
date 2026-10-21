# Write your MySQL query statement below

--     SELECT e.student_id , s.student_name , e.subject_name , COUNT(*) AS attended_exams
--     FROM Examinations e
--     LEFT JOIN Students s ON e.student_id = s.student_id

--     GROUP BY e.student_id , e.subject_name

--     ORDER BY e.student_id

-- -- ORDER BY student_id , subject_name

-- SELECT e.student_id , s.student_name , e.subject_name
-- FROM  Students s
-- JOIN Examinations e
-- ON s.student_id = e.student_id
-- ORDER BY e.student_id , e.subject_name

-- SELECT * 
-- FROM Students stu
-- JOIN Subjects sub
-- JOIN Examinations e ON stu.student_id = e.student_id


SELECT
    stu.student_id,
    stu.student_name,
    sub.subject_name,
    COUNT(e.subject_name) AS attended_exams
FROM Students stu
CROSS JOIN Subjects sub
LEFT JOIN Examinations e
    ON stu.student_id = e.student_id
    AND sub.subject_name = e.subject_name
GROUP BY
    stu.student_id,
    stu.student_name,
    sub.subject_name
ORDER BY
    stu.student_id,
    sub.subject_name;
