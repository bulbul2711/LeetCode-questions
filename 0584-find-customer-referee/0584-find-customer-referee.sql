# Write your MySQL query statement below
SELECT name FROM Customer 
WHERE ifnull(referee_id,1)<>2;