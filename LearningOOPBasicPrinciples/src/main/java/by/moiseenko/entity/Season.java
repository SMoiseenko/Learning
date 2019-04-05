package by.moiseenko.entity;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public enum Season {
  WINTER(false){
    public Season changeSeason(){
      return Season.SPRING;
    }
  },
  SPRING(true){
    public Season changeSeason(){
      return Season.SUMMER;
    }
  },
  SUMMER(true){
    public Season changeSeason(){
      return Season.AUTUMN;
    }
  },
  AUTUMN(false){
    public Season changeSeason(){
      return Season.WINTER;
    }
  };

  private boolean isGoodSeason;

  Season(boolean isGoodSeason) {
    this.isGoodSeason = isGoodSeason;
  }

  public boolean isGoodSeason() {
    return isGoodSeason;
  }

  public void changeQuality(){
    this.isGoodSeason = !this.isGoodSeason();
  }

  public abstract Season changeSeason();

//  public static Season changeSeason(Season s) {
//    Season result = s;
//    switch (s) {
//      case WINTER:
//        result = Season.SPRING;
//        break;
//      case SPRING:
//        result= Season.SUMMER;
//        break;
//      case SUMMER:
//        result = Season.AUTUMN;
//        break;
//      case AUTUMN:
//        result = Season.WINTER;
//        break;
//
//    }
//    return result;
//  }
}
