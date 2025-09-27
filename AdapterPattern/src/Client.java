public class Client {
    public static void main(String[] args) {
        RussianSpeaking person = new TranslatorAdapter();
        person.speakRussian("Привет, меня зовут Тамерлан!");
    }
}