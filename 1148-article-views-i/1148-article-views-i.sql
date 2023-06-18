# Write your MySQL query statement below
SELECT DISTINCT author_id AS id
FROM Views 
WHERE author_id=viewer_id
ORDER BY author_id;











# GROUP BY and DISTINCT both generate the same query execution plan when no aggregates are used. 2. GROUP BY becomes important when aggregates are used. DISTINCT is just for filtering out duplicate records from query result sets.