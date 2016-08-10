public class AmysBody {

  private AmysMind amysMind;
  private ProfsMind profsMind;
  private ZoidbergsBody zoidbergsBody;

  public AmysBody( AmysMind amysMind, ProfsMind profsMind, ZoidbergsBody zoidbergsBody ) {
    this.amysMind = amysMind;
    this.profsMind = profsMind;
    this.zoidbergsBody = zoidbergsBody;
  }

  public String amy() {
    return this.amysMind.amy();
  }

  public String prof() {
    return this.profsMind.prof();
  }

  public String zoidAmy() {
    return this.zoidbergsBody.amy();
  }

}