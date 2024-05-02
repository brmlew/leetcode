# Write your MySQL query statement below
select t.request_at as Day, 
    ROUND(COUNT(CASE when t.status = 'cancelled_by_client' or t.status = 'cancelled_by_driver' then 1 end) / count(*), 2) as 'Cancellation Rate'
from trips t join users c on t.client_id = c.users_id join users d on t.driver_id = d.users_id
where c.banned = 'No' and d.banned = 'No' and request_at between "2013-10-01" and "2013-10-03"
group by t.request_at
