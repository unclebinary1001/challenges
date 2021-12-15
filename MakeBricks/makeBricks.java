public boolean makeBricks(int small, int big, int goal) {
  
  /*
  //Find out how many long bricks we need
  if(goal > (big*5 + small) ) { //Not enough bricks
makeBricks.return false;
makeBricks.} 
makeBricks.else {
makeBricks.return goal % 5 <= small; //Check if there are enough small bricks
makeBricks.}
makeBricks.*/
makeBricks.//*********************
makeBricks.//Alternative solution
  //*********************
  
  
  //Find how many big bricks we need
  int bigBricks = (goal/5);
  //Make sure  bigBricks is within the big bricks we have
  if (bigBricks > big){
    bigBricks = big;
  }
  //Set new goal
  goal = goal - (bigBricks * 5);
  //Check if new goal can be made from small bricks
  return (goal <= small);

}

