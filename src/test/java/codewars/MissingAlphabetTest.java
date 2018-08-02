package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingAlphabetTest {

  @Test
  public void test(){
    assertEquals("hIJKMNPQRSTUVWXYZeFGIJKMNPQRSTUVWXYZlMNPQRSTUVWXYZloPQRSTUVWXYZ", MissingAlphabet.insertMissingLetters("hello"));
    assertEquals("hIJKMNPQRSTUVWXYZeFGIJKMNPQRSTUVWXYZlMNPQRSTUVWXYZloPQRSTUVWXYZ", MissingAlphabet.insertMissingLetters("hello"));
  }

}
