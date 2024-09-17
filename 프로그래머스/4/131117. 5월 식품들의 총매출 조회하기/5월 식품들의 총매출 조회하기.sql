SELECT 
    O.PRODUCT_ID,
    P.PRODUCT_NAME,
    SUM(O.AMOUNT) * P.PRICE AS TOTAL_SALES
FROM FOOD_ORDER AS O
JOIN FOOD_PRODUCT AS P
ON O.PRODUCT_ID = P.PRODUCT_ID
WHERE O.PRODUCE_DATE BETWEEN '2022-05-01' AND '2022-05-31'
GROUP BY O.PRODUCT_ID
ORDER BY 3 DESC, 1 ASC