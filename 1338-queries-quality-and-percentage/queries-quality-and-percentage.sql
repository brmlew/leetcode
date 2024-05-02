# Write your MySQL query statement below
select query_name, ROUND(AVG(rating/position), 2) as quality, ROUND(100.0 * COUNT(case when rating < 3 then 1 end) / COUNT(*), 2) as poor_query_percentage
from queries
where query_name is not null
group by query_name
