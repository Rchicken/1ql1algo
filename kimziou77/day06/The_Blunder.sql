--  https://www.hackerrank.com/challenges/the-blunder/problem?isFullScreen=true
select CEILING(avg(salary)-avg(replace(salary,'0',''))) from employees;
