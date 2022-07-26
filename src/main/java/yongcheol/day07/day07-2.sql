SELECT s2.name
FROM FRIENDS AS f
         JOIN Students AS s1
              ON f.FRIEND_ID = s1.ID
         JOIN Students AS s2
              ON f.ID = s2.ID
         JOIN Packages AS p1
              ON f.FRIEND_ID = p1.ID
         JOIN Packages AS p2
              ON f.ID = p2.ID
WHERE p1.salary > p2.salary
ORDER BY p1.salary ASC
;

