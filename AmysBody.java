public class AmysBody {

  private AmysMind amysMind;
  private ProfsMind profsMind;

  public AmysBody( AmysMind amysMind, ProfsMind profsMind ) {
    this.amysMind = amysMind;
    this.profsMind = profsMind;
  }

  public String amy() {
    return this.amysMind.amy();
  }

  public String prof() {
    return this.profsMind.prof();
  }

}