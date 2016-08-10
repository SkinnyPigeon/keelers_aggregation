public class ProfsBody {

  private AmysMind amysMind;
  private ProfsMind profsMind;
  private BendersMind bendersMind;

  public ProfsBody( AmysMind amysMind, ProfsMind profsMind, BendersMind bendersMind ) {
    this.amysMind = amysMind;
    this.profsMind = profsMind;
    this.bendersMind = bendersMind;
  }

  public String prof() {
    return this.profsMind.prof();
  }

  public String bender() {
    return this.bendersMind.bender();
  }

}