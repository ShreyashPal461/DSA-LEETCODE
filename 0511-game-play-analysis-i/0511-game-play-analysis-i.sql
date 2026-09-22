# Write your MySQL query statement below
Select player_id,
MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id