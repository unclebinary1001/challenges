def FirstFactorial(num):
  '''
  cur = num
  while(cur>1):
    num *= cur-1
    cur -= 1
  # code goes here
  return num
  '''
  if (num == 0 or num == 1):
    return 1
  else:
    return (num * FirstFactorial(num-1))

# keep this function call here 
print(FirstFactorial(input()))