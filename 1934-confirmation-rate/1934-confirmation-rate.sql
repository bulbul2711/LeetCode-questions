# Write your MySQL query statement below
SELECT s.user_id,
CASE WHEN c.time_stamp IS NULL THEN 0.00
ELSE ROUND(SUM(c.action='confirmed')/COUNT(*),2)
END AS confirmation_rate
FROM Signups AS s
LEFT JOIN Confirmations AS c
ON s.user_id=c.user_id
GROUP BY s.user_id;