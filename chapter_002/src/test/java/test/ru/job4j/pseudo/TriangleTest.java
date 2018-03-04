package test.ru.job4j.pseudo;

import org.junit.Test;
import ru.job4j.pseudo.Triengle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenDrawSquare() {
        Triengle triengle = new Triengle();
        assertThat(
                triengle.draw(),
                is(
                        new StringBuilder()
                        .append("   +   ")
                        .append("  + +  ")
                        .append(" +   + ")
                        .append("+++++++")
                                .toString()
                )
        );
    }
}
