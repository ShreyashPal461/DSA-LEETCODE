# Write your MySQL query statement below
select email AS EMAIL 
FROM Person
GROUP BY email
HAVING count(email)>1;