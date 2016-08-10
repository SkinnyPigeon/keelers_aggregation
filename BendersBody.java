public class BendersBody {

  private AmysMind amysMind;
  private BendersMind bendersMind;

  public BendersBody( AmysMind amysMind, BendersMind bendersMind ) {
    this.amysMind = amysMind;
    this.bendersMind = bendersMind;
  }

  public String amy() {
    return this.amysMind.amy();
  }

  public String bender() {
    return this.bendersMind.bender();
  }

}