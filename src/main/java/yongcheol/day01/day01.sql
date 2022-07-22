/*
    Name, Grade, Mark라는 열이 포함된 보고서를 생성하는 작업을 해야함
    Grade가 8보다 낮는 학생들의 이름은 원하지 않습니다.
    보고서는 Grade로 내림차순이어야 합니다.
    Grade(8-10)의 학생이 한명 이상 있을 경우 해당 학생의 이름을 알파벳 순으로 정렬합니다
    Grade가 8보다 낮은 경우 NULL을 이름으로 사용하고 Grade별로 내림차순 합니다
    Grade(1-7)을 받은 학생이 한명 이상 있는 경우 해당 학생의 점수를 기준으로 오름차순으로 정렬
 */

SELECT
    CASE
        WHEN Marks BETWEEN 70 AND 100 THEN Name
        ELSE NULL
        END AS Name,
    CASE
        WHEN Marks BETWEEN 0 AND 9 THEN 1
        WHEN Marks BETWEEN 10 AND 19 THEN 2
        WHEN Marks BETWEEN 20 AND 29 THEN 3
        WHEN Marks BETWEEN 30 AND 39 THEN 4
        WHEN Marks BETWEEN 40 AND 49 THEN 5
        WHEN Marks BETWEEN 50 AND 59 THEN 6
        WHEN Marks BETWEEN 60 AND 69 THEN 7
        WHEN Marks BETWEEN 70 AND 79 THEN 8
        WHEN Marks BETWEEN 80 AND 89 THEN 9
        WHEN Marks BETWEEN 90 AND 100 THEN 10
        END AS Grade,
    Marks FROM Students
ORDER BY Grade desc, NAME asc;