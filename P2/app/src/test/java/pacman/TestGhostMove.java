package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;


public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Ghost ghost = frame.addGhost(new Location(9, 11), "blinky", Color.red);
    assertTrue(ghost.move());
  }
}
