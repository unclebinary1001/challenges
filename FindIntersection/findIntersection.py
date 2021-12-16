def FindIntersection(strArr):

  firstList = strArr[0].split(, )
  secondtList = set(strArr[1].split(, ))
  

  resultArr = []
  for num in firstList:
    if num in secondtList:
      resultArr.append(num)
  
  
  return ','.join(resultArr) if resultArr else False

# keep this function call here 
print(FindIntersection(input()))
