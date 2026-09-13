# Write your MySQL query statement below

SELECT SCORE,dense_rank()over(ORDER BY SCORE DESC) as 'rank' FROM SCORES order by score desc;