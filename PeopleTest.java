import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PeopleTest {

  AmysBody amy;
  AmysBody amy2;
  ProfsBody professor;
  AmysMind amysMind;
  ProfsMind profsMind;
  BendersMind bendersMind;
  BendersBody bender;
  ZoidbergsBody zoidberg;


  @Before 
  public void before() {
    amysMind = new AmysMind();
    profsMind = new ProfsMind();
    bendersMind = new BendersMind();

    amy = new AmysBody( amysMind, profsMind, zoidberg );
    professor = new ProfsBody( amysMind, profsMind, bendersMind );
    bender = new BendersBody( amysMind, bendersMind );
    zoidberg = new ZoidbergsBody( amy );
    amy2 = new AmysBody( amysMind, profsMind, zoidberg );
  }

  @Test
  public void amyIsAmy() {
    assertEquals( "I'm Amy", amy.amy() );
  }

  @Test
  public void amyIsProf() {
    assertEquals( "I'm the Professor", amy.prof() );
  }

  @Test
  public void benderIsAmy() {
    assertEquals( "I'm Amy", bender.amy() );
  }

  @Test
  public void profIsBender() {
    assertEquals( "I'm Bender", professor.bender() );
  }

  @Test
  public void zoidbergIsAmysBody() {
    assertEquals( "I'm Amy", zoidberg.amy() );
  }

  @Test
  public void amyIsConfused() {
    assertEquals( "I'm Amy", amy2.zoidAmy() );
  }




}