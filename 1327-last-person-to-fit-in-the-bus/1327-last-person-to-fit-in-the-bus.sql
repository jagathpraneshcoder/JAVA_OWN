# Write your MySQL query statement below
SELECT person_name 
FROM Queue
WHERE person_id = (
    SELECT person_id 
    FROM (
        SELECT person_id, 
               SUM(weight) OVER (ORDER BY turn) AS cumulative_weight
        FROM Queue
    ) AS subquery
    WHERE cumulative_weight <= 1000
    ORDER BY cumulative_weight DESC
    LIMIT 1
);