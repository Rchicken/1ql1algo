/*
CITY CONTRY 테이블에서 각각의 평균 도시 인구를 가장 가까운 정수로 반올림합니다.
CITY.contryCode == Contry.Code 는 같은 값
 */

SELECT COUNTRY.Continent, FLOOR(AVG(CITY.POPULATION))
FROM CITY
         JOIN COUNTRY
              ON CITY.CountryCode=COUNTRY.Code
GROUP BY COUNTRY.Continent
;