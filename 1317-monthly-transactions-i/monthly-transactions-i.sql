# Write your MySQL query statement below
select SUBSTR(trans_date,1,7) as month, country, COUNT(*) as trans_count, COUNT(case when state = 'approved' then 1 end) as approved_count, SUM(amount) as trans_total_amount, SUM(case when state = 'approved' then amount else 0 end) as approved_total_amount
from transactions
group by month, country