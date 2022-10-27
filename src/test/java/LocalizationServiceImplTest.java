import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {
    private Country country;
    private LocalizationServiceImpl local = new LocalizationServiceImpl();

    @Test
    @DisplayName("Проверка locale на русский текст")
    void testRus() {
        country = Country.RUSSIA;
        Assertions.assertEquals("Добро пожаловать", local.locale(country));
    }

    @Test
    @DisplayName("Проверка locale на английский текст")
    void testEng() {
        country = Country.USA;
        Assertions.assertEquals("Welcome", local.locale(country));
    }
}
