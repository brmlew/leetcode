# Write your MySQL query statement below
select salesperson.name from salesperson 
where name not in (
    select distinct s.name
    from orders o join salesperson s on o.sales_id = s.sales_id join company c on o.com_id = c.com_id
    where c.name = 'RED'
)
