-- https://www.hackerrank.com/challenges/earnings-of-employees/problem?isFullScreen=true
select (months * salary) as earnings, count(name) from Employee
group by earnings
order by earnings desc
limit 1
;
