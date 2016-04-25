public class Triangle {
  int sideOne;
  int sideTwo;
  int sideThree;

  public Triangle(int side1, int side2, int side3){
    if(!(side1 + side2 < side3 || side2 + side3 < side1 || side3 + side1 < side2)){
      sideOne = side1;
      sideTwo = side2;
      sideThree = side3;
    }
  }

  public Boolean aScalene(){
      if(sideOne != sideTwo && sideTwo != sideThree && sideThree != sideOne){
        return true;
      }
      return false;
    }

    public Boolean aIsosceles(){
      if(sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree){
        return true;
      }
      return false;
    }

    public Boolean aEquilateral(){
      if(sideOne == sideTwo && sideOne == sideThree && sideTwo == sideThree){
        return true;
      }
      return false;
    }

}
