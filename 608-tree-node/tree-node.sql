# Write your MySQL query statement below
select id, 
    Case when t.p_id is null then 'Root'
        when counts.children = 0 or counts.children is null then 'Leaf'
        else 'Inner'
        END as type
from tree t left join (select p_id as node, count(*) as children from tree 
group by p_id) as counts on t.id = counts.node