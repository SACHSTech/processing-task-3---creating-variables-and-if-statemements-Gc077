import processing.core.PApplet;

/**
 * This program Sketch.Java calls functions to draw a scene, using variables and the "random" command along
 * with if statments the location, size and colour of some items will change on each load of the code
 * @author: Garv Choudhry 
 * 
 */
public class Sketch extends PApplet {

	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // Calling size function
    size(720, 500);
  }

    // Declare and give value to variables 
    float buildingX = random(1, 620);
    float buildingY = random(250, 300);
    float buildingSize = random(60, 300);
    float sunX = random(1, 600);
    float sunY = random(50, 250);
    float sunSize = random(70, 110);
    float roofX2 = buildingX + (buildingSize / 2);
    float roofY2 = buildingY - (buildingSize / 2);
    float roofX3 = buildingX + buildingSize;
    float doorX = buildingX + (buildingSize / 2);
    float doorY = buildingY + (buildingSize / 2); 
    float doorSize = buildingSize / 2;
    float windowX = buildingX + (buildingSize / 6);
    float windowY = buildingY + (buildingSize / 6);
    float windowSize = buildingSize / 4;
    int s = second();  // Values from 0 - 59
    int m = minute();  // Values from 0 - 59
    int h = hour();    // Values from 0 - 23

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    // If statement for background colour
    if (sunX <= 50 || sunX > 600 && sunY < 205){
      background(15, 15, 110);
    }
    if (sunX <= 600 && sunX > 70 && sunY < 205){
      background(0, 200, 255);
    }
    if (sunX > 50 && sunX <= 70 || sunY >= 205) {
      background(253, 94, 83);

    }
    stroke(0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // ENVIRONMENT DESIGNS 
    // If and else statments for Sun colour
    if (sunX <= 50 || sunX > 600){
      fill(255);
    }
    if (sunX <= 600 && sunX > 70){
      fill(255, 255, 0);
    }
    if (sunX > 50 && sunX <= 70) {
      fill(255, 167, 0);
    }
    
    // Draw sun
    ellipse(sunX, sunY, sunSize, sunSize);

    // Draw base grass
    stroke(0, 120, 0);
    fill(0, 120, 0);
    rect(0, 250, width, 250);
    
    // RED HOUSE DESIGNS
    // Draw the body
    stroke(0);
    fill(160, 55, 63);
    rect(buildingX, buildingY, buildingSize, buildingSize);

    // Draw the roof
    fill(0);

    triangle(buildingX, buildingY, roofX2, roofY2, roofX3, buildingY);

    
    // Draw the door 
    rect(doorX, doorY, doorSize, doorSize);
    
    // If and else statements for window colour

    if (sunX <= 70 || sunX >= 600 || sunY >= 205){

      fill(255, 255, 0);
    }
    else{
      fill(0);
    }

    // Draw window
    rect(windowX, windowY, windowSize, windowSize);

    // If statements for diplaying time 
    if (sunX <= 50 || sunX > 600 && sunY < 205){
      fill(255);
    }
    else{
      fill(0);
    }
    textSize(35);
    text(+h+ ":", 30, 60);   
    text(+m+ ":", 80, 60);   
    text(+s, 130, 60);
  }
  
}