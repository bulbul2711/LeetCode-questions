# Write your MySQL query statement below
# SELECT s.machine_id, ROUND(AVG(e.timestamp-s.timestamp), 3) AS processing_time
# FROM Activity s JOIN Activity e ON
#     s.machine_id = e.machine_id AND s.process_id = e.process_id AND
#     s.activity_type = 'start' AND e.activity_type = 'end'
# GROUP BY s.machine_id





#However, unlike queries of other joins, we use WHERE clause to specify the condition for the table to combine #with itself; instead of the ON clause
SELECT a.machine_id,ROUND(AVG(b.timestamp-a.timestamp),3) AS processing_time
FROM Activity a , Activity b
WHERE a.machine_id = b.machine_id AND a.process_id = b.process_id
AND a.activity_type = 'start' AND b.activity_type = 'end'
GROUP BY a.machine_id;