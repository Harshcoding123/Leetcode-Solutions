# Write your MySQL query statement below
SELECT firstName,lastName,city,state  
FROM person as p
LEFT JOIN address as a
on p.personId = a.personId
