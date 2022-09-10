import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AfishaTest {






        Afisha afisha = new Afisha(1, "afisha1", 123, "romantic");
        Afisha afisha1 = new Afisha(2, "name", 124, "comedia");
        Afisha afisha2 = new Afisha(3, "afisha1", 123, "romantic");
        Afisha afisha3 = new Afisha(4, "name", 124, "comedia");
        Afisha afisha4 = new Afisha(5, "afisha1", 123, "romantic");
        Afisha afisha5 = new Afisha(6, "name", 124, "comedia");
        Afisha afisha6 = new Afisha(7, "afisha1", 123, "romantic");
        Afisha afisha7 = new Afisha(8, "name", 124, "comedia");

        @BeforeEach
        public void setup() {
            afisha.save(afisha);
            afisha.save(afisha1);
            afisha.save(afisha2);
            afisha.save(afisha3);
            afisha.save(afisha4);
            afisha.save(afisha5);
            afisha.save(afisha6);
            afisha.save(afisha7);

        }


        @Test
        public void test() {

            Afisha[] expected = {afisha, afisha1, afisha2, afisha3, afisha4, afisha5, afisha6, afisha7};
            Afisha[] actual = afisha.findAll();
            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void shouldReverseTest() {

            Afisha[] expected = {afisha7, afisha6, afisha5, afisha4, afisha3};
            Afisha[] actual = afisha.findLast();
            Assertions.assertArrayEquals(actual, expected);
        }

        @Test
        public void setCountValid() {
            afisha.setCountLast(2);
            Afisha[] expected = {afisha7, afisha6};
            Afisha[] actual = afisha.findLast();
            Assertions.assertArrayEquals(expected, actual);
        }


    }


