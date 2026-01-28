#2nd try(optimal solution)
SELECT e.name AS Employee
FROM Employee e
JOIN Employee m
ON e.managerId = m.id
WHERE e.salary > m.salary;




#1st try
SELECT b.name AS Employee
FROM Employee b
WHERE b.salary > (
    SELECT a.salary
    FROM Employee a
    WHERE b.managerID = a.id 
);
