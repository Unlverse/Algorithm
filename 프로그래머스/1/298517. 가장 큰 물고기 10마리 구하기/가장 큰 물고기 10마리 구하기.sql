select id as ID, length As LENGTH
from fish_info
where length > 10
order by length desc, id asc
limit 10;

