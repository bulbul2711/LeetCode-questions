# Write your MySQL query statement below
# SELECT tweet_id FROM Tweets
# WHERE char_length(content) >15;



SELECT tweet_id FROM Tweets
WHERE length(content) >15;