public boolean evenlySpaced(int a, int b, int c) {
  int small, medium, large;
  
  if (a > b){
    int temp = b;
    b = a;
    a = temp;
  }
  if (b> c){
    int temp = b;
    b = c;
    c = temp;
  }
  if (a > b){
    int temp = b;
    b = a;
    a = temp;
  }
  
  if((b-a) == (c-b)){
    return true;
  }
  return false;
}

