int x1=150;
int x2=650;
void setup(){
  size(800,400); 
  background(#cdcdcd);
}
void draw(){
  noFill();
  for(int n=15;n<=65;n++){
  background(#cdcdcd);
  for(int i=25;i>0;i--){
      int h =(i*10);
      int j=(n*10);
      ellipse(j, 200, h, h);
    }
  }
  for(int g=65;g>=15;g--){
    background(#cdcdcd);
    for(int i=25;i>0;i--){
      int h =(i*10);
      int j=(g*10);
      ellipse(j, 200, h, h);
    }
  }
  for(int i=25;i>0;i--){
    int h =(i*10);
    ellipse(x1, 200, h, h);
  }
  for(int i=25;i>0;i--){
    int h =(i*10);
    ellipse(x2, 200, h, h);
  }
}
//for(int n=15;n<=65;n++){
  //background(#cdcdcd);
  //for(int i=25;i>0;i--){
      //int h =(i*10);
      //int j=(n*10);
      //ellipse(j, 200, h, h);
      //
    //}
//}
//for(int g=65;g>=15;g--){
  //background(#cdcdcd);
  //for(int i=25;i>0;i--){
      //int h =(i*10);
      //int j=(g*10);
      //ellipse(j, 200, h, h);
      //
    //}
//}
