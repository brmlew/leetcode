# Write your MySQL query statement below
(select name as results
from users join movieRating on users.user_id = movieRating.user_id
group by name
order by count(*) desc, name
limit 1)
UNION ALL
(select title as results
from movies join movierating on movies.movie_id = movierating.movie_id
where month(created_at) = 2 and year(created_at) = 2020
group by movies.movie_id
order by avg(rating) desc, title
limit 1)