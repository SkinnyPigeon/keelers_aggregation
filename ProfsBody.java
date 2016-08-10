public class ProfsBody {

  private AmysMind amysMind;
  private ProfsMind profsMind;

  public ProfsBody( AmysMind amysMind, ProfsMind profsMind ) {
    this.amysMind = amysMind;
    this.profsMind = profsMind;
  }

  public String prof() {
    return this.profsMind.prof();
  }

}