SELECT MAX(months * salary) as total_earnings ,COUNT(*)
FROM EMPLOYEE
group by months * salary
order by total_earnings desc
limit 1;
