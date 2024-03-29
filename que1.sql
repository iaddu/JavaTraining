/*Write an SQL query that reports the average experience years 
of all the employees for each project, rounded to 2 digits.

Return the result table in any order.
*/
select project.project_id,round(avg(employee.experience_years),2) 
as average_years from
project  join employee 
on project.employee_id = employee.employee_id
group by project.project_id;
