# Write your MySQL query statement below
select ROUND(COUNT(Case when datediff(event_date, a2.first) = 1 then 1 end) / count(distinct a.player_id), 2) as fraction
from activity a join (select player_id as id, min(event_date) as first from activity group by player_id) as a2 on a.player_id = a2.id