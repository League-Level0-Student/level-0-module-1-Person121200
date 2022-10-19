void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    
    
    ellipse(212, 200, 150, 150);
    ellipse(150, 200, 150, 150);
    fill (#34a832);
    
    rect(176, 103, 12, 32);
    fill(#a83e32);
    
    if(mousePressed == true) {
      
      ellipse(80, 200, 30, 30);
      fill(#f2f2f0);
}
}
