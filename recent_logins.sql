/*
Table: Logins

+----------------+----------+
| Column Name    | Type     |
+----------------+----------+
| user_id        | int      |
| time_stamp     | datetime |
+----------------+----------+
(user_id, time_stamp) is the primary key (combination of columns with unique values) for this table.
Each row contains information about the login time for the user with ID user_id.
 

Write a solution to report the latest login for all users in the year 2020. Do not include the users 
who did not login in 2020.

Return the result table in any order.

The result format is in the following example.
*/
 # Write your MySQL query statement below
select user_id,max(time_stamp)  as last_stamp from logins where time_stamp like '2020%' 
group by user_id order by time_stamp desc ;