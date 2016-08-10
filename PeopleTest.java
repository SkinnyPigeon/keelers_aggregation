import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PeopleTest {

  AmysBody amy;
  ProfsBody professor;
  AmysMind amysMind;
  ProfsMind profsMind;


  @Before 
  public void before() {
    amysMind = new AmysMind();
    profsMind = new ProfsMind();
    amy = new AmysBody( amysMind, profsMind );
    professor = new ProfsBody( amysMind, profsMind );
  }

  @Test
  public void amyIsAmy() {
    assertEquals( "I'm Amy", amy.amy() );
  }

  @Test
  public void amyIsProf() {
    assertEquals( "I'm the Professor", amy.prof() );
  }




}