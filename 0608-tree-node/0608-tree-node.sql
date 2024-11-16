# Write your MySQL query statement below
with p_id as (select p_id from tree where p_id is not null group by 1)

select id,
case when p_id is null then 'Root'
when id not in (select p_id from p_id) then 'Leaf'
else 'Inner'
end as type
from tree