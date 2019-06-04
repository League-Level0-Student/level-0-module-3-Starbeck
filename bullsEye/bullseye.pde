    void setup(){
      size(800,800);
      background(#cdcdcd);
      
    }

    void draw(){
      for(int i=8;i>0;i--){
        if(i==8 || i==6 || i==4 || i==2){
          fill(255,0,0);
        }else{
          fill(0,0,0);
        }
      int h =(i*100);
      ellipse(400, 400, h, h);
      }
      
    }
         

/*    void setup(){
        size(400,600);
        background(0,255,0);
    }

    void draw(){
        fill(255,0,0);
        ellipse(25, 50, 100, 100);
    }
*/
