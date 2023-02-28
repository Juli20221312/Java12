import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviesManager;

public class MoviesManagerTest {

    @Test
    public void addFilms() {
        MoviesManager manager = new MoviesManager();
        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilm() {
        MoviesManager manager = new MoviesManager();
        manager.add("Film I");

        String[] expected = {"Film I"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNullFilm() {
        MoviesManager manager = new MoviesManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addTenFilms() {
        MoviesManager manager = new MoviesManager();
        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");
        manager.add("Film VII");
        manager.add("Film VIII");
        manager.add("Film IX");
        manager.add("Film X");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII", "Film VIII", "Film IX", "Film X"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLastNull() {
        MoviesManager manager = new MoviesManager();

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastOne() {
        MoviesManager manager = new MoviesManager();

        manager.add("Film I");

        String[] expected = {"Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastThree() {
        MoviesManager manager = new MoviesManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        String[] expected = { "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTen() {
        MoviesManager manager = new MoviesManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");
        manager.add("Film VII");
        manager.add("Film VIII");
        manager.add("Film IX");
        manager.add("Film X");

        String[] expected = { "Film X", "Film IX", "Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastNine() {
        MoviesManager manager = new MoviesManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");
        manager.add("Film VII");
        manager.add("Film VIII");
        manager.add("Film IX");

        String[] expected = { "Film IX", "Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastEleven() {
        MoviesManager manager = new MoviesManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");
        manager.add("Film VII");
        manager.add("Film VIII");
        manager.add("Film IX");
        manager.add("Film X");
        manager.add("Film XI");

        String[] expected = { "Film XI", "Film X", "Film IX", "Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilms5() {
        MoviesManager manager = new MoviesManager(5);
        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastEleven5() {
        MoviesManager manager = new MoviesManager(5);

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");
        manager.add("Film VII");
        manager.add("Film VIII");
        manager.add("Film IX");
        manager.add("Film X");
        manager.add("Film XI");

        String[] expected = { "Film XI", "Film X", "Film IX", "Film VIII", "Film VII"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
