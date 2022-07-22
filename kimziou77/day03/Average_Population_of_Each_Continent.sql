-- https://www.hackerrank.com/challenges/average-population-of-each-continent/problem?isFullScreen=true
select country.continent, FLOOR(avg(city.population)) from city
    join country on city.CountryCode = country.Code
    group by country.continent
