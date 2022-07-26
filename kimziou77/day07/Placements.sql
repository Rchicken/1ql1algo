-- https://www.hackerrank.com/challenges/placements/problem?isFullScreen=true
select s1.name
from friends as f
    join students as s1 on f.id = s1.id
    join students as s2 on f.friend_id = s2.id
    join packages as p1 on f.id = p1.id
    join packages as p2 on f.friend_id = p2.id
where p1.salary < p2.salary
order by p2.salary asc
;
