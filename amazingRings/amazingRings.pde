int x1=150;
int x2=650;
int s1=1;
int s2=-1;
void setup(){
  size(800,300); 
  background(#cdcdcd);
}
void draw(){
  noFill();
  //for(int n=15;n<=65;n++){
  background(#cdcdcd);
  for(int i=25;i>0;i--){
      int h =(i*10);
      //int j=(n*10);
      ellipse(x1, 150, h, h);
    }
  //}
  //for(int g=65;g>=15;g--){
    //background(#cdcdcd);
    for(int i=25;i>0;i--){
      int h =(i*10);
      //int j=(g*10);
      ellipse(x2, 150, h, h);
    }
  //}
  x1+=s1;
  if(x1<150 || x1>650){
    s1=-s1;
    s2=-s2;
  }
  x2+=s2;
}
