/*Reformat Deparment Table
Easy
Topics
Companies
SQL Schema
Pandas Schema
Table: Department

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| revenue     | int     |
| month       | varchar |
+-------------+---------+
In SQL,(id, month) is the primary key of this table.
The table has information about the revenue of each department per month.
The month has values in ["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"].
 

Reformat the table such that there is a department id column and a revenue column for each month.

Return the result table in any order.

The result format is in the following example.

 */
 # Write your MySQL query statement below
select id,
MAX(case when month = 'Jan' then revenue else null END )as Jan_Revenue,
MAX(case when month = 'Feb' then revenue else null  END )as Feb_Revenue,
MAX(case when month = 'Mar' then revenue  else null END )as Mar_Revenue,
MAX(case when month = 'Apr' then revenue  else null END  )as Apr_Revenue,
MAX(case when month = 'May' then revenue  else null END ) as May_Revenue,
MAX(case when month = 'Jun' then revenue else null END  )as Jun_Revenue,
MAX(case when month = 'Jul' then revenue  else null  END )as Jul_Revenue,
MAX(case when month = 'Aug' then revenue else null  END )as Aug_Revenue,
MAX(case when month = 'Sep' then revenue else null END  )as Sep_Revenue,
MAX(case when month = 'Oct' then revenue  else null END  )as Oct_Revenue,
MAX(case when month = 'Nov' then revenue  else null  END )as Nov_Revenue,
MAX(case when month = 'Dec' then revenue else null  END )as Dec_Revenue
from department group by id;
