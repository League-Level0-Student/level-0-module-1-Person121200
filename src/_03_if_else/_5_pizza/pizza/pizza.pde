
void setup() {
    size(500, 500);
    fill(#9e6c2e);
ellipse(255, 255, 400, 400);
fill(#d12f19);
ellipse(255, 255, 350, 350);
fill(#ebfc68);
ellipse(255, 255, 310, 310);
}
void draw() {
    PImage pepperoni;
    pepperoni = loadImage("pepperoni.png");
    image(pepperoni,150,80);
    pepperoni.resize(30, 30);
    image(pepperoni,200,200);
    pepperoni.resize(80, 80);



}
