@RunWith(Parameterized.class)
 // Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

 
  public CheckIsAdultTest(int age, boolean result) {
	// Инициализируй поля класса в конструкторе
    this.age = age;
    this.result = result;
  }

  @Parameterized.Parameters// Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
	return new Object[][]{
            {18, true},
            {17, false},
            {21, true},
            {20, true},
        };
    }
  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	// Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Для возраста " + age + " результат неверный", result, isAdult);
	}
}

