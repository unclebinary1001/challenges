def make_bricks(small, big, goal):
  if goal >(small + 5*big):
    return False
  else:
    return ((goal%5)<=small)

