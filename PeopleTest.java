import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PeopleTest {

  AmysBody amy;
  ProfsBody professor;
  AmysMind amysMind;
  ProfsMind profsMind;
  BendersMind bendersMind;
  BendersBody bender;


  @Before 
  public void before() {
    amysMind = new AmysMind();
    profsMind = new ProfsMind();
    bendersMind = new BendersMind();
    amy = new AmysBody( amysMind, profsMind );
    professor = new ProfsBody( amysMind, profsMind );
    bender = new BendersBody( amysMind, bendersMind );
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




}