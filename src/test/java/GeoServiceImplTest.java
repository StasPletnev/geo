import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {
    private GeoServiceImpl geo = new GeoServiceImpl();
    private final String MOSCOW_IP = "172.0.32.11";
    private final String NEW_YORK_IP = "96.44.183.149";
    private final String AmericanIP = "96.00.00.00";

    @Test
    @DisplayName("Проверка определения IP Москва")
    void testIPMoscow() {
        Assertions.assertEquals("Moscow", geo.byIp(MOSCOW_IP).getCity());
    }
    @Test
    @DisplayName("Проверка определения IP Нью Йорк")
    void testIPNewYork() {
        Assertions.assertEquals("New York", geo.byIp(NEW_YORK_IP).getCity());
    }
    @Test
    @DisplayName("Проверка определения IP Америка")
    void testIPAmerica() {
        Assertions.assertEquals(Country.USA, geo.byIp(AmericanIP).getCountry());
    }
}
