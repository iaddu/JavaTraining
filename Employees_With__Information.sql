/*
Table: Employees
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| employee_id | int     |
| name        | varchar |
+-------------+---------+
employee_id is the column with unique values for this table.
Each row of this table indicates the name of the employee whose ID is employee_id.
 

Table: Salaries

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| employee_id | int     |
| salary      | int     |
+-------------+---------+
employee_id is the column with unique values for this table.
Each row of this table indicates the salary of the employee whose ID is employee_id.
 

Write a solution to report the IDs of all the employees with missing information. The information of an employee is missing if:

The employee's name is missing, or
The employee's salary is missing.
Return the result table ordered by employee_id in ascending order.

The result format is in the following example.

 */
 # Write your MySQL query statement below

select * from 
(select e.employee_id as employee_id from employees e left join salaries s
 on e.employee_id = s.employee_id where s.salary is null 
union
select s.employee_id as employee_id from employees e right join salaries s 
 on e.employee_id = s.employee_id where e.name is null
) as combined_result order by employee_id;
